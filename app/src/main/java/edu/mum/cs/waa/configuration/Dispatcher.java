package edu.mum.cs.waa.configuration;

import edu.mum.cs.waa.interceptor.PerformanceMonitorInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.*;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.core.env.Environment;
import org.springframework.validation.Validator;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.config.annotation.*;
import org.springframework.web.servlet.i18n.CookieLocaleResolver;
import org.springframework.web.servlet.i18n.LocaleChangeInterceptor;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.UrlBasedViewResolver;
import org.springframework.web.servlet.view.tiles3.TilesConfigurer;
import org.springframework.web.servlet.view.tiles3.TilesView;

@EnableWebMvc
@Configuration
@ComponentScan(basePackages = {"edu.mum.cs.waa"})
@PropertySource(value = "classpath:application.properties")
@ImportResource("classpath:/config/webflow-context.xml")
public class Dispatcher extends WebMvcConfigurerAdapter {

	@Autowired
	Environment environment;

	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler(environment.getProperty("staticResourceAlias"))
				.addResourceLocations(environment.getProperty("staticResourceLocation"));
	}

	@Override
	public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
		configurer.enable();
	}

	@Bean
	public InternalResourceViewResolver jspViewResolver() {
		InternalResourceViewResolver bean = new InternalResourceViewResolver();
		bean.setPrefix(environment.getProperty("viewResolver.prefix"));
		bean.setSuffix(environment.getProperty("viewResolver.suffix"));
		return bean;
	}

	@Bean
	public UrlBasedViewResolver viewResolver() {
		UrlBasedViewResolver viewResolver = new UrlBasedViewResolver();
		viewResolver.setViewClass(TilesView.class);
		viewResolver.setOrder(-2);
		return viewResolver;
	}

	@Bean
	public TilesConfigurer tilesConfigurer() {
		TilesConfigurer tilesConfigurer = new TilesConfigurer();
		tilesConfigurer.setDefinitions("/WEB-INF/views/tiles/tiles-definition.xml");
		tilesConfigurer.setCheckRefresh(true);

		return tilesConfigurer;
	}


	@Bean
	public LocaleResolver localeResolver() {
		CookieLocaleResolver localeResolver = new CookieLocaleResolver();
		return localeResolver;
	}


	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(new NoticeInterceptor()).addPathPatterns("/employees/list");

		LocaleChangeInterceptor localeChangeInterceptor = new LocaleChangeInterceptor();
		localeChangeInterceptor.setParamName("lang");
		PerformanceMonitorInterceptor monitorInterceptor = new PerformanceMonitorInterceptor();
		registry.addInterceptor(monitorInterceptor);

		registry.addInterceptor(localeChangeInterceptor);
	}

	@Bean(name = "messageSource")
	public ReloadableResourceBundleMessageSource messageSource() {
		ReloadableResourceBundleMessageSource resource = new ReloadableResourceBundleMessageSource();
		resource.setBasename("classpath:messages");
		resource.setDefaultEncoding("UTF-8");
		return resource;
	}

	@Bean(name = "validator")
	public LocalValidatorFactoryBean validator() {
		LocalValidatorFactoryBean bean = new LocalValidatorFactoryBean();
		bean.setValidationMessageSource(messageSource());
		return bean;
	}

	@Override
	public Validator getValidator() {
		return validator();
	}

}