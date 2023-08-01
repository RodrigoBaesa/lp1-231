package semana17.Vendedor;

public class Vendedor {
    
    protected String nome;
    protected double vendas;
    protected double comissao;

    public Vendedor (String nome, double vendas, double comissao) {
        this.nome = nome;
        this.vendas = vendas;
        this.comissao = comissao;
    }

    public double obterSalario() {
        return vendas * (comissao/100);
    }

    // Getters e Setters

}