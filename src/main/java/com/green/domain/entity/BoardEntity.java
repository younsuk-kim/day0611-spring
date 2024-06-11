package com.green.domain.entity;

import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
//Jpa-ORM(Object Relational Mapping)기술표준 :DB의 테이블과 java의 객체가 매핑
//jpa에서는 DB-테이블를 사용하지 않고 
//java의 Entity를 이용하여 처리합니다.

//시퀀스 생성시켜주는 어노테이션
@SequenceGenerator(name = "gen_board",
			sequenceName = "seq_board", initialValue = 1, allocationSize = 1)
@Builder
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@NoArgsConstructor
@Getter
@Entity//테이블이라고 생각합시다. 테이블 대신 사용하는 객체(테이블 구조는 함부로 건드리면 안된다.DTO로 사용하지 마세요)
@Table(name = "board")//클래스 이름이 테이블명-별도로 지정 가능(default값은 테이블명=클래스명)
public class BoardEntity extends BaseEntity{
	
	//@GeneratedValue(strategy = GenerationType.IDENTITY)//auto_increment
	
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "gen_board")
	@Id//pk컬럼입니다.
	private long no;
	
	@Column(nullable = false)//not null 컬럼명 지정 가능함
	private String title;	//게시글 제목-필수 이름을 수정하면 컬럼이 새로 생성된다.
	@Column(columnDefinition = "text not null")//not null
	private String content;	//내용-필수
	private int readCount;	//db에서는 자동으로 underscore 표기법으로 적용됨
	
	

}
