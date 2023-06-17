package com.hanteo.ct.solution1.board.query;

import com.hanteo.ct.solution1.board.dto.request.BoardSearchCondition;
import com.hanteo.ct.solution1.board.dto.response.BoardReadResponse;
import com.querydsl.jpa.impl.JPAQueryFactory;
import jakarta.persistence.EntityManager;

import java.util.List;

public class BoardQueryImpl implements BoardQuery{

    private final JPAQueryFactory queryFactory;

    public BoardQueryImpl(EntityManager em) {
        this.queryFactory = new JPAQueryFactory(em);
    }

    @Override
    public List<BoardReadResponse> searchBoard(BoardSearchCondition condition) {
        return null;
    }
}
