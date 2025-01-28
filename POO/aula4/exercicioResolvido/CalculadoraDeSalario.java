
class CalculadoraDeSalario {

    double calculaDesconto(Funcionario funcionario) {
        double salarioBase = funcionario.dadosContratuais.salarioBase;
        boolean valeTransporte = funcionario.dadosContratuais.valeTransporte;
        double desconto = 0.0;

        if (salarioBase <= TabelaDeValoresDeDesconto.SALARIO_ESCALAO_1) { 
            desconto = salarioBase * TabelaDeValoresDeDesconto.DESCONTO_ESCALAO_1;
        } else if (salarioBase <= TabelaDeValoresDeDesconto.SALARIO_ESCALAO_2) {
            desconto = salarioBase * TabelaDeValoresDeDesconto.DESCONTO_ESCALAO_2;
        } else {
            desconto = salarioBase * TabelaDeValoresDeDesconto.DESCONTO_ESCALAO_3;
        }

        if (valeTransporte && salarioBase > TabelaDeValoresDeDesconto.SALARIO_LIMITE_DESCONTO_VT) {
            desconto += salarioBase * TabelaDeValoresDeDesconto.DESCONTO_VT;
        }

        return desconto;
    }
}
