package com.open4job.struts.controller;

import org.apache.struts.action.ActionForm;

public class BienvenidaControlador extends ActionForm {
	
	String texto;
	String nombre;
	
	public String getTexto() {
		return texto;
	}
	public void setTexto(String texto) {
		this.texto = texto;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	

}
