package com.glearning.lms.config;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.context.annotation.Configuration;

@Configuration
class DBHealthEndpoint implements HealthIndicator {

	@Override
	public Health health() {
		return Health.up().withDetail("DB-status", "DB is healthy").build();
	}

}

@Configuration
class PaymentGatewayHealthEndpoint implements HealthIndicator {

	@Override
	public Health health() {
		return Health.up().withDetail("Payment-Gateway", "Payment gateway is healthy").build();
	}

}
