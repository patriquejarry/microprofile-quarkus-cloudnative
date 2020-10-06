package com.github.patriquejarry;

import javax.inject.Inject;

import org.eclipse.microprofile.health.HealthCheck;
import org.eclipse.microprofile.health.HealthCheckResponse;
import org.eclipse.microprofile.health.Readiness;
import org.eclipse.microprofile.rest.client.inject.RestClient;

@Readiness
public class ReadinessProbe implements HealthCheck {

	@Inject
	@RestClient
	TimeService timeService;

	@Override
	public HealthCheckResponse call() {

		if (timeService.getTime() == null) {
			return HealthCheckResponse.down("I'm not ready");
		} else {
			return HealthCheckResponse.up("I'm ready");
		}
	}

}
