package domain;

import java.util.List;

public class Turma {
    private Integer ano;
    private Integer semestre;
    private Integer diasSemana;
    private String horarios;
    private Disciplina disciplina;
    private List<Avaliacao> avaliacoes;

    private void abrirTurma() {

    }

    private void alocarProfessor() {
        
    }

    public Turma(Integer ano, Integer semestre, Integer diasSemana, String horarios, Disciplina disciplina) {
        this.ano = ano;
        this.semestre = semestre;
        this.diasSemana = diasSemana;
        this.horarios = horarios;
        this.disciplina = disciplina;
    }

    public Integer getAno() {
        return ano;
    }

    public void setAno(Integer ano) {
        this.ano = ano;
    }

    public Integer getSemestre() {
        return semestre;
    }

    public void setSemestre(Integer semestre) {
        this.semestre = semestre;
    }

    public Integer getDiasSemana() {
        return diasSemana;
    }

    public void setDiasSemana(Integer diasSemana) {
        this.diasSemana = diasSemana;
    }

    public String getHorarios() {
        return horarios;
    }

    public void setHorarios(String horarios) {
        this.horarios = horarios;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }

    public List<Avaliacao> getAvaliacoes() {
        return avaliacoes;
    }

    public void setAvaliacoes(List<Avaliacao> avaliacoes) {
        this.avaliacoes = avaliacoes;
    }

}
