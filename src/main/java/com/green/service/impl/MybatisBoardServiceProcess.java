package com.green.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import com.green.domain.mapper.BoardMapper;
import com.green.service.MybatisBoardService;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class MybatisBoardServiceProcess implements MybatisBoardService {
	
	private final BoardMapper mapper;
	
	@Override
	public void findAll(Model model) {
		model.addAttribute("list", mapper.findAll());
		
	}

}
