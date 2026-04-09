Rest API Automation

Projeto de automação de testes de API utilizando Java + RestAssured + JUnit 5 + Allure Report.

Este projeto foi criado para validar endpoints REST utilizando boas práticas de automação e estrutura profissional de QA.

🛠️ Tecnologias Utilizadas
Java 17
Maven
RestAssured
JUnit 5
Allure Report
VS Code
📁 Estrutura do Projeto
rest-api-automation
 ├── src
 │   └── test
 │       └── java
 │           └── ApiValidationTests.java
 ├── pom.xml
 └── README.md
▶️ Como Executar o Projeto
1. Clonar o projeto
git clone https://github.com/Edson-Lira-Povoa/AgibankApi
2. Acessar a pasta
cd rest-api-automation
3. Executar os testes
mvn test
📊 Gerar Relatório Allure
Executar testes
mvn clean test
Gerar relatório
mvn allure:report
Abrir relatório
mvn allure:serve
🔎 Testes Implementados
✅ Validar listagem de usuários
✅ Validar busca por usuário específico
✅ Validar usuário inexistente
✅ Validar criação de usuário
🌐 API Utilizada

JSONPlaceholder

https://jsonplaceholder.typicode.com

Endpoints utilizados:

GET /users
GET /users/{id}
POST /users
🎯 Objetivo do Projeto

Demonstrar:

Automação de APIs REST
Uso do RestAssured
Estrutura profissional de QA
Integração com Allure Reports
Boas práticas de testes automatizados
👨‍💻 Autor

Edson Lira
QA Automation Engineer
