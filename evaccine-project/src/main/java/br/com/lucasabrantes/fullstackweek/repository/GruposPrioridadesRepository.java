package br.com.lucasabrantes.fullstackweek.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import br.com.lucasabrantes.fullstackweek.domain.GruposPrioridades;

public interface GruposPrioridadesRepository extends JpaRepository<GruposPrioridades, Long> {
	
}
