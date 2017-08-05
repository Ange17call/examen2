package com.distribuida;


import org.apache.camel.Exchange;
import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class RouterHttpExamen extends RouteBuilder {

	@Override
	public void configure() throws Exception {
		
		from("activemq:prueba.cola?concurrentConsumers=10")
		.id( "cola_proceso" )
		.split( body().tokenize(" ") ).streaming()
			.setBody( simple("${body.trim()}") ) 
			.loadBalance().roundRobin()
				.to("direct:a")
				.to("direct:b")
				.to("direct:c")
			.end()
			.log( "${body}" )
		.end( );
	
	
	from("direct:a").id( "direct_a" )
		.setHeader(Exchange.HTTP_QUERY, simple("texto=${body}"))
		.to("{{servidor.url1}}/mayusculas");
	
	from("direct:b").id( "direct_b" )
		.setHeader(Exchange.HTTP_QUERY, simple("texto=${body}"))
		.to("{{servidor.url2}}/minusculas");

	from("direct:c").id( "direct_c" )
		.setHeader(Exchange.HTTP_QUERY, simple("texto=${body}"))
		.to("{{servidor.url3}}/reversa");
			
	}
}
