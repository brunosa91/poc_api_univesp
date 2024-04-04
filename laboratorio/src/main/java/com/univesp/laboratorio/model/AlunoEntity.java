package com.univesp.laboratorio.model;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Objects;

@Entity
@Table(name = "aluno_entity")
@Data
public class AlunoEntity implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idAluno;

    @Column(nullable = true)
    private String nome;

    @Column(nullable = true)
    private Integer matricula;

    @Column
    private LocalDateTime DataCriacao;
/*
    public AlunoEntity() {
    }
    public AlunoEntity(Long idAluno, String nome, Integer matricula, LocalDateTime dataCriacao) {
        this.idAluno = idAluno;
        this.nome = nome;
        this.matricula = matricula;
        DataCriacao = dataCriacao;
    }

    public Long getIdAluno() {
        return idAluno;
    }

    public void setIdAluno(Long idAluno) {
        this.idAluno = idAluno;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getMatricula() {
        return matricula;
    }

    public void setMatricula(Integer matricula) {
        this.matricula = matricula;
    }

    public LocalDateTime getDataCriacao() {
        return DataCriacao;
    }

    public void setDataCriacao(LocalDateTime dataCriacao) {
        DataCriacao = dataCriacao;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AlunoEntity that = (AlunoEntity) o;
        return Objects.equals(idAluno, that.idAluno) && Objects.equals(nome, that.nome) && Objects.equals(matricula, that.matricula) && Objects.equals(DataCriacao, that.DataCriacao);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idAluno, nome, matricula, DataCriacao);
    }
*/
}
