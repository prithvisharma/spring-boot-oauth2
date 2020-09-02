package com.springoauth;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {
	@Override
	public void configure(HttpSecurity httpSecurity ) throws Exception {
		
//		httpSecurity.antMatcher("/**").authorizeRequests()
//					.antMatchers("/").permitAll()
//					.anyRequest().authenticated()
//					.and()
//					.oauth2Login()
//					.and()
//					.logout()
//					.logoutSuccessUrl("/login")
//                   .deleteCookies("JSESSIONID")
//                   .invalidateHttpSession(true)
//					.permitAll();
		
		httpSecurity.csrf().disable()
					.authorizeRequests().antMatchers("/").permitAll()
					.anyRequest().authenticated()
					.and()
					.oauth2Login()
					.and()
					.logout()
					.invalidateHttpSession(true)
					.clearAuthentication(true)
					.deleteCookies("JSESSIONID")
					.logoutRequestMatcher(new AntPathRequestMatcher("/logout") )
					.logoutSuccessUrl("/logout-display")
					.permitAll();
	}
}
