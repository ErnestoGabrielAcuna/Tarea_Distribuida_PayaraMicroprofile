package com.distribuida.web.actions;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

import com.distribuida.web.dto.Singer;
import com.distribuida.web.servicios.ServicioSinger;

import lombok.Getter;

@Named("singerAction")
@SessionScoped
public class SingerAction implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Inject private ServicioSinger servicio;
	
	@Getter private List<Singer> singers;
	
	@PostConstruct
	protected void init( ) {
		
		singers = servicio.listar();
	}

	public String iniciar( ) {
		singers = servicio.listar();
		
		return "";
	}
}
