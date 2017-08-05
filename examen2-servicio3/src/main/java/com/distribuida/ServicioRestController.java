package com.distribuida;


import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class ServicioRestController {

	@Autowired
	private ServicioReversa servicio3;
	

	@ResponseBody
	@RequestMapping(value="/rest/reversa", method=RequestMethod.GET)
	public String convertirReversa(@PathParam("texto") String texto){
		
		return servicio3.convertirReversa(texto);
	}
	
	
}
