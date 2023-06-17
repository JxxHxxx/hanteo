package com.hanteo.ct.solution1.board.dto.response;

import com.querydsl.core.annotations.QueryProjection;
import lombok.Getter;

@Getter
public class BoardReadResponse {
    private final Long boardNo;
    private final String genderName;
    private final String groupName;
    private final String boardName;

    @QueryProjection
    public BoardReadResponse(Long boardNo, String genderName, String groupName, String boardName) {
        this.boardNo = boardNo;
        this.genderName = genderName;
        this.groupName = groupName;
        this.boardName = boardName;
    }
}
