package com.biz.books.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.biz.books.model.MemberVO;
import com.biz.books.service.JoinService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
public class JoinController {
	
	@Autowired
	JoinService js;
	
	
	@RequestMapping(value="join",method=RequestMethod.GET)
	public String join() {
		
		return "join";
	}
	
	
	@RequestMapping(value="join",method=RequestMethod.POST)
	public String join_insert(@ModelAttribute MemberVO vo) {
		
		log.debug(vo.toString());
		
		js.joininsert(vo);
		
		return "redirect:/";
	}
	
}
