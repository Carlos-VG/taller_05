-- ===========================
-- PERSONAS (base para herencia)
-- ===========================
INSERT INTO persona (id, nombre, apellido, correo) VALUES (1, 'Carlos', 'Pérez', 'carlos.perez@unicauca.edu.co');

INSERT INTO persona (id, nombre, apellido, correo) VALUES (2, 'Ana', 'Rojas', 'ana.rojas@unicauca.edu.co');

INSERT INTO persona (id, nombre, apellido, correo) VALUES (3, 'Luis', 'Martínez', 'luis.martinez@unicauca.edu.co');

INSERT INTO persona (id, nombre, apellido, correo) VALUES (4, 'Luis', 'Martínez', 'luis.martinez@unicauca.edu.co');

-- ===========================
-- DOCENTES (hereda de persona)
-- ===========================
-- Docente 1 (id=1)
INSERT INTO docente (id, oficina_id) VALUES (1, 1);

-- Docente 2 (id=2)
INSERT INTO docente (id, oficina_id) VALUES (2, 2);

-- ===========================
-- ADMINISTRATIVO (hereda de persona)
-- ===========================
INSERT INTO administrativo (id, rol) VALUES (3, 'Secretario Académico');

-- ===========================
-- OFICINAS
-- ===========================
INSERT INTO oficina (id, nombre, ubicacion) VALUES (1, 'Of-201', 'Bloque A, Piso 2');
INSERT INTO oficina (id, nombre, ubicacion) VALUES (2, 'Of-305', 'Bloque B, Piso 3');

-- ===========================
-- ASIGNATURAS
-- ===========================
INSERT INTO asignatura (id, nombre, codigo) VALUES (1, 'Arquitectura Empresarial', 'ASI-101');

INSERT INTO asignatura (id, nombre, codigo) VALUES (2, 'Bases de Datos II', 'ASI-102');

-- ===========================
-- ESPACIOS FÍSICOS
-- ===========================
INSERT INTO espacio_fisico (id, nombre, capacidad) VALUES (1, 'Aula Tulcán 101', 40);

INSERT INTO espacio_fisico (id, nombre, capacidad) VALUES (2, 'Laboratorio Redes 2', 28);

-- ===========================
-- CURSOS
-- ===========================
INSERT INTO curso (id, nombre, asignatura_id) VALUES (1, 'Arquitectura Empresarial - Grupo A', 1);

INSERT INTO curso (id, nombre, asignatura_id) VALUES (2, 'Bases de Datos II - Grupo B', 2);

-- ===========================
-- RELACIÓN CURSO–DOCENTE (N:M)
-- ===========================
-- Curso 1 con Docente 1 y 2
INSERT INTO curso_docente (curso_id, docente_id) VALUES (1, 1);
INSERT INTO curso_docente (curso_id, docente_id) VALUES (1, 2);

-- Curso 2 con Docente 2
INSERT INTO curso_docente (curso_id, docente_id) VALUES (2, 2);

-- ===========================
-- FRANJAS HORARIAS
-- ===========================
INSERT INTO franja_horaria (id, dia, hora_inicio, hora_fin, curso_id, espacio_fisico_id) VALUES (1, 'LUNES', '08:00:00', '10:00:00', 1, 1);

INSERT INTO franja_horaria (id, dia, hora_inicio, hora_fin, curso_id, espacio_fisico_id) VALUES (2, 'MIERCOLES', '10:00:00', '12:00:00', 1, 2);

INSERT INTO franja_horaria (id, dia, hora_inicio, hora_fin, curso_id, espacio_fisico_id) VALUES (3, 'VIERNES', '14:00:00', '16:00:00', 2, 1);
-- ===========================
