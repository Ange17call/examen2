package com.distribuida;

import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan("com.edu")
public class AppConfig {
	
		
	@Bean
	public ServletRegistrationBean adminServletRegistrationBean() {
	    return new ServletRegistrationBean(new Servlet(), "/inicio");
	}
	
	@Bean
	public ServletRegistrationBean transaccionServletRegistrationBean() {
	    return new ServletRegistrationBean(new ServicioServlet(), "/proceso");
	}

}
