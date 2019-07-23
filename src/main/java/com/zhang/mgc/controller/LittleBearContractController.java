package com.zhang.mgc.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zhang.mgc.model.Clue;
import com.zhang.mgc.model.Contract;
import com.zhang.mgc.model.Cust;
import com.zhang.mgc.model.Defend;
import com.zhang.mgc.model.User;
import com.zhang.mgc.service.ClueService;
import com.zhang.mgc.service.ContractService;
import com.zhang.mgc.service.CustService;
import com.zhang.mgc.service.UserService;

@Controller
@RequestMapping("/user")
public class LittleBearContractController {
	
	@Autowired
	private ContractService contractService;

	/**
	 * 合同收款页面获取数据
	 */
	@GetMapping("/contract")
	@ResponseBody
	public List<Contract> selectContractInfo(HttpServletRequest request) {
		System.out.println("page:" + request.getParameter("page"));
		List<Contract> listContract = new ArrayList<Contract>();
		listContract = contractService.selectContractInfo(request.getParameter("page"));
		System.out.print("listContract:" + listContract);
		return listContract;
	}
	
	/**
	 * 合同收款页面获取数据量
	 */
	@GetMapping("/getContractPage")
	@ResponseBody
	public String getContractPage() {
		return contractService.getContractPage();
	}

}
