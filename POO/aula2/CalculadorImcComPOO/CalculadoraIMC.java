class CalculadoraIMC {
    static IMC calcular(Paciente paciente) {
        double imc = paciente.peso / (paciente.altura * paciente.altura);
        return new IMC(imc);
    }
}