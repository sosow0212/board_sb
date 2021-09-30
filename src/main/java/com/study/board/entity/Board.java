package com.study.board.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity // 테이블을 의미한다
@Data
public class Board {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // MySQL
    private Integer id;
    private String title;
    private String content;
    // 위에까지 mySQL Workbench 테이블에 있는 것과 똑같이 만든다
}
