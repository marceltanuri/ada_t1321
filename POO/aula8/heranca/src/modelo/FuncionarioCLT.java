package modelo;

public class FuncionarioCLT extends Funcionario {

    private static final int FRACAO_ADICIONAL_FERIAS = 3;
    private static final double TAXA_INSS_FERIAS = 0.08;

    public FuncionarioCLT(String nome, Double salario) {
        super(nome, salario);
    }

    @Override
    public double calcularFerias() {
        {
            double valorTotal = this.getSalario() + (this.getSalario() / FRACAO_ADICIONAL_FERIAS);
            return valorTotal - (valorTotal * TAXA_INSS_FERIAS);
        }

    }
}
