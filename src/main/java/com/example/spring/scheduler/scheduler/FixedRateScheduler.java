package com.example.spring.scheduler.scheduler;

import org.springframework.context.annotation.Description;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Description("FixedRate runs the schedule() every n millisecond")
@Component
public class FixedRateScheduler {
	
	@Scheduled(fixedRate = 10000)
	public void schedule() {
		log.debug("FixedRateScheduler @Scheduled(fixedRate = 10000)");
	}

}
