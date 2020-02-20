package com.zhangwenchao.cms.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zhangwenchao.cms.dao.ActroDao;
import com.zhangwenchao.cms.pojo.Article;
import com.zhangwenchao.cms.pojo.Condations;
import com.zhangwenchao.cms.service.ActroService;
@Service
public class ActroServiceImpl implements ActroService {
 
	 @Autowired
	 private ActroDao actroDao;
	
	 @Override
		public List<Article> list(String condition,Condations con) {
			// TODO Auto-generated method stub
			return actroDao.list(condition,con);
		}

}
