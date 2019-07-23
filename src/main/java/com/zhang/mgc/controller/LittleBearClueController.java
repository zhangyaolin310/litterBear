package com.zhang.mgc.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
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
import com.zhang.mgc.model.User;
import com.zhang.mgc.service.ClueService;
import com.zhang.mgc.service.CustService;
import com.zhang.mgc.service.UserService;


@Controller
@RequestMapping("/user")
public class LittleBearClueController {
    
    @Autowired
    private ClueService clueservice;
    
    @Autowired
    private UserService userservice;
    
    @Autowired
    private CustService custservice;
    
    /**
     	进入主页
     * */
    @GetMapping("/index")
    public String index() {
    	
		return "index";
    }
    
    
    /**
		销售线索页面查询所有数据量
     */
    @GetMapping("/getPage")
    @ResponseBody
    public String getPage(HttpServletRequest request) {
    	String status = request.getParameter("status");
    	String custSource = request.getParameter("custSource");
    	String personName = request.getParameter("personName");
    	String phone = request.getParameter("phone");
    	System.out.println(status + custSource + personName + phone);
    	return clueservice.getPage(status,custSource,personName,phone);
    }
    
    /**
 		销售线索查询接口，根据条件查询数据
	*/
    @PostMapping("/clueinfo")
    @ResponseBody
    public List<Clue> selectClueBySomething(@RequestParam("status") String status,@RequestParam("custSource") String custSource,
    		@RequestParam("personName") String personName,@RequestParam("phone") String phone,@RequestParam("page")String page) {
    	System.out.println(phone + personName + status + custSource + page);
    	List<Clue> listClue= new ArrayList<Clue>();
    	listClue = clueservice.selectClueBySomething(status,custSource,personName,phone,page);
		return listClue;
	}
    
    /**
		销售线索页面加载所有数据
     */
    @GetMapping("/clueinfo")
    @ResponseBody
    public List<Clue> selectClueInfo(HttpServletRequest request) {
    	System.out.println("page:" + request.getParameter("page"));
    	List<Clue> listClue= new ArrayList<Clue>();
    	listClue = clueservice.selectClueInfo(request.getParameter("page"));
    	System.out.print("listClue:" + listClue);
		return listClue;
	}
    
    /**
	添加线索页面获取所有产品
     */
	@GetMapping("/getPlan")
	@ResponseBody
	public List<String> getPlan(HttpServletRequest request) {
		return clueservice.getPlan(request.getParameter("planType"));
	}
	
	/**
	添加线索
     */
	@PostMapping("/insertClue")
	public String insertClue(@RequestParam("custSource") String custSource,@RequestParam("phone") String phone,@RequestParam("province")String province,
    		@RequestParam("personName") String personName,@RequestParam("custName") String custName,@RequestParam("intentionPlan")String intentionPlan) {
		Clue clue = new Clue();
		clue.setCustSource(custSource);
		clue.setPhone(phone);
		if ("未知".equals(province) || province.isEmpty()) {
			province = "";
		}
		clue.setProvince(province);
		clue.setPersonName(personName);
		clue.setCustName(custName);
		if ("未知".equals(intentionPlan) || intentionPlan.isEmpty()) {
			intentionPlan = "";
		}
		clue.setIntentionPlan(intentionPlan);
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
		clue.setCreateTime(df.format(new Date()));
		clue.setStatus("待分配");
		System.out.println(clue);
		clueservice.insertClue(clue);
		return "/view/system/staffinfo/staffinfo_list";
	}
	
	/**
	获取销售人员清单
     */
	@GetMapping("/getXiaoshou")
	@ResponseBody
	public List<User> getXiaoshou() {
		return userservice.getXiaoshou();
	}
	
	/**
	销售线索--》分配任务
     */
	@PostMapping("/updateStatus")
	@ResponseBody
	public Map<String, String> updateStatus(@RequestParam("clueId")String clueId,@RequestParam("userId")String userId) {
		System.out.println("userId:" + userId);
		System.out.println("clueId:" + clueId);
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
		String assignedTime = df.format(new Date());
		clueservice.updateClue(assignedTime, Integer.parseInt(clueId),Integer.parseInt(userId));
		Map<String, String> map = new HashMap<>();
		String string = "/pages/view/system/staffinfo/staffinfo_list.html";
		map.put("url", string);
		return map;
	}
}
