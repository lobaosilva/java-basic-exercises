## Enunciado do Exercício
Crie um programa em Java que:

1. Declare variáveis de diferentes tipos de dados, incluindo:
    - `int`
    - `double`
    - `char`
    - `boolean`
    - `String`
2. Atribua valores a essas variáveis.
3. Imprima os valores das variáveis no console.

---

## Solução do Exercício
1. Crie uma nova classe chamada `DataTypes` dentro da pasta `exercicio2` (ou nome similar).
2. No arquivo `DataTypes.java`, declare as variáveis com os tipos de dados mencionados e imprima os valores atribuídos.  

O código para a classe `DataTypes` deve ficar assim:

```java
public class DataTypes {
    public static void main(String[] args) {
        // Declaração de variáveis e atribuição de valores
        int idade = 25;
        double altura = 1.75;
        char inicialDoNome = 'L';
        boolean estudante = true;
        String nomeCompleto = "Lobão Silva";
        
        // Impressão dos valores das variáveis
        System.out.println("Idade: " + idade);
        System.out.println("Altura: " + altura);
        System.out.println("Inicial do Nome: " + inicialDoNome);
        System.out.println("É estudante? " + estudante);
        System.out.println("Nome Completo: " + nomeCompleto);
    }
}
```

---

## Explicação do Código
- **Variáveis e Tipos de Dados:**
    - `int idade = 25;`: Declara uma variável do tipo `int` (inteiro) para armazenar uma idade.
    - `double altura = 1.75;`: Declara uma variável `double` para armazenar uma altura em metros.
    - `char inicialDoNome = 'L';`: Declara uma variável `char` para armazenar o primeiro caractere de um nome.
    - `boolean estudante = true;`: Declara uma variável `boolean` para indicar se a pessoa é estudante (`true` ou `false`).
    - `String nomeCompleto = "Lobão Silva";`: Declara uma `String` para armazenar o nome completo.
- **Impressão dos Valores:**  
  `System.out.println(...)`: Exibe o valor de cada variável no console.

---

## Saída Esperada
Ao executar o programa, a saída será:

```console
Idade: 25
Altura: 1.75
Inicial do Nome: L
É estudante? true
Nome Completo: Lobão Silva
```

---

Esse exercício introduz os conceitos básicos de declaração e uso de variáveis em Java e ajuda a entender como diferentes tipos de dados são armazenados e exibidos.