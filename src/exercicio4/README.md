# Exercício: Verificação de Número Par ou Ímpar em Java

Este exercício propõe a criação de um programa em Java que solicita um número inteiro ao usuário e determina se ele é par ou ímpar.

---

## 📌 Enunciado do Exercício
Crie um programa em Java que:

1. Peça ao usuário para inserir um número inteiro.
2. Verifique se o número é par ou ímpar.
3. Exiba uma mensagem indicando se o número é par ou ímpar.

---

## 💡 Solução do Exercício
1. Crie uma nova classe chamada `EvenOddChecker` dentro da pasta `exercicio4`.
2. Implemente o código para que ele:
   - Utilize a classe `Scanner` para ler a entrada do usuário.
   - Verifique se o número é par ou ímpar usando o operador de módulo (`%`).
   - Exiba uma mensagem indicando o resultado.    

Aqui está o código para a classe `EvenOddChecker`:

```java
import java.util.Scanner;

public class EvenOddChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    
        // Solicita ao usuário que insira um número
        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();
    
        // Verifica se o número é par ou ímpar
        if (numero % 2 == 0) {
            System.out.println("O número " + numero + " é par.");
        } else {
            System.out.println("O número " + numero + " é ímpar.");
        }
    
        scanner.close(); // Fecha o Scanner
    }
}
```

---

## 🔍 Explicação do Código
- **Leitura de Dados com `Scanner`:**
    - `Scanner scanner = new Scanner(System.in);`: Inicia o Scanner para ler a entrada do usuário.
    - `scanner.nextInt();`: Lê um número inteiro fornecido pelo usuário.
- **Verificação de Paridade:**
    - `if (numero % 2 == 0)`: Utiliza o operador de módulo (`%`) para verificar se o número é divisível por 2. Se o resto da divisão por 2 for igual a 0, o número é par.
    - Se a condição for verdadeira, o programa exibe que o número é par; caso contrário, exibe que o número é ímpar.
- **Fechamento do `Scanner`:**
    - `scanner.close();`: Fecha o Scanner após o uso para liberar recursos.

---

## 📤 Saída Esperada
**Exemplo de Entrada e Saída:**

1. Para um número par:

    ```plaintext
    Digite um número inteiro: 8
    O número 8 é par.
    ```
2. Para um número ímpar:

    ```plaintext
    Digite um número inteiro: 7
    O número 7 é ímpar.
    ```
   
---

Esse exercício ensina o uso do operador de módulo para verificar condições numéricas e reforça a utilização de estruturas condicionais (`if` e `else`) para controle de fluxo.