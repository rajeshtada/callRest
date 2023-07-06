package com.example.callRest.config;

import java.util.Locale;

import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.i18n.LocaleChangeInterceptor;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;
import org.springframework.web.servlet.view.tiles3.TilesConfigurer;
import org.springframework.web.servlet.view.tiles3.TilesViewResolver;

import com.fasterxml.jackson.databind.ObjectMapper;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = { "com.example.callRest.*" })
//@Import({ HibernateConfig.class })
//@EnableScheduling
public class WebMvcConfig implements WebMvcConfigurer {

//	@Bean
//	public ViewResolver internalResourceViewResolver() {
//		InternalResourceViewResolver bean = new InternalResourceViewResolver();
//		bean.setPrefix("/WEB-INF/views/");
//		bean.setSuffix(".jsp");
//		return bean;
//	}

//	@Bean
//	public TilesConfigurer tilesConfigure() {
//		TilesConfigurer tilesConfigurer = new TilesConfigurer();
//		tilesConfigurer.setDefinitions(new String[] { "/WEB-INF/views/**/tiles.xml" });
//		tilesConfigurer.setCheckRefresh(true);
//		return tilesConfigurer;
//	}
//
//	@Override
//	public void configureViewResolvers(ViewResolverRegistry registry) {
//		TilesViewResolver viewResolver = new TilesViewResolver();
//		registry.viewResolver(viewResolver);
//	}

	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/resources/*.jpeg", "/resources/*.jpg")
				.addResourceLocations("/", "/resources/").setCachePeriod(31556926);
	}

}
