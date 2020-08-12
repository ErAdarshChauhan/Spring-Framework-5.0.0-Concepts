package com.chauhansoft.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;

@SuppressWarnings("deprecation")
@Configuration
//@EnableWebSecurity
public class SpringSecurityConfiguration extends WebSecurityConfigurerAdapter {

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		// TODO Auto-generated method stub
		http.csrf().disable();// disable all api's to access by same credential
		// configure role to access particular api based on credential

//		http.authorizeRequests().antMatchers("/api/books/**").hasAnyRole("ADMIN", "USER").and().httpBasic();
//		http.authorizeRequests().antMatchers("/api/book/**").hasAnyRole("ADMIN", "USER").and().httpBasic();
//		http.authorizeRequests().antMatchers("/api/admin/**").hasAnyRole("ADMIN").and().httpBasic();

		// code re-factoring
		http.authorizeRequests().antMatchers("/api/books/**").hasAnyRole("ADMIN", "USER").and().authorizeRequests()
				.antMatchers("/api/book/**").hasAnyRole("ADMIN", "USER").and().authorizeRequests()
				.antMatchers("/api/admin/**").hasAnyRole("ADMIN").and().httpBasic();
	}

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		// TODO Auto-generated method stub
//		auth.inMemoryAuthentication().withUser("tom").password("tom").roles("USER");
//		auth.inMemoryAuthentication().withUser("martin").password("martin").roles("ADMIN");

		// code re-factoring
		auth.inMemoryAuthentication().withUser("tom").password("tom").roles("USER").and().withUser("martin")
				.password("martin").roles("ADMIN");
	}

	
	@Bean
	public static NoOpPasswordEncoder passwordEncoder() {
		return (NoOpPasswordEncoder) NoOpPasswordEncoder.getInstance();
	}
}
