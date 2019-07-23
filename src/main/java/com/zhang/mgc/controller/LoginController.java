package com.zhang.mgc.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mysql.cj.util.StringUtils;
import com.zhang.mgc.model.User;
import com.zhang.mgc.service.UserService;




@Controller
public class LoginController {
	
	@Autowired
    private UserService service;
	
	@GetMapping("/login")
    public String login() {
		System.out.println("这是没有参数的入口");
    	return "login";
    }
    
    @PostMapping("/login")
    public String login(@RequestParam("userId")String userId,@RequestParam("passWord")String passWord,Model map,HttpSession session) {
    	System.out.println("userId:" + userId);
    	String perPassword = new String();
    	User user = service.selectByName(userId);
    	if(user != null) {
    		perPassword = user.getPassword();
    	}
    	System.out.print("user:" + user);
    	if (user != null && perPassword.equals(passWord)) {
			session.setAttribute("userId", userId);
			return "redirect:/user/index";
		}
    	else {
			map.addAttribute("msg", "用户名或密码错误");
			return "login";
		}
    }
    
    @GetMapping("/loginOut")
    public String loginOut(HttpSession session) {
    	System.out.println("返回首页:" + session.getAttribute("userId"));
    	session.removeAttribute("userId");
    	System.out.println("userId:" + session.getAttribute("userId"));
    	return "login";
    }
}
