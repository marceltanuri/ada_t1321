class Livro {

    public Livro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    public Livro(){

    }

    public Livro(String titulo, String autor, String editora, Integer ano, String categoria, RegraDeEmprestimo regraDeEmprestimo) {
        this.titulo = titulo;
        this.autor = autor;
        this.editora = editora;
        this.ano = ano;
        this.categoria = categoria;
        this.regraDeEmprestimo = regraDeEmprestimo;
    }

    String titulo;
    String autor;
    String editora;
    Integer ano;
    String categoria;
    RegraDeEmprestimo regraDeEmprestimo;

}
