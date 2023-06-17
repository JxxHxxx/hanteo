package com.hanteo.ct.solution1.board.domain;

public enum BoardType {
    GENERAL("일반"), NOTICE("공지사항"), ANONYMOUS("익명 게시판");

    private String description;

    BoardType(String description) {
        this.description = description;
    }

    public String description() {
        return this.description;
    }
}
