# 🏃 RunTrack

API de exemplo para gestão de corridas, feita em **Kotlin + Spring Boot WebFlux**, 
com **Postgres (R2DBC)** e **RabbitMQ** para mensageria.

## ✨ Funcionalidades
- Criar corrida (`POST /api/v1/runs`)
- Listar corridas com filtros (`GET /api/v1/runs`)
- Publicar evento em RabbitMQ ao salvar corrida
- Retry + Backoff + DLQ para consumo de mensagens inválidas
- Migrations com Flyway
- Documentação interativa com Swagger/OpenAPI
- Observabilidade via Actuator + Prometheus
- Testes com MockK, WireMock e Testcontainers

---

## 🛠️ Tecnologias principais
- Kotlin 1.9
- Spring Boot 3.3 (WebFlux, Validation, Actuator)
- Postgres 16 + R2DBC
- RabbitMQ 3.13
- Flyway 10
- springdoc-openapi (Swagger UI)
- Testcontainers (Postgres, RabbitMQ)
- Ktlint + Detekt

---

## 🚀 Como rodar localmente

### Pré-requisitos
- **JDK 21**
- **Docker + Docker Compose**
- **Gradle Wrapper** (`./gradlew`)

### Subindo infra
```bash
docker compose up -d postgres rabbitmq
# run-track
