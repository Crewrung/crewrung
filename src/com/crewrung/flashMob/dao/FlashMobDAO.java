package com.crewrung.flashMob.dao;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.crewrung.db.DBCP;
import com.crewrung.flashMob.vo.FlashMobMainViewVO;

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

}
