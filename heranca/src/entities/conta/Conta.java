package entities.conta;

public class Conta {
    protected int numero;
    protected double saldo;

    public Conta(int numero) {
        this.numero = numero;
        this.saldo = 0.0;
    }

    public boolean sacar (double valor){
        if(valor <= saldo){
            saldo-=valor;
            return true;
        }

        return false;
    }

    public boolean depositar (double valor){
        if(valor > 0){
            saldo+=valor;
            return true;
        }

        return false;
    }

    public double getSaldo() {
        return saldo;
    }
}
