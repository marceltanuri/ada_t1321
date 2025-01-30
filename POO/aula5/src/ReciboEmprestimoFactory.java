import java.time.LocalDateTime;

public class ReciboEmprestimoFactory {

    static ReciboEmprestimo criarRecibo(Livro livro, Locador locador) {
        ReciboEmprestimo reciboEmprestimo = new ReciboEmprestimo(livro, locador);
        reciboEmprestimo.dataDeInicio = LocalDateTime.now();
        reciboEmprestimo.dataPrevistaDeDevolucao = gerarDataDevolucao(livro);
        return reciboEmprestimo;
    }

    private static LocalDateTime gerarDataDevolucao(Livro livro) {
        if (livro.regraDeEmprestimo == RegraDeEmprestimo.CURTA_DURACAO) {
            return LocalDateTime.now().plusDays(1);
        } else if (livro.regraDeEmprestimo == RegraDeEmprestimo.MEDIA_DURACAO) {
            return LocalDateTime.now().plusDays(1);
        } else if (livro.regraDeEmprestimo == RegraDeEmprestimo.LONGA_DURACAO) {
            return LocalDateTime.now().plusDays(1);
        }

        throw new IllegalArgumentException("Não foi possível calcular a data de devolução do livro, regraDeEmprestimo inválida");
    }

}
