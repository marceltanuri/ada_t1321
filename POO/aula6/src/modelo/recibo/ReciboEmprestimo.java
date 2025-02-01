package modelo.recibo;

import modelo.Livro;
import modelo.Locador;

import java.time.LocalDateTime;

public class ReciboEmprestimo {

    ReciboEmprestimo(Livro livro, Locador locador) {
        this.livro = livro;
        this.locador = locador;
    }

    LocalDateTime dataDeInicio;

    Livro livro;

    Locador locador;

    public LocalDateTime dataPrevistaDeDevolucao;


}
