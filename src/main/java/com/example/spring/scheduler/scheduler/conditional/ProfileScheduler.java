package com.example.spring.scheduler.scheduler.conditional;

import org.springframework.context.annotation.Description;
import org.springframework.context.annotation.Profile;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Description("schedule() will be executed if condition is met -> -Dspring.profiles.active=scheduler")
@Profile("scheduler")
@Component
public class ProfileScheduler {
	
	@Scheduled(fixedDelay = 1000)
	public void schedule() {
		log.debug("ProfileScheduler @Scheduled(fixedDelay = 1000)");
	}

}
