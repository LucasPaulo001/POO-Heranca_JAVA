package entities.cliente;

import java.time.LocalDate;

public class Cliente {
    protected LocalDate dataCadastro;

    public Cliente(LocalDate dataCadastro) {
        this.dataCadastro = dataCadastro;
    }
}
