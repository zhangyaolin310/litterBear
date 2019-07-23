package com.zhang.mgc.service.impl;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.zhang.mgc.dao.mapper.CustMapper;
import com.zhang.mgc.model.Clue;
import com.zhang.mgc.model.Cust;
import com.zhang.mgc.model.Defend;
import com.zhang.mgc.service.CustService;

@Service
public class CustServiceImpl implements CustService{
	
	@Autowired
	private CustMapper custMapper;

	/**
	 * 客户跟进页面加载接口
	 * */
	@Override
	public List<Clue> selectCustInfo(String page) {
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
		return custMapper.selectCustInfo(startSize, endSize);
	}

	/**
	 * 客户跟进页面加载数据量
	 * */
	@Override
	public String getFollowCustPage() {
		return custMapper.getFollowCustPage();
	}

	/**
	 * 客户跟进页面查询接口
	 * */
	@Override
	public List<Clue> selectCustBySomething(Clue clue) {
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
		if(clue.getUserId() == 0) {
			clue.setUserName(null);
		}
		if("未知".equals(clue.getIntentionPlan())) {
			clue.setIntentionPlan("");
		}
		if("全部".equals(clue.getFollowStatus())) {
			clue.setFollowStatus("");
		}
		return custMapper.selectCustBySomething(clue);
	}
	
	/**
	 * 客户跟进页面条件查询数据量
	 * */
	@Override
	public String getCustBySomethingPage(Clue clue) {
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
		if(clue.getUserId() == 0) {
			clue.setUserName(null);
		}
		if("未知".equals(clue.getIntentionPlan())) {
			clue.setIntentionPlan("");
		}
		if("全部".equals(clue.getFollowStatus())) {
			clue.setFollowStatus("");
		}
		return custMapper.getCustBySomethingPage(clue);
	}	

	/**
	 * 客户跟进页面重新分配销售
	 * */
	@Override
	public void updateStatusAgain(Integer userId, Integer clueId) {
		custMapper.updateStatusAgain(userId, clueId);
	}

	/**
	 * 客户跟进页面修改跟进状态
	 * */
	@Override
	public void updateClueFollowStatus(String followStatus,Long clueId) {
		custMapper.updateClueFollowStatus(followStatus,clueId);
	}

	/**
	 * 客户创建页面获取主营业务
	 * */
	@Override
	public List<String> getMainBusi() {
		return custMapper.getMainBusi();
	}
	
	/**
	 * 客户跟进页面创建客户
	 * */
	@Override
	public void insertCust(Cust cust) {
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
		String createTime = df.format(new Date());
		cust.setCreateTime(createTime);
		custMapper.insertCust(cust);
	}

	/**
	 * 客户创建页面获取企业类型
	 * */
	@Override
	public List<String> getBusiType() {
		return custMapper.getBusiType();
	}

	/**
	 * 客户创建页面获取运作资源主类型
	 * */
	@Override
	public List<String> getOperResources() {
		return custMapper.getOperResources();
	}

	/**
	 * 客户创建页面获取联系人身份
	 * */
	@Override
	public List<String> getPersonShenfen() {
		return custMapper.getPersonShenfen();
	}

	/**
	 * 客户创建页面获取采购动机
	 * */
	@Override
	public List<String> getPurchMotiva() {
		return custMapper.getPurchMotiva();
	}

	/**
	 * 客户创建页面获取采购方式
	 * */
	@Override
	public List<String> getPurchMethod() {
		return custMapper.getPurchMethod();
	}

	/**
	 * 客户创建页面获取重点需求
	 * */
	@Override
	public List<String> getImportRequire() {
		return custMapper.getImportRequire();
	}

	/**
	 * 客户创建页面获取可编辑选项
	 * */
	@Override
	public Clue getClueById(Long clueId) {
		return custMapper.getClueById(clueId);
	}

	/**
	 * 跟进维护获取维护客户信息
	 * */
	@Override
	public Cust getCustById(Long custId) {
		return custMapper.getCustById(custId);
	}

	/**
	 * 客户跟进页面修改客户信息
	 * */
	@Override
	public void updateCust(Cust cust) {
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//最近维护时间
		String defendTime = df.format(new Date());
		cust.setDefendTime(defendTime);
		custMapper.updateCust(cust);
		custMapper.insertDefend(cust);
	}

	/**
	 * 客户跟进页面修改客户演示状态
	 * */
	@Override
	public void updateShowStatus(String showStatus,String showAppointTime, Long custId) {
		custMapper.updateShowStatus(showStatus,showAppointTime,custId);
	}

	/**
	 * 客户跟进页面根据客户ID修改跟进状态为已申请演示
	 * */
	@Override
	public void updateClueFollowStatusBycust(String followStatus, Long custId) {
		custMapper.updateClueFollowStatusBycust(followStatus, custId);
	}

	/**
	 * 客户跟进页面获取客户终止原因
	 * */
	@Override
	public List<String> getStopCust() {
		return custMapper.getStopCust();
	}

	/**
	 * 客户跟进页面客户终止
	 * */
	@Override
	public void updateStopYuanyin(String stopYuanyin, String stopHuanjie, Long custId) {
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//最近维护时间
		String custStopTime = df.format(new Date());
		custMapper.updateStopYuanyin(custStopTime, stopHuanjie, stopYuanyin, custId);
	}

	/**
	 * 维护记录页面加载数据
	 * */
	@Override
	public List<Defend> getDefend(String page) {
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
		return custMapper.getDefend(startSize, endSize);
	}

	/**
	 * 维护记录页面获取数据量
	 * */
	@Override
	public String getDefendPage(String userName, String defendTime) {
		if("选择销售人员".equals(userName)) {
			userName = "";
		};
		return custMapper.getDefendPage(userName, defendTime);
	}

	/**
	 * 维护记录页面根据客户和维护时间获取s数据
	 * */
	@Override
	public List<Defend> selectDefendBySomething(String userName,String defendTime,String page) {
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
		if("选择销售人员".equals(userName)) {
			userName = "";
		};
		return custMapper.selectDefendBySomething(userName, defendTime, startSize, endSize);
	}
	
}
