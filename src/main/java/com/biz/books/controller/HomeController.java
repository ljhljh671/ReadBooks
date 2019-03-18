package com.biz.books.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.biz.books.model.BookVO;
import com.biz.books.service.BookService;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	@Autowired
	BookService bservice;
	
	@RequestMapping(value = "/", method = RequestMethod.GET, produces="text/html;charset=utf8")
	public String home(Model model) {
		
		List<BookVO> blist = bservice.getBookAllList();
		
		model.addAttribute("BLIST",blist);
		
		return "home";
	}
	
	
	
}
