package com.lentux.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lentux.parola.service.ParolaService;

@RestController
public class ParolaController {

	@Autowired
	private ParolaService parolaService;
	
	@GetMapping("/")
	public String getParola() {
		return parolaService.getParola();
	}
}