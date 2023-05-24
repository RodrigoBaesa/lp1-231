package semana12.exercicios;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ContaTest {

    @Test
    public void testarSaque(){
        Conta conta = new Conta(1, "Abigail");

        conta.saldo = 100.0;
        double saldo = conta.sacar(99.0);

        assertEquals(1.0, saldo, 0.01);
    }

    @Test
    public void testarDepositar(){
        Conta conta = new Conta(1, "Abigail");

        conta.saldo = 100.0;
        double saldo = conta.depositar(99.0);

        assertEquals(199.0, saldo, 0.01);
    }

    @Test
    public void testarTransferir(){
        Conta conta1 = new Conta(1, "Abigail");
        Conta conta2 = new Conta(2, "Leah");

        conta1.saldo = 100.0;
        conta2.saldo = 100.0;
        double saldo = conta1.transferir(95.0, conta2);

        assertEquals(5.0, saldo, 0.01);
    }
}