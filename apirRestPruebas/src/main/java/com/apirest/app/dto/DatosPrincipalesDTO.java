package com.apirest.app.dto;

public class DatosPrincipalesDTO {

	private Integer id;
	private String nombre;
	private String rfc;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getRfc() {
		return rfc;
	}

	public void setRfc(String rfc) {
		this.rfc = rfc;
	}

	@Override
	public String toString() {
		return "DatosPrincipalesDTO [id=" + id + ", nombre=" + nombre + ", rfc=" + rfc + "]";
	}

}
