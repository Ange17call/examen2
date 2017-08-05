package com.distribuida;

import org.springframework.stereotype.Component;


@Component
public class ServicioMayusculasImpl implements ServicioMayusculas {
	
	public String convertirAMayusculas(String texto){
		
		return texto.toUpperCase();
		
	}
	
	}
