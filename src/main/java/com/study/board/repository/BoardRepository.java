package com.study.board.repository;

import com.study.board.entity.Board;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BoardRepository extends JpaRepository<Board, Integer> { // Board entity에서 id 지정하는 타입이 Integer라서 Integer을 넣음

}
