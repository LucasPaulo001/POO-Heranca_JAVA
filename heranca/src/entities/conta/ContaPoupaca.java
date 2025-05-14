package entities.conta;

public class ContaPoupaca extends Conta {
    private double taxaJuros;

    public ContaPoupaca(int numero, double taxaJuros) {
        super(numero);
        this.taxaJuros = taxaJuros;
    }

    public void renderJurso (){
        saldo += saldo * taxaJuros;
    }

}
