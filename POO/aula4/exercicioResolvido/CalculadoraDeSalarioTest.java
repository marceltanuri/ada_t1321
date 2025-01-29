public class CalculadoraDeSalarioTest {

    public static void main(String[] args) {
        // Cenário 1: Salário até R$ 2000.00, sem vale-transporte
        Funcionario funcionario1 = criarFuncionario("João", "1990-05-15", "Desenvolvedor", 2000.00, false);
        validarDesconto(funcionario1, 200.00, "Cenário 1: Salário até R$ 2000.00, sem vale-transporte");

        // Cenário 2: Salário entre R$ 2000.01 e R$ 5000.00, sem vale-transporte
        Funcionario funcionario2 = criarFuncionario("Maria", "1985-03-10", "Analista", 4500.00, false);
        validarDesconto(funcionario2, 675.00, "Cenário 2: Salário entre R$ 2000.01 e R$ 5000.00, sem vale-transporte");

        // Cenário 3: Salário acima de R$ 5000.00, sem vale-transporte
        Funcionario funcionario3 = criarFuncionario("Carlos", "1980-07-20", "Gerente", 6000.00, false);
        validarDesconto(funcionario3, 1200.00, "Cenário 3: Salário acima de R$ 5000.00, sem vale-transporte");

        // Cenário 4: Salário acima de R$ 2500.00, com vale-transporte
        Funcionario funcionario4 = criarFuncionario("Ana", "1992-11-02", "Coordenadora", 3000.00, true);
        validarDesconto(funcionario4, 630.00, "Cenário 4: Salário acima de R$ 2500.00, com vale-transporte");

        // Cenário 5: Salário até R$ 2000.00, com vale-transporte (nenhum desconto adicional)
        Funcionario funcionario5 = criarFuncionario("Lucas", "1995-09-15", "Estagiário", 1800.00, true);
        validarDesconto(funcionario5, 180.00, "Cenário 5: Salário até R$ 2000.00, com vale-transporte");
    }

    private static Funcionario criarFuncionario(String nome, String dataNascimento, String cargo, double salarioBase, boolean valeTransporte) {
        DadosPessoais dadosPessoais = new DadosPessoais();
        dadosPessoais.nome = nome;
        dadosPessoais.dataNascimento = dataNascimento;

        DadosContratuais dadosContratuais = new DadosContratuais();
        dadosContratuais.cargo = cargo;
        dadosContratuais.salarioBase = salarioBase;
        dadosContratuais.valeTransporte = valeTransporte;

        Funcionario funcionario = new Funcionario();
        funcionario.dadosPessoais = dadosPessoais;
        funcionario.dadosContratuais = dadosContratuais;

        return funcionario;
    }

    private static void validarDesconto(Funcionario funcionario, double descontoEsperado, String descricaoCenario) {
        CalculadoraDeSalario calculadora = new CalculadoraDeSalario();
        double descontoCalculado = calculadora.calculaDesconto(funcionario);

        if (Double.compare(descontoCalculado, descontoEsperado) == 0) {
            System.out.println(descricaoCenario + " -> PASSED");
        } else {
            System.out.println(descricaoCenario + " -> FAILED");
            System.out.println("Desconto esperado: " + descontoEsperado + ", Desconto calculado: " + descontoCalculado);
        }
    }
}

// Abstração
// Encapsulamento
// Herança
// Polimorfismo