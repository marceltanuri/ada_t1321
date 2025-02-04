package livro.modelo;

import livro.RegraDeEmprestimo;

public class Livro {
    private String titulo;
    private String autor;
    private String editora;
    private Integer ano;
    private String categoria;
    private RegraDeEmprestimo regraDeEmprestimo;

    public Livro(String titulo, String autor, String editora, Integer ano, String categoria, RegraDeEmprestimo regraDeEmprestimo) {
        this.titulo = titulo;
        this.autor = autor;
        this.editora = editora;
        this.ano = ano;
        this.categoria = categoria;
        this.regraDeEmprestimo = regraDeEmprestimo;
    }

    public String getTitulo(){
        return this.titulo;
    }
    public String getAutor(){
        return this.autor;
    }

    public RegraDeEmprestimo getRegraDeEmprestimo(){
        return this.regraDeEmprestimo;
    }

    public void setRegraDeEmprestimo(RegraDeEmprestimo regraDeEmprestimo){
        this.regraDeEmprestimo = regraDeEmprestimo;
    }

    public String getEditora() {
        return editora;
    }
    public Integer getAno() {
        return ano;
    }
    public String getCategoria() {
        return categoria;
    }
}