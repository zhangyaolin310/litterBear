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
import com.zhang.mgc.model.Cust;
import com.zhang.mgc.model.Defend;
import com.zhang.mgc.model.ShowPlan;
import com.zhang.mgc.model.User;
import com.zhang.mgc.service.ClueService;
import com.zhang.mgc.service.CustService;
import com.zhang.mgc.service.ShowCustService;
import com.zhang.mgc.service.UserService;

@Controller
@RequestMapping("/user")
public class LittleBearShowCustController {

	@Autowired
	private ShowCustService showCustservice;

	/**
	 * 产品演示页面获取数据
	 */
	@GetMapping("/getShowCust")
	@ResponseBody
	public List<Clue> getShowCust(HttpServletRequest request) {
		System.out.println("page:" + request.getParameter("page"));
		List<Clue> listClue = new ArrayList<Clue>();
		listClue = showCustservice.getShowCust(request.getParameter("page"));
		System.out.print("listClue:" + listClue);
		return listClue;
	}
	/**
	 * 产品演示页面获取数据量
	 */
	@GetMapping("/getShowCustPage")
	@ResponseBody
	public String getShowCustPage() {
		return showCustservice.getShowCustPage();
	}
	
	/**
	 * 产品演示页面条件搜索获取数据
	 */
	@PostMapping("/selectShowCustBySomething")
	@ResponseBody
	public List<Clue> selectShowCustBySomething(@RequestBody Clue clue ) {
		System.out.println(clue);
		return showCustservice.selectShowCustBySomething(clue);
	}
	
	/**
	 * 产品演示页面条件搜索获取数据
	 */
	@PostMapping("/getShowCustBySomethingPage")
	@ResponseBody
	public Map<String, String> getShowCustBySomethingPage(@RequestBody Clue clue ) {
		Map<String, String> map = new HashMap<>();
		String string = showCustservice.getShowCustBySomethingPage(clue);
		map.put("sum", string);
		return map;
	}
	
	/**
	 * 产品演示页面申请演示
	 */
	@PostMapping("/insertShowPlan")
	@ResponseBody
	public Map<String, String> insertShowPlan(@RequestBody ShowPlan showPlan ) {
		System.out.println(showPlan);
		Map<String, String> map = new HashMap<>();
		String string = "/pages/view/recruitstudent/studentpool/studentpool_list.html";
		try {
			showCustservice.insertShowPlan(showPlan);
			showCustservice.updateShowStatus(showPlan);
		} catch (Exception e) {
			// TODO: handle exception
		}
		map.put("url", string);
		return map;
	}
	
	/**
	 * 申请演示页面获取意向服务方式
	 * */
	@GetMapping("/getIntentionalServices")
	@ResponseBody
	public List<String> getIntentionalServices() {
		return showCustservice.getIntentionalServices();
	}
	
	/**
	 * 申请演示页面申请合同接口
	 * */
	@GetMapping("/shenqingHetong")
	@ResponseBody
	public Map<String, String> shenqingHetong(HttpServletRequest request) {
		showCustservice.updateOnlyShowStatus(Long.valueOf(request.getParameter("custId")));
		Map<String, String> map = new HashMap<>();
		String string = "申请成功";
		map.put("str", string);
		return map;
	}
}
