package com.triple.firstappdemo.config;

import com.triple.firstappdemo.repository.UserRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.ServerResponse;

import java.util.Collections;

/**
 *
 */
@Configuration

public class RouterFuntionConfiguration {

    /**
     * Servlet
     * 请求接口 : ServletRequest或者HttpServletRequest
     * 响应接口 : ServletResponse 或者 HttpServletResponse
     * Spring5.0 重新定义了服务请求和响应接口
     * 请求接口 : ServerRequest
     * 响应接口 :
     * 既可以支持 Servlet 规范, 也可以支持自定义,比如Netty(Web Server)
     *
     */
    @Bean
    public RouterFuntion<ServerResponse> personFindAll(UserRepository userRepository){

        Collections<User> users = userRepository.findAll();

    }
}
