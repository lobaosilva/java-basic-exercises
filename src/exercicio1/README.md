# Exercício: Introdução ao Java com IntelliJ IDEA

Este exercício orienta sobre como configurar um projeto Java básico no IntelliJ IDEA, incluindo a criação de uma classe principal que exibe uma mensagem de boas-vindas no console.

---

## 📋 Enunciado do Exercício

1. Crie um novo projeto Java no IntelliJ.
2. Configure-o para compilar e rodar corretamente.
3. Adicione uma classe principal chamada `AppStart` com um método `main` simples que imprime **"Bem-vindo ao Java!"**.

---

## 💡 Solução do Exercício

Siga os passos detalhados para implementar a solução.

### Passo 1: Criar um Projeto Java no IntelliJ

1. Abra o IntelliJ IDEA.
2. Selecione **New Project**.
3. Escolha **Java** e clique em **Next**.
4. Defina o nome do projeto, como `ExerciciosJava`.
5. Selecione o local onde deseja salvar o projeto e clique em **Finish**.

### Passo 2: Configurar o Projeto para Compilar e Rodar

Certifique-se de que o JDK está configurado corretamente no IntelliJ para compilar e rodar o projeto.

1. Acesse **File** > **Project Structure**.
2. Verifique se a versão do JDK está configurada (preferencialmente 17 ou superior).

### Passo 3: Criar a Classe Principal `AppStart`

1. No painel do projeto, clique com o botão direito na pasta `src` e selecione **New** > **Java Class**.
2. Nomeie a classe como `AppStart`.
3. Adicione o código a seguir na classe `AppStart`:

    ```java
    public class AppStart {
        public static void main(String[] args) {
            System.out.println("Bem-vindo ao Java!");
        }
    }
    ```

### Passo 4: Executar o Projeto

1. Clique com o botão direito na classe `AppStart`.
2. Selecione **Run 'AppStart'**.
3. O console deve exibir a seguinte mensagem:

    ```console
    Bem-vindo ao Java!
    ```

---

## 🔍 Explicação do Código

- **Classe `AppStart`**: A classe principal do projeto, responsável por iniciar a aplicação.
- **Método `main`**: O ponto de entrada do programa, que contém o comando `System.out.println("Bem-vindo ao Java!");` para exibir uma mensagem no console.

---

Este exercício introduz conceitos básicos de configuração de projeto em Java e desenvolvimento de código inicial no IntelliJ IDEA.
