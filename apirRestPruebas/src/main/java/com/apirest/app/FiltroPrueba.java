package com.apirest.app;

import java.io.IOException;
import java.util.Enumeration;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestClient;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Component
public class FiltroPrueba implements Filter{

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		HttpServletRequest req = (HttpServletRequest) request;
		HttpServletResponse res = (HttpServletResponse) response;
		Enumeration<String> headerNames = req.getHeaderNames();
		System.out.println("******************************************************************");
	    if (headerNames != null) {
	            while (headerNames.hasMoreElements()) {
	                    System.out.println( req.getHeader(headerNames.nextElement()));
	            }
	    }
	    System.out.println("******************************************************************");
		chain.doFilter(request, response);
		
	}
	@Bean
	public RestClient restClient() {
		RestClient customClient = RestClient.builder()
				  .build();
		
		return customClient;
	} 

}
