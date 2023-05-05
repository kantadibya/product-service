package com.productServce.config;

import org.hibernate.service.spi.ServiceException;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic;


public abstract class DispatcherServletInitializer<ServletContext> implements WebApplicationInitializer
{
   
	
	public void onStartup(ServletContext servletContext) throws ServiceException {
		

		AnnotationConfigWebApplicationContext ctx=new  AnnotationConfigWebApplicationContext();
		ctx.register(AppConfiguration.class);
		
		
		DispatcherServlet servlet= new   DispatcherServlet(ctx);
	           Dynamic dynamic = servletContext.addServlet("dispatcher", servlet);
		
		dynamic.addMapping("/");
		dynamic.setLoadOnStartup(1);
		
	}

	

}
