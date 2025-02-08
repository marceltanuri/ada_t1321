package service;

import modelo.Funcionario;

public class CalculadoraDeFeriasDoCooperado implements ServicoDeCalculoFerias{

    @Override
    public double calcularFerias(Funcionario funcionario) {
        return funcionario.getSalario() / 5;

    }


    @Override
    public double calcularTaxa() {
        return 0;
    }
}
