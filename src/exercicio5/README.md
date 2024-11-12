# 📝 Exercício: Calculadora de Média de Notas em Java

Este exercício envolve a criação de um programa que solicita três notas ao usuário, calcula a média e indica se o aluno foi aprovado, está em recuperação ou foi reprovado.

---

## 📌 Enunciado do Exercício

Crie um programa em Java que:

1. Peça ao usuário que insira três notas (valores de 0 a 10).
2. Calcule a média das notas.
3. Exibe a média e uma mensagem indicando se o aluno foi aprovado, está de recuperação ou foi reprovado.
   - Considerando que:
     - Média igual ou superior a 7: Aprovado.
     - Média entre 5 e 6.9: Recuperação.
     - Média inferior a 5: Reprovado.

---

## 💡 Solução do Exercício

1. Crie uma classe chamada `GradeAverage` dentro da pasta `eercicios5`.
2. Implemente o código para que ele:
   - Utilize a classe `Scanner` para ler as notas fornecidas pelo usuário.
   - Calcule a média das notas.
   - Verifique o status de aprovação do aluno com base na média e exiba a mensagem correspondente.

Aqui está o código para a classe `GradeAvarage`:
```java
import java.util.Scanner;

public class GradeAverage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Solicita as três notas ao usuário
        System.out.print("Digite a primeira nota (0 a 10): ");
        double nota1 = scanner.nextDouble();
    
        System.out.print("Digite a segunda nota (0 a 10): ");
        double nota2 = scanner.nextDouble();

        System.out.print("Digite a terceira nota (0 a 10): ");
        double nota3 = scanner.nextDouble();

        // Calcula a média das notas
        double media = (nota1 + nota2 + nota3) / 3;

        // Exibe a média
        System.out.printf("Média : %.2f%n", media);

        // Verifica o status do aluno com base na média
        if (media >= 7) {
            System.out.println("Status: Aprovado");
        } else if (media >= 5 && media < 7) {
            System.out.println("Status: Recuperação");
        } else {
            System.out.println("Status: Reprovado");
        }

        scanner.close(); // Fecha o Scanner
    }
}
```

---

## 🔍 Explicação do Código

- **Leitura de Dados com `Scanner`:**
  - `scanner.nextDouble();`: Lê as notas fornecidas pelo usuário como números de ponto flutuante (`double`), garantindo precisão para notas com casas decimais.
- **Cálculo da Média:**
  - `(nota1 + nota2 + nota3) / 3;`: Calcula a média das três notas.
- **Formatação da Média:**
  - `System.out.printf("Média: %.2f%n", media);`: Exibe a média com duas casa decimais para melhor formatação.
- **Estrutura Condicional para Verificação do Status:**
  - `if (media >= 7)`: Verifica se a média é 7 ou superior para indicar aprovação.
  - `else if (media >= 5 && media <7)`: Verifica se a média está entre 5 e 6.9 para indicar recuperação.
  - `else`: Para médias inferiores a 5, o aluno é considerado reprovado.
- **Fechamento do `Scanner`:**
  - `scanner.close();`: Fecha o `Scanner` após o uso para liberar recursos.

---

## 📤 Saída Esperada

**Exemplo de Entrada e Saída:**

```plaintext
Digite a primeira nota (0 a 10): 6.5
Digite a segunda nota (0 a 10): 7.2
Digite a terceira nota (0 a 10): 5.8
Média: 6.50
Status: Recuperação
```

---

Esse exercídio cobre a aplicação de cálculos aritméticos básicos, uso de condições aninhadas (`if`, `else if`, `else`) e o uso do `Scanner` para entradas de dados. É uma ótima prática para desenvolver lógica condicional e formatação de saída em Java.