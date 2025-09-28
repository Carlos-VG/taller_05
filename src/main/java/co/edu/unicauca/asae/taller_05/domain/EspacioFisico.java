package co.edu.unicauca.asae.taller_05.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

/**
 * @brief Entidad que representa un espacio físico (aula/laboratorio).
 * @details Nombre único. Capacidad y ubicación opcionales.
 */
@Entity
@Getter
@Setter
@Table(name = "espacio_fisico", uniqueConstraints = @UniqueConstraint(columnNames = "espNombre"))
public class EspacioFisico {

    /** Identificador interno autoincremental. */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int espId;

    /** Nombre único del espacio (obligatorio). */
    @Column(nullable = false, unique = true, length = 255)
    private String espNombre;

    /** Capacidad aproximada (opcional). */
    @Column
    private int espCapacidad;

}
