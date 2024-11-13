package exercicio7;

import java.util.Scanner;

public class FibonacciSequence {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário que insira o número de termos
        System.out.print("Digite o número da sequência de Fibonacci que deseja exibir: ");
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

        scanner.close();
    }
}
