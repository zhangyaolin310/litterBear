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
import com.zhang.mgc.model.User;
import com.zhang.mgc.service.ClueService;
import com.zhang.mgc.service.CustService;
import com.zhang.mgc.service.UserService;

@Controller
@RequestMapping("/user")
public class LittleBearCustController {

	@Autowired
	private ClueService clueservice;

	@Autowired
	private UserService userservice;

	@Autowired
	private CustService custservice;

	/**
	 * 客户跟进页面查询所有数据量
	 */
	@GetMapping("/getFollowCustPage")
	@ResponseBody
	public String getFollowCustPage() {
		return custservice.getFollowCustPage();
	}

	/**
	 * 客户跟进页面获取数据
	 */
	@GetMapping("/custinfo")
	@ResponseBody
	public List<Clue> selectCustInfo(HttpServletRequest request) {
		System.out.println("page:" + request.getParameter("page"));
		List<Clue> listClue = new ArrayList<Clue>();
		listClue = custservice.selectCustInfo(request.getParameter("page"));
		System.out.print("listClue:" + listClue);
		return listClue;
	}

	/**
	 * 客户跟进页面条件查询数据
	 */
	@PostMapping("/selectCustBySomething")
	@ResponseBody
	public List<Clue> selectCustBySomething(@RequestBody Clue clue) {
		System.out.println("有数据传输进来");
		System.out.println(clue);
		return custservice.selectCustBySomething(clue);
	}
	
	/**
	 * 客户跟进页面条件查询数据量
	 */
	@PostMapping("/getCustBySomethingPage")
	@ResponseBody
	public Map<String, String> getCustBySomethingPage(@RequestBody Clue clue) {
		System.out.println(clue);
		Map<String, String> map = new HashMap<>();
		String string = custservice.getCustBySomethingPage(clue);
		map.put("sum", string);
		return map;
	}

	/**
	 * 客户跟进页面重新分配按钮
	 */
	@PostMapping("/updateStatusAgain")
	@ResponseBody
	public Map<String, String> updateStatusAgain(@RequestParam("clueId") String clueId,
			@RequestParam("userId") String userId) {
		System.out.println("userId:" + userId);
		System.out.println("clueId:" + clueId);
		System.out.println(!"选择销售人员".equals(userId));
		if (!("选择销售人员".equals(userId))) {
			custservice.updateStatusAgain(Integer.parseInt(userId), Integer.parseInt(clueId));
		}
		Map<String, String> map = new HashMap<>();
		String string = "/pages/view/marketactive/marketactive/marketactive_list.html";
		map.put("url", string);
		return map;
	}

	/**
	 * 创建客户页面获取主营业务
	 */
	@GetMapping("/getMainBusi")
	@ResponseBody
	public List<String> getPlan() {
		return custservice.getMainBusi();
	}
	
	/**
	 * 创建客户页面获取企业类型
	 */
	@GetMapping("/getBusiType")
	@ResponseBody
	public List<String> getBusiType() {
		return custservice.getBusiType();
	}
	
	/**
	 * 创建客户页面获取运作资源主类型
	 */
	@GetMapping("/getOperResources")
	@ResponseBody
	public List<String> getOperResources() {
		return custservice.getOperResources();
	}
	
	/**
	 * 创建客户页面获取联系人身份
	 */
	@GetMapping("/getPersonShenfen")
	@ResponseBody
	public List<String> getPersonShenfen() {
		return custservice.getPersonShenfen();
	}
	
	/**
	 * 创建客户页面获取采购意向
	 */
	@GetMapping("/getPurchMotiva")
	@ResponseBody
	public List<String> getPurchMotiva() {
		return custservice.getPurchMotiva();
	}
	
	/**
	 * 创建客户页面获取采购方式
	 */
	@GetMapping("/getPurchMethod")
	@ResponseBody
	public List<String> getPurchMethod() {
		return custservice.getPurchMethod();
	}
	
	/**
	 * 创建客户页面获取重点需求
	 */
	@GetMapping("/getImportRequire")
	@ResponseBody
	public List<String> getImportRequire() {
		return custservice.getImportRequire();
	}

	/**
	 * 客户跟进创建客户
	 */
	@PostMapping("/insertCust")
	@ResponseBody
	public Map<String, String> insertCust(@RequestBody Cust cust) {
		System.out.println(cust);
		Map<String, String> map = new HashMap<>();
		String string = "/pages/view/marketactive/marketactive/marketactive_list.html";
		map.put("url", string);
		String followStatus = "跟进中";
		custservice.updateClueFollowStatus(followStatus,cust.getClueId());
		custservice.insertCust(cust);
		return map;
	}
	
