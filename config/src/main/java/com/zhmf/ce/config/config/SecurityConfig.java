package com.zhmf.ce.config.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * @author ztx
 */
@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    /**
     * 自定义用户认证逻辑。除了actuator开头的地址都需要认证
     * @param http
     * @throws Exception
     */
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.csrf().disable(); // 禁用csrf支持
        http
            .authorizeRequests() //获取HttpServletRequest使用限制访问控制
                .antMatchers("/actuator/**").permitAll() // actuator开头一直是允许的
                .anyRequest().authenticated() // 其他地址认证后可以访问
            .and()
                .httpBasic() // 使用 HTTP Basic 认证
                ;
    }
}
