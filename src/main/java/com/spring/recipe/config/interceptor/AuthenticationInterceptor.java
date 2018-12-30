package com.spring.recipe.config.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class AuthenticationInterceptor extends HandlerInterceptorAdapter {
	
	
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		
		HttpSession session = request.getSession();
		
		boolean sessionIsNew = session.isNew();
		
		if(sessionIsNew) {
			session.invalidate();
			response.sendRedirect("/home/index.do");
		}
		
		return super.preHandle(request, response, handler);
	}

}
