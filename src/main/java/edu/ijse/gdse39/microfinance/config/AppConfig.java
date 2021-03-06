package edu.ijse.gdse39.microfinance.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;
import org.springframework.web.servlet.view.ResourceBundleViewResolver;
import org.springframework.web.servlet.view.XmlViewResolver;

/**
 * @author Pahansith on 9/29/2017
 * @project MicroFinance
 */
@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "edu.ijse.gdse39.microfinance")
public class AppConfig extends WebMvcConfigurerAdapter {

    @Bean
    public ViewResolver viewResolver() {
        InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
        viewResolver.setViewClass(JstlView.class);
        viewResolver.setPrefix("/WEB-INF/jsp/");
        viewResolver.setSuffix(".jsp");
        viewResolver.setOrder(0);
        return viewResolver;
    }

    @Bean
    public ViewResolver resourceBundleViewResolver() {
        ResourceBundleViewResolver bean = new ResourceBundleViewResolver();
        bean.setBasename("views");
        bean.setOrder(1);
        return bean;
    }

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/assets/**").addResourceLocations("/WEB-INF/assets/");
        registry.addResourceHandler("/bootstrap/**").addResourceLocations("/WEB-INF/bootstrap/");
    }
}
