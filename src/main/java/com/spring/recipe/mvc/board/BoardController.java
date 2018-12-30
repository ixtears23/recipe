package com.spring.recipe.mvc.board;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/board")
public class BoardController {

	@GetMapping(value = "/index.do")
	public String index() {
		
		return "board/index";
	}
}
