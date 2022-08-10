package co.com.bvc.repository;

import org.springframework.data.repository.CrudRepository;

import co.com.bvc.entity.Evento;

public interface EventoDao extends CrudRepository<Evento, String> {
	
	public Evento findByIdEvento(String idEvento);

}
