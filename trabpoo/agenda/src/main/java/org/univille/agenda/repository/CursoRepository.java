package org.univille.agenda.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.univille.agenda.model.Curso;

public interface CursoRepository extends JpaRepository<Curso,Long> {
}
