package com.distribuida;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import org.springframework.context.ApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

@WebServlet
public class ServicioServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	Servicio servicio;

	@Override
	public void init() throws ServletException {
		super.init();

		ApplicationContext springContext = WebApplicationContextUtils
				.getRequiredWebApplicationContext(this.getServletContext());

		servicio = (Servicio) springContext.getBean("servicioEnviar");
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String texto = request.getParameter("texto");
		
		servicio.enviar(texto);
		
		getServletContext().getRequestDispatcher("/index.jsp").forward(request, response);
	}

}