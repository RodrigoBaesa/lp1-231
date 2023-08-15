package semana19.Banco;

import java.time.LocalDate;

public abstract class Conta{

    private int numero;
    private LocalDate dataAbertura;
    protected double saldo;
    protected double tarifa;
    private Correntista correntista;

    public Conta(int numero, double saldo, double tarifa, Correntista correntista) {
        this.numero = numero;
        this.dataAbertura = dataAbertura;
        this.saldo = saldo;
        this.tarifa = tarifa;
        correntista.addConta(this);
    }

    public abstract double calcularTarifa();

    public void sacar(double valor){
        if(valor > saldo){
            throw new RuntimeException("Saldo insuficiente!");
        }
        saldo = saldo - valor;
    }

    public void depositar(double valor){
        saldo += valor;
    }
}