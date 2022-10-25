package br.com.empresa.frota.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.empresa.frota.api.entities.Viagem;

public interface ViagemRepository extends JpaRepository<Viagem, Long> {

}
