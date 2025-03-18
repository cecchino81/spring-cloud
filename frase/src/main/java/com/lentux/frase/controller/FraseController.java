package com.lentux.frase.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lentux.frase.service.FraseService;

@RestController
public class FraseController {

	@Autowired
	private FraseService fraseService;
	
	@GetMapping("/")
	public String getSentence() {
		return fraseService.getFrase();
	}
}
