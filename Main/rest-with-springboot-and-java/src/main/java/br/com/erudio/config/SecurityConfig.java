package br.com.erudio.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

import br.com.erudio.security.jwt.JwtConfigurer;
import br.com.erudio.security.jwt.JwtTokenProvider;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

	private final JwtTokenProvider tokenProvider;

	public SecurityConfig(JwtTokenProvider tokenProvider) {
		this.tokenProvider = tokenProvider;
	}

	@Bean
	public BCryptPasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}

	@Bean
	public AuthenticationManager authenticationManager(AuthenticationConfiguration authenticationConfiguration) throws Exception {
		return authenticationConfiguration.getAuthenticationManager();
	}

	@Bean
	public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
		http
				.httpBasic().disable()
				.csrf().disable()
				.sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS)
				.and()
				.authorizeHttpRequests(authorize -> authorize
						.anyRequest().permitAll()
				);

		return http.build();
	}
}
