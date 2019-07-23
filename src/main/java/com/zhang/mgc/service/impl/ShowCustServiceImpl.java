package com.zhang.mgc.service.impl;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.zhang.mgc.dao.mapper.CustMapper;
import com.zhang.mgc.dao.mapper.ShowCustMapper;
import com.zhang.mgc.model.Clue;
import com.zhang.mgc.model.Cust;
import com.zhang.mgc.model.Defend;
import com.zhang.mgc.model.ShowPlan;
import com.zhang.mgc.service.CustService;
import com.zhang.mgc.service.ShowCustService;

@Service
public class ShowCustServiceImpl implements ShowCustService{
	
	@Autowired
	private ShowCustMapper showCustMapper;

	/**
	 * 产品演示页面加载接口
	 * */
	@Override
	public List<Clue> getShowCust(String page) {
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
		return showCustMapper.getShowCust(startSize, endSize);
	}

	/**
	 * 产品演示页面获取数据量
	 * */
	@Override
	public String getShowCustPage() {
		return showCustMapper.getShowCustPage();
	}

	/**
	 * 产品演示页面条件搜索接口
	 * */
	@Override
	public List<Clue> selectShowCustBySomething(Clue clue) {
		if ("未知".equals(clue.getIntentionPlan())) {
			clue.setIntentionPlan(null);
		}
		if ("全部".equals(clue.getShowStatus())) {
			clue.setShowStatus(null);;
		}
		if (clue.getUserId() == 0) {
			clue.setUserId(null);
		}
		int pageNum = Integer.parseInt(clue.getPage());
		int startSize = 0;
		int endSize = 0;
		if (pageNum == 1) {
			endSize = pageNum * 10;
		}
		else {
			startSize = (pageNum - 1) * 10;
			endSize = pageNum * 10;
		};
		clue.setStartSize(startSize);
		clue.setEndSize(endSize);
		return showCustMapper.selectShowCustBySomething(clue);
	}

	/**
	 * 产品演示页面条件搜索获取数据量
	 * */
	@Override
	public String getShowCustBySomethingPage(Clue clue) {
		if ("未知".equals(clue.getIntentionPlan())) {
			clue.setIntentionPlan(null);
		}
		if ("全部".equals(clue.getShowStatus())) {
			clue.setShowStatus(null);;
		}
		if (clue.getUserId() == 0) {
			clue.setUserId(null);
		}
		return showCustMapper.getShowCustBySomethingPage(clue);
	}

	/**
	 * 申请演示页面获取意向服务方式
	 * */
	@Override
	public List<String> getIntentionalServices() {
		System.out.println(showCustMapper.getIntentionalServices());
		return showCustMapper.getIntentionalServices();
	}

	/**
	 * 添加演示产品
	 * */
	@Override
	public void insertShowPlan(ShowPlan showPlan) {
		showCustMapper.insertShowPlan(showPlan);
	}

	/**
	 * 添加演示产品,修改客户演示状态
	 * */
	@Override
	public void updateShowStatus(ShowPlan showPlan) {
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
		String showEndTime = df.format(new Date());
		showCustMapper.updateShowStatus(showEndTime, showPlan.getCustId());
	}

	/**
	 * 产品演示申请合同接口
	 * */
	@Override
	public void updateOnlyShowStatus(Long custId) {
		showCustMapper.updateOnlyShowStatus(custId);
	}
	
}
