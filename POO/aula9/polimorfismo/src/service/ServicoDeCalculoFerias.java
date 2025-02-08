package service;

import modelo.Funcionario;

public interface ServicoDeCalculoFerias extends ServicoDeCalculo {
    double calcularFerias(Funcionario funcionario);



    }

// Classe -> objetos

// Classe abstratas ou Interface -> classes -> objetos

// Interfaces apenas define comportamento, implements (mais simples)

// Classe abstrata define tambem atributos, extends (menos simples)

// Classe abstrata nem todos os metodos precisam ser abstratos

// Classe -> comportamento

// objeto -> diferentes valores de atributos, formas de implementar o metodo