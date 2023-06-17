package com.hanteo.ct.solution1.board.query;

import com.hanteo.ct.solution1.board.dto.request.BoardSearchCondition;
import com.hanteo.ct.solution1.board.dto.response.BoardReadResponse;

import java.util.List;

public interface BoardQuery {
    List<BoardReadResponse> searchBoard(BoardSearchCondition condition);
}
