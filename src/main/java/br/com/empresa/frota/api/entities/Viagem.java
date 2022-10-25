package br.com.empresa.frota.api.entities;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "viagem")
public class Viagem implements Serializable{

	private static final long serialVersionUID = 8611332645334502446L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@ManyToOne(fetch = FetchType.EAGER)
	private Carro carro;

	@Column(name = "data_retirada", nullable = false)
	private LocalDate dataRetirada;

	@Column(name = "data_entrega", nullable = false)
	private LocalDate dataEntrega;
	
	

}
