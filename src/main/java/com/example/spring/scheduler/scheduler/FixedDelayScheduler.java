package com.example.spring.scheduler.scheduler;

import org.springframework.context.annotation.Description;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Description("FixedDelay means n millisecond between the finish time of an execution of schedule() and the start time of the next execution of schedule()")
@Component
public class FixedDelayScheduler {

	@Scheduled(fixedDelay = 5000)
	public void schedule() {
		log.debug("fixDelayScheduler @Scheduled(fixedDelay = 5000)");
	}
}
