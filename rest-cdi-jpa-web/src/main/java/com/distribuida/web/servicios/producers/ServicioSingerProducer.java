package com.distribuida.web.servicios.producers;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Produces;
import javax.ws.rs.client.ClientBuilder;

import org.jboss.resteasy.client.jaxrs.ResteasyClient;
import org.jboss.resteasy.client.jaxrs.ResteasyWebTarget;

import com.distribuida.web.servicios.ServicioSinger;

@ApplicationScoped
public class ServicioSingerProducer {

	public static final String SINGER_URL = "http://127.0.0.1:8080/rest-cdi-jpa-server";
	
	@Produces
	public ServicioSinger servicio( ) {
		ResteasyClient client = (ResteasyClient )ClientBuilder.newClient();
		
		ResteasyWebTarget target = client.target( SINGER_URL );
		
		return target.proxy( ServicioSinger.class );
	}
}
