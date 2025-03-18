package com.lentux.frase.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.lentux.frase.domain.ParolaClientPort;
import com.lentux.frase.domain.ParolaRestClient;

@Service
public class SoggettoClientAdapter implements ParolaClientPort {
	@Value("${frase.soggetto.uri}")
	private String soggettoUri;
	@Autowired
	private ParolaRestClient parolaRestClient;
	
	public String getParola() {
		return parolaRestClient.getParola(soggettoUri);
	}
}
