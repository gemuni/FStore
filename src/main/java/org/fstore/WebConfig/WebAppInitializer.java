package org.fstore.WebConfig;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class WebAppInitializer implements WebApplicationInitializer {

	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
		
		 AnnotationConfigWebApplicationContext appContext = new AnnotationConfigWebApplicationContext();
	        appContext.register(WebAppContextConfig.class);
	 
	        // Dispatcher Servlet
	        ServletRegistration.Dynamic dispatcher = servletContext.addServlet("SpringDispatcher",
	                new DispatcherServlet(appContext));
	        dispatcher.setLoadOnStartup(1);
	        dispatcher.addMapping("/");
	         
	        dispatcher.setInitParameter("contextClass", appContext.getClass().getName());
	 
	        servletContext.addListener(new ContextLoaderListener(appContext));
		
	}

}
