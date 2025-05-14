import entities.cliente.PessoaFisica;
import entities.cliente.PessoaJuridica;
import entities.conta.ContaCorrente;
import entities.conta.ContaPoupaca;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // Criando uma Pessoa Física
        PessoaFisica pf = new PessoaFisica(LocalDate.of(2025, 5, 13), "123.456.78-10", "nome", LocalDate.of(2001, 6, 4) );

        // Criando uma Pessoa Jurídica
        PessoaJuridica pj = new PessoaJuridica(LocalDate.of(2025, 5, 13), "123.456.78-10", "nome");

        // Conta Corrente para Pessoa Física
        ContaCorrente ccPF = new ContaCorrente(1001, 500.0, pf);
        ccPF.depositar(300);
        ccPF.sacar(750);
        ccPF.cobrarTaxa();

        // Conta Corrente para Pessoa Jurídica
        ContaCorrente ccPJ = new ContaCorrente (1234, 4567, pj);
        ccPJ.depositar(2000);
        ccPJ.sacar(2500);
        ccPJ.cobrarTaxa();

        // Conta Poupança
        ContaPoupaca cp = new ContaPoupaca(1234, 5);
        cp.depositar(1000);
        cp.renderJurso();

        // Exibindo saldos finais
        System.out.printf("Saldo Conta Corrente (Pessoa Física): R$ %.2f\n", ccPF.getSaldo());
        System.out.printf("Saldo Conta Corrente (Pessoa Jurídica): R$ %.2f\n", ccPJ.getSaldo());
        System.out.printf("Saldo Conta Poupança: R$ %.2f\n", cp.getSaldo());
    }
}
