package com.biz.books.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.biz.books.mapper.JoinMapper;
import com.biz.books.model.MemberVO;

@Service
public class JoinService {
	
	@Autowired
	JoinMapper jmapper;
	
	public int joininsert(MemberVO vo) {
		
		int ret = jmapper.insert(vo);
		return ret;
	}

}
