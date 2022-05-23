package com.its.board.controller.service;

import com.its.board.controller.dto.BoardDTO;
import com.its.board.controller.repository.BoardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.awt.*;

@Service
public class BoardService {
    @Autowired
    private BoardRepository boardRepository;

    public boolean save(BoardDTO boardDTO) {
        int result = boardRepository.save(boardDTO);
        if (result > 0) {
            return true;
        } else {
            return false;
        }
    }

    public List<BoardDTO> findAll() {
        return boardRepository.findAll();
    }
}
