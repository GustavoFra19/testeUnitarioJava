# Desafio de Testes Unitários - Validador de Usuário

Este projeto foi desenvolvido como parte de um estudo prático sobre **Garantia de Qualidade (QA)** e **Desenvolvimento Java**. O foco principal foi a criação de uma lógica de validação robusta e a implementação de testes unitários automatizados.

## 📌 Funcionalidades
A classe `ValidadorUsuario` valida os seguintes campos:
- **Nome de Usuário:** Deve conter entre 3 e 20 caracteres.
- **E-mail:** Validação via Regex para garantir formatos válidos.
- **Senha:** Mínimo de 8 caracteres, exigindo pelo menos uma letra e um número.

## 🛠️ Tecnologias
- **Java 21**
- **JUnit 5** (Framework de Testes)
- **IntelliJ IDEA**

## ✅ Cobertura de Testes
Foram implementados testes para cenários de sucesso e falha, garantindo que:
- Nomes curtos ou nulos sejam rejeitados.
- E-mails sem `@` ou domínio sejam bloqueados.
- Senhas fracas (sem números ou muito curtas) não sejam aceitas.
- Casos válidos retornem confirmação de sucesso.

## 🚀 Como rodar o projeto
1. Certifique-se de ter o **JDK 21** instalado.
2. Importe o projeto em sua IDE (preferencialmente IntelliJ).
3. Adicione as bibliotecas do JUnit 5 localizadas na pasta `/lib` ao seu classpath.
4. Execute o arquivo `ValidadorUsuarioTest.java` para visualizar os resultados.
