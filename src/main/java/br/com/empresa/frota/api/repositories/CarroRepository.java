package br.com.empresa.frota.api.repositories;

	import java.util.List;

	import javax.persistence.NamedQueries;
	import javax.persistence.NamedQuery;

	import org.springframework.data.domain.Page;
	import org.springframework.data.domain.Pageable;
	import org.springframework.data.jpa.repository.JpaRepository;
	import org.springframework.data.repository.query.Param;
	import org.springframework.transaction.annotation.Transactional;

	import br.com.empresa.frota.api.entities.Carro;

	@Transactional(readOnly = true)
	@NamedQueries({
			@NamedQuery(name = "LancamentoRepository.findByFuncionarioId", 
					query = "SELECT lanc FROM Lancamento lanc WHERE lanc.funcionario.id = :funcionarioId") })
	public interface CarroRepository extends JpaRepository<Carro, Long> {

		List<Carro> findByFuncionarioId(@Param("funcionarioId") Long funcionarioId);

		Page<Carro> findByFuncionarioId(@Param("funcionarioId") Long funcionarioId, Pageable pageable);
}

