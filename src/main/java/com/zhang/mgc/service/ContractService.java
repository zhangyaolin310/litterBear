package com.zhang.mgc.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.zhang.mgc.model.Clue;
import com.zhang.mgc.model.Contract;
import com.zhang.mgc.model.Cust;
import com.zhang.mgc.model.Defend;

public interface ContractService {

	//合同收款页面加载获取数据
	List<Contract> selectContractInfo(String page);
	
	//合同收款页面获取数据量
	String getContractPage();

}
