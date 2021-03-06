//package com.example.jsp.configure;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.web.servlet.ViewResolver;
//import org.springframework.web.servlet.config.annotation.EnableWebMvc;
//import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
//import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
//import org.springframework.web.servlet.resource.PathResourceResolver;
//import org.springframework.web.servlet.view.InternalResourceViewResolver;
//import org.springframework.web.servlet.view.JstlView;
//
//@EnableWebMvc
//@Configuration
//public class WebConfig implements WebMvcConfigurer {
//    @Override
//    public void addResourceHandlers(ResourceHandlerRegistry registry) {
//        registry.addResourceHandler("/static/**")
//                .addResourceLocations("/static/")
//                .setCachePeriod(3600)
//                .resourceChain(true)
//                .addResolver( new PathResourceResolver());
//    }
//    @Bean
//    public ViewResolver getViewResolver(){
//        InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
//        viewResolver.setPrefix("/WEB-INF/pages/");
//        viewResolver.setSuffix(".jsp");
//        viewResolver.setViewClass( JstlView.class );
//        return viewResolver;
//    }
//}
