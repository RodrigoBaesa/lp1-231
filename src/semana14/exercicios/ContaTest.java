package semana14.exercicios;

import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.Test;

public class ContaTest {
    
    @Test
    public void testaInstanciarConta() {
        Conta conta = new Conta(1, "Domingos Latorre");

        assertEquals(1, conta.getCodigo());
        assertEquals("Domingos Latorre", conta.getCorrentista());
        assertEquals(0.0, conta.getSaldo());
    }

    @Test
    public void testaInstanciarContaComCodigoNegativo() {

        assertThrows(RuntimeException.class, () -> {
            new Conta(-1, "Domingos Latorre");
        });
    }

    @Test
    public void testaInstanciarContaComCodigoZero() {

        assertThrows(RuntimeException.class, () -> {
            new Conta(-1, "Domingos Latorre");
        });
    }

    @Test
    public void testaInstanciarContaComCorrentistaDeMenosDe5Caracteres() {

        assertThrows(RuntimeException.class, () -> {
            new Conta(1, "Dom");
        });
    }

    @Test
    public void testaInstanciarContaComCorrentistaDeMaisDe100Caracteres() {

        assertThrows(RuntimeException.class, () -> {
            new Conta(1, "DomingosLatorreDomingosLatorreDomingosLatorreDomingosLatorreDomingosLatorreDomingosLatorreDomingosLatorre");
        });
    }

    @Test
    public void testaSacar() {

        Conta conta = new Conta(1, "Domingos Latorre");
        conta.depositar(3000.0);
        conta.sacar(150.0);

        double saldoAposSaque = conta.getSaldo();

        assertEquals(2850.0, saldoAposSaque);
    }

    @Test
    public void testaSacarValorMaiorDoQueSaldo() {

        Conta conta = new Conta(1, "Domingos Latorre");
        conta.depositar(3000.0);
 
        assertThrows(RuntimeException.class, () -> {
            conta.sacar(3050.0);
        });
    }

    @Test
    public void testaDepositar() {

        Conta conta = new Conta(1, "Domingos Latorre");
        conta.depositar(150.0);

        double saldoAposDeposito = conta.getSaldo();

        assertEquals(150.0, saldoAposDeposito);
    }

    @Test
    public void testaTransferir() {

        Conta contaCorrente = new Conta(1, "Domingos Latorre");
        Conta contaPoupanca = new Conta(2, "Domingos Latorre");

        contaCorrente.depositar(3000.0);
        contaCorrente.transferir(contaPoupanca, 1000.0);

        double saldoContaRemetente = contaCorrente.getSaldo();
        double saldoContaDestino = contaPoupanca.getSaldo();

        assertEquals(2000.0, saldoContaRemetente);
        assertEquals(1000.0, saldoContaDestino);
    }

    @Test
    public void testaTransferirValorMaiorDoQueSaldo() {

        Conta contaCorrente = new Conta(1, "Domingos Latorre");
        Conta contaPoupanca = new Conta(2, "Domingos Latorre");

        contaCorrente.depositar(3000.0);

        assertThrows(RuntimeException.class, () -> {
            contaCorrente.transferir(contaPoupanca, 3010.0);
        });
    }

    @Test
    public void testaGetCodigo() {
        Conta conta = new Conta(1, "Domingos Latorre");

        int codigo = conta.getCodigo();

        assertEquals(1, codigo);
    }

    @Test
    public void testaGetCorrentista() {
        Conta conta = new Conta(1, "Domingos Latorre");

        String correntista = conta.getCorrentista();

        assertEquals("Domingos Latorre", correntista);
    }

    @Test
    public void testaGetSaldo() {
        Conta conta = new Conta(1, "Domingos Latorre");

        double saldo = conta.getSaldo();

        assertEquals(0.0, saldo);
    }
}