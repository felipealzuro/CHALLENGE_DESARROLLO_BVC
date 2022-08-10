package co.com.bvc.services;

import java.util.List;

public interface IEventoService {
	
	public EventoDTO addEvento(EventoDTO eventoDTO);
	
	public List<EventoDTO> listRegistroEventos(String plataforma);

}
