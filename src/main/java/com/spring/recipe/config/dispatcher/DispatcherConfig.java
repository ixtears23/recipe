package com.spring.recipe.config.dispatcher;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;
import org.springframework.web.servlet.view.tiles3.TilesConfigurer;
import org.springframework.web.servlet.view.tiles3.TilesViewResolver;

import com.spring.recipe.config.interceptor.AuthenticationInterceptor;

@ComponentScan(basePackages = { "com.spring.recipe.mvc" })
@EnableWebMvc
public class DispatcherConfig implements WebMvcConfigurer {
	
	@Override
	public void configureViewResolvers(ViewResolverRegistry registry) {
		
		TilesViewResolver tilesViewResolver = new TilesViewResolver();
		tilesViewResolver.setOrder(1);
		
		
		InternalResourceViewResolver internalResourceViewResolver = new InternalResourceViewResolver(); 
		internalResourceViewResolver.setPrefix("/WEB-INF/views/");
		internalResourceViewResolver.setSuffix(".jsp");
		internalResourceViewResolver.setOrder(2);
		
		registry.viewResolver(tilesViewResolver);
		registry.viewResolver(internalResourceViewResolver);
	}
	
	
	@Bean
	public TilesConfigurer tileConfiguration() {
		
//		String definitions = "/WEB-INF/tiles/definitions/*.xml";
		
		String[] definitions = { "/WEB-INF/tiles/definitions/template.xml", 
									"/WEB-INF/tiles/definitions/board.xml", 
									"/WEB-INF/tiles/definitions/home.xml" };
		TilesConfigurer tiles = new TilesConfigurer();
		tiles.setDefinitions(definitions);
		return tiles;
	}
	
	
//	@Override
//	public void addInterceptors(InterceptorRegistry registry) {
		
//		String[] patterns = {"/login.do"};
//		AuthenticationInterceptor authenticationInterceptor = new AuthenticationInterceptor();
//		
//		registry.addInterceptor(authenticationInterceptor).addPathPatterns(patterns);
//	}
	
}
