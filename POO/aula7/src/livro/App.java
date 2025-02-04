package livro;

import livro.modelo.Livro;
import livro.modelo.recibo.ReciboEmprestimo;
import livro.modelo.recibo.ReciboEmprestimoFactory;

class App {

    static void main(String[] args) {

        Livro livro1 = new Livro("", "", "", 1990, "", RegraDeEmprestimo.CURTA_DURACAO);

        livro1.setRegraDeEmprestimo(RegraDeEmprestimo.LONGA_DURACAO);

        ReciboEmprestimo recibo = ReciboEmprestimoFactory.criarRecibo(null, null);


    }

}
