package com.example.spring.scheduler.scheduler;

import org.springframework.context.annotation.Description;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Description("schedule() will be executed a first time after the initialDelay value – and it will remain execution according to the fixedDelay")
@Component
public class InitialDelayScheduler {

	@Scheduled(fixedDelay = 11500, initialDelay = 11500)
	public void schedule() {
		log.debug("InitialDelayScheduler @Scheduled(fixedDelay = 11500, initialDelay = 11500)");
	}
}
