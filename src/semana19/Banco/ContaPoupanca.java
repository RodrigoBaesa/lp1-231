package semana19.Banco;

import java.time.LocalDate;

public class ContaPoupanca extends Conta {

    private LocalDate aniversario;

    public ContaPoupanca(int numero, double tarifa, LocalDate aniversario, Correntista correntista, double saldo) {
        super(numero, saldo, tarifa, correntista);
        this.setAniversario(aniversario);
    }

    @Override
    public double calcularTarifa() {
    return this.tarifa;
    }

    public LocalDate getAniversario() {
    return aniversario;
    }

    public void setAniversario(LocalDate aniversario) {
    this.aniversario = aniversario;
    }
}