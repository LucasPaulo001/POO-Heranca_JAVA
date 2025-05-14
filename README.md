## Modelar o seguinte esquema de um banco.

- Observações:
`Em conta corrente deve ser possível sacar além do saldo o limite do cheque especial;
A taxa da conta corrente é R$ 100,00 para pessoa jurídica e R$ 10,00 para pessoa física;`
---
  ```
                           +--------------------+
                           |      Cliente       |
                           +--------------------+
                           | - nome: String     |
                           | - cpfOuCnpj: String|
                           | - dataCadastro:    |
                           |       LocalDate    |
                           +--------------------+
                                     ▲
                     ┌───────────────┼────────────────┐
                     │                                │
          +-----------------------+      +-------------------------+
          |     PessoaFisica      |      |    PessoaJuridica       |
          +-----------------------+      +-------------------------+
          | - dataNascimento:     |      |  -cnpj: String          |
          |         LocalDate     |      |  -RazaiSocial: String   |
          +-----------------------+      +-------------------------+
          
                           +------------------------+
                           |        Conta           |
                           +------------------------+
                           | # numero: int          |
                           | # saldo: double        |
                           | # cliente: Cliente     |
                           +------------------------+
                           | + depositar(valor)     |
                           | + sacar(valor)         |
                           | + getSaldo(): double   |
                           +------------------------+
                                     ▲
                     ┌───────────────┼──────────────┐
                     │                              │
          +---------------------------+   +-----------------------------+
          |     ContaCorrente         |   |       ContaPoupanca         |
          +---------------------------+   +-----------------------------+
          | - limiteCheque: double    |   | - taxaJuros: double         |
          +---------------------------+   +-----------------------------+
          | + cobrarTaxa()            |   | + renderJuros()             |
          +---------------------------+   +-----------------------------+
  ```
