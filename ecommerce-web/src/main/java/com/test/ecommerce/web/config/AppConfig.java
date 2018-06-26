package com.test.ecommerce.web.config;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.Import;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.test.DataConfig;

@SpringBootApplication

@ComponentScan(basePackages = { "com.test" })
public class AppConfig implements WebMvcConfigurer{

	public static void main(String[] args) {
		new SpringApplicationBuilder(AppConfig.class).properties("spring.profiles.default=production").run(args);
	}
}
