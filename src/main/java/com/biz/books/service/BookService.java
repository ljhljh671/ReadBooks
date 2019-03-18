package com.biz.books.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.biz.books.mapper.BookMapper;
import com.biz.books.model.BookVO;

@Service
public class BookService {
	
	@Autowired
	BookMapper bmapper;
	
	public List<BookVO> getBookAllList() {
		
		List<BookVO> bookVO = bmapper.selectAll();
		
		return bookVO;
	}
	
	public int Bookinsert(BookVO vo) {
		
		int ret = bmapper.insert(vo);
		
		return ret;
	}
	
	


}
