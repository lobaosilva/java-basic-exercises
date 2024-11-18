package exercicio9;

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
                System.out.println("🎯 Total de tentativas: " + tentativa);
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
