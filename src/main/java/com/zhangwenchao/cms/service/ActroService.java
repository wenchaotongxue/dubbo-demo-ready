package com.zhangwenchao.cms.service;

import java.util.List;

import com.zhangwenchao.cms.pojo.Article;
import com.zhangwenchao.cms.pojo.Condations;

public interface ActroService {

	List<Article> list(String condition, Condations con);

}
