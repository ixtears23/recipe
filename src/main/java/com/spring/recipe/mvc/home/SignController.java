package com.spring.recipe.mvc.home;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SignController {

	@GetMapping(value = "/sign.do")
	public String sign() {
		
		return "sign";
	}
	
	
}
