package com.crewrung.account.dao;

import java.time.LocalDate;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.crewrung.account.vo.JoinVO;
import com.crewrung.account.vo.LoginVO;
import com.crewrung.account.vo.MypageVO;
import com.crewrung.account.vo.UserIdFindVO;
import com.crewrung.account.vo.UserInfoVO;
import com.crewrung.account.vo.UserPwFindVO;
import com.crewrung.db.DBCP;

public class loginTestmain {
	public static void main(String[] args) {

		SqlSessionFactory sqlfactory = DBCP.getSqlSessionFactory();
		SqlSession session = sqlfactory.openSession();

		AccountDAO dao = new AccountDAO(session);
		// �α���
//		LoginVO loginVO = new LoginVO("donghyeok981", "FUtDrL6Cv8mZdZ5");
//
//		boolean result = dao.login(loginVO);
//
//		if(result == true){
//			System.out.println("�α��� ����: " + result);
//		}else{
//			System.out.println("�α��� ����");
//		}
//	���������� ��ȸ
//		MypageVO mypageVO = new MypageVO("donghyeok981");
//		MypageVO mypage = dao.getMypage(mypageVO.getUserId());
//		if(mypage != null){
//			if(mypage.getProfileImage() != null){
//				System.out.println(mypage.getProfileImage());
//			}else{
//				System.out.println("�̹����� �����ϴ�.");
//			}
//			if(mypage != null){
//				System.out.println(mypage.getNickname());
//				System.out.println(mypage.getEmail());
//				System.out.println(mypage.getPhoneNumber());
//			}
//			if(mypage.getIntroduction() != null){
//				System.out.println(mypage.getIntroduction());
//			}else{
//				System.out.println("�ڱ�Ұ��� �ۼ��ϼ���");
//			}
//			if(mypage.getCrewNames() != null){
//				System.out.println(mypage.getCrewNames());
//			}
//			if(mypage.getFlashMobTitles() != null){
//				System.out.println(mypage.getFlashMobTitles());
//			}
//		}
//		ȸ������
//		JoinVO joinVO = new JoinVO("user12","1234","�����","kik@gmail.com","010-1234-1234","������","����",
//				1144000000,"����� �ʵ��б� �̸���?","������","2025-04-12",null,null);
//		
//		int joinResult = dao.join(joinVO);
//		if(joinResult>0){
//			System.out.println("ȸ�����Լ���");
//		}else{
//			System.out.println("ȸ�����Խ���");
//		}
		
		// ���̵� ���� �ܷ�Ű �������� Ȯ�� �ʿ� 
//		UserInfoVO userinfoVO = new UserInfoVO("donghyeok981");
//		int removeResult = dao.removeUser(userinfoVO);
//		if(removeResult > 0){
//			System.out.println("ȸ�� Ż�� ����");
//		}else{
//			System.out.println("ȸ�� Ż�� ����");
//		}

// ���������� �̹���, �ڱ�Ұ� ����		
//		MypageVO setMypage = new MypageVO();
//		setMypage.setUserId("gyeonghyii18");
//		setMypage.setProfileImage("newimage");
//		int setMypageResult = dao.setMypage(setMypage);
//		if(setMypageResult > 0){
//			System.out.println("����Ϸ�");
//		}else{
//			System.out.println("�������");
//		}
//	���̵� ã��	
//		UserIdFindVO userIdFindVO = new UserIdFindVO();
//		userIdFindVO.setEmail("yeongilgim@gmail.com");
//		userIdFindVO.setQuestion("������ �ʵ��б���?");
//		userIdFindVO.setAnswer("�����ʵ��б�");
//		
//		String userId = dao.getUserId(userIdFindVO);
//		if(userId != null){
//			System.out.println("���̵� : " + userId);
//		}else{
//			System.out.println("��ġ�ϴ� ������ �����ϴ�.");
//		}
// ��й�ȣ ã��
//		UserPwFindVO userPwFindVO = new UserPwFindVO();
//		userPwFindVO.setUserId("gimsubin94");
//		userPwFindVO.setEmail("yeongilgim@gmail.com");
//		
//		String userPw = dao.getUserPw(userPwFindVO);
//		if(userPw != null){
//			System.out.println("��й�ȣ : " + userPw);
//		}else{
//			System.out.println("��ġ�ϴ� ���̵� �̸����� �����ϴ�.");
//		}
		// ���ѹ� Ȯ���ʿ�
		UserInfoVO userInfo = new UserInfoVO();
		userInfo.setUserId("gyeonghyii18");
		userInfo.setEmail("update@naver.com");
		int setuserInfoResult = dao.setUserInfo(userInfo);
		if(setuserInfoResult > 0){
			System.out.println("���� �Ϸ�");
		}else{
			System.out.println("���� ����");
		}
		
		
	}
}
