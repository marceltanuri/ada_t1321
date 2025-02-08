package service;

import modelo.TipoFuncionario;

public class ServicoDeCalculoDeFeriasFactory {

    public static ServicoDeCalculoFerias obterLogicaDeCalculo(TipoFuncionario tipoFuncionario) {
        return switch (tipoFuncionario) {
            case CLT -> new CalcularFeriasCLT();
            case PJ -> new CalcularFeriasPJ();
            case ESTAGIARIO -> new CalcularFeriasEstagiario();
            case COOPERADO -> new CalculadoraDeFeriasDoCooperado();
            default -> throw new IllegalArgumentException();        };
    }

}


// ORM -> Classe -> Tabela campos da classe -> campos da tabela
// quem cria a tabela nao é vc
// objeto -> serializado para ser salvo no banco de dados
// objeto <- serializado no banco de dados
// nem esse Select vc faz mais
// FuncionarioRepository.list()
// FuncionarioRepository.getById(123)
// Spring -> SpringData -> JPA -> Java Persistence API -> SQL
// Hibernate
