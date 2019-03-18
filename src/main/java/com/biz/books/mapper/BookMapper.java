package com.biz.books.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.UpdateProvider;

import com.biz.books.model.BookVO;

public interface BookMapper {
	
	@Select("SELECT * FROM tbl_books")
	public List<BookVO> selectAll();
	
	@Select("SELECT * FROM tbl_books WHERE b_id=#{b_id}")
	public List<BookVO> findById();
	
	@InsertProvider(type=BookSQLBuilder.class, method="getInsertsql")
	public int insert(BookVO vo);
	
	@UpdateProvider(type=BookSQLBuilder.class, method="getUpdatesql")
	public int update(BookVO vo);
	
	@Delete("DELETE FROM tbl_books WHERE b_id = #{b_id}")
	public int delete(String b_id);

}
