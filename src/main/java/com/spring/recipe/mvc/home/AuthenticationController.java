package com.spring.recipe.mvc.home;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.spring.recipe.common.httpdto.HttpResponsePost;
import com.spring.recipe.mvc.home.vo.LoginVO;


@RestController
public class AuthenticationController {
	
	private static final Logger LOG = LoggerFactory.getLogger(AuthenticationController.class);
	
	@PostMapping(value = "/login.do")
	public ModelAndView login(LoginVO loginVO) {
		
//		HttpResponsePost response = new HttpResponsePost(loginVO);
		
		ModelAndView mav = new ModelAndView("home/index");
		mav.addObject("loginVO", loginVO);
		
		LOG.debug("AuthenticationController /login");
		
		return mav;
	}

}
