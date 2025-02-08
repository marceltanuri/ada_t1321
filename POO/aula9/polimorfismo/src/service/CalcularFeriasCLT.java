package service;

import modelo.Funcionario;

public class CalcularFeriasCLT implements ServicoDeCalculoFerias {

    public double calcularFerias(Funcionario funcionario) {
        return funcionario.getSalario() * 2;
    }

}


// Classe pai/mae
// Classe filha herdar todos os attr & comportamentos

// NAO USE HERANçA, use composição ao inves