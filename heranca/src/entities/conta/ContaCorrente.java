package entities.conta;

import entities.cliente.Cliente;
import entities.cliente.PessoaFisica;
import entities.cliente.PessoaJuridica;

public class ContaCorrente extends Conta {
    private double checqueEspecial;
    private Cliente cliente;

    public ContaCorrente(int numero, double checqueEspecial, Cliente cliente) {
        super(numero);
        this.checqueEspecial = checqueEspecial;
        this.cliente = cliente;
    }

    @Override
    public boolean sacar(double valor){
        if(valor <= saldo + checqueEspecial){
            saldo-=valor;
            return true;
        }
        return false;
    }

    public void cobrarTaxa (){
        if (cliente instanceof PessoaJuridica) {
            saldo -= 100.0;
        } else if (cliente instanceof PessoaFisica) {
            saldo -= 10.0;
        }
    }
}
