package modelo.recibo;

import modelo.Livro;
import modelo.Locador;
import modelo.RegraDeEmprestimo;

import java.time.LocalDateTime;

public class ReciboEmprestimoFactory {

    public static ReciboEmprestimo criarRecibo(Livro livro, Locador locador) {
        ReciboEmprestimo reciboEmprestimo = new ReciboEmprestimo(livro, locador);
        reciboEmprestimo.dataDeInicio = LocalDateTime.now();
        reciboEmprestimo.dataPrevistaDeDevolucao = gerarDataDevolucao(livro);
        return reciboEmprestimo;
    }

    private static LocalDateTime gerarDataDevolucao(Livro livro) {
        if (livro.regraDeEmprestimo == RegraDeEmprestimo.CURTA_DURACAO) {
            return LocalDateTime.now().plusDays(1);
        } else if (livro.regraDeEmprestimo == RegraDeEmprestimo.MEDIA_DURACAO) {
            return LocalDateTime.now().plusDays(3);
        } else if (livro.regraDeEmprestimo == RegraDeEmprestimo.LONGA_DURACAO) {
            return LocalDateTime.now().plusDays(7);
        }

        throw new IllegalArgumentException("Não foi possível calcular a data de devolução do livro, regraDeEmprestimo inválida");
    }

}

// private: torna inacessivel um campo (atributo) como um método para qualquer outra classe além dela mesma

// privado de pacote (por omissão): torna inacessivel um campo (atributo) como um método para qualquer outra classe que esteja fora do pacote da mesma

// protected: protected: torna inacessivel um campo (atributo) como um método para qualquer outra classe que esteja fora do pacote da mesma .....

// public: libero geral! mesmo fora do pacote