package br.com.empresa.frota.api.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import br.com.empresa.frota.api.entities.Funcionario;

	
public interface FuncionarioRepository extends JpaRepository<Funcionario, Long> {

		Funcionario findByCpf(String cpf);
		
		Funcionario findByEmail(String email);
		
		Funcionario findByCpfOrEmail(String cpf, String email);
}
