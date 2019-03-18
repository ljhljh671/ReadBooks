package com.biz.books.mapper;

import org.apache.ibatis.jdbc.SQL;

public class BookSQLBuilder {
	
	public String getInsertsql() {
		
		SQL sql = new SQL()
				.INSERT_INTO("tbl_books")
				.VALUES("b_id", "book_seq.nextval")
				.VALUES("b_userid", "#{b_userid}")
				.VALUES("b_isbn", "#{b_isbn}")
				.VALUES("b_title", "#{b_title}")
				.VALUES("b_date", "#{b_date}")
				.VALUES("b_star", "#{b_star}")
				.VALUES("b_text", "#{b_text}") ;
		
		return sql.toString();
	}
	
	public String getUpdatesql() {
		
		SQL sql = new SQL()
				.UPDATE("tbl_books")
				.SET("b_id = #{b_id}")
				.SET("b_userid = #{b_userid}")
				.SET("b_isbn = #{b_isbn}")
				.SET("b_title = #{b_title}")
				.SET("b_date = #{b_date}")
				.SET("b_star = #{b_star}")
				.SET("b_text = #{b_text}") ;
		
		
		return sql.toString();
	}

}
