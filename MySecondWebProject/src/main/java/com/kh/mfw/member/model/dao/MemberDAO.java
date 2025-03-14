package com.kh.mfw.member.model.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.ibatis.session.SqlSession;

import com.kh.mfw.member.model.dto.MemberDTO;

public class MemberDAO {
	
	public MemberDTO login(SqlSession sqlSession, MemberDTO member) {
		
		// sqlsession이 제공하는 메소스를 통해 sql문을 찾아서 실행하고 결과를 받을 수 있음
		// sqlsession.sql문종류에 맞는 메소드("mapper파일의namspace.sql문의 id속성값");
		
		//MemberDTO loingnMember = sqlSession.selectOne("memberMapper.login",member);
		//System.out.println(loingnMember);
		return sqlSession.selectOne("memberMapper.login",member);
	}
	
	public boolean checkId(SqlSession sqlSession, String memberId) {
		/*
		int result = sqlSession.selectOne("memberMapper.checkId", memberId);
		
		if(result > 0) {
			return true;
		} else {
			return false;
		} */
		return (Integer)sqlSession.selectOne("memberMapper.checkId", memberId) > 0 ? true : false;
	
	}
	
	
	
	// 의사 결정 코드
	public int signUp(SqlSession sqlSession, MemberDTO member) {
		
		// 3차 유효성 검증 (Java)
		
		// 4차 데이터무결성을 위한 제약조건(DBMS)
		
		
		// 아이디 중복검사
		return sqlSession.insert("memberMapper.signUp", member);
	}
	
	
	
}
