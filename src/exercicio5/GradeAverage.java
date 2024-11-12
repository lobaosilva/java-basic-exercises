package exercicio5;

import java.util.Scanner;

public class GradeAverage {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Solicitar as três notas ao usuário
        System.out.print("Digite a primeira nota (0 a 10): ");
        double nota1 = scanner.nextDouble();

        System.out.print("Digite a segunda nota (0 a 10): ");
        double nota2 = scanner.nextDouble();

        System.out.print("Digite a terceira nota (0 a 10): ");
        double nota3 = scanner.nextDouble();

        // Calcula a média das notas
        double media = (nota1 + nota2 + nota3) / 3;

        // Exibe a média
        System.out.printf("Média: %.2f%n", media);

        // Verifica o status do aluno com base na média
        if (media >= 7) {
            System.out.println("Status: Aprovado");
        } else if (media >= 5 && media < 7) {
            System.out.println("Status: Recuperação");
        } else {
            System.out.println("Status: Reprovado");
        }

        scanner.close();
    }
}
