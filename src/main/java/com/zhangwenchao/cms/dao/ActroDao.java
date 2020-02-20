package com.zhangwenchao.cms.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.zhangwenchao.cms.pojo.Article;
import com.zhangwenchao.cms.pojo.Condations;

public interface ActroDao {

	List<Article> list(@Param("condition")String condition, @Param("con")Condations con);


}
