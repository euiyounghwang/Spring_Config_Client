package com.poscoict.config.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigClientController {
	
	@Value("${test.str}")
	private String configStr1;
	
	@Value("${namoosori.value}")
	private String configStr;
	
//	@RequestMapping(value = "/findFeederServerLog", method = RequestMethod.POST)
//	@ResponseBody
	@GetMapping("/test1")
	public String test() {
		return configStr1;
	}
	
	@GetMapping("/test")
	public String Config() {
		return configStr;
	}
	
}
