package com.devdh.simple.ex.persistence;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

@Repository
public class ExDAOImpl implements ExDAO{

	@Inject
	SqlSession sqlSession;
	
}
