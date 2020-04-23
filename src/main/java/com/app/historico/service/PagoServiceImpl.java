package com.app.historico.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.historico.model.entity.Pago;
import com.app.historico.model.repository.PagoRepository;
@Service
public class PagoServiceImpl implements IPagoService {

	@Autowired
	private PagoRepository repository;
	
	public Pago save(Pago pago) {
		// TODO Auto-generated method stub
		return repository.save(pago);
	}

	public Iterable<Pago> findByNroPrestamo(Integer nroPrestamo) {
		// TODO Auto-generated method stub
		return repository.findByNroPrestamo(nroPrestamo);
	}

	public Iterable<Pago> findAdll() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

}
