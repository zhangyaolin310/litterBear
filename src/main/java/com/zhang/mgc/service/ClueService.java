package com.zhang.mgc.service;

import java.util.List;

import com.zhang.mgc.model.Clue;

public interface ClueService {

	//销售线索页面加载获取数据
	List<Clue> selectClueInfo(String page);
	//销售线索获取线索表数据量
	String getPage(String status,String custSource,String personName,String phone);
	//销售线索页面查询接口
	List<Clue> selectClueBySomething(String status,String custSource,String personName,String phone,String page);
	//获取产品名称
	List<String> getPlan(String planType);
	//添加线索数据
	void insertClue(Clue clue);
	//修改线索表status
	void updateClue(String assignedTime,Integer clueId,Integer userId);
}
