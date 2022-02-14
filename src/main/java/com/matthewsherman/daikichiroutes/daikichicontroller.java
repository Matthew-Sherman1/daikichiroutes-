package com.matthewsherman.daikichiroutes;

import org.springframework.web.bind.annotation.PathVariable;
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
	
	@RequestMapping("/travel/{location}")
	public String travel(@PathVariable("location")  String location) {
		
		return "Congratulations! You will soon travel to " + location;
		}
	@RequestMapping("/lotto/{num}")
	public String lotto(@PathVariable("num")  int num) {
		if(num % 2 ==0) {
			return "You will take a grand journey in the near future, but be weary of tempting offers";
		}
		return "You have enjoyed the fruits of your labor but now is a great time to spend time with family and friends.";
		}
}
