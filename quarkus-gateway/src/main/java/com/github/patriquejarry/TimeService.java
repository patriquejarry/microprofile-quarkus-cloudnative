package com.github.patriquejarry;

import javax.enterprise.context.ApplicationScoped;
import javax.ws.rs.GET;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

@ApplicationScoped
@RegisterRestClient(baseUri = "http://localhost:8080/time")
public interface TimeService {

	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String getTime();
}
