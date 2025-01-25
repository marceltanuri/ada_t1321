# Exercício: Cálculo de Salário Líquido com Vale-Transporte

## Descrição
Você deverá criar uma aplicação em Java que utiliza conceitos básicos de Programação Orientada a Objetos (POO) para calcular o **salário líquido** de um funcionário. O programa deverá receber dados do funcionário pelo método `main` (através do array `args`) e calcular o salário líquido com base em regras de desconto automáticas e na adesão ou não ao **vale-transporte**.

---

## Requisitos
1. **Criar uma classe chamada `Funcionario`** com os seguintes atributos:
   - `String nome`: Nome do funcionário.
   - `int idade`: Idade do funcionário.
   - `String cargo`: Cargo ou função do funcionário.
   - `double salarioBase`: Salário base do funcionário.
   - `double desconto`: Valor total de desconto (calculado automaticamente pelo programa).
   - `boolean recebeValeTransporte`: Indica se o funcionário opta por receber o vale-transporte.

2. **Métodos na classe `Funcionario`**:
   - `calcularDesconto()`: Calcula o valor do desconto com base em:
     - **Faixa salarial:**
       - Salário base até **R$ 2000.00**: 10% de desconto.
       - Salário base de **R$ 2000.01 a R$ 5000.00**: 15% de desconto.
       - Salário base acima de **R$ 5000.00**: 20% de desconto.
     - **Vale-transporte (opcional):**
       - Para quem recebe vale-transporte e tem salário base acima de **R$ 2500.00**, aplica-se uma taxa adicional de **6% sobre o salário base**.
   - `calcularSalarioLiquido()`: Retorna o salário líquido do funcionário com a fórmula:
     ```java
     salarioLiquido = salarioBase - desconto;
     ```

3. **Receber dados pelo método `main`**:
   - O programa deve receber os dados no formato:
     ```
     nome idade cargo salarioBase recebeValeTransporte
     ```
     Por exemplo:
     ```
     java CalculadoraSalario João 30 "Desenvolvedor" 4000.00 true
     ```

4. **Criar uma classe chamada `CalculadoraSalario`**:
   - Esta classe deve conter o método `main` responsável por:
     - Ler os argumentos do `args` e convertê-los para os tipos necessários.
     - Criar um objeto da classe `Funcionario` com os dados fornecidos.
     - Calcular o desconto automaticamente com base no salário base e na adesão ao vale-transporte.
     - Exibir o nome, idade, cargo, adesão ao vale-transporte e o salário líquido do funcionário.

5. **Validar os dados de entrada**:
   - Certifique-se de que idade e salário base sejam positivos.
   - O valor de `recebeValeTransporte` deve ser `true` ou `false`.
   - Exiba mensagens de erro claras caso algum dado seja inválido.

6. **Exibir o resultado**:
   - O programa deve imprimir os dados do funcionário e o salário líquido com duas casas decimais:
     ```
     Funcionário: João
     Idade: 30
     Cargo: Desenvolvedor
     Recebe Vale-Transporte: Sim
     Salário Líquido: R$ 3640.00
     ```

---

## Regras de Negócio
1. **Faixas de desconto baseadas no salário base**:
   - Salário até **R$ 2000.00**: 10% de desconto.
   - Salário de **R$ 2000.01 a R$ 5000.00**: 15% de desconto.
   - Salário acima de **R$ 5000.00**: 20% de desconto.

2. **Desconto adicional para vale-transporte**:
   - Caso o funcionário receba vale-transporte **(recebeValeTransporte = true)** e tenha um salário base acima de **R$ 2500.00**, aplica-se um desconto adicional de **6% sobre o salário base**.

3. **Dados de entrada válidos**:
   - Idade e salário base devem ser positivos.
   - O valor de `recebeValeTransporte` deve ser um booleano válido (`true` ou `false`).

4. **Caso a entrada esteja incompleta ou no formato errado, exiba a mensagem:**
   ```
   Erro: Formato de entrada inválido. Use: nome idade cargo salarioBase recebeValeTransporte
   ```

---

## Exemplo de Execução

**Entrada válida com vale-transporte:**
```shell
java CalculadoraSalario Maria 28 "Analista de Sistemas" 4500.00 true
```
**Saída:**
```
Funcionário: Maria
Idade: 28
Cargo: Analista de Sistemas
Recebe Vale-Transporte: Sim
Salário Líquido: R$ 3660.00
```

**Entrada válida sem vale-transporte:**
```shell
java CalculadoraSalario João 35 "Gerente" 5200.00 false
```
**Saída:**
```
Funcionário: João
Idade: 35
Cargo: Gerente
Recebe Vale-Transporte: Não
Salário Líquido: R$ 4160.00
```

**Entrada inválida (dados faltando):**
```shell
java CalculadoraSalario Carlos 29 "Engenheiro" 3000.00
```
**Saída:**
```
Erro: Formato de entrada inválido. Use: nome idade cargo salarioBase recebeValeTransporte
```

**Entrada inválida (valor negativo):**
```shell
java CalculadoraSalario Ana 25 "Desenvolvedor" -3000.00 true
```
**Saída:**
```
Erro: Idade e salário base devem ser valores positivos.
```

---

## Objetivo do Exercício
- Aplicar conceitos de POO, como criação de classes e métodos.
- Manipular argumentos do método `main`.
- Implementar lógica de negócio com regras baseadas em faixas salariais e condições adicionais.
- Validar entradas de forma robusta e exibir mensagens claras.

Este exercício simula um cenário real de cálculo de salários e beneficia os alunos ao introduzir a combinação de POO com lógica de negócios.
