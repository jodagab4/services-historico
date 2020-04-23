package com.app.historico.service;

import com.app.historico.model.entity.Pago;

public interface IPagoService {

	public Pago save (Pago pago);
	public Iterable <Pago> findByNroPrestamo(Integer nroPrestamo);
	public Iterable<Pago> findAdll();
}
