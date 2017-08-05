package com.distribuida;

import org.springframework.stereotype.Component;


@Component
public class ServicioMinusculasImpl implements ServicioMinusculas {
	
	public String convertirAMinusculas(String texto){
		
		return texto.toLowerCase();
		
	}
	
	}
