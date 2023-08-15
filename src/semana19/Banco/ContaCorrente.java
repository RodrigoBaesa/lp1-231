package semana19.Banco;

public class ContaCorrente extends Conta{

    private double limite;

    public ContaCorrente(int numero, double tarifa, double limite, Correntista correntista) {
        super(numero, tarifa, limite, correntista);
        this.limite = limite;
    }

    @Override
    public double calcularTarifa() {
        return this.tarifa * 1.5;
    }
}