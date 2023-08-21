package application;

import java.util.*;

public class Tarefa {

    private String titulo;
    private String descricao;
    private Boolean isConcluida;

    public Tarefa(String titulo, String descricao, Boolean isConcluida) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.isConcluida = isConcluida;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Boolean getConcluida() {
        return isConcluida;
    }

    public void setConcluida(Boolean concluida) {
        isConcluida = concluida;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tarefa tarefa = (Tarefa) o;
        return Objects.equals(titulo, tarefa.titulo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(titulo);
    }

    @Override
    public String toString() {
        return "Tarefa{" +
                "titulo='" + titulo + '\'' +
                ", descricao='" + descricao + '\'' +
                ", isConcluida=" + isConcluida +
                '}';
    }
}
