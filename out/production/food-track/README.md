# **FoodTrack System**

## **Sobre o Projeto**
O **FoodTrack System** é um sistema desenvolvido para gerenciar um food truck, permitindo o controle de pedidos, estoque, vendas, e um programa de fidelidade. É parte de um trabalho acadêmico para a disciplina de **Linguagem de Programação 1**, ministrada pela professora **Fernanda Dias**.

---

## **Funcionalidades Principais**
- Cadastro e gestão de pedidos.
- Controle de estoque de ingredientes com alertas de reposição.
- Registro de vendas e geração de relatórios detalhados.
- Programa de fidelidade para clientes frequentes.
- Sistema modularizado com serviços específicos para cada funcionalidade.

---

## **Estrutura do Projeto**

### **Pacote `enums`**
Define os tipos e estados usados no sistema:
- **`Cargo`**: Enumeração para os cargos dos funcionários.
- **`CategoriaLanche`**: Define os tipos de lanches disponíveis.
- **`StatusPedido`**: Enumeração para controlar o estado dos pedidos (A FAZER, FEITO, ENTREGUE).

### **Pacote `model`**
Contém as classes principais que representam as entidades do sistema:
- **`Cliente`**: Representa os clientes do food truck.
- **`Estoque`**: Gerencia os ingredientes disponíveis.
- **`Fidelidade`**: Implementa o programa de fidelidade dos clientes.
- **`Funcionario`**: Representa os funcionários do food truck.
- **`ItemPedido`**: Define os itens individuais em um pedido.
- **`Pedido`**: Representa um pedido feito por um cliente.
- **`Pessoa`**: Classe base para `Cliente` e `Funcionario`.
- **`ProcessoCozinha`**: Gerencia o fluxo dos pedidos na cozinha.
- **`Produto`**: Representa os produtos oferecidos (ex.: tipos de coxinha).
- **`Transacao`**: Classe base para pedidos e vendas.
- **`Venda`**: Registra os dados de vendas realizadas.

### **Pacote `service`**
Contém classes responsáveis pela lógica de negócios e operações específicas:
- **`ClienteService`**: Gerencia as operações relacionadas a clientes.
- **`EstoqueService`**: Realiza controle de estoque e reposição.
- **`FidelidadeService`**: Implementa e gerencia o programa de fidelidade.
- **`PedidoService`**: Gerencia os pedidos do sistema.
- **`VendaService`**: Controla o registro e processamento de vendas.

### **Classe Principal**
- **`Main`**: Contém o ponto de entrada para execução do sistema. Aqui são iniciados os serviços e disponibilizado o menu principal para navegação.

---

## **Funcionalidades Detalhadas**
- **Cadastro de pedidos:** Os clientes podem criar pedidos escolhendo produtos e quantidades.
- **Cálculo automático de valores:** O total do pedido é calculado automaticamente com base nos itens selecionados.
- **Controle de estoque:** Os ingredientes são reduzidos conforme os pedidos são registrados.
- **Alerta de estoque baixo:** Avisos são emitidos quando um ingrediente atinge o nível mínimo.
- **Relatórios de vendas:** Geração de relatórios diários com dados financeiros e estatísticas de vendas.
- **Programa de fidelidade:** Os clientes acumulam pontos baseados em suas compras e podem ganhar recompensas, como uma coxinha grátis.

---
## **Ferramentas e Tecnologias**
- **Java**: Linguagem de programação principal.
- **IntelliJ IDEA**: Ambiente de desenvolvimento integrado (IDE).
- **Git**: Controle de versão.

---

## **Autores**
- **Gabriel Vitor Moreno Chaves**
- **Marcelo Ferreira da Nóbrega**
- **Dyego Kelven Dantas Gomes**
- **Pedro henrique lins queiroga de castro**
- **Natália Rodrigues de Carvalho Loureiro Silveira**

Trabalho realizado para a disciplina de **Linguagem de Programação 1**, ministrada por **Fernanda Dias**.
