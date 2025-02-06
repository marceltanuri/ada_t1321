package service;

import modelo.Funcionario;

public class CalculoDeFerias {

    public static final int DIAS_DE_FERIAS_ESTAGIARIO = 15;
    public static final double TAXA_BONUS_FERIAS_PJ = 0.10;
    public static final double TAXA_INSS_FERIAS = 0.08;
    public static final int FRACAO_ADICIONAL_FERIAS_CLT = 3;

    public static double calcularValorDeFerias(Funcionario funcionario) {

        double ferias = switch (funcionario.getTipo()) {
            case CLT -> {
                // Valor das férias = Salário mensal + (Salário mensal / 3) - INSS (8%)
                double salario = funcionario.getSalario();
                double valorTotal = salario + (salario / FRACAO_ADICIONAL_FERIAS_CLT);
                double inss = valorTotal * TAXA_INSS_FERIAS;  // INSS agora aplicado sobre o total
                yield valorTotal - inss;}
            case PJ -> {
                // Salário mensal * 0.10
                yield funcionario.getSalario() * TAXA_BONUS_FERIAS_PJ;
            }
            case ESTAGIARIO -> {
                //Valor das férias = (Bolsa Auxílio * 15) / 30
                yield (funcionario.getSalario() * DIAS_DE_FERIAS_ESTAGIARIO) / 30;
            }
            case COOPERADO -> {
                yield funcionario.getSalario()  / 2;
            }
            default ->
                    throw new IllegalArgumentException("Regra de cálculo de férias não disponível para o tipo de funcionário: " + funcionario.getTipo());
        };
        return ferias;
    }
}
