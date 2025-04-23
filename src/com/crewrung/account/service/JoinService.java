package com.crewrung.account.service;

import org.apache.ibatis.session.SqlSessionFactory;

import com.crewrung.account.dao.AccountDAO;
import com.crewrung.account.vo.JoinVO;

public class JoinService {
	
	private AccountDAO accountDAO;
	private SqlSessionFactory sqlSessionFactory;
	
	public JoinService(AccountDAO accountDAO){
		this.accountDAO = accountDAO;
	}
	
	public String JoinUser(JoinVO joinVO){
		int userIdCheck = accountDAO.isUserIdExist(joinVO);
		if(userIdCheck > 0){
			return "아이디가 이미 존재합니다";
		}
		
		int emailCheck = accountDAO.isEmailExist(joinVO);
		if (emailCheck > 0){
			return "이메일이 이미 존재합니다";
		}
		
		int nickname = accountDAO.isNickNameExist(joinVO);
		if (nickname > 0){
			return "닉네임이 이미 존재합니다";
		}
		
		int joinUser = accountDAO.join(joinVO);
		if(joinUser > 0){
			return "회원가입 성공";
		}else{
			return "회원가입 실패";
		}
	}
}
