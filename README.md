# 🚗 Simulador de Carro em Java

Este projeto é uma simulação de um carro utilizando os conceitos de **Programação Orientada a Objetos** em Java. O foco principal está no uso de **encapsulamento**, **métodos** e **validação de regras** de negócio baseadas em um enunciado detalhado.

---

## ✨ Funcionalidades implementadas

- ✅ Ligar e desligar o carro
- ✅ Acelerar e desacelerar com validações
- ✅ Trocar de marcha respeitando limites e ordem
- ✅ Verificar velocidade atual
- ✅ Virar para esquerda ou direita (com restrições de velocidade)

---

## ⚙️ Regras de negócio

- O carro inicia desligado, em ponto morto (marcha 0) e velocidade 0.
- Só é possível realizar ações se o carro estiver ligado.
- A velocidade varia de 0 a 120 km/h.
- A troca de marchas deve ser feita de forma sequencial (sem pular marchas).
- Cada marcha tem um intervalo de velocidade permitido:

| Marcha | Velocidade permitida |
|--------|----------------------|
| 0      | 0 km/h               |
| 1      | 0 - 20 km/h          |
| 2      | 21 - 40 km/h         |
| 3      | 41 - 60 km/h         |
| 4      | 61 - 80 km/h         |
| 5      | 81 - 100 km/h        |
| 6      | 101 - 120 km/h       |

- O carro só pode virar se estiver entre 1 km/h e 40 km/h.
- Só pode ser desligado se estiver parado e em marcha 0.

---

## 👩‍💻 Linguagem e Ferramentas

- Java
- IntelliJ IDEA (IDE utilizada)
- Git e GitHub para versionamento e hospedagem

---

## 🧠 Aprendizados

Este projeto reforça os conceitos de:
- Encapsulamento e controle de acesso a atributos
- Lógica condicional
- Controle de fluxo com validações
- Práticas de boas mensagens e UX em linha de comando

---

## 📌 Como executar

1. Clone o repositório:
   ```bash
   git clone https://github.com/seu-usuario/seu-repositorio.git
