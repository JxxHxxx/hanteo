package com.hanteo.ct.problem_1.domain;

import com.hanteo.ct.problem_1.board.domain.Board;
import com.hanteo.ct.problem_1.board.domain.BoardRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.List;

@DataJpaTest
class BoardRepositoryTest {

    @Autowired
    BoardRepository boardRepository;

    @BeforeEach
    void beforeEach() {
    }

    @Test
    void name() {
        List<Board> boards = boardRepository.findByChildId(1);

    }
}