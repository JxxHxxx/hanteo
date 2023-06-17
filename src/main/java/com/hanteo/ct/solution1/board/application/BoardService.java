package com.hanteo.ct.solution1.board.application;

import com.hanteo.ct.solution1.board.domain.Board;
import com.hanteo.ct.solution1.board.domain.BoardRepository;
import com.hanteo.ct.solution1.board.domain.BoardType;
import com.hanteo.ct.solution1.board.dto.request.BoardForm;
import com.hanteo.ct.solution1.board.dto.request.BoardSearchCondition;
import com.hanteo.ct.solution1.board.dto.response.BoardCreateResponse;
import com.hanteo.ct.solution1.board.dto.response.BoardReadResponse;
import com.hanteo.ct.solution1.common.trigger.BoardCreatedEvent;
import lombok.RequiredArgsConstructor;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;

import java.util.List;

import static com.hanteo.ct.solution1.board.domain.BoardType.*;


@Service
@RequiredArgsConstructor
public class BoardService {

    private final BoardRepository boardRepository;
    private final ApplicationEventPublisher publisher;

    public BoardCreateResponse create(Long idolGroupId, BoardForm form) {
        if (GENERAL.equals(form.boardType())) {
            Board board = Board.builder()
                    .name(form.name())
                    .type(form.boardType())
                    .build();

            boardRepository.save(board);

            BoardCreatedEvent event = new BoardCreatedEvent(idolGroupId, form.name(), form.boardType());
            publisher.publishEvent(event);
        }

        if (ANONYMOUS.equals(form.boardType())) {
            BoardCreatedEvent event = new BoardCreatedEvent(idolGroupId, form.boardType().description(), form.boardType());
            publisher.publishEvent(event);
        }

        return new BoardCreateResponse(form.name(), form.boardType().name());
    }

    public List<BoardReadResponse> readCond(BoardSearchCondition condition) {
        return boardRepository.searchBoard(condition);
    }
}
