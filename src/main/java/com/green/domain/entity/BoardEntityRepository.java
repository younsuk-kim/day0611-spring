package com.green.domain.entity;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

//@Repository 필수는 아님
public interface BoardEntityRepository extends JpaRepository<BoardEntity, Long>{

	@Query(value = "select * from board ORDER BY no DESC "+
	"LIMIT :limit OFFSET :offset", nativeQuery = true)
	List<BoardEntity> selectAllWithPagination(@Param("limit")  int limit, @Param("offset") int offset);

}
