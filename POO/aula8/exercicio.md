### **Desafio: Cálculo de Férias para Diferentes Tipos de Funcionários**  

#### **Contexto**  
Uma empresa deseja automatizar o cálculo de férias de seus funcionários. No entanto, existem diferentes tipos de contratos de trabalho, e o cálculo varia conforme a categoria do funcionário. Você deve implementar um sistema que permita calcular corretamente o valor das férias de acordo com as regras estabelecidas para cada tipo de funcionário.  

---

### **Regras de Cálculo de Férias**  
1. **Funcionário CLT** (Contrato formal)  
   - Tem direito a **30 dias de férias** a cada 12 meses trabalhados.  
   - O valor das férias é calculado da seguinte forma:  
     ```
     Valor das férias = Salário mensal + (Salário mensal / 3) - INSS (8%)
     ```  

2. **Funcionário PJ** (Prestador de serviço)  
   - Não tem férias remuneradas, mas pode receber um **bônus** ao tirar um período de descanso.  
   - O cálculo do bônus é:  
     ```
     Valor das férias = Salário mensal * 0.10
     ```  

3. **Estagiário**  
   - Tem direito a **15 dias de férias** a cada 6 meses trabalhados.  
   - O valor das férias é calculado da seguinte forma:  
     ```
     Valor das férias = (Bolsa Auxílio * 15) / 30
     ```  

---

### **Entradas e Saídas Esperadas**  
Seu programa deve receber como entrada os seguintes dados:  
- Tipo de funcionário (`CLT`, `PJ` ou `Estagiario`)  
- Nome do funcionário  
- Salário mensal ou bolsa auxílio  

O programa deve imprimir o nome do funcionário, o tipo de contrato e o valor correto das férias ou bônus de férias, **mantendo o formato padronizado**.  

##### **Exemplos de Entrada e Saída**  

**Entrada 1:** (Funcionário CLT)  
```  
Tipo: CLT  
Nome: João  
Salário: 3000.00  
```  
**Saída Esperada:**  
```  
Funcionário: João  
Tipo: CLT  
Valor das férias: R$ 3.660,00  
```

---

**Entrada 2:** (Funcionário PJ)  
```  
Tipo: PJ  
Nome: Ana  
Salário: 5000.00  
```  
**Saída Esperada:**  
```  
Funcionário: Ana  
Tipo: PJ  
Valor das férias: R$ 500,00  
```

---

**Entrada 3:** (Estagiário)  
```  
Tipo: Estagiario  
Nome: Lucas  
Bolsa Auxílio: 1200.00  
```  
**Saída Esperada:**  
```  
Funcionário: Lucas  
Tipo: Estagiário  
Valor das férias: R$ 600,00  
```

---

### **Objetivo do Desafio**  
- Criar um **programa** que receba os dados de entrada e exiba a saída correta conforme os exemplos.  

✅ **Lembre-se de seguir o formato exato de saída para facilitar a validação dos testes!** 🚀