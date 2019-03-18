package com.biz.books.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.biz.books.model.BookVO;
import com.biz.books.service.BookService;

@Controller
public class BookController {
	
	@Autowired
	BookService bs;
	
	@RequestMapping(value="write",method=RequestMethod.GET)
	public String book_write() {
		
		return "book_write";
	}
	
	@RequestMapping(value="write",method=RequestMethod.POST)
	public String book_write(@ModelAttribute BookVO vo) {
		
		bs.Bookinsert(vo);
		return "redirect:/";
	}
	


}
