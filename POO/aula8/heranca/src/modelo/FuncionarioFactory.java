package modelo;

public class FuncionarioFactory {

    public static Funcionario novoFuncionario(TipoFuncionario tipoFuncionario, String nome, double salario
    ){
        return switch (tipoFuncionario){
            case CLT -> new FuncionarioCLT(nome, salario);
            case PJ -> new FuncionarioPJ(nome, salario);
            case ESTAGIARIO -> new FuncionarioEstagiario(nome, salario);
            case COOPERADO -> new FuncionarioCooperado(nome, salario);
            case ESTRANGEIRO -> new FuncionarioEstrangeiro(nome, salario);
            default -> throw new IllegalArgumentException("Tipo inválido");
        };
    }

}
