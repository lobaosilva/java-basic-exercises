# 🎲 Jogo de Adivinhação em Java

Um jogo simples e divertido em Java onde o objetivo é adivinhar um número secreto gerado aleatoriamente. Desafie-se a acertar com o menor número de tentativas possível! 🚀

---

## 📝 Enunciado do Exercício

Crie um programa em Java que implemente um jogo de adivinhação:

1. O programa deve gerar um número aleatório entre 1 e 100.
2. Permita que o usuário tente adivinhar o número.
3. Para cada tentativa, o programa deve:
   - Informar se o número inserido é maior, menor ou igual ao número gerado.
4. O jogo termina quando o usuário acerta o número.
5. Exiba o número de tentativas realizadas ao final.

---

## 💻 Solução do Exercício

1. Crie uma nova classe chamada `GuessingGame` dentro da pasta `exercicio9`.
2. Implemente o código para:
   - Gerar um número aleatório usando a classe `Random`.
   - Utilizar um loop para permitir que o usuário faça várias tentativas.
   - Informar ao usuário se a tentativa está acima, abaixo ou igual ao número gerado.
   - Contar o número de tentativas realizadas.

Aqui está o código para a classe `GuessingGame`:

```java
import java.util.Scanner;
import java.util.Random;

public class GuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Gera um número aleatório entre 1 e 100
        int numeroSecreto = random.nextInt(100) + 1;
        int tentativa = 0;
        int numeroUsuario;
        boolean acertou = false;

        System.out.println("🎉 Bem-vindo ao Jogo de Adivinhação!");
        System.out.println("🔢 Tente adivinhar o número secreto entre 1 e 100.");

        // Loop para permitir tentativas até acertar
        while (!acertou) {
            System.out.print("Digite sua tentativa: ");
            numeroUsuario = scanner.nextInt();
            tentativa++;

            if (numeroUsuario == numeroSecreto) {
                System.out.println("✅ Parabéns! Você acertou o número secreto: " + numeroSecreto);
                System.out.println("🎯 Você precisou de " + tentativa + " tentativa(s).");
                acertou = true;
            } else if (numeroUsuario < numeroSecreto) {
                System.out.println("📈 O número secreto é maior!");
            } else {
                System.out.println("📉 O número secreto é menor!");
            }
        }

        scanner.close(); // Fecha o Scanner
    }
}
```

---

## 🔍 Explicação do Código

- **Geração do Número Aleatório:**
    - `Random random = new Random();`: Instancia a classe Random para gerar números aleatórios.
    - `random.nextInt(100) + 1;`: Gera um número aleatório entre 1 e 100 (inclusive).
- **Leitura do Input do Usuário:**
    - `scanner.nextInt();`: Lê a tentativa do usuário.
- **Variáveis de Controle:**
    - `tentativa`: Conta o número de tentativas realizadas.
    - `acertou`: Define se o usuário acertou ou não o número secreto.
- **Loop `while`:**
    - Continua executando enquanto `acertou` for `false`.
    - Verifica:
        - Se o número do usuário é igual ao número secreto, exibe a mensagem de sucesso e encerra o loop.
        - Se o número é menor ou maior, orienta o usuário para tentar novamente.
- **Fechamento do `Scanner`:**
    - `scanner.close();`: Fecha o `Scanner` após o uso para liberar recursos.

---

## 🕹️ Saída Esperada
**Exemplo de Entrada e Saída:***

```plaintext
🎉 Bem-vindo ao Jogo de Adivinhação!
🔢 Tente adivinhar o número secreto entre 1 e 100.
Digite sua tentativa: 50
📈 O número secreto é maior!
Digite sua tentativa: 75
📉 O número secreto é menor!
Digite sua tentativa: 60
📈 O número secreto é maior!
Digite sua tentativa: 65
✅ Parabéns! Você acertou o número secreto: 65
🎯 Você precisou de 4 tentativa(s).
```

---

## 🌟 Considerações
Este exercício é excelente para praticar:

1. **Manipulação de loops:** O loop `while` controla o jogo até o usuário acertar.
2. **Condicionais:** A comparação das tentativas com o número secreto orienta o fluxo do jogo.
3. **Uso de bibliotecas padrão:** O uso de `Random` para gerar números aleatórios é uma prática comum em jogos simples.

Ele também demonstra como fornecer feedback ao usuário e criar interatividade em um programa Java.