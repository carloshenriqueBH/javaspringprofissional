package com.devsuperior.services;

import org.springframework.stereotype.Service;

@Service
public class PensionService {
	
	public double pension(double amount) {
		return amount * 0.1;
	}
}
