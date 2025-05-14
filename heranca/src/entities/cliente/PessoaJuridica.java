package entities.cliente;

import java.time.LocalDate;

public class PessoaJuridica extends Cliente {
    private String cnpj;
    private String razaoSocial;

    public PessoaJuridica(LocalDate dataCadastro, String cnpj, String razaoSocial) {
        super(dataCadastro);
        this.cnpj = cnpj;
        this.razaoSocial = razaoSocial;
    }
}
