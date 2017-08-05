package com.distribuida;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

@Component(value="servicioEnviar")
public class ServicioImpl implements Servicio {

	@Autowired
	JmsTemplate jmsTemplate;
	
	public void enviar(String texto){
		jmsTemplate.convertAndSend("prueba.cola",texto);
	}
	

}
