## Enunciado do Exercício
1. Crie um novo projeto Java no IntelliJ.
2. Configure-o para compilar e rodar corretamente.
3. Adicione uma classe principal chamada `AppStart` com um método `main` simples que imprime "Bem-vindo ao Java!".

---

## Solução do Exercício
Siga os passos abaixo para implementar a solução:

**Passo 1: Criar um Projeto Java no IntelliJ**
1. Abra o IntelliJ IDEA.
2. Selecione **New Project**.
3. Escolha **Java** e clique em **Next**.
4. Defina o nome do projeto, por exemplo, `ExerciciosJava`.
5. Selecione o local onde deseja salvar o projeto e clique em Finish.

**Passo 2: Configurar o Projeto para Compilar e Rodar**
No IntelliJ, o projeto deve ser configurado automaticamente para compilar e rodar. Verifique se o JDK está configurado corretamente:

1. Vá em **File** > **Project Structure**.
2. Verifique se a versão do JDK está configurada, preferencialmente 17 ou superior.

**Passo 3: Criar a Classe Principal `AppStart`**
1. No painel de projeto, clique com o botão direito no diretório `src` e selecione **New** > **Java Class**.
2. Nomeie a classe como `AppStart`.
3. Adicione o código abaixo na classe AppStart:
    ```java
    public class AppStart {
        public static void main(String[] args) {
            System.out.println("Bem-vindo ao Java!");
        }
    }
    ```

**Passo 4: Executar o Projeto**
1. Clique com o botão direito na classe `AppStart`.
2. Selecione **Run 'AppStart'**.
3. O console deve exibir:
    ```console
    Bem-vindo ao Java!
    ```

---

## Explicação do Código
- **Classe** `AppStart`: Esta é a classe principal que contém o ponto de entrada do programa.
- **Método** `main`: O método `main` é o ponto de partida de execução do programa em Java. Ele contém a instrução `System.out.println("Bem-vindo ao Java!");`, que imprime a mensagem "Bem-vindo ao Java!" no console.

Esse exercício cobre os passos iniciais de configuração de um projeto Java e a criação de uma estrutura básica de código.