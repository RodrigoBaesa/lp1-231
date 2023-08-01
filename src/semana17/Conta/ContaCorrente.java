package semana17.Conta;

import java.time.LocalDate;

public class ContaCorrente extends Conta {

    private double limite;

    public ContaCorrente(int numero, LocalDate dataAbertura, double saldo, double tarifa) {
        super(numero, dataAbertura, saldo, tarifa);
    }

    public double calcularTarifa () {
        return tarifa = 10;
    }
    
    public void sacar (double valor) {
        return;
    }
}
