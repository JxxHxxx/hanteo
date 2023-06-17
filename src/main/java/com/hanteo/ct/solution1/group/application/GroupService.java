package com.hanteo.ct.solution1.group.application;

import com.hanteo.ct.solution1.common.trigger.GroupCreatedEvent;
import com.hanteo.ct.solution1.group.domain.IdolGroup;
import com.hanteo.ct.solution1.group.domain.IdolGroupRepository;
import com.hanteo.ct.solution1.group.dto.request.IdolGroupForm;
import lombok.RequiredArgsConstructor;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class GroupService {

    private final IdolGroupRepository idolGroupRepository;
    private final ApplicationEventPublisher publisher;

    public void create(IdolGroupForm form) {
        IdolGroup idolGroup = idolGroupRepository.save(new IdolGroup(form.name(), form.groupGenderId()));

        GroupCreatedEvent event = new GroupCreatedEvent(idolGroup.getId());
        publisher.publishEvent(event);
    }
}
