package com.hanteo.ct.solution1.common.trigger;

import com.hanteo.ct.solution1.board.domain.BoardType;

public record BoardCreatedEvent(
        Long idolGroupId,
        String boardName,
        Long boardId
) {
}
