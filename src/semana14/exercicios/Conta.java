package semana14.exercicios;

public class Conta {
    private int codigo;
    private String correntista;
    private double saldo;

    public Conta(int codigo, String correntista) {
        setCodigo(codigo);
        setCorrentista(correntista);
    }

    public boolean sacar(double valor) {
        setSaldo(saldo - valor);
        return true;
    }

    public boolean depositar(double valor) {
        setSaldo(saldo + valor);
        return true;
    }

    public boolean transferir(Conta contaDestino, double valor) {
        sacar(valor);
        contaDestino.depositar(valor);
        return true;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getCorrentista() {
        return correntista;
    }

    public double getSaldo() {
        return saldo;
    }

    private void setCodigo(int codigo) {
        if(codigo <= 0) 
            throw new RuntimeException("Código não permitido");
        this.codigo = codigo;
    }

    private void setCorrentista(String correntista) {
        if(correntista.length() < 5 || correntista.length() > 100) 
            throw new RuntimeException("O nome do titular deve ter no mínimo 5 e no máximo 100 caracteres");
        this.correntista = correntista;
    }

    private void setSaldo(double saldo) {
        if(saldo < 0.0) 
            throw new RuntimeException("Você não pode sacar ou transferir um valor maior que o seu saldo");
        this.saldo = saldo;
    }
}