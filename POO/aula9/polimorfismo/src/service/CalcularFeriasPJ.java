package service;

import modelo.Funcionario;

public class CalcularFeriasPJ implements ServicoDeCalculoFerias {

    public double calcularFerias(Funcionario funcionario) {
        return funcionario.getSalario() / 2;
    }


}
