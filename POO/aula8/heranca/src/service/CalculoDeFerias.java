package service;

import modelo.Funcionario;

public class CalculoDeFerias {

    public static double calcularValorDeFerias(Funcionario funcionario) {
        return funcionario.calcularFerias();
    }
}
