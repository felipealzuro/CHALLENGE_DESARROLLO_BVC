package co.com.bvc.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import co.com.bvc.entity.RegistroEvento;

public interface RegistroEventoDao extends CrudRepository<RegistroEvento, Long> {

	public List<RegistroEvento> findByPlataforma(String plataforma);
}
