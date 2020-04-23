package com.app.historico.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.app.historico.model.entity.Pago;
import com.app.historico.service.IPagoService;

@RestController
public class HistoricoController {

	@Autowired
	private IPagoService pago;

	@GetMapping("/historico/{nroPrestamo}")
	public ResponseEntity<?> historioPrestamo(@PathVariable Integer nroPrestamo) {
		Iterable<Pago> Ipago = pago.findByNroPrestamo(nroPrestamo);
		return ResponseEntity.ok(Ipago);
	}

	@GetMapping("/historico/hitoricoTotal")
	public List<Pago> listar() {
		return (List<Pago>) pago.findAdll();
	}

}
