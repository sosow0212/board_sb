package com.study.board.service;

import com.study.board.entity.Board;
import com.study.board.repository.BoardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BoardService {

    @Autowired // 이 어노테이션은 스프링이 알아서 생성하게 해줌
    private BoardRepository boardRepository;

    public void write(Board board) {

        boardRepository.save(board);
    }
}
