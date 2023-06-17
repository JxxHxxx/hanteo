package com.hanteo.ct.solution1.board.presentation;

import com.hanteo.ct.solution1.board.application.BoardService;
import com.hanteo.ct.solution1.board.dto.request.BoardForm;
import com.hanteo.ct.solution1.board.dto.request.BoardSearchCondition;
import com.hanteo.ct.solution1.board.dto.response.BoardCreateResponse;
import com.hanteo.ct.solution1.board.dto.response.BoardReadResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequiredArgsConstructor
public class BoardController {

    private final BoardService boardService;

    @PostMapping("/groups/{group-id}/boards")
    public ResponseEntity<BoardCreateResponse> create(@PathVariable("group-id") Long groupId, @RequestBody BoardForm form) {
        BoardCreateResponse response = boardService.create(groupId, form);
        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }

    @GetMapping("/boards")
    public ResponseEntity<List<BoardReadResponse>> readCond(@ModelAttribute BoardSearchCondition condition) {
        List<BoardReadResponse> response = boardService.readCond(condition);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}
