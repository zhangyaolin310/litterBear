package com.zhang.mgc.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;


@Component
public class LoginInterceptor implements HandlerInterceptor {
	private static final Logger log = LoggerFactory.getLogger(LoginInterceptor.class);
	
	@Override

    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)

            throws Exception {

        // TODO Auto-generated method stub

        log.info("------preHandle------");

        // 获取session

        HttpSession session = request.getSession(true);
        log.info((String) session.getAttribute("userId"));

        // 判断用户ID是否存在，不存在就跳转到登录界面

        if (session.getAttribute("userId") == null) {

            log.info("------:跳转到login页面！");

            System.out.println(request.getContextPath() + "/login");

            response.sendRedirect("/login");

            return false;

        } else {

            return true;

        }

    }



    @Override

    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,

            ModelAndView modelAndView) throws Exception {

        // TODO Auto-generated method stub

    }



    @Override

    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)

            throws Exception {

        // TODO Auto-generated method stub

    }
}
