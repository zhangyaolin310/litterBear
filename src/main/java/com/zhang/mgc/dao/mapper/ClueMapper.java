package com.zhang.mgc.dao.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.zhang.mgc.model.Clue;

public interface ClueMapper {

	//销售线索页面加载获取数据
	List<Clue> selectClueInfo(@Param("startSize") Integer statrSize,@Param("endSize")Integer endSize);
	//获取线索表数据量
	String getPage(@Param("status") String status,@Param("custSource")String custSource,
			@Param("personName") String personName,@Param("phone") String phone);
	//销售线索查询接口
	List<Clue> selectClueBySomething(@Param("status") String status,@Param("custSource")String custSource,
			@Param("personName") String personName,@Param("phone") String phone,
			@Param("startSize")Integer startSize,@Param("endSize")Integer endSize);
	//获取产品名称
	List<String> getPlan(@Param("planType") String planType);
	//添加线索数据
	void insertClue(Clue clue);
	
	//修改线索表status
	void updateClue(@Param("assignedTime") String assignedTime,@Param("clueId")Integer clueId,@Param("userId")Integer userId);
	
}
