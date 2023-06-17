package com.hanteo.ct.solution1.group.application;

import com.hanteo.ct.solution1.common.trigger.BoardCreatedEvent;
import com.hanteo.ct.solution1.group.domain.IdolGroupRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.context.event.EventListener;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class GroupEventListener {

    private final IdolGroupRepository idolGroupRepository;

    @Order(1)
    @EventListener(BoardCreatedEvent.class)
    public void handle(BoardCreatedEvent event) {
        if (idolGroupRepository.findById(event.idolGroupId()).isEmpty()) {
            throw new IllegalArgumentException("존재하지 않는 아이돌 그룹입니다.");
        }
    }
}
