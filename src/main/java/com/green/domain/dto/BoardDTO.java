package com.green.domain.dto;

import java.time.LocalDateTime;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class BoardDTO {
	private long no;	
	private String title;	//게시글 제목-필수 이름을 수정하면 컬럼이 새로 생성된다.
	private String content;	//내용-필수
	private int readCount;
	private LocalDateTime createdAt;
	private LocalDateTime updatedAt;

}
