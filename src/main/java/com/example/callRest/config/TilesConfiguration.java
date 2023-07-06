package com.example.callRest.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.view.UrlBasedViewResolver;
import org.springframework.web.servlet.view.tiles3.TilesConfigurer;
import org.springframework.web.servlet.view.tiles3.TilesView;

@Configuration
@ComponentScan(basePackages = { "com.example.callRest" })
public class TilesConfiguration {
	
	@Bean
	public UrlBasedViewResolver tilesViewResolver() {
		UrlBasedViewResolver tilesViewResolver = new UrlBasedViewResolver();

		tilesViewResolver.setViewClass(TilesView.class);
//		tilesViewResolver.setPrefix("/WEB-INF/jsp/");
//		tilesViewResolver.setSuffix(".jsp");
		return tilesViewResolver;
	}

	@Bean
	public TilesConfigurer tilesConfigurer() {
		TilesConfigurer tilesConfigurer = new TilesConfigurer();

		String[] defs = { "/WEB-INF/tiles/tiles.xml" };

//		tilesConfigurer.setDefinitions(defs);
		tilesConfigurer.setDefinitions("/WEB-INF/tiles/tiles.xml");
		

		return tilesConfigurer;
	}

}
