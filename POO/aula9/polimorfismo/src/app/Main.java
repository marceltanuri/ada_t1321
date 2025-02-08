package app;

import modelo.Funcionario;
import modelo.TipoFuncionario;
import service.ServicoDeCalculoDeFeriasFactory;
import service.ServicoDeCalculoFerias;

public class Main {

    public static void main(String[] args) {

        String nome = args[0];

        TipoFuncionario tipo = TipoFuncionario.values()[Integer.valueOf(args[1]) - 1];

        double salario = Double.valueOf(args[2]);

        Funcionario funcionario = new Funcionario(nome, tipo, salario);

        ServicoDeCalculoFerias calculoFerias = ServicoDeCalculoDeFeriasFactory.obterLogicaDeCalculo(funcionario.getTipo());

        double ferias = calculoFerias.calcularFerias(funcionario);

        System.out.println(ferias);

    }

}
