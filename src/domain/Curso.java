package domain;

import java.util.List;

public class Curso {
    private Integer codigo;
    private String descricao;
    private List<Aluno> alunos;
    private List<Disciplina> disciplinas;

    public void cadastrar() {

    }

    public Curso(Integer codigo, String descricao, List<Aluno> alunos) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.alunos = alunos;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(List<Aluno> alunos) {
        this.alunos = alunos;
    }

    public List<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(List<Disciplina> disciplinas) {
        this.disciplinas = disciplinas;
    }



}
