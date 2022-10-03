package br.com.empresa.frota.api.entities;

import java.util.Date;

public class Viagem {
private Long id;
private Integer carrold;
private Date dataRetirada;
private Date dataEntrega;
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public Integer getCarrold() {
	return carrold;
}
public void setCarrold(Integer carrold) {
	this.carrold = carrold;
}
public Date getDataRetirada() {
	return dataRetirada;
}
public void setDataRetirada(Date dataRetirada) {
	this.dataRetirada = dataRetirada;
}
public Date getDataEntrega() {
	return dataEntrega;
}
public void setDataEntrega(Date dataEntrega) {
	this.dataEntrega = dataEntrega;
}

}
