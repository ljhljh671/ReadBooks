package com.biz.books.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class MemberVO {
	
	private int b_id;
	private String b_userid;
	private String b_password;
	private String b_re_password;
	private String b_hobby;
	

}
