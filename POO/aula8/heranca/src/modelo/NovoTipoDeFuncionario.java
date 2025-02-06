package modelo;

public class NovoTipoDeFuncionario extends Funcionario {
    protected NovoTipoDeFuncionario(String nome, Double salario) {
        super(nome, salario);
    }

    @Override
    public double calcularFerias() {
        // nova regra de negócio sem alterar nenhuma outra classe do programa
        return 0;
    }
}
