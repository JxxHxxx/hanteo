package com.hanteo.ct.solution1.board.domain;

import com.hanteo.ct.solution1.board.query.BoardQuery;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoardRepository extends JpaRepository<Board, Long>, BoardQuery {
    Long countBy();
}
