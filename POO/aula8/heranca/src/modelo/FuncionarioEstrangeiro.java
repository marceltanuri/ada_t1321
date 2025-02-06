package modelo;

public class FuncionarioEstrangeiro extends Funcionario{
    protected FuncionarioEstrangeiro(String nome, Double salario) {
        super(nome, salario);
    }

    @Override
    public double calcularFerias() {
        return 0.0;
    }
}
