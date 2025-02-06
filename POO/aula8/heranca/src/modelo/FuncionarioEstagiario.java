package modelo;

public class FuncionarioEstagiario extends Funcionario{

    private static final int DIAS_DE_FERIAS = 15;
    private static final int DIAS_DE_UM_MES = 30;

    public FuncionarioEstagiario(String nome, Double salario) {
        super(nome, salario);
    }

    @Override
    public double calcularFerias() {
        return (this.getSalario() * DIAS_DE_FERIAS) / DIAS_DE_UM_MES;
    }
}
