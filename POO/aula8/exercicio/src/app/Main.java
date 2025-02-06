package app;

import modelo.Funcionario;
import modelo.TipoFuncionario;
import service.CalculoDeFerias;

import java.util.Objects;

public class Main {

    public static void main(String[] args) {
        //**Entrada 1:** (Funcionário CLT)
        Funcionario funcionario = new Funcionario(TipoFuncionario.CLT, "João", 3000.00);

        validar(3680.00, CalculoDeFerias.calcularValorDeFerias(funcionario), "");

        //**Entrada 2:** (Funcionário PJ)
        funcionario = new Funcionario(TipoFuncionario.PJ, "Ana", 5000.00);

        validar(500.00, CalculoDeFerias.calcularValorDeFerias(funcionario), "");

        // **Entrada 3:** (Estagiário)
        funcionario = new Funcionario(TipoFuncionario.ESTAGIARIO, "Lucas", 1200.00);

        validar(600.00, CalculoDeFerias.calcularValorDeFerias(funcionario), "");

    }

    public static void validar(double valorEsperado, double valorObtido, String mensagemDeValidacao){

        if(!Objects.equals(valorEsperado, valorObtido)){
            System.out.println("Not passed: " + mensagemDeValidacao + " Esperado: " + valorEsperado + " | Obtido: " + valorObtido);
        }
        else{
            System.out.println("Passed!");
        }

    }
}
