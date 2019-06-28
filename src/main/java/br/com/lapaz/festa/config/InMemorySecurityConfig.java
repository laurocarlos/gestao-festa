package br.com.lapaz.festa.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;

@SuppressWarnings("deprecation")
@Configuration
public class InMemorySecurityConfig extends WebSecurityConfigurerAdapter {
	@Autowired
	public String configureGlobal(AuthenticationManagerBuilder builder) throws Exception {
		builder.inMemoryAuthentication().withUser("Pedro").password("123").roles("USER");
		builder.inMemoryAuthentication().withUser("thiago").password("123").roles("USER");
		builder.inMemoryAuthentication().withUser("alexandre").password("123").roles("USER");

		return "redirect:/convidados";
	}

	@Bean
	public static NoOpPasswordEncoder passwordEncoder() {
		return (NoOpPasswordEncoder) NoOpPasswordEncoder.getInstance();
	}
}
