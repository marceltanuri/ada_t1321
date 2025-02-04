public class Pedido {

    String mesa = "0";

    String descricao = "Couver";

    public Pedido() {

    }

    public Pedido(String mesa, String descricao) {
        this.mesa = mesa;
        this.descricao = descricao;
        this.fecharConta();
    }

    public void fecharConta(){

    }

    // Static, Instance
    // Singleton é um entre alguns Design Patterns (Padroes de Projeto) -> o mais bonite de POO aplicada

    // POO -> S.O.L.I.D -> Design Patterns
}
