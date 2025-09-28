package co.edu.unicauca.asae.taller_05.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

/**
 * @brief Entidad base de la jerarquía de personas.
 * @details Estrategia JOINED para mantener normalización y evitar nulos de
 *          subclases.
 *          El correo es único. (Ver herencia JPA y restricciones de columna).
 *          Referencia: herencia en JPA SINGLE_TABLE / JOINED / TABLE_PER_CLASS.
 */
@Entity
@Getter
@Setter
@Table(name = "persona", uniqueConstraints = @UniqueConstraint(columnNames = "perCorreo"))
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Persona {

    /** Identificador interno autoincremental. */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int perId;

    /** Nombres de la persona (obligatorio, máx. 60). */
    @Column(nullable = false, length = 50)
    private String perNombre;

    /** Apellidos de la persona (obligatorio, máx. 60). */
    @Column(nullable = false, length = 50)
    private String perApellido;

    /** Correo institucional o personal único (obligatorio). */
    @Column(nullable = false, unique = true, length = 50)
    private String perCorreo;
}
