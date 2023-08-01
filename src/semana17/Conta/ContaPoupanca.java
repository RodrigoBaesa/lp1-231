package semana17.Conta;

import java.time.LocalDate;

public class ContaPoupanca extends Conta {

    private LocalDate aniversario;

    public ContaPoupanca(int numero, LocalDate dataAbertura, double saldo, double tarifa) {
        super(numero, dataAbertura, saldo, tarifa);
    }

    public double calcularTarifa() {
        return tarifa = 5;
    }
    
}
