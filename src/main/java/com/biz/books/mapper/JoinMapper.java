package com.biz.books.mapper;

import org.apache.ibatis.annotations.InsertProvider;

import com.biz.books.model.MemberVO;

public interface JoinMapper {
	
	@InsertProvider(type=JoinSQLBuilder.class, method="getInsertsql")
	public int insert(MemberVO vo);
	

}
