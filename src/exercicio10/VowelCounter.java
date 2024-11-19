package exercicio10;

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
