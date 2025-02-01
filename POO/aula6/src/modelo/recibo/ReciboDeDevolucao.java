package modelo.recibo;

import java.time.LocalDateTime;

public class ReciboDeDevolucao {

    ReciboEmprestimo reciboEmprestimo;

    LocalDateTime dataDevolucao;

    String observacao;


    public ReciboDeDevolucao(ReciboEmprestimo reciboEmprestimo, LocalDateTime dataDevolucao, String observacao) {
        this.reciboEmprestimo = reciboEmprestimo;
        this.dataDevolucao = dataDevolucao;
        this.observacao = observacao;
    }

    public ReciboDeDevolucao(ReciboEmprestimo reciboEmprestimo, LocalDateTime dataDevolucao) {
        this.reciboEmprestimo = reciboEmprestimo;
        this.dataDevolucao = dataDevolucao;
    }
}

// compile errors
// runtime errors
