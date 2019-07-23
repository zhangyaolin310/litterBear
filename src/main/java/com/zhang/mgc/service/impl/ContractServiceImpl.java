package com.zhang.mgc.service.impl;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zhang.mgc.dao.mapper.ContractMapper;
import com.zhang.mgc.model.Contract;
import com.zhang.mgc.service.ContractService;

@Service
public class ContractServiceImpl implements ContractService{
	
	@Autowired
	private ContractMapper contractMapper;

	/**
	 * 合同收款页面加载接口
	 * */
	@Override
	public List<Contract> selectContractInfo(String page) {
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
		return contractMapper.selectContractInfo(startSize, endSize);
	}

	/**
	 * 合同收款页面加载获取数据量
	 * */
	@Override
	public String getContractPage() {
		return contractMapper.getContractPage();
	}
	
}
