package com.zhang.mgc.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zhang.mgc.dao.mapper.ClueMapper;
import com.zhang.mgc.model.Clue;
import com.zhang.mgc.service.ClueService;

@Service
public class ClueServiceImpl implements ClueService{
	
	@Autowired
	private ClueMapper clueMapper;

	/*
	 * 销售线索查询接口
	 * */
	@Override
	public List<Clue> selectClueBySomething(String status,String custSource,String personName,String phone,String page) {
		// TODO Auto-generated method stub
		int pageNum = Integer.parseInt(page);
		int startSize = 0;
		int endSize = 0;
		if (pageNum == 1) {
			endSize = pageNum * 10;
		}
		else {
			startSize = (pageNum - 1) * 10;
			endSize = pageNum * 10;
		};
		List<Clue> listClue= new ArrayList<Clue>();
		if ("全部".equals(status)) {
			status = "";
		};
		if ("全部".equals(custSource)) {
			custSource = "";
		};
		listClue = clueMapper.selectClueBySomething(status,custSource,personName,phone,startSize,endSize);
		System.out.println(listClue);
		return listClue;
	}

	/*
	 * 销售线索页面加载接口
	 * */
	@Override
	public List<Clue> selectClueInfo(String page) {
		int pageNum = Integer.parseInt(page);
		int startSize = 0;
		int endSize = 0;
		if (pageNum == 1) {
			endSize = pageNum * 10;
		}
		else {
			startSize = (pageNum - 1) * 10;
			endSize = pageNum * 10;
		};
		return clueMapper.selectClueInfo(startSize,endSize);
	}

	/*
	 * 销售线索获取数据总量
	 * */
	@Override
	public String getPage(String status,String custSource,String personName,String phone) {
		if ("全部".equals(status)) {
			status = "";
		};
		if ("全部".equals(custSource)) {
			custSource = "";
		};
		return clueMapper.getPage(status,custSource,personName,phone);
	}

	/*
	 * 获取产品信息
	 * */
	@Override
	public List<String> getPlan(String planType) {
		return clueMapper.getPlan(planType);
	}

	/*
	 * 添加线索
	 */
	@Override
	public void insertClue(Clue clue) {
		clueMapper.insertClue(clue);
	}

	 
	/*
	 * 修改线索表status
	 */
	@Override
	public void updateClue(String assignedTime, Integer clueId,Integer userId) {
		clueMapper.updateClue(assignedTime, clueId,userId);
	}
	
	
}
