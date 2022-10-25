package br.com.empresa.frota.api.entities;

import java.util.Date;
@En
public class Carro {
private Long id;
private String modelo;
private String marca;
private Date dataFabricacao;

public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public String getModelo() {
	return modelo;
}
public void setModelo(String modelo) {
	this.modelo = modelo;
}
public String getMarca() {
	return marca;
}
public void setMarca(String marca) {
	this.marca = marca;
}
public Date getDataFabricacao() {
	return dataFabricacao;
}
public void setDataFabricacao(Date dataFabricacao) {
	this.dataFabricacao = dataFabricacao;

}
