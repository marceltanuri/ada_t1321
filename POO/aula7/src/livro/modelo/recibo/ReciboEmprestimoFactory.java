package livro.modelo.recibo;

import livro.Locador;
import livro.RegraDeEmprestimo;
import livro.modelo.Livro;
import livro.modelo.recibo.ReciboEmprestimo;

import java.time.LocalDateTime;

public class ReciboEmprestimoFactory {

    public static ReciboEmprestimo criarRecibo(Livro livro, Locador locador) {
        ReciboEmprestimo reciboEmprestimo = new ReciboEmprestimo(livro, locador);
        reciboEmprestimo.dataDeInicio = LocalDateTime.now();
        reciboEmprestimo.dataPrevistaDeDevolucao = gerarDataDevolucao(livro);
        return reciboEmprestimo;
    }

    private static LocalDateTime gerarDataDevolucao(Livro livro) {
        if (livro.getRegraDeEmprestimo() == RegraDeEmprestimo.CURTA_DURACAO) {
            return LocalDateTime.now().plusDays(1);
        } else if (livro.getRegraDeEmprestimo() == RegraDeEmprestimo.MEDIA_DURACAO) {
            return LocalDateTime.now().plusDays(3);
        } else if (livro.getRegraDeEmprestimo() == RegraDeEmprestimo.LONGA_DURACAO) {
            return LocalDateTime.now().plusDays(7);
        }

        throw new IllegalArgumentException("Não foi possível calcular a data de devolução do livro, regraDeEmprestimo inválida");
    }

}