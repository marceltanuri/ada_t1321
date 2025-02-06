package modelo;

public class FuncionarioPJ extends Funcionario{
    private static final double TAXA_BONUS_FERIAS = 0.10;
    public FuncionarioPJ(String nome, Double salario) {
        super(nome, salario);
    }

    @Override
    public double calcularFerias() {
        return this.getSalario() * TAXA_BONUS_FERIAS;
    }
}
