package org.univille.agenda.model;

import jakarta.persistence.*;

@Entity(name = "tb_curso")
public class Curso {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumns(value = {
            @JoinColumn(name="agenda_dia", referencedColumnName="dia"),
            @JoinColumn(name="agenda_materia", referencedColumnName="materia"),
            @JoinColumn(name="agenda_sala", referencedColumnName="sala")
    })
    private Agenda agenda;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumns(value = {
            @JoinColumn(name="turma_codigo", referencedColumnName="codigo"),
            @JoinColumn(name="turma_semestre", referencedColumnName="semestre"),
    })
    private Turma turma;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumns(value = {
            @JoinColumn(name="professor_nome", referencedColumnName="nome")
    })
    private Professor professor;

    public Agenda getAgenda() {
        return agenda;
    }

    public void setAgenda(Agenda agenda) {
        this.agenda = agenda;
    }

    public Turma getTurma() {
        return turma;
    }

    public void setTurma(Turma turma) {
        this.turma = turma;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", agenda=" + agenda +
                ", turma=" + turma +
                ", professor=" + professor +
                '}';
    }
}
