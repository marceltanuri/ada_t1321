package service;

import modelo.Funcionario;

public class CalcularFeriasEstagiario implements ServicoDeCalculoFerias{

    public double calcularFerias(Funcionario funcionario) {
        return funcionario.getSalario() * 1.3;
    }
}
