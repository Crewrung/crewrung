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
			return "���̵� �̹� �����մϴ�";
		}
		
		int emailCheck = accountDAO.isEmailExist(joinVO);
		if (emailCheck > 0){
			return "�̸����� �̹� �����մϴ�";
		}
		
		int nickname = accountDAO.isNickNameExist(joinVO);
		if (nickname > 0){
			return "�г����� �̹� �����մϴ�";
		}
		
		int joinUser = accountDAO.join(joinVO);
		if(joinUser > 0){
			return "ȸ������ ����";
		}else{
			return "ȸ������ ����";
		}
	}
}
