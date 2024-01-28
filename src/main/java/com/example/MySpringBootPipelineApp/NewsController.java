package com.example.MySpringBootPipelineApp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/news")
public class NewsController {
	
	
	
	@GetMapping("/headline")
	public String getHeadline() {
		return "Simplilearn Pipeline Tutorial is rather intuitive;";
		
	}

}
