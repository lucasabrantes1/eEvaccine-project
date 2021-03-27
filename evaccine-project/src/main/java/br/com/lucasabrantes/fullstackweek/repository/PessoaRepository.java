package br.com.lucasabrantes.fullstackweek.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.lucasabrantes.fullstackweek.domain.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Long> {

}
