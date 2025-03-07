# Repositório: JavaFintech

Este repositório contém o código Java da aplicação Fintech, que implementa a lógica de negócios e o backend do sistema.

## Descrição

Este projeto faz parte de uma aplicação Fintech completa, que inclui um frontend desenvolvido em HTML, CSS e Bootstrap (armazenado em um repositório separado) e um backend desenvolvido em Java.

O objetivo deste repositório é fornecer a implementação da lógica de negócios, o modelo de dados e as funcionalidades principais do sistema Fintech.

## Arquitetura

A aplicação Fintech é dividida em duas partes:

*   **Frontend (HTML/CSS/Bootstrap):** Responsável pela interface do usuário e pela interação com o usuário. Este código está armazenado em outro repositório (link abaixo).
*   **Backend (Java):** Responsável pela lógica de negócios, o modelo de dados e o acesso aos dados. Este código é armazenado neste repositório.

A comunicação entre o frontend e o backend pode ser feita através de uma API (Application Programming Interface) que será implementada em um passo futuro.

## Conteúdo

O repositório contém os seguintes arquivos:

*   `src/`:
    *   `com.renisonramos.fintech/`:
        *   `model/`:
            *   `Conta.java`: Classe que representa uma conta bancária.
            *   `Meta.java`: Classe que representa uma meta financeira.
            *   `Transacao.java`: Classe que representa uma transação financeira.
            *   `Usuario.java`: Classe que representa um usuário do sistema.
        *   `Main.java`: Classe principal que demonstra a criação e manipulação de objetos das classes do modelo.

## Como usar

1.  Clone o repositório:

    ```bash
    git clone https://github.com/seu-usuario/JavaFintech.git
    ```

2.  Abra o projeto no IntelliJ IDEA (ou sua IDE preferida).

3.  Compile e execute o arquivo `Main.java`.

4.  Explore o código para entender a implementação da lógica de negócios.


## Tecnologias utilizadas

*   Java
*   IntelliJ IDEA (opcional)

## Repositório do Frontend

O código HTML/CSS/Bootstrap do frontend da aplicação Fintech está armazenado no seguinte repositório:

*   [https://github.com/renisonramos/ProjetoFintech]

## Autor

Renison Borralho Ramos

## Próximos Passos

*   Implementar a lógica de acesso a dados (banco de dados, arquivos, etc.).
*   Criar uma API para permitir a comunicação entre o frontend e o backend.
*   Implementar testes unitários para garantir a qualidade do código.
*   Explorar frameworks como Spring Boot para simplificar o desenvolvimento do backend.
