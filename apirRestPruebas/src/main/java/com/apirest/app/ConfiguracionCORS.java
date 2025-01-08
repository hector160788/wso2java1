package com.apirest.app;

import java.util.Arrays;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.reactive.CorsConfigurationSource;
import org.springframework.web.cors.reactive.UrlBasedCorsConfigurationSource;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;



@Configuration
public class ConfiguracionCORS{
	
//	@Bean
//	CorsConfigurationSource corsConfigurationSource() {
//	    CorsConfiguration configuration = new CorsConfiguration();
//	    configuration.setAllowCredentials(false);
//	    configuration.setAllowedOrigins(Arrays.asList("*"));
//	    configuration.setAllowedMethods(Arrays.asList("GET", "POST","PUT", "DELETE"));
//	    configuration.setAllowedHeaders(Arrays.asList("*"));
//	    UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
//	    source.registerCorsConfiguration("/**", configuration);
//	    return source;
//	}
	
	 @Bean
     public WebMvcConfigurer corsConfigurer() {
         return new WebMvcConfigurer() {
             @Override
             public void addCorsMappings(CorsRegistry registry) {
                 registry.addMapping("/**").allowedOrigins("*").allowedMethods("GET", "POST","PUT", "DELETE");
             }
         };
     }

}
