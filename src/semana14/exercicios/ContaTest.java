package semana14.exercicios;

import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.Test;

public class ContaTest {
    
    @Test
    public void testaInstanciarConta() {
        Conta conta = new Conta(1, "Rodrigo");

        assertEquals(1, conta.getCodigo());
        assertEquals("Rodrigo", conta.getCorrentista());
        assertEquals(0.0, conta.getSaldo());
    }

    @Test
    public void testaInstanciarCorrentista() {
        assertThrows(RuntimeException.class, () -> {
            Conta conta = new Conta(1, "Rodrigo");
            conta.setCorrentista("R");
        });
    }

    @Test
    public void testaSacar() {

        Conta conta = new Conta(1, "Rodrigo");
        conta.depositar(1000.0);
        conta.sacar(100.0);

        double saldoAposSaque = conta.getSaldo();

        assertEquals(900.0, saldoAposSaque);
    }

    @Test
    public void testaDepositar() {

        Conta conta = new Conta(1, "Rodrigo");
        conta.depositar(500.0);

        double saldoAposDeposito = conta.getSaldo();

        assertEquals(500.0, saldoAposDeposito);
    }

    @Test
    public void testaGetCodigo() {
        Conta conta = new Conta(1, "Rodrigo");

        int codigo = conta.getCodigo();

        assertEquals(1, codigo);
    }

    @Test
    public void testaGetCorrentista() {
        Conta conta = new Conta(1, "Rodrigo");

        String correntista = conta.getCorrentista();

        assertEquals("Rodrigo", correntista);
    }

    @Test
    public void testaGetSaldo() {
        Conta conta = new Conta(1, "Rodrigo");

        double saldo = conta.getSaldo();

        assertEquals(0.0, saldo);
    }
}