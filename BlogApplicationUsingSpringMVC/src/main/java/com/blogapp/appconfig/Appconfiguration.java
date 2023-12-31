package com.blogapp.appconfig;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class Appconfiguration {
	@Bean
	public SecurityFilterChain securityFilterChain(HttpSecurity httpSecurity) throws Exception {
		httpSecurity
				.authorizeHttpRequests(auth -> auth.requestMatchers("/public/**").permitAll() // Public resources
				         .requestMatchers(HttpMethod.GET,"/login").permitAll().requestMatchers(HttpMethod.POST,"/login").permitAll() // Login page
				         .requestMatchers("/dashboard/**").authenticated())
				.csrf(csrf -> csrf.disable()).formLogin().loginPage("/login").permitAll();
		
		return httpSecurity.build();
	}

	@Bean
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
}
