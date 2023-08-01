package semana17.Vendedor;

public class VendedorFixo extends Vendedor {
    
    private double salario;

    public VendedorFixo(String nome, double vendas, double comissao, double salario) {
        super(nome, vendas, comissao);
    }

    @Override
    public double obterSalario() {
        return (vendas * (comissao/100)) + salario;
    }
}
