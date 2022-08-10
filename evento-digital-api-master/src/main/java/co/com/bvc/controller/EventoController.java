package co.com.bvc.controller;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.com.bvc.services.EventoDTO;
import co.com.bvc.services.IEventoService;

@RestController
@RequestMapping(path = "/evento")
public class EventoController {
	
	@Autowired
	private IEventoService eventoService;
	
	@PostMapping
	public ResponseEntity<?> addEvento(RequestEntity<EventoDTO> eventoDTO){
		EventoDTO eventoAdded = eventoService.addEvento(eventoDTO.getBody());
		ResponseEntity<?> response = new ResponseEntity<>(eventoAdded, HttpStatus.OK);
		return response;
	}
	
	@GetMapping
	public ResponseEntity<?> listRegistroEventos(@Param(value = "plataforma") String plataforma){
		List<EventoDTO> eventosList = eventoService.listRegistroEventos(plataforma);
		ResponseEntity<?> response = new ResponseEntity<>(eventosList, HttpStatus.OK);
		return response;
	}

}
