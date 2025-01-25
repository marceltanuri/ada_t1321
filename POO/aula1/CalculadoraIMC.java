class CalculadoraIMC {
    static void main(String[] args) {
        
        String nome = null;
        double peso = 0.0;
        double altura = 0.0;

        for (int i = 0; i < args.length; i++) {
            switch (args[i]) {
                case "-n" -> nome = args[++i];
                case "-p" -> peso = Double.parseDouble(args[++i]);
                case "-a" -> altura = Double.parseDouble(args[++i]);
                default -> System.out.println("Parâmetro desconhecido: " + args[i]);
            }
        }

        if (nome == null || peso <= 0 || altura <= 0) {
            System.out.println("Erro: Todos os parâmetros devem ser fornecidos corretamente.");
            System.out.println("Uso: java CalculadoraIMC -n <nome> -p <peso> -a <altura>");
            return;
        }

        double imc = peso / (altura * altura);
        imprimir(nome, peso, altura, imc);
       
    }

    static void imprimir(String nome, double peso, double altura, double imc){
        System.out.println("Paciente: " + nome);
        System.out.println("Peso: " + String.format("%.2f", peso) + " kg");
        System.out.println("Altura: " + String.format("%.2f", altura) + " m");
        System.out.println("IMC: " + String.format("%.2f", imc));
    }
}