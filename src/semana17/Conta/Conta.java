package semana17.Conta;

import java.time.LocalDate;

public class Conta {
    
    private int numero;
    private LocalDate dataAbertura;
    protected double saldo;
    protected double tarifa;

    public Conta (int numero, LocalDate dataAbertura, double saldo, double tarifa) {
        this.numero = numero;
        this.dataAbertura = dataAbertura;
        this.saldo = saldo;
        this.tarifa = tarifa;
    }

    public void sacar (double valor) {
        saldo = saldo - valor;
        System.out.println(saldo);
        return;
    }

    public void depositar(double valor) {
        saldo = saldo + valor;
        System.out.println(saldo);
        return;
    }

    public double calcularTarifa() {
        return tarifa;
    }
}
