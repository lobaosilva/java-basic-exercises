# Exercício: Calculadora Simples em Java

Este exercício propõe a criação de uma calculadora simples em Java, que permite ao usuário realizar operações matemáticas básicas (adição, subtração, multiplicação e divisão).

---

## 📌 Enunciado do Exercício
Crie um programa em Java que funcione como uma calculadora simples. O programa deve:

1. Pedir ao usuário que insira dois números.
2. Pedir ao usuário que escolha uma operação (adição, subtração, multiplicação ou divisão).
3. Realizar a operação escolhida e exibir o resultado.

---

## 💡 Solução do Exercício
1. Crie uma nova classe chamada `BasicCalculator` dentro da pasta `exercicio3`.
2. Implemente o código para que ele:
   - Utilize a classe `Scanner` para ler a entrada do usuário.
   - Receba os números e a operação a ser realizada.
   - Realize a operação escolhida e exiba o resultado.  

Aqui está o código para a classe `BasicCalculator`:
   ```java
   import java.util.Scanner;
   
   public class BasicCalculator {
       public static void main(String[] args) {
           Scanner scanner = new Scanner(System.in);
   
           // Leitura dos números
           System.out.print("Digite o primeiro número: ");
           double numero1 = scanner.nextDouble();
           
           System.out.print("Digite o segundo número: ");
           double numero2 = scanner.nextDouble();
           
           // Seleção da operação
           System.out.print("Escolha uma operação (+, -, *, /): ");
           char operacao = scanner.next().charAt(0);
           
           // Variável para armazenar o resultado
           double resultado;
           
           // Estrutura condicional para realizar a operação
           switch (operacao) {
               case '+': 
                   resultado = numero1 + numero2;
                   System.out.println("Resultado: " + resultado);
                   break;
               case '-':
                   resultado = numero1 - numero2;
                   System.out.println("Resultado: " + resultado);
                   break;
               case '*':
                   resultado = numero1 * numero2;
                   System.out.println("Resultado: " + resultado);
                   break;
               case '/':
                   // Verifica se o divisor é diferente de zero
                   if (numero2 != 0) {
                      resultado = numero1 / numero2;
                      System.out.println("Resultado: " + resultado);
                   } else {
                      System.out.println("Erro: Divisão por zero não é permitida.");
                   }
                   break;
               default:
                   System.out.println("Operação inválida.");
                   break;
           }
       
           scanner.close(); // Fecha o Scanner
       }
   }
   ```

## 🔍 Explicação do Código
- **Leitura de Dados com `Scanner`**:
  - `Scanner scanner = new Scanner(System.in);`: Inicia o `Scanner` para ler a entrada do usuário.
  - `scanner.nextDouble();`: Lê números de ponto flutuante (tipo `double`) fornecidos pelo usuário.
  - `scanner.next().charAt(0);`: Lê o operador como um caractere (por exemplo, `+`, `-`, `*`, ou `/`).
- **Estrutura Condicional `switch`**:
  - Avalia a operação escolhida pelo usuário e executa o caso correspondente.
  - Se o usuário escolher `+`, `-`, `*`, ou `/`, o programa realiza a operação e imprime o resultado.
  - Verifica se o divisor (`numero2`) é diferente de zero para evitar divisão por zero.
- **Fechamento do `Scanner`**:
  - `scanner.close();`: Fecha o Scanner após o uso para liberar recursos.

---

## 📤 Saída Esperada
**Exemplo de Entrada e Saída:**
   ```plaintext
   Digite o primeiro número: 10
   Digite o segundo número: 5
   Escolha uma operação (+, -, *, /): *
   Resultado: 50.0
   ```

**Divisão por Zero:**
   ```plaintext
   Digite o primeiro número: 10
   Digite o segundo número: 0
   Escolha uma operação (+, -, *, /): /
   Erro: Divisão por zero não é permitida.
   ```

---

Esse exercício introduz o uso do `Scanner` para entrada do usuário e ensina a utilizar o `switch` para controle de fluxo. Ele também aborda como prevenir erros comuns, como a divisão por zero.