	/**
	 * 客户创建页面获取可编辑选项
	 */
	@GetMapping("/getClueById")
	@ResponseBody
	public Clue getClueById(HttpServletRequest request) {
		System.out.println("clueId:" + request.getParameter("clueId"));
		Clue clue = new Clue();
		clue = custservice.getClueById(Long.valueOf(request.getParameter("clueId")));
		System.out.println(clue);
		return clue;
	}
	
	/**
	 * 跟进维护获取维护的客户信息
	 */
	@GetMapping("/getCustById")
	@ResponseBody
	public Cust getCustById(HttpServletRequest request) {
		System.out.println("custId:" + request.getParameter("custId"));
		Cust cust = new Cust();
		cust = custservice.getCustById(Long.valueOf(request.getParameter("custId")));
		System.out.println(cust);
		return cust;
	}
	
	/**
	 * 客户跟进维护客户和添加维护信息
	 */
	@PostMapping("/updateCust")
	@ResponseBody
	public Map<String, String> updateCust(@RequestBody Cust cust,HttpSession session) {
		System.out.println(cust);
		System.out.println("userId:" + session.getAttribute("userId"));
		Map<String, String> map = new HashMap<>();
		String string = "";
		map.put("url", string);
		cust.setDefendPerson(String.valueOf(session.getAttribute("userId")));
		//修改客户信息和添加维护信息
		custservice.updateCust(cust);
		return map;
	}
	
	/**
	 * 客户跟进页面申请预约
	 */
	@PostMapping("/updateShowStatus")
	@ResponseBody
	public Map<String, String> updateShowStatus(@RequestParam("custId") String custId,
			@RequestParam("showAppointTime") String showAppointTime) {
		System.out.println("custId:" + custId);
		System.out.println("showAppointTime:" + showAppointTime);
		Map<String, String> map = new HashMap<>();
		String string = "/pages/view/marketactive/marketactive/marketactive_list.html";
		map.put("url", string);
		//修改线索表中的跟进状态
		String followStatus = "已申请演示";
		custservice.updateClueFollowStatusBycust(followStatus,Long.valueOf(custId));
		//修改客户表中的演示状态
		String showStatus = "待演示";
		custservice.updateShowStatus(showStatus,showAppointTime, Long.valueOf(custId));
		return map;
	}
	
	/**
	 * 客户跟进页面获取客户终止原因
	 */
	@GetMapping("/getStopCust")
	@ResponseBody
	public List<String> getStopCust() {
		return custservice.getStopCust();
	}
	
	/**
	 * 客户跟进页面终止客户
	 */
	@PostMapping("/updateStopYuanyin")
	@ResponseBody
	public Map<String, String> updateStopYuanyin(@RequestParam("custId") String custId,
			@RequestParam("stopYuanyin") String stopYuanyin,@RequestParam("stopHuanjie") String stopHuanjie) {
		System.out.println("custId:" + custId+"showAppointTime:" + stopYuanyin+"stopHuanjie:" + stopHuanjie);
		Map<String, String> map = new HashMap<>();
		String string = "/pages/view/marketactive/marketactive/marketactive_list.html";
		map.put("url", string);
		custservice.updateStopYuanyin(stopYuanyin, stopHuanjie, Long.valueOf(custId));
		return map;
	}
	
	/**
	 * 维护记录页面获取数据
	 */
	@GetMapping("/getDefend")
	@ResponseBody
	public List<Defend> getDefend(HttpServletRequest request) {
		System.out.println("page:" + request.getParameter("page"));
		List<Defend> listDefend = new ArrayList<Defend>();
		listDefend = custservice.getDefend(request.getParameter("page"));
		System.out.print("listClue:" + listDefend);
		return listDefend;
	}
	
	/**
	 * 维护记录页面查询所有数据量
	 */
	@GetMapping("/getDefendPage")
	@ResponseBody
	public String getDefendPage(HttpServletRequest request){
		System.out.println("userName:" + request.getParameter("userName")+"defendTime:" + request.getParameter("defendTime"));
		return custservice.getDefendPage(request.getParameter("userName"),request.getParameter("defendTime"));
	}
	
	/**
	 * 维护记录页面获取数据
	 */
	@PostMapping("/selectDefendBySomething")
	@ResponseBody
	public List<Defend> selectDefendBySomething(@RequestParam("userName") String userName,@RequestParam("defendTime") String defendTime,
			@RequestParam("page") String page) {
		System.out.println("userName:" + userName+"defendTime:" + defendTime);
		List<Defend> listDefend = new ArrayList<Defend>();
		listDefend = custservice.selectDefendBySomething(userName, defendTime, page);
		return listDefend;
	}
}
