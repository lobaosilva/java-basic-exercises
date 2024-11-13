# 🔢 Exercício: Sequência de Fibonacci em Java

Neste exercício, o objetivo é criar um programa em Java que exiba os primeiros `n` números da sequência de Fibonacci, a partir de um número fornecido pelo usuário. A sequência de Fibonacci é uma série numérica onde cada número é a soma dos dois anteriores, com os dois primeiros números sendo 0 e 1.

---

## 📝 Enunciado do Exercício

Crie um programa em Java que:

1. Peça ao usuário que insira um número inteiro `n`.
2. Exiba os primeiro `n` números da sequência de Fibonacci.

A sequência de Fibonacci é definida da seguinte forma:

- Os dois primeiros números são 0 e 1.
- Cada número subsequente é a soma dos dois números anteriores.

**Exemplo:** 0, 1, 1, 2, 3, 5, 8, 13, 21, ...

---

## 💡 Solução do Exercício

1. Crie uma nova classe chamada `FibonacciSequence` dentro da pasta `exercicio7`.
2. Implemente o código para que ele:
    - Utilize a classe `Scanner` para ler o número de termos da sequência desejada pelo usuário.
    - Use um loop para calcular e exibir a sequência de Fibonacci até o enésimo termo.

Aqui está o código para a classe `FibonacciSequence`:

```java
import java.util.Scanner;

public class FibonacciSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário que insira o número de termos
        System.out.print("Digite o número de termos da sequência de Fibonacci que deseja exibir: ");
        int n = scanner.nextInt();

        int primeiro = 0, segundo = 1; // Inicializa os dois primeiros números da sequência

        System.out.print("Sequência de Fibonacci: ");

        // Exibe a sequência de Fibonacci até o enésimo termo
        for (int i = 0; i < n; i++) {
            System.out.print(primeiro + " ");

            // Calcula o próximo termo da sequência
            int proximo = primeiro + segundo;
            primeiro = segundo;
            segundo = proximo;
        }

        scanner.close(); // Fecha o Scanner
    }
}
```

---

## 🔍 Explicação do Código

- **Leitura de Dados com `Scanner`:**
  - `scanner.nextInt();`: Lê o número de termos desejado fornecido pelo usuário e o armazena na variável `n`.
- **Variáveis para a Sequência:**
  - `int primeiro = 0, segundo = 1;`: Define os dois primeiros números da sequência de Fibonacci.
- **Loop `for` para Gerar a Sequência:**
  - `for (int i = 0; i < n; i++)`: Itera `n` vezes para calcular e exibir os termos da sequência de Fibonacci.
  - `System.out.print(primeiro + " ");`: Exibe o valor atual de `primeiro`, que é o termo da sequência.
  - `int proximo = primeiro + segundo;`: Calcula o próximo termo da sequência somando `primeiro` e `segundo`.
  - Atualiza `primeiro` e `segundo` para os próximos termos, mantendo a progressão da sequência.
- **Fechamento do `Scanner`:**
  - `scanner.close();`: Fecha o `Scanner` após o uso para liberar recursos.

---

## ✅ Saída Esperada

**Exemplo de Entrada e Saída:**

```plaintext
Digite o número de termos da sequência de Fibonacci que deseja exibir: 8
Sequência de Fibonacci: 0 1 1 2 3 5 8 13
```

---

Esse exercício ajuda a desenvolver lógica de loops e manipulação de variáveis para gerar uma sequência numérica. A sequência de Fibonacci é um clássico exemplo para aprender o uso de variáveis temporárias e a lógica de progressão em Java.