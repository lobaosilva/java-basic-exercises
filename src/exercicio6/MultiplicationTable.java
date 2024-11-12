package exercicio6;

import java.util.Scanner;

public class MultiplicationTable {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário que insira um número
        System.out.print("Digite um número inteiro para ver sua tabuada: ");
        int numero = scanner.nextInt();

        // Gera e exibe a tabuada de 1 a 10
        System.out.println("Tabuada do " + numero + ":");
        for (int i = 1; i <= 10 ; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }

        scanner.close();
    }
}
