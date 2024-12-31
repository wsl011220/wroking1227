package com.wsl.working1227.Interceptor;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class InterceptorConfig implements WebMvcConfigurer {
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        // 设置拦截器并指定拦截路径
        registry.addInterceptor(new MyInterceptor()).addPathPatterns("/zhuye");
        // 拦截所有
        // registry.addInterceptor(new MyInterceptor()).addPathPatterns("/**");
//         指定不拦截
//         registry.addInterceptor(new MyInterceptor()).addPathPatterns("/**").excludePathPatterns("http://localhost:8080/login/zhuye");
    }
}