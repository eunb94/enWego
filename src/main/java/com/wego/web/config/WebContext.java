package com.wego.web.config;

import javax.servlet.MultipartConfigElement;
import javax.servlet.ServletRegistration.Dynamic;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class WebContext extends AbstractAnnotationConfigDispatcherServletInitializer{

	@Override
	protected Class<?>[] getRootConfigClasses() {
		return new Class[] {RootContext.class};
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		return new Class[] {ServletContext.class};
	}

	@Override
	protected String[] getServletMappings() {
		return new String[] {"/"};
	}
	
	@Override
	protected void customizeRegistration(Dynamic registration) {
		registration.setInitParameter("throwExceptionIfNoHandlerFound", "true");
		MultipartConfigElement multipartConfig = new MultipartConfigElement("C:\\Users\\user\\spring\\wegoprj\\wegoprj2\\src\\main\\webapp\\resources\\wegoimg\\reviewimg\\",
				20971520,41943040,20971520);
		registration.setMultipartConfig(multipartConfig);
	}
	
}
