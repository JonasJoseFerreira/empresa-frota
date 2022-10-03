package br.com.empresa.frota.api.entities;




	import java.io.Serializable;
	
	
	import javax.persistence.Column;
	import javax.persistence.Entity;
	
	import javax.persistence.GeneratedValue;
	import javax.persistence.GenerationType;
	import javax.persistence.Id;
	
	import javax.persistence.Table;
	

	

	@Entity
	@Table(name = "funcionario")
	public class Funcionario implements Serializable {

		private static final long serialVersionUID = -5754246207015712518L;
		
		private Long id;
		private String nome;
		
		public Funcionario() {
		}

		@Id
	    @GeneratedValue(strategy=GenerationType.AUTO)
		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		@Column(name = "nome", nullable = false)
		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}


		
}
