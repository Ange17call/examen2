package com.distribuida;

import org.springframework.stereotype.Component;


@Component
public class ServicioReversaImpl implements ServicioReversa {
	
	public String convertirReversa(String texto){
		
		StringBuilder sb = new StringBuilder( texto );
		
		return sb.reverse().toString( );
		
	}
	
	}
