package modelo;

public class Funcionario {

    private TipoFuncionario tipo;

    private String nome;

    private Double salario;

    public Funcionario(TipoFuncionario tipo, String nome, Double salario) {
        this.nome = nome;
        this.tipo = tipo;
        this.salario = salario;
    }

    public TipoFuncionario getTipo() {
        return tipo;
    }

    public String getNome() {
        return nome;
    }

    public Double getSalario() {
        return salario;
    }
}
