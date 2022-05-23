package com.its.board.controller.repository;

import com.its.board.controller.dto.BoardDTO;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.awt.*;

@Repository
public class BoardRepository {
    public int save(BoardDTO boardDTO) {
    }

    public List findAll() {
    }

    @Autowired
    private SqlSessionTemplate sql;

    public int save(BoardDTO boardDTO) {
        return sql.insert("Board.save", boardDTO);
    }

    public List<BoardDTO> findAll() {
        return sql.selectList("Board.findAll");
    }
}
