package modelo;

public class FuncionarioCooperado extends Funcionario{
    protected FuncionarioCooperado(String nome, Double salario) {
        super(nome, salario);
    }

    @Override
    public double calcularFerias() {
        return this.getSalario()/2;
    }
}
