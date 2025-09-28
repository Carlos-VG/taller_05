package co.edu.unicauca.asae.taller_05.repositories;

import co.edu.unicauca.asae.taller_05.domain.FranjaHoraria;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * @brief Repositorio de Franja Horaria.
 * @details Métodos alineados con los casos de consulta del taller.
 */
public interface FranjaHorariaRepository extends JpaRepository<FranjaHoraria, Integer> {

    /**
     * @brief Franjas de un curso con curso+espacio en fetch (EAGER puntual).
     */
    @EntityGraph(attributePaths = { "curso", "espacioFisico" })
    List<FranjaHoraria> findByCurso_Id(int cursoId);

    /**
     * @brief Franjas de un docente, con curso en fetch y espacio LAZY.
     */
    @Query("""
                select f
                from FranjaHoraria f
                join f.curso c
                join c.docentes d
                left join fetch c.asignatura a
                where d.id = :docenteId
            """)
    List<FranjaHoraria> findByDocenteIdFetchCurso(@Param("docenteId") int docenteId);
}
