package com.javaex.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.javaex.vo.PersonVo;

@Repository
public class PhonebookDao {

	@Autowired
	private SqlSession sqlSession;

	public List<PersonVo> selectList() {
		System.out.println("PhonebookDao.selectList()");

		return sqlSession.selectList("phonebook.select");
	}

}
