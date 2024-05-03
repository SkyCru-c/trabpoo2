package org.univille.agenda.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.univille.agenda.model.Professor;

public interface ProfessorRepository extends JpaRepository<Professor,Long> {
}
