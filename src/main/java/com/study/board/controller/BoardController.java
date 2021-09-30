package com.study.board.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller // 컨트롤러임을 알려주는 어노테이션
public class BoardController {

    @GetMapping("/board/write") // localhost:8090/board/write 접속시 "boardwrite.html"을 보여준다
    public String boardWriteForm() {

        return "boardwrite";
    }
}
