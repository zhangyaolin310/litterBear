package com.zhang.mgc.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.zhang.mgc.model.Clue;
import com.zhang.mgc.model.Cust;
import com.zhang.mgc.model.Defend;

public interface CustService {

	//客户跟进页面加载获取数据
	List<Clue> selectCustInfo(String page);
	
	//客户跟进页面数据量
	String getFollowCustPage();
	
	//客户跟进页面查询接口
	List<Clue> selectCustBySomething(Clue clue);
	
	//客户跟进页面条件查询数据量
	String getCustBySomethingPage(Clue clue);
	
	//客户跟进页面重新分配销售人员
	void updateStatusAgain(Integer userId,Integer clueId);
	
	//客户跟进页面修改客户跟进状态
	void updateClueFollowStatus(String followStatus,Long clueId);
	
	//获取主营业务
	List<String> getMainBusi();
	
	//获取企业类型
	List<String> getBusiType();
	
	//获取运作资源主类型
	List<String> getOperResources();
	
	//获取联系人身份
	List<String> getPersonShenfen();
	
	//获取采购意向
	List<String> getPurchMotiva();
	
	//获取采购方式
	List<String> getPurchMethod();
	
	//获取重点需求
	List<String> getImportRequire();
	
	//客户跟进页面创建客户
	void insertCust(Cust cust);
	
	//客户创建页面可编辑选项
	Clue getClueById(Long clueId);
	
	//跟进维护获取需要维护的客户信息
	Cust getCustById(Long custId);
	
	//客户跟进页面维护客户
	void updateCust(Cust cust);
	
	//客户跟进页面修改演示状态
	void updateShowStatus(String showStatus,String showAppointTime,Long custId);
	
	//客户跟进页面根据客户ID修改跟进状态为已申请演示
	void updateClueFollowStatusBycust(String followStatus,Long custId);
	
	//获取终止客户原因
	List<String> getStopCust();
	
	//客户跟进页面终止客户
	void updateStopYuanyin(String stopYuanyin,String stopHuanjie,Long custId);
	
	//客户跟进页面加载获取数据
	List<Defend> getDefend(String page);
	
	//维护记录页面获取数据量
	String getDefendPage(String userName,String defendTime);
	
	//客户跟进页面根据客户和维护时间获取数据
	List<Defend> selectDefendBySomething(String userName,String defendTime,String page);
}
