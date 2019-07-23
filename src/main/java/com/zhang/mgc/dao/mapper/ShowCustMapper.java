package com.zhang.mgc.dao.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.zhang.mgc.model.Clue;
import com.zhang.mgc.model.Cust;
import com.zhang.mgc.model.Defend;
import com.zhang.mgc.model.ShowPlan;

public interface ShowCustMapper {
	
	//产品演示页面加载获取数据
	List<Clue> getShowCust(@Param("startSize") Integer startSize,@Param("endSize")Integer endSize);
	
	//产品演示页面获取数据量
	String getShowCustPage();
	
	//产品演示页面条件搜索获取数据
	List<Clue> selectShowCustBySomething(Clue clue);
	
	//产品演示页面条件搜索获取数据量
	String getShowCustBySomethingPage(Clue clue);
	
	//获取意向服务方式
	List<String> getIntentionalServices();
	
	//添加演示产品
	void insertShowPlan(ShowPlan showPlan);
	
	//产品演示修改客户表中演示状态
	void updateShowStatus(@Param("showEndTime") String showEndTime,@Param("custId")Long custId);
	
	//产品演示申请合同接口
	void updateOnlyShowStatus(@Param("custId")Long custId);
	
}
