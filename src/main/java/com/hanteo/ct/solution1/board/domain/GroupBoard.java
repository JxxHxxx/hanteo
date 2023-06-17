package com.hanteo.ct.solution1.board.domain;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class GroupBoard {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "group_board_idx")
    private Long id;
    private Long idolGroupId;
    private String boardName;
    private Long boardId;

    @Builder
    public GroupBoard(Long idolGroupId, String boardName, Long boardId) {
        this.idolGroupId = idolGroupId;
        this.boardName = boardName;
        this.boardId = boardId;
    }
}
