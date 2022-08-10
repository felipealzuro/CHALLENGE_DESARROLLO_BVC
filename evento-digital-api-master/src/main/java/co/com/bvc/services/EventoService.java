package co.com.bvc.services;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.com.bvc.entity.Evento;
import co.com.bvc.entity.RegistroEvento;
import co.com.bvc.repository.EventoDao;
import co.com.bvc.repository.RegistroEventoDao;

@Service
public class EventoService implements IEventoService {
	
	@Autowired
	private RegistroEventoDao registroEventoDao;
	
	@Autowired
	private EventoDao eventoDao;

	@Override
	public EventoDTO addEvento(EventoDTO eventoDTO) {
		Date fechaEvento =  Calendar.getInstance().getTime();
		RegistroEvento registroEvento = new RegistroEvento();
		Evento evento = eventoDao.findByIdEvento(eventoDTO.getIdEvento());
		float costoEvento = eventoDTO.getNumeroEventos() * evento.getValorUnitario();
		
		registroEvento.setIdEvento(eventoDTO.getIdEvento());
		registroEvento.setPlataforma(eventoDTO.getPlataforma());
		registroEvento.setNumeroEventos(eventoDTO.getNumeroEventos());
		registroEvento.setFechaEvento(fechaEvento);
		registroEvento.setCostoEvento(costoEvento);
		
		registroEventoDao.save(registroEvento);

		return eventoDTO;
	}

	@Override
	public List<EventoDTO> listRegistroEventos(String plataforma) {
		List<EventoDTO> eventosList = new ArrayList<>();
		registroEventoDao.findByPlataforma(plataforma)
			.forEach(e -> { 
				EventoDTO evento = new EventoDTO();
				
				evento.setIdEvento(e.getIdEvento());
				evento.setPlataforma(e.getPlataforma());
				evento.setNumeroEventos(e.getNumeroEventos());
				evento.setFechaEvento(e.getFechaEvento());
				evento.setCostoEvento(e.getCostoEvento());
				
				eventosList.add(evento);
			});
		return eventosList;
	}

}
