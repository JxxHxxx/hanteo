package com.hanteo.ct.solution1.group.domain;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class IdolGroup {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idol_group_idx")
    private Long id;
    private String name;
    private Integer groupGenderId;

    public IdolGroup(String name, Integer groupGenderId) {
        this.name = name;
        this.groupGenderId = groupGenderId;
    }
}
