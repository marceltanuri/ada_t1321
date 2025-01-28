public class CalculadoraDeSalario {

    public double calculaDesconto(Funcionario funcionario) {
        double salarioBase = funcionario.dadosContratuais.salarioBase;
        boolean valeTransporte = funcionario.dadosContratuais.valeTransporte;
        double desconto = 0.0;

        if (salarioBase <= 2000.00) {
            desconto = salarioBase * 0.10;
        } else if (salarioBase <= 5000.00) {
            desconto = salarioBase * 0.15;
        } else {
            desconto = salarioBase * 0.20;
        }

        if (valeTransporte && salarioBase > 2500.00) {
            desconto += salarioBase * 0.06;
        }

        return desconto;
    }
}
