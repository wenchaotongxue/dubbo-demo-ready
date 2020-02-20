package com.zhangwenchao.cms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zhangwenchao.cms.pojo.Article;
import com.zhangwenchao.cms.pojo.Condations;
import com.zhangwenchao.cms.service.ActroService;

@Controller
public class ActorController {
	
	
	 @Autowired
	 private ActroService actroService;
	
	@RequestMapping("list")
	public String ActorList(Model m,String condition,Condations con) {

		List<Article> articleList = actroService.list(condition,con);
		m.addAttribute("condition", condition);
		m.addAttribute("articleList", articleList);
		return "list";
	}
	
	
	

}
