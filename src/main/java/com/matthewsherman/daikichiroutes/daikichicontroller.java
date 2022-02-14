package com.matthewsherman.daikichiroutes;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class daikichicontroller {
	
	@RequestMapping("/daikichi")
	public String Welcome() {
		return "Welcome";
	}

	@RequestMapping("/daikichi/today")
	public String today() {
		return "today, you will find luck";
	}

	
	@RequestMapping("/daikichi/tomorrow")
	public String tomorrow() {
		return "Tomorrow, an opportunity will arise, so be sure to be open to new ideas!";
	}
	
	

}
