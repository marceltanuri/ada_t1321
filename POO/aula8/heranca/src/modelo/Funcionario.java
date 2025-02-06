package modelo;

public abstract class Funcionario {
    private String nome;

    private Double salario;

    // tipo

    protected Funcionario(String nome, Double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public Double getSalario() {
        return salario;
    }

    public abstract double calcularFerias();

}

// Polimorfismo -> Herança ou Interface

// Classe concreta (Herança), extends
// Classe abstrata (Herança), extends
// Interface, implements
