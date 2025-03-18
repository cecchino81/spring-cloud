package com.lentux.frase.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import com.lentux.frase.domain.ParolaRestClient;

public class ParolaRestClientTemplateAdapter implements ParolaRestClient {
	@Autowired
	private RestTemplate restTemplate;
	
	public String getParola(String parolaUri) {
	String parola = null;
	try {
		parola = restTemplate.getForObject(parolaUri, String.class);
	} catch (RestClientException e) {
		//... eccezione remota ... 
		}
	return parola;
	}

}
