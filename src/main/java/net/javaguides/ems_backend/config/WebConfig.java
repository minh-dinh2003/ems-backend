package net.javaguides.ems_backend.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**") // Apply CORS settings to all paths
            .allowedOrigins(Arrays.asList("https://beneficial-comfort-production.up.railway.app/")) // Add allowed origins
            .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS") // Add allowed methods
            .allowedHeaders("*"); // Allow all headers
    }
}
