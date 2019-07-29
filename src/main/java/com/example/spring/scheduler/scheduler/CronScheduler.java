package com.example.spring.scheduler.scheduler;

import org.springframework.context.annotation.Description;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Description("execution schedule() every ten seconds")
@Component
public class CronScheduler {
	
	@Scheduled(cron = "* * * * * *" , zone = "UTC")
	public void schedule() {
		log.debug("CronScheduler @Scheduled(cron = \"* * * * * *\" , zone = \"UTC\")");
	}

}
