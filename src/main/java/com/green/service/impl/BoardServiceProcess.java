package com.green.service.impl;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import com.green.domain.entity.BoardEntityRepository;
import com.green.service.BoardService;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class BoardServiceProcess implements BoardService {

	private final BoardEntityRepository repository;
	
	@Override
	public void findAllProcess(Model model) {
		//페이징처리
//		Sort sort = Sort.by(Direction.DESC,"no");
//		Pageable pageable = PageRequest.of(5405, 10, sort);
//		model.addAttribute("list" , repository.findAll(pageable));
		
		int limit=10;
		int offset=5405;
		model.addAttribute("list", repository.selectAllWithPagination(limit, offset));
		
	}

}
