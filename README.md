<img src="http://img.shields.io/static/v1?label=STATUS&message=CONCLUIDO&color=GREEN&style=for-the-badge"/>

# Avaliação: Desenvolvimento de API REST para um sistema de currículos de uma empresa de TI

Este projeto tem como objetivo desenvolver uma API RESTful utilizando Spring e Java para gerenciar o cadastro e manipulação de currículos de candidatos a vagas de uma empresa de tecnologia. A API permite o gerenciamento completo dos dados dos candidatos, incluindo informações pessoais, escolaridade, vagas desejadas e o status dos currículos durante os processos seletivos.

Objetivo
Desenvolver uma API para um sistema de currículos que possibilite:

Cadastro, consulta, atualização e exclusão de currículos de candidatos.
Filtragem de currículos por escolaridade ou vaga desejada.
Controle do status de cada currículo no processo de seleção.

---

## Requisitos do Projeto

## 1. Modelagem de Dados:

- Criar modelos de entidade para **Candidato**, e enums para **Vaga**, **Escolaridade** e **Status do Currículo**.
  
  Entidades principais:
  - **Candidato**: nome, data de nascimento, CPF, escolaridade, vaga desejada, status do currículo.

  Tipos de dados para:
  - **Escolaridade**: `MEDIO`, `FUNDAMENTAL`, `GRADUACAO`, `POS_GRADUACAO`, `ESPECIALIZACAO`.
  - **Vaga Desejada**: `ANALISTA`, `QA`, `DEV`, `TECH_LEAD`, `SUPORTE`, `UX`.
  - **Status do Currículo**: `EM_ANALISE`, `REPROVADO`, `APROVADO`.

- Utilizar **JPA** para mapear as entidades e suas relações com o banco de dados.

---

## 2. DTOs (Data Transfer Objects):

- Criar **DTOs** para representar os objetos que serão enviados e recebidos pela API, garantindo a separação entre as camadas de apresentação e de negócios, além de evitar o vazamento de informações sensíveis.

---

## 3. Repositories

- Implementar interfaces **Repository** para cada entidade, permitindo operações CRUD básicas.
- **Diferencial**: utilizar queries derivadas para realizar consultas filtradas por **vaga desejada** ou **escolaridade** do candidato.

---

### 4. Services:
- Implementar classes de **Serviço** para gerenciar a lógica de negócios do sistema.
- Métodos de serviço para adicionar currículos, atualizar status, e mais.

---

### 5. Controllers:
- Criar **Controllers** REST para gerenciar as requisições HTTP e invocar os serviços apropriados.
- Utilizar anotações como `@RestController`, `@RequestMapping`, `@GetMapping`, `@PostMapping` para implementar os endpoints da API.

<div align="center">

## **Tecnologias Utilizadas**
---


- **Java 17**
- **Spring**
- **Eclipse**
- **PostgreSQL** para persistência de dados.


---
## **Serratec - 2024**

</div>



