package com.hanteo.ct.solution1.board.dto.request;

import lombok.Getter;

@Getter
public class BoardSearchCondition {
    private final Integer genderId;
    private final Long idolGroupId;
    private final Long boardId;
    private final String genderName;
    private final String idolGroupName;
    private final String boardName;

    public BoardSearchCondition(Integer genderId, Long idolGroupId, Long boardId, String genderName, String idolGroupName, String boardName) {
        this.genderId = genderId;
        this.idolGroupId = idolGroupId;
        this.boardId = boardId;
        this.genderName = genderName;
        this.idolGroupName = idolGroupName;
        this.boardName = boardName;
    }
}
