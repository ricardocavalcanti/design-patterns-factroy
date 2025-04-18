# 💡 Design Pattern: Simple Factory (Java)

Este repositório demonstra a aplicação do **padrão de projeto Factory* utilizando Java puro.
O padrão Factory encapsula a criação de objetos em uma classe chamada *Factory*, permitindo ao sistema decidir em tempo de execução qual instância de classe concreta deve ser retornada.

---

## 🎯 Objetivo

Facilitar a criação de objetos relacionados sem depender de implementações concretas no código cliente. Isso permite maior flexibilidade, encapsulamento da lógica de criação e facilidade de manutenção.

---
## 📁 Estrutura do Projeto

```bash
design-patterns-factory/
├── src/
│   └── br/
│       └── com/
│           └── pattern/
│               ├── factory/               <- Interface, classes concretas e fábrica
│               ├── service/               <- Lógica de negócio, classes que usam a factory
│               └── Main.java              <- Classe com o exemplo funcional
├── .gitignore
├── README.md
└── pom.xml 
```

---

## ⚙️ Tecnologias

- Java 17
- Maven

---

## ▶️ Como executar
### Compile
- mvn compile

### Execute
- mvn exec:java -Dexec.mainClass="br.com.pattern.factory.Main"

---

## 🧪 Exemplo de saída
Criando veículo do tipo: Carro
Dirigindo um carro...

Criando veículo do tipo: Moto
Pilotando uma moto...

Criando veículo do tipo: Caminhão
Conduzindo um caminhão...

---

## 📚 Conceitos aplicados

- Programação Orientada a Objetos

- Encapsulamento de comportamentos

- Interface como contrato

- Inversão de dependência

- Factory Pattern

- OCP (Open/Closed Principle)

---







