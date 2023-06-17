package com.hanteo.ct.solution1.board.domain;


import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface GroupBoardRepository extends JpaRepository<GroupBoard, Integer> {
}
