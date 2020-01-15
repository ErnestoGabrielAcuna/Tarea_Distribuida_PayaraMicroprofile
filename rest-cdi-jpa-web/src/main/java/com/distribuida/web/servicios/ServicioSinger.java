package com.distribuida.web.servicios;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.distribuida.web.dto.Singer;

@Path("/singers")
public interface ServicioSinger {

	@GET
	@Produces(value=MediaType.APPLICATION_JSON)
	public List<Singer> listar( );
}
