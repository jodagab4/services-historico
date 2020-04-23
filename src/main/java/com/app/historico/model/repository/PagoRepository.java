package com.app.historico.model.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.app.historico.model.entity.Pago;
@Repository
public interface PagoRepository extends MongoRepository<Pago, String> {
    @Query("{'nroPrestamo': ?0}")
	public Iterable<Pago> findByNroPrestamo(Integer nroPrestamo);

}
