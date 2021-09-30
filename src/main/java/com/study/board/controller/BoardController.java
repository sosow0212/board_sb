package com.study.board.controller;

import com.study.board.entity.Board;
import com.study.board.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller // 컨트롤러임을 알려주는 어노테이션
public class BoardController {

    @Autowired
    private BoardService boardService;


    @GetMapping("/board/write") // localhost:8090/board/write 접속시 "boardwrite.html"을 보여준다
    public String boardWriteForm() {

        return "boardwrite";
    }

    @PostMapping("/board/writepro")
    public String boardWritePro(Board board) { // 매개변수가 많아질 수 있으니, 클래스를 받음

        boardService.write(board);

        return "";
    }
}
