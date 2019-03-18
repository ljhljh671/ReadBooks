package com.biz.books.mapper;

import org.apache.ibatis.jdbc.SQL;

public class JoinSQLBuilder {
	
	public String getInsertsql() {
		
		SQL sql = new SQL()
				.INSERT_INTO("tbl_join")
				.VALUES("b_id","seq_join.nextval")
				.VALUES("b_userid", "#{b_userid}")
				.VALUES("b_password", "#{b_password}")
				.VALUES("b_re_password", "#{b_re_password}")
				.VALUES("b_hobby", "#{b_hobby}");
				
		return sql.toString();
	}
	
	

}
