package com.zhou.springboot04.config;


import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {


    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        //下面这两行配置表示在内存中配置了两个用户
        auth.inMemoryAuthentication()
                .withUser("admin").roles("admin").password("$2a$10$2UaOufuypWR1TASuso2S6.u6TGL7nuAGCsb4RZ5X2SMEuelwQBToO")
                .and()
                .withUser("user").roles("user").password("$2a$10$2UaOufuypWR1TASuso2S6.u6TGL7nuAGCsb4RZ5X2SMEuelwQBToO");
    }
//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//        http.authorizeRequests().hasRole("admin")
//    }
}
