package com.wk.service.impl;

import com.wk.dao.IndexDao;
import com.wk.service.IndexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service("service")
public class IndexServiceImpl implements IndexService {
	@Autowired
	private IndexDao dao;
	//构造方法
	public IndexServiceImpl(){
		System.out.println("service constructor");
	}
	//初始化方法
	@PostConstruct//使用初始化方法的注解
	public void init(){
		System.out.println("service init");
	}
	@Override
	public void query() {
		dao.query();
		System.out.println("service");
	}

	public void setDao(IndexDao dao) {
		this.dao = dao;
	}
}
