package org.sai.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = { "org.sai" })
public class Config implements WebMvcConfigurer {

	/*
	 * @Bean public InternalResourceViewResolver viewReslover() {
	 * InternalResourceViewResolver viewReslover = new
	 * InternalResourceViewResolver(); viewReslover.setPrefix("/WEB-INF/views/");
	 * viewReslover.setSuffix(".jsp"); return viewReslover; }
	 */

	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/UrlToReachResourcesFolder/**").addResourceLocations("/resources/");

	}

	
	
	

}
