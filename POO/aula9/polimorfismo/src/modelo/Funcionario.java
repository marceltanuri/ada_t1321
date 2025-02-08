package modelo;

public class Funcionario {
    private String nome;
    private TipoFuncionario tipo; // 1,2,3,4,5

    private double salario;

    public Funcionario(String nome, TipoFuncionario tipo, double salario) {
        this.nome = nome;
        this.tipo = tipo;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public TipoFuncionario getTipo() {
        return tipo;
    }

    public double getSalario() {
        return salario;
    }
}


