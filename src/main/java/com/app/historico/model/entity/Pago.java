package com.app.historico.model.entity;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "transaccion")
public class Pago {

	private String id ;
	private int nroPrestamo;
	private double  importeCuota;
	private int cuota;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getNroPrestamo() {
		return nroPrestamo;
	}
	public void setNroPrestamo(int nroPrestamo) {
		this.nroPrestamo = nroPrestamo;
	}
	public double getImporteCuota() {
		return importeCuota;
	}
	public void setImporteCuota(double importeCuota) {
		this.importeCuota = importeCuota;
	}
	public int getCuota() {
		return cuota;
	}
	public void setCuota(int cuota) {
		this.cuota = cuota;
	}
			
}
