package ua.mike.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * Created by mike on 16.06.2022 15:42
 */
@Configuration
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {

    @Override
    public void configure(HttpSecurity http) throws Exception {
        http.csrf()
                .ignoringAntMatchers("/encrypt/**")
                .ignoringAntMatchers("/decrypt/**");

        super.configure(http);
    }
}
