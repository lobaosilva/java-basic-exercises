# 📝 Contador de Vogais em Java

Um programa simples em Java que analisa uma frase fornecida pelo usuário e conta o número total de vogais presentes. Ideal para praticar manipulação de strings e lógica de programação! 🚀

---

## 📌 Enunciado do Exercício

Implemente um programa em Java que:

1. Solicite ao usuário que insira uma frase.
2. Conte o número de vogais (`a`, `e`, `i`, `o`, `u`) na frase, ignorando se estão em maiúsculas ou minúsculas.
3. Exiba o total de vogais encontradas na frase.

---

## 💻 Solução do Exercício

1. Crie uma nova classe chamada `VowelCounter` dentro da pasta `exercicio10`.
2. Implemente as funcionalidades principais:
   - Use a classe `Scanner` para capturar a entrada do usuário.
   - Converta a frase para letras minúsculas para facilitar a verificação.
   - Utilize um loop para iterar sobre cada caractere e identificar as vogais.

### Código da Classe `VowelCounter`

```java
import java.util.Scanner;

public class VowelCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário uma frase
        System.out.print("Digite uma frase: ");
        String frase = scanner.nextLine();

        // Converte a frase para minúsculas para simplificar a comparação
        frase = frase.toLowerCase();

        int contadorVogais = 0;

        // Conta as vogais na frase
        for (int i = 0; i < frase.length(); i++) {
            char letra = frase.charAt(i);
            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
                contadorVogais++;
            }
        }

        // Exibe o número total de vogais
        System.out.println("A frase contém " + contadorVogais + " vogal(is).");

        scanner.close(); // Fecha o Scanner
    }
}
```

---

## 🛠️ Explicação do Código

1. **Leitura da Entrada do Usuário**:
    - `scanner.nextLine();`: Captura a frase inserida pelo usuário.

2. **Normalização do Texto**:
    - `frase.toLowerCase();`: Converte toda a frase para letras minúsculas, facilitando a comparação com as vogais.

3. **Iteração sobre os Caracteres**:
    - `frase.length();`: Obtém o tamanho total da frase.
    - `frase.charAt(i);`: Acessa o caractere na posição `i`.

4. **Identificação de Vogais**:
    - O `if` verifica se o caractere atual é uma das vogais (`a`, `e`, `i`, `o`, `u`).
    - O contador de vogais (`contadorVogais`) é incrementado sempre que uma vogal é encontrada.

5. **Exibição do Resultado**:
    - Imprime a quantidade total de vogais na frase.

6. **Fechamento do Scanner**:
    - `scanner.close();`: Libera os recursos alocados pelo `Scanner`.

---

## 🔍 Exemplo de Entrada e Saída

### Entrada:

```plaintext
Digite uma frase: Olá, mundo! Deus é maravilhoso.
```

### Saída:

```plaintext
A frase contém 12 vogal(is).
```

---

## 🌟 Destaques do Exercício

1. **Manipulação de Strings**:
    - Conversão para letras minúsculas e iteração sobre cada caractere.

2. **Uso de Condicionais e Loops**:
    - Aplicação de condições para verificar vogais e de loops para processar a frase.

3. **Contagem de Ocorrências**:
    - Exemplo prático de como usar variáveis contadoras.

Este exercício é uma ótima oportunidade para explorar conceitos básicos de programação em Java e aprender a trabalhar com textos e estruturas de controle. 💡