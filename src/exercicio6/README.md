# 📘 Exercício: Gerador de Tabuada em Java

Este exercício propõe a criação de um programa que exibe a tabuada de um número inserido pelo usuário, utilizando Java. É uma excelente prática para consolidar conceitos de loops e operações aritméticas.

---

## 📝 Enunciado do Exercício

Crie um programa em Java que:
1. Peça ao usuário que insira um número inteiro.
2. Exiba a tabuada desse número de 1 a 10.

---

## 💡 Solução do Exercício
1. Crie uma nova classe chamada `MultiplicationTable` dentro da pasta `exercicios6`.
2. Implemente o código para que ele:
   - Utilize a classe `Scanner` para ler o número fornecido pelo usuário.
   - Use o loop `for` para gerar e exibir a tabuada de 1 a 10 para o número inserido.

Aqui está o código para a classe `MultiplicationTable`:

```java
import java.util.Scanner;

public class MultiplicationTable {
    public static void maind(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário que insira um número
        System.out.print("Digite um número inteiro para ver sua tabuada: );
        int numero = scanner.nextInt();

        // Gera e exibe a tabuada de 1 a 10
        System.out.println("Tabuada do " + numero + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }

        scanner.close(); // Fecha o Scanner
    }
}
```

---

## 🔍 Explicação do Código

- **Leitura de Dados com `Scanner`:**
  - `scanner.nextInt();`: Lê um número inteiro fornecido pelo usuário e o armazena na variável `numero`.
- **Loop `for` para Gerar a Tabuada:**
  - `for (int i = 1; i <= 10; i++)`: Itera de `i = 1` até `i = 10` para calcular a tabuada.
  - `numero * i`: Calcula o produto do número inserido pelo usuário com o valor atual de `i`.
  - `System.out.println(...)`: Exibe o resultado da multiplicação formatado no estilo de tabuada (por exemplo, `5 x 3 = 15`).
- **Fechamento do `Scanner`:**
  - `scanner.close();`: Fecha o `Scanner` após o uso para liberar recursos.

---

## ✅ Saída Esperada

**Exemplo de Entrada e Saída:**
```plaintext
Digite um número inteiro para ver sua tabuada: 5
Tabuada do 5:
5 x 1 = 5
5 x 2 = 10
5 x 3 = 15
5 x 4 = 20
5 x 5 = 25
5 x 6 = 30
5 x 7 = 35
5 x 8 = 40
5 x 9 = 45
5 x 10 = 50
```

---

Esse exercício é uma ótima prática para entender loops e operações aritméticas em Java. Ele ajuda a desenvolver uma compreensão básica de como usar laços para executar operações repetidas vezes.
