package com.lentux.frase.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lentux.frase.domain.ParolaClientPort;

@Service
public class FraseService {
	@Autowired
	private ParolaClientPort soggettoClientAdapter;
	@Autowired
	private ParolaClientPort verboClientAdapter;
	@Autowired
	private ParolaClientPort complementoClientAdapter;
	
	public String getFrase() {
	return soggettoClientAdapter.getParola() + " " +
			verboClientAdapter.getParola() + " " +
			complementoClientAdapter.getParola() + ".";
	}
}
