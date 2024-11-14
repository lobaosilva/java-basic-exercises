# 🔐 Exercício: Simulador de Login em Java

Neste exercício, vamos criar um programa em Java que simula um sistema de login com tentativas limitadas. O usuário terá até três tentativas para inserir as credenciais corretas, com mensagens adequadas para cada tentativa.

---

## 📝 Enunciado do Exercício

Crie um programa em Java que:

1. Defina um nome de usuário e uma senha pré-definidos no código.
2. Solicite ao usuário que insira um nome de usuário e uma senha.
3. Verifique se o nome de usuário e a senha inseridos correspondem aos valores pré-definidos.
4. Permmita que o usuário tenha até 3 tentativas para acertar as credenciais.
5. Exiba uma mensagem apropriada para cada tentativa:
   - "Login bem-sucedido" se o nome de usuário e a senha estiverem corretos.
   - "Credenciais incorretas. Tente novamente." para cada tentativa errada.
   - "Conta bloqueada" se o número máximo de tentativas for excedido.

---

## 💻 Solução do Exercício

1. Cria uma nova classe chamada `LoginSimulator` dentro da pasta `exercicio8`.
2. Implemente o código para que ele:
   - Defina o nome do usuário e senha corretos como constantes.
   - Utilize a classe `Scanner` para ler o nome de usuário e senha inseridos pelo usuário.
   - Controle o número de tentativas usando um loop `while` e uma variável contadora.

Aqui está o código para a classe `LoginSimulator`:

```java
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
            System.out.print("Digite um nome de usuário: ");
            String usuario = scanner.nextLine();

            System.out.prin("Digite a senha: ");
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
```

---

## 🔍 Explicação do Código

- **Definição das Credenciais:**
  - `final String usuarioCorreto = "admin";` e `final String senhaCorreta = "1234";`: Define o nome de usuário e senha corretos que serão usaados para validaar o login.
- **Controle de Tentativas:**
  - `int tentativas = 0;`: Inicializa o contador de tentativas com zero.
  - `boolean loginBemSucedido = false;`: Define uma variável para verificar se o login foi bem-sucedido.
- **Loop `while` para Permitir Tentativas:**
  - `while (tentativas <3 && !loginBemSucedido)`: Permite que o usuário tente o login até três vezes, a menos que o login seja bem-sucedido antes disso.
  - `tentativas++`: Incrementa o contador de tentativas em cada falha.
- **Verificação de Credenciais:**
  - `usuario.equals(usuarioCorreto) && senha.equals(senhaCorreta)`: Verifica se o nome de usuário e a senha inseridos correspondem aos valores corretos.
  - `loginBemSucedido = true;`: Altera a variável `loginBemSucedido` para `true` caso o login seja bem-sucedido, encerrando o loop.
- **Exibição de Mensagens:**
  - `"Login bem-sucedido."`: Exibe essa mensagem quando o login for bem-sucedido.
  - `"Credenciais incorretas. Tente novamente."`: Exibe essa mensagem para cada tentativa errada, até o limite de três tentativas.
  - `"Conta bloqueada. Número máximo de tentativas excedido."`: Exibe essa mensagem se o número de tentativas é excedido e o login não foi bem-sucedido.
- **Fechamento do `Scanner`:**
  - `scanner.close();`: Fecha o `Scanner` após o uso para liberar recursos.

---

## ✅ Saída Esperada

**Exemplo de Entrada e Saída:**

1. Para um login bem-sucedido na primeira tentativa:

   ```plaintext
    Digite o nome de usuário: admin
    Digite a senha: 1234
    Login bem-sucedido.
   ```
   
2. Para três tentativas incorretas:

   ```plaintext
    Digite o nome de usuário: user
    Digite a senha: 4321
    Credenciais incorretas. Tente novamente.
    
    Digite o nome de usuário: admin
    Digite a senha: 0000
    Credenciais incorretas. Tente novamente.
    
    Digite o nome de usuário: user
    Digite a senha: 1234
    Conta bloqueada. Número máximo de tentativas excedido.
   ```
   
---

Esse exercício é uma prática importante para aprender a usar loops, condições e variáveis de controle em Java. Ele simula um cenário de login básico e destaca o uso de estrutura condicional e repetição com controle de fluxo.