# 📚 BookFlow

Sistema de gerenciamento de biblioteca desenvolvido em Java — o projeto central da minha trilha de estudos backend.

## 💡 Sobre o projeto

O **BookFlow** não é um projeto fechado de uma vez: é um único código que ganha complexidade a cada módulo do roadmap que eu concluo. Começa como POO pura (`Livro`, `Usuário`, `Empréstimo`) e evolui, etapa por etapa, até virar uma API REST completa com Spring Boot, persistida em banco relacional, testada, containerizada e publicada em nuvem.

A ideia é que o histórico de commits e branches conte a história real do aprendizado — sem pular etapas e sem simular conhecimento que ainda não tenho.

## 🚧 Status atual

> Fase 1 (POO Básica) — em andamento. Toda a teoria de OOP (classes → polimorfismo) já foi estudada; o projeto em si ainda está sendo modelado e implementado.

## 🗺️ Roadmap de evolução

- [x] **1. POO Básica** — modelagem de `Livro`, `Usuário` e `Empréstimo` usando herança, interface, encapsulamento e polimorfismo 🔵
- [ ] **2. Tratamento de exceções** — exceção customizada para regra de negócio (ex: livro já emprestado) + carga inicial de dados via arquivo texto
- [ ] **3. Coleções & Generics** — troca das listas soltas por `Map`/`Set`, com `Comparable`/`Comparator` para ordenação
- [ ] **4. Streams** — relatórios gerados via Stream (ex: total emprestado por usuário) sem uso de `for` tradicional
- [ ] **5. Padrões de projeto** — aplicação de ao menos 2 padrões (ex: Builder para objetos complexos, Factory para tipos de usuário)
- [ ] **6. Persistência com JDBC** — dados passam a ser persistidos em banco real via JDBC, com DAO completo para `Livro` e `Usuário`
- [ ] **7. Modelagem SQL** — banco de dados relacional completo do projeto, com queries reais sobre os dados
- [ ] **8. Testes com JUnit** — cobertura das principais regras de negócio (projeto-marco do módulo Java)
- [ ] **9. API REST com Spring Boot** — migração para Spring Boot + Spring Data JPA: CRUD completo, Flyway, Spring Security + JWT (usuário comum empresta/devolve, admin gerencia livros), paginação/filtros, documentação Swagger
- [ ] **10. Testes de API** — suíte de testes manual e automatizada cobrindo autenticação, validação e fluxos de CRUD
- [ ] **11. Containerização com Docker** — app + banco dockerizados, subindo com `docker-compose`
- [ ] **12. Deploy em nuvem (AWS)** — deploy final em EC2 + RDS, fechando o ciclo do roadmap

## 🛠️ Tecnologias

**Atual:** Java 25, gerenciador de dependências Maven

**Previstas ao longo da evolução:** JDBC, MySQL, Spring Boot, Spring Data JPA, Spring Security + JWT, Flyway, Swagger/OpenAPI, JUnit, Docker, AWS (EC2, RDS)

## 📂 Estrutura do projeto

> Em construção — será detalhada assim que a modelagem das classes for definida.

## ▶️ Como executar

> Instruções serão adicionadas assim que a estrutura inicial estiver pronta.

## 🎯 Motivação

Este projeto faz parte de um plano de estudos autodidata em Java, com foco em me preparar para vagas de estágio e desenvolvedor júnior backend. Cada fase reflete um módulo estudado, aplicado na prática — sem IA fazendo o trabalho no lugar do aprendizado.

## 👤 Autor

**Yuri Leocadio**
[GitHub](https://github.com/YuriLeocadio)
