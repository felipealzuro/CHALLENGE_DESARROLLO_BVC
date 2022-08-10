package co.com.bvc.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class RegistroEvento {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column
	private String plataforma;
	
	@Column
	private String idEvento;
	
	@Column
	private int numeroEventos;
	
	@Column
	private Date fechaEvento;
	
	@Column
	private float costoEvento;

	public RegistroEvento() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

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
