package com.example.spring.scheduler.config;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

import com.example.spring.scheduler.scheduler.conditional.ConditionalScheduler;

@Configuration
@EnableScheduling
@ComponentScan({ "com.example.*" })
public class Application {
	
	@Bean
    @ConditionalOnProperty(value = "ConditionalScheduler.enabled", matchIfMissing = false, havingValue = "true")
	public ConditionalScheduler schedule() {
		return new ConditionalScheduler();
	}

}
