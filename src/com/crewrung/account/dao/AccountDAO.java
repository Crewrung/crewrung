package com.crewrung.account.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.crewrung.account.vo.JoinVO;
import com.crewrung.account.vo.LoginVO;
import com.crewrung.account.vo.MypageVO;
import com.crewrung.account.vo.UserIdFindVO;
import com.crewrung.account.vo.UserInfoVO;
import com.crewrung.account.vo.UserPwFindVO;
import com.crewrung.account.vo.UserSetVO;

public class AccountDAO {

	SqlSession con;

	public AccountDAO(SqlSession sqlsession){
		this.con = sqlsession;
	}

	// �α���
	public boolean login(LoginVO loginVO){
		return con.selectOne("accountMapper.Login",loginVO) != null ? true : false;
	}

	// ����������
	public MypageVO getMypage(String userId){
		MypageVO mypage = con.selectOne("accountMapper.getMypageInfo", userId);

		if (mypage != null){
			List<String> crewNames = con.selectList("accountMapper.getMypageCrew", userId);
			mypage.setCrewNames(crewNames);

			List<String> flashMobTitles = con.selectList("accountMapper.getMypageFlashMob", userId);
			mypage.setFlashMobTitles(flashMobTitles);
		}
		return mypage;
	}
	
	// ����������  ����
	public int setMypage(MypageVO mypageVO){
		return con.update("accountMapper.setMypage", mypageVO);
	}
	
	// ȸ������
	public int join(JoinVO joinVO){
		return con.insert("accountMapper.Join", joinVO);
	}
	
	// ȸ��Ż��
	public int removeUser(UserInfoVO userInfoVO){
		return con.delete("accountMapper.removeUser", userInfoVO);
	}
	
	// ���̵� ã��
	public String getUserId(UserIdFindVO useridFindVO){
		return con.selectOne("accountMapper.getUserId", useridFindVO);
	}
	
	// ��й�ȣ ã��
	public String getUserPw(UserPwFindVO userPwFindVO){
		return con.selectOne("accountMapper.getUserPw", userPwFindVO);
	}
	
	// �������� ����
	public int setUserInfo(UserInfoVO userInfoVO){
		return con.update("accountMapper.setUserInfo", userInfoVO);
	}
	
	// ���̵� �ߺ� üũ
	public int isUserIdExist(JoinVO joinVO){
		return con.selectOne("accountMapper.isUserIdExist", joinVO);
	}
	// �̸��� �ߺ� üũ
	public int isEmailExist(JoinVO joinVO){
		return con.selectOne("accountMapper.isEmailExist", joinVO);
	}
	// �г��� �ߺ� üũ
	public int isNickNameExist(JoinVO joinVO){
		return con.selectOne("accountMapper.isNickNameExist", joinVO);
	}
	


}
