package com.hanteo.ct.solution1.group.presentation;

import com.hanteo.ct.solution1.common.trigger.GroupCreatedEvent;
import com.hanteo.ct.solution1.group.application.GroupService;
import com.hanteo.ct.solution1.group.dto.request.IdolGroupForm;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class GroupController {

    private final GroupService groupService;

    @PostMapping("/groups")
    public String create(@RequestBody IdolGroupForm form) {
        groupService.create(form);

        return form + " 그룹 생성 완료";
    }
}
