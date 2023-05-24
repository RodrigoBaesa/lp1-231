package semana12.exercicios;
    // Crie uma classe Conta que representa uma conta em um banco. Essa classe deve ter os atributos codigo (int), saldo (double) e correntista (String). Ao criar uma conta devem ser passado os valores para codigo, correntista e o saldo deve ter o valor 0.0. Implemente métodos para sacar, depositar e transferir valores. Escreva testes de unidade para todos os métodos da classe.

public class Conta {
    public int codigo;
    public double saldo;
    public String correntista;
    
    public Conta (int codigo, String correntista){
        this.codigo = codigo;
        this.correntista = correntista;
        this.saldo = 0.0;
    }

    public double sacar(double valor){
        if (valor > saldo){
            throw new IllegalArgumentException("Saldo insuficiente!");
        } else {
            saldo = saldo - valor;
            return saldo;
        }
    }

    public double depositar(double valor){
        if (valor <= 0){
            throw new IllegalArgumentException("Valor inválido!");
        } else {
            return saldo + valor;
        }
    }
    
    public double transferir(double valor, Conta conta){
        if (valor > saldo){
            throw new IllegalArgumentException("Saldo insuficiente!");
        } else {
            saldo = saldo - valor;
            conta.saldo = conta.saldo + valor;
            return saldo;
        }
    }
}
