package com.example.spring.scheduler.scheduler.conditional;

import org.springframework.context.annotation.Description;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Description("schedule() will be executed if value is present else it is disabled -> -DexpressionScheduler.fixedDealy=\"* * * * * *\"")
@Component
public class ExpressionScheduler {

	@Scheduled(cron = "${expressionScheduler.fixedDealy:-}")
	public void schedule() {
		log.debug("ExpressionScheduler -> the only way to set value from outside!");
	}
}
