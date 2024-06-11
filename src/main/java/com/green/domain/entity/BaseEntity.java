package com.green.domain.entity;

import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;

@Getter
@MappedSuperclass//공통필드 상속
public abstract class BaseEntity {
	
		//@CreatedDate-@EnableJpaAuditing entity클래스에 리스너도 등록해야함
		@CreationTimestamp
		@Column(columnDefinition = "timestamp")
		private LocalDateTime createdAt;
		
		@UpdateTimestamp
		@Column(columnDefinition = "timestamp")
		private LocalDateTime updatedAt;

}
