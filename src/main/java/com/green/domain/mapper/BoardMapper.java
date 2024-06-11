package com.green.domain.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.green.domain.dto.BoardDTO;

@Mapper
public interface BoardMapper {

	List<BoardDTO> findAll();

}
