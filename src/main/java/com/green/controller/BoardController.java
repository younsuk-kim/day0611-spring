package com.green.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.green.service.BoardService;
import com.green.service.impl.BoardServiceProcess;

import lombok.RequiredArgsConstructor;


@Controller
@RequiredArgsConstructor	//생성자DI 만들어줌
@RequestMapping("/boards")	//해당 controller의 모든 메소드의 기본경로
public class BoardController {
	
	//서비스
	private final BoardService service;//생성자 DI-자동처리됨
	
	//게시글의 내용을 표현해주는 페이지를 보여주세요
	@GetMapping//url생략시 클래스의 기본경로 적용 /boards/ == /boards
	public String list(Model model) {
		
		service.findAllProcess(model);
		
		return "views/board/list";
	}
	

}
