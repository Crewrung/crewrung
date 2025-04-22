package com.crewrung.flashMob.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import com.crewrung.flashMob.vo.FlashMobMainViewVO;
import com.crewrung.flashMob.vo.FlashMobVO;

public class FlashMobDAO {
	SqlSession con;
	
	public FlashMobDAO(SqlSession sqlSession) {
		
		this.con = sqlSession;

	}
	
	public List<FlashMobMainViewVO> getAllFlashMobs() {
		List<FlashMobMainViewVO> result = new ArrayList<>();
		result = con.selectList("flashMobMapper.getAllFlashMobs");
		con.close();
		return result;
	}
	
	public List<FlashMobMainViewVO> getAllFlashMobsByFilter(Map<String, String> filter) {
		List<FlashMobMainViewVO> result = new ArrayList<>();
		result = con.selectList("flashMobMapper.getAllFlashMobsByFilter", filter);
		con.close();
		return result;
	}
	
	public int addFlashMob(FlashMobVO flashMobVO) {
		int result = 0;
		result = con.insert("flashMobMapper.addFlashMob", flashMobVO);
		return result;
	}
	
	public FlashMobVO getFlashMobDetail(int flashMobNumber) {
		FlashMobVO result = null;
		result = con.selectOne("flashMobMapper.getFlashMobDetail", flashMobNumber);
		return result;
	}

}
