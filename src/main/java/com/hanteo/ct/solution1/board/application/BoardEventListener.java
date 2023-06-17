package com.hanteo.ct.solution1.board.application;

import com.hanteo.ct.solution1.board.domain.*;
import com.hanteo.ct.solution1.common.trigger.BoardCreatedEvent;
import com.hanteo.ct.solution1.common.trigger.GroupCreatedEvent;
import lombok.RequiredArgsConstructor;
import org.springframework.context.event.EventListener;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import static com.hanteo.ct.solution1.board.domain.BoardType.*;

@Component
@RequiredArgsConstructor
public class BoardEventListener {

    private final GroupBoardRepository groupBoardRepository;
    private final BoardRepository boardRepository;

    @Order(2)
    @EventListener(BoardCreatedEvent.class)
    public void handle(BoardCreatedEvent event) {
        GroupBoard groupBoard = GroupBoard.builder()
                .idolGroupId(event.idolGroupId())
                .boardName(event.boardName())
                .boardId(event.boardId())
                .build();

        groupBoardRepository.save(groupBoard);
    }

    @EventListener(GroupCreatedEvent.class)
    public void handle(GroupCreatedEvent event) {
        Board board = Board.builder()
                .name(NOTICE.description())
                .type(NOTICE)
                .build();
        Board saveBoard = boardRepository.save(board);

        GroupBoard groupBoard = GroupBoard.builder()
                .idolGroupId(event.idolGroupId())
                .boardName(NOTICE.description())
                .boardId(saveBoard.getId())
                .build();
        groupBoardRepository.save(groupBoard);
    }
}
