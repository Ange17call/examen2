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
	private ServicioMayusculas servicio1;
	

	@ResponseBody
	@RequestMapping(path="/rest/mayusculas", method=RequestMethod.GET)
	public String convertirAMayusculas(@PathParam("texto") String texto){
		
		return servicio1.convertirAMayusculas(texto);
	}
	
	
}
