package com.hanteo.ct.solution1.board.domain;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Board {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "board_idx")
    private Long id;
    private String name;
    @Enumerated(EnumType.STRING)
    private BoardType type;

    @Builder
    public Board(String name, BoardType type) {
        this.name = name;
        this.type = type;
    }
}
