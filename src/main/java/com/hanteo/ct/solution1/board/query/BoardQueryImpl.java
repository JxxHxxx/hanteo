package com.hanteo.ct.solution1.board.query;

import com.hanteo.ct.solution1.board.domain.QBoard;
import com.hanteo.ct.solution1.board.domain.QGroupBoard;
import com.hanteo.ct.solution1.board.dto.request.BoardSearchCondition;
import com.hanteo.ct.solution1.board.dto.response.BoardReadResponse;
import com.hanteo.ct.solution1.board.dto.response.QBoardReadResponse;
import com.hanteo.ct.solution1.group.domain.QGroupGender;
import com.hanteo.ct.solution1.group.domain.QIdolGroup;
import com.querydsl.core.types.dsl.BooleanExpression;
import com.querydsl.jpa.impl.JPAQueryFactory;
import jakarta.persistence.EntityManager;

import java.util.List;

import static com.hanteo.ct.solution1.board.domain.QGroupBoard.groupBoard;
import static com.hanteo.ct.solution1.group.domain.QGroupGender.*;
import static com.hanteo.ct.solution1.group.domain.QIdolGroup.idolGroup;

public class BoardQueryImpl implements BoardQuery {

    private final JPAQueryFactory queryFactory;

    public BoardQueryImpl(EntityManager em) {
        this.queryFactory = new JPAQueryFactory(em);
    }

    @Override
    public List<BoardReadResponse> searchBoard(BoardSearchCondition condition) {
        return queryFactory
                .select(new QBoardReadResponse(
                                groupBoard.boardId,
                                groupGender.name,
                                idolGroup.name,
                                groupBoard.boardName
                        )
                ).from(groupBoard)
                .leftJoin(idolGroup).on(groupBoard.idolGroupId.eq(idolGroup.id))
                .leftJoin(groupGender).on(idolGroup.groupGenderId.eq(groupGender.id))
                .where(
                        idolGroupNameEqual(condition.getIdolGroupName()),
                        genderNameEqual(condition.getGenderName()),
                        boardNameEqual(condition.getBoardName()),
                        idolGroupIdEqual(condition.getIdolGroupId()),
                        genderIdEqual(condition.getGenderId()),
                        boardIdEqual(condition.getBoardId())
                )
                .fetch();

    }

    public BooleanExpression idolGroupNameEqual(String idolGroupName) {
        return idolGroupName != null && !idolGroupName.isEmpty() ? idolGroup.name.eq(idolGroupName) : null;
    }

    public BooleanExpression genderNameEqual(String genderName) {
        return genderName != null && !genderName.isEmpty() ? groupGender.name.eq(genderName) : null;
    }

    public BooleanExpression boardNameEqual(String boardName) {
        return boardName != null && !boardName.isEmpty() ? groupBoard.boardName.eq(boardName) : null;
    }

    public BooleanExpression idolGroupIdEqual(Long idolGroupId) {
        return idolGroupId != null ? idolGroup.id.eq(idolGroupId) : null;
    }

    public BooleanExpression genderIdEqual(Integer genderId) {
        return genderId != null ? groupGender.id.eq(genderId) : null;
    }

    public BooleanExpression boardIdEqual(Long boardId) {
        return boardId != null  ? groupBoard.boardId.eq(boardId) : null;
    }
}
