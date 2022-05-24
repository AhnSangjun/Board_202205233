package com.its.board.controller;

import com.its.board.dto.BoardDTO;
import com.its.board.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Controller
@RequestMapping
public class BoardController {
    @Autowired
    private BoardService boardService;

    // 글쓰기 화면 요청
//   @GetMaping("/board/save") // RequestMapping 미적용
    @GetMapping("/board/save") // RequestMapping 적용
    public String saveForm() {
        return "board/save"; // => views/boarc/save.jsp
    }

    // 글쓰기 처리
    //  @PostMapping("/board/save") // RequestMapping 미적용

    @PostMapping("/save") // Request 적용
    public String save(@ModelAttribute BoardDTO boardDTO) {
        boolean result = boardService.save(boardDTO);
        if (result) {
            return "redirect:/findAll"; // => /board/findAll 주소 요청
        } else {
            return "board/save-fail";
        }
    }

    // 목록 출력

    @GetMapping("/findAll")
    public String findAll(Model model) {
        List<BoardDTO> boardDTOList = boardService.findAll();
        model.addAttribute("boardList", boardDTOList);
        return "boardPages/list";
    }

    // 상세조회
    @GetMapping("/detail")
    public String findById(@RequestParam("id") Long id, Model model) {
        BoardDTO boardDTO = boardService.findById(id);
        model.addAttribute("board", boardDTO);
        return "boardPage/detail";

    }

    // 비밀번호 체크 페이지
    @GetMapping("/passwordCheck")
    public String passwordCheck(@RequestParam("id") Long id) {
        BoardDTO boardDTO = boardService.findById(id);
        Model model = null;
        model.addAttribute("board", boardDTO);
        return "boardPage/passwordCheck";
    }

    // 삭제처리
    @GetMapping("delete")
    public String delete(@RequestParam("id") Long id) {
        boardService.delete(id);
        return "redirect:/board/findAll";
    }
}
