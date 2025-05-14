package entities.cliente;

import java.time.LocalDate;

public class PessoaFisica extends Cliente {
    private String cpf;
    private String nome;
    private LocalDate nascimento;

    public PessoaFisica(LocalDate dataCadastro, String s, String nome, LocalDate localDate) {
        super(dataCadastro);
        this.cpf = cpf;
        this.nome = this.nome;
        this.nascimento = nascimento;
    }
}
