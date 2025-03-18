package com.lentux.parola.service;

import java.util.Random;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class ParolaService {

	@Value("${frase.parole}")
	private String parole;

	private Random random = new Random();
	
	public String getParola() {
		String[] wordArray = parole.split(",");
		int randomIndex = random.nextInt(wordArray.length);
		return wordArray[randomIndex];
	}
}
