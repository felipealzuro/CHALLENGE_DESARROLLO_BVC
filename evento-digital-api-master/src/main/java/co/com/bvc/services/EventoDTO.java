package co.com.bvc.services;

import java.util.Date;

public class EventoDTO {
	
	private String plataforma;
	
	private String idEvento;
	
	private int numeroEventos;
	
	private Date fechaEvento;
	
	private float costoEvento;

	public String getPlataforma() {
		return plataforma;
	}

	public void setPlataforma(String plataforma) {
		this.plataforma = plataforma;
	}

	public String getIdEvento() {
		return idEvento;
	}

	public void setIdEvento(String idEvento) {
		this.idEvento = idEvento;
	}

	public int getNumeroEventos() {
		return numeroEventos;
	}

	public void setNumeroEventos(int numeroEventos) {
		this.numeroEventos = numeroEventos;
	}

	public Date getFechaEvento() {
		return fechaEvento;
	}

	public void setFechaEvento(Date fechaEvento) {
		this.fechaEvento = fechaEvento;
	}

	public float getCostoEvento() {
		return costoEvento;
	}

	public void setCostoEvento(float costoEvento) {
		this.costoEvento = costoEvento;
	}
	
}
