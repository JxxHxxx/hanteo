package com.hanteo.ct.solution1.board.dto.request;

import com.hanteo.ct.solution1.board.domain.BoardType;

public record BoardForm(
        String name,
        BoardType boardType
) {
    public String StringBoardType() {
        return this.boardType.description();
    }
}
