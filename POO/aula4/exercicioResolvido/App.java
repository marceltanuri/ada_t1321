class App{
    public static void main(String... a){

        Funcionario f1 = new Funcionario();
        f1.dadosPessoais = new DadosPessoais();
        f1.dadosContratuais = new DadosContratuais();

        f1.dadosPessoais.nome = null; // TODO preencher com valores do a[]
        f1.dadosPessoais.dataNascimento = null;
        f1.dadosContratuais.cargo = null;

        double x = f1.dadosContratuais.salarioBase * 1;
        System.out.println(x);
    }
}