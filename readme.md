# 📌 Estrutura do Sistema Bancário

## 1️⃣ Classes e Relacionamentos

O sistema será composto pelas seguintes classes:

### ContaBancaria (Classe abstrata)
- Representa uma conta genérica com atributos como **número da conta, titular e saldo**.
- Métodos básicos para **depósito, saque e consulta de saldo**.
- Define um método abstrato para **calcular taxas**, a ser implementado nas subclasses.

### ContaCorrente (Extende ContaBancaria)
- Conta bancária com **taxa de manutenção mensal**.
- Pode cobrar uma **taxa extra para saques**.

### ContaPoupanca (Extende ContaBancaria)
- Conta bancária que possui um **rendimento mensal**.
- Método para **aplicar rendimento ao saldo**.

### Banco
- Gerencia uma **lista de contas bancárias**.
- Permite **abrir e remover contas**.
- Métodos para **buscar contas, listar contas e gerenciar transações**.

---

## 2️⃣ Funcionalidades Essenciais

O sistema deverá implementar as seguintes funcionalidades:

### ✅ Criar uma conta bancária
- O banco poderá **registrar novas contas** (corrente ou poupança).
- Cada conta terá um **número único e um titular**.

### ✅ Depósito de dinheiro
- O usuário poderá **adicionar saldo** a uma conta.

### ✅ Saque de dinheiro
- O usuário poderá **retirar dinheiro** da conta, **respeitando o saldo disponível**.
- Em **ContaCorrente**, poderá haver uma **taxa adicional**.

### ✅ Transferência entre contas
- O usuário poderá **transferir dinheiro entre contas** dentro do mesmo banco.

### ✅ Consulta de saldo
- O usuário poderá **visualizar o saldo atual da conta**.

### ✅ Listagem de contas
- O banco poderá **exibir todas as contas registradas e seus detalhes**.

### ✅ Cálculo de taxas e rendimentos
- O sistema aplicará automaticamente a **taxa de manutenção da conta corrente**.
- A conta poupança poderá **acumular rendimentos mensalmente**.

---

## 3️⃣ Expansões Futuras

Após a implementação básica, o projeto poderá ser expandido com:

### 🔹 Histórico de transações
- Registrar todas as movimentações (**depósitos, saques e transferências**).

### 🔹 Sistema de autenticação
- Criar um **sistema simples de login/senha** para cada conta.

### 🔹 Armazenamento de dados
- **Salvar e carregar contas** de um **banco de dados ou arquivo**.

### 🔹 Interface gráfica (GUI) ou API REST
- Criar uma **interface gráfica (JavaFX, Swing)** ou uma **API REST com Spring Boot** para interagir com o sistema.

---

## 4️⃣ Fluxo de Uso do Sistema

1. **Usuário cria uma conta** (corrente ou poupança).
2. **Usuário deposita dinheiro na conta**.
3. **Usuário pode sacar ou transferir dinheiro**.
4. **O sistema atualiza o saldo e armazena as movimentações**.
5. **A conta corrente tem taxas descontadas periodicamente**.
6. **A conta poupança recebe rendimentos**.
7. **O banco pode exibir todas as contas e seus dados**.
