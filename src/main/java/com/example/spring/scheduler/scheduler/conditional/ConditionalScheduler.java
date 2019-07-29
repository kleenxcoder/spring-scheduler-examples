package com.example.spring.scheduler.scheduler.conditional;

import org.springframework.context.annotation.Description;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Description("schedule() will be executed if condition is met -> see @Application.java")
public class ConditionalScheduler {
	
	public void schedule() {
		log.debug("InitialDelayScheduler @Scheduled(fixedDelay = 11500, initialDelay = 11500)");
	}

}
