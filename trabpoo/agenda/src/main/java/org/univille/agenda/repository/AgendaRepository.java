package org.univille.agenda.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.univille.agenda.model.Agenda;

public interface AgendaRepository extends JpaRepository<Agenda,Long> {
}
