package org.univille.agenda.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.univille.agenda.model.Turma;

public interface TurmaRepository extends JpaRepository<Turma,Long> {
}
