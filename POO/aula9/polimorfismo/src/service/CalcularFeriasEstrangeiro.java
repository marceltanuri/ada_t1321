package service;

import modelo.Funcionario;

public class CalcularFeriasEstrangeiro implements ServicoDeCalculoFerias {

    public double calcularFerias(Funcionario funcionario) {
        return funcionario.getSalario() * 1.5;
    }
}
