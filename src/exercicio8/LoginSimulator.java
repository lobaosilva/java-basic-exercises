package exercicio8;

import java.util.Scanner;

public class LoginSimulator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Definindo nome de usuário e senha corretos
        final String usuarioCorreto = "admin";
        final String senhaCorreta = "1234";

        int tentativas = 0;
        boolean loginBemSucedido = false;

        // Permite até 3 tentativas de login
        while (tentativas < 3 && !loginBemSucedido) {
            System.out.print("Digite o nome de usuário: ");
            String usuario = scanner.nextLine();

            System.out.print("Digite a senha: ");
            String senha = scanner.nextLine();

            // Verifica as credenciais
            if (usuario.equals(usuarioCorreto) && senha.equals(senhaCorreta)) {
                System.out.println("Login bem-sucedido.");
                loginBemSucedido = true;
            } else {
                tentativas++;
                if (tentativas < 3) {
                    System.out.println("Credenciais incorretas. Tente novamente.");
                }
            }
        }

        // Verifica se o número máximo de tentativas foi excedido
        if (!loginBemSucedido) {
            System.out.println("Conta bloqueada. Número máximo de tentativas excedido.");
        }

        scanner.close(); // Fecha o Scanner
    }
}
