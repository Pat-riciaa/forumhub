# ForumHub

## Descrição

ForumHub é uma aplicação backend desenvolvida com Spring Boot para gerenciar tópicos e cursos em um fórum simples. Utiliza banco de dados H2 em memória para persistência dos dados.

## Tecnologias

- Java 17+
- Spring Boot
- Spring Data JPA
- H2 Database (em memória)
- Maven

## Funcionalidades

- Cadastro e listagem de cursos
- Cadastro e listagem de tópicos relacionados aos cursos
- Validação personalizada para garantir a existência do curso
- API REST simples para interação

## Como rodar

1. Clone o repositório:
   ```bash
   git clone https://github.com/SEU-USER/forumhub.git
   
2. Entre na pasta do projeto:

bash
Copiar
Editar
cd forumhub

3. Rode o projeto com Maven:

bash
Copiar
Editar
./mvnw spring-boot:run

4. Acesse a API (exemplo):

Listar tópicos: GET http://localhost:8080/topicos

Criar tópico: POST http://localhost:8080/topicos (envie JSON com dados)

5. Console H2 (para visualizar o banco):

http://localhost:8080/h2-console

JDBC URL: jdbc:h2:mem:forumhubdb

Usuário: sa

Senha: (deixe vazio)

## Contato

Desenvolvido por:
👤 **Patrícia Vieira**  
 
[![LinkedIn](https://img.shields.io/badge/-LinkedIn-blue?logo=linkedin&logoColor=white&style=flat-square)](https://www.linkedin.com/in/patrícia-vieira-da-silva)  
[![GitHub](https://img.shields.io/badge/-GitHub-black?logo=github&logoColor=white&style=flat-square)](https://github.com/Pat-ricia)

