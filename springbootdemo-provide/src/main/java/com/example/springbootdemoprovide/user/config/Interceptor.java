//package com.example.springbootdemoprovide.user.config;
//
//import org.springframework.context.annotation.Configuration;
//import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
//import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
//
//@Configuration
//public class Interceptor implements WebMvcConfigurer {
//
//    @Override
//    public void addInterceptors(InterceptorRegistry registry) {
//
//        registry.addInterceptor(new InterceptorConfig()).addPathPatterns("/**")
//                .excludePathPatterns("/html/**")
//                .excludePathPatterns("/css/**")
//                .excludePathPatterns("/js/**")
//                .excludePathPatterns("/user/login");
//
//}
//}
