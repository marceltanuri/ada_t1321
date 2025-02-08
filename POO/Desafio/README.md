# 🚀 Desafio Extra – Sistema de GPS com Polimorfismo  

Olá, turma!  

Agora que vocês aprenderam sobre **polimorfismo com interfaces**, chegou a hora de praticar com um desafio extra! Vamos criar um **sistema de GPS** que calcula rotas de diferentes formas, utilizando os conceitos de **interface, classes concretas e factory**.  

---

## 🎯 Objetivo do Desafio  
Criar um sistema que permita calcular rotas de diferentes formas, usando **polimorfismo** para lidar com as diferentes maneiras de traçar um caminho entre dois pontos.  

---

## 📌 Requisitos  

### 1️⃣ Criar uma Interface ou Classe Abstrata  
- Deve representar o comportamento comum das rotas.  
- Ter um método:  

```java
String traçarRota(String pontoA, String pontoB);
```

- O método recebe dois pontos (origem e destino) e retorna uma `String` com os passos do percurso.  

### 2️⃣ Criar Classes Concretas para Diferentes Tipos de Rotas  
Cada classe deve implementar o método `traçarRota`, retornando uma simulação da rota em forma de texto.  

Tipos de rotas que devem ser implementados:  
- 🚗 **Rota de Carro**  
- 🚶 **Rota de Pedestre**  
- 🚲 **Rota de Bicicleta**  
- 🚌 **Rota de Ônibus**  

Cada uma dessas classes deve ter uma implementação diferente do método `traçarRota`, simulando os passos para chegar ao destino.  

### 3️⃣ Criar uma Factory para Gerenciar as Instâncias  
A Factory deve ter um método que retorna a instância correta de acordo com o tipo de rota escolhido pelo usuário.  

```java
public class RotaFactory {
    public static Rota criarRota(String tipo) {
        switch (tipo.toLowerCase()) {
            case "carro": return new RotaCarro();
            case "pedestre": return new RotaPedestre();
            case "bicicleta": return new RotaBicicleta();
            case "onibus": return new RotaOnibus();
            default: throw new IllegalArgumentException("Tipo de rota inválido.");
        }
    }
}
```

### 4️⃣ Criar a Classe `Main` para Testar o Sistema  
- Deve pedir ao usuário via `Scanner` os seguintes dados:  
  - **Origem** (Ponto A)  
  - **Destino** (Ponto B)  
  - **Tipo de Rota** (carro, pedestre, bicicleta ou ônibus)  
- Com base no tipo de rota escolhido, usar a **Factory** para obter a instância correta e chamar o método `traçarRota`.  
- Exibir a rota calculada na tela.  

---

## 📝 Exemplo de Execução  

**Entrada no terminal:**  
```
Digite o ponto de origem: Praça Central  
Digite o ponto de destino: Rua das Palmeiras  
Escolha o tipo de rota (carro, pedestre, bicicleta, onibus): bicicleta  
```

**Saída esperada:**  
```
Calculando rota de bicicleta de Praça Central até Rua das Palmeiras...  
1. Siga pela ciclovia da Av. Principal.  
2. Vire à direita na Rua das Palmeiras.  
3. Você chegou ao seu destino! 🚲  
```

---

## 🏆 O que vocês vão praticar com este desafio?  
✅ **Polimorfismo** – Criar uma interface comum para diferentes tipos de comportamento.  
✅ **Encapsulamento** – Cada tipo de rota terá sua própria implementação.  
✅ **Factory Pattern** – Criar um gerenciador de instâncias para facilitar a criação dos objetos.  
✅ **Interação com o Usuário** – Uso do `Scanner` para entrada de dados.  
✅ **Organização de Código** – Divisão em classes bem estruturadas.  

---

## 🔹 Dicas  
- O foco é a **implementação orientada a objetos**, não precisa usar mapas reais.  
- A saída pode ser uma sequência de passos fictícia, apenas para demonstrar a lógica da rota.  
- Comentem o código para explicar suas decisões!  

🚀 **Bom desafio! Mãos ao código!**  
