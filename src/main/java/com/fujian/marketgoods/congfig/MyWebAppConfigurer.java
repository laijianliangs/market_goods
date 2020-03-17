package com.fujian.marketgoods.congfig;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MyWebAppConfigurer implements WebMvcConfigurer {

    /**
     * 添加静态资源访问路径，避免静态指资源被拦截
     *
     * @param registry
     */
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
              registry.addResourceHandler("/view/static/**").addResourceLocations("classpath:/static/images")
                                                                          .addResourceLocations("classpath:/static/");
    }
}



