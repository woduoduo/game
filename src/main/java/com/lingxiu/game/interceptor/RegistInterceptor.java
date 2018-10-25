package com.lingxiu.game.interceptor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * 配置拦截器
 * <p>extends WebMvcConfigurerAdapter 已经过时</>
 *
 * @author lingxiu 2018/10/25 10:39
 */
@Configuration
public class RegistInterceptor implements WebMvcConfigurer {
    private final Logger log = LoggerFactory.getLogger(RegistInterceptor.class);

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        log.info("【注册拦截器】");
        registry.addInterceptor(new MybatisPageInterceptor()).addPathPatterns("/**");
    }
}
