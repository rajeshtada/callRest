package com.example.callRest.config;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;


public class ApplicationInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		return new Class[] { WebMvcConfig.class };
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		return new Class[] {};
	}

	@Override
	protected String[] getServletMappings() {
		return new String[] { "/caller" };
	}


	

}



//public class ApplicationInitializer implements WebApplicationInitializer {

//@Override
//public void onStartup(ServletContext servletContext) throws ServletException {
//	AnnotationConfigWebApplicationContext ctx = new AnnotationConfigWebApplicationContext();
//    ctx.setServletContext(servletContext);
//    ServletRegistration.Dynamic servlet = servletContext.addServlet("dispatcher", new DispatcherServlet(ctx));
//    servlet.setLoadOnStartup(1);
//    servlet.addMapping("/");
//    
//}
//}


// in getepay portal 
//public void onStartup(ServletContext servletContext) throws ServletException {
//	servletContext.getInitParameter("defaultHtmlEscape");
//	super.onStartup(servletContext);
//}







