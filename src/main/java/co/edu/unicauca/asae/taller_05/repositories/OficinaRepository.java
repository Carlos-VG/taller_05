package co.edu.unicauca.asae.taller_05.repositories;

import co.edu.unicauca.asae.taller_05.domain.Oficina;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @brief Repositorio de Oficina.
 */
public interface OficinaRepository extends JpaRepository<Oficina, Integer> {
}
