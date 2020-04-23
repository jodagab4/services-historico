package com.app.historico.service;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.historico.model.entity.Pago;
import com.app.historico.model.repository.PagoRepository;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.*;
@Service
public class PagoEvents {

	private Logger log = LoggerFactory.getLogger(PagoEvents.class);
	@Autowired
	private PagoRepository repository;
	@Autowired
	ObjectMapper objectMapper;

	public void processTransactionEvent(ConsumerRecord<Integer, String> consumerRecord) throws JsonProcessingException {

		Pago transactionEvent = objectMapper.readValue(consumerRecord.value(), Pago.class);
		log.info("transactionEvent : {} ", transactionEvent);
		repository.save(transactionEvent);
		log.info("Successfully Persisted the transaction Event {} ",transactionEvent);
	}
}
