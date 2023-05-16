package semana11.exercicios;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class PessoaTest {

    @Test
    public void testaCalcularPesoIdeal() {
        Pessoa p1 = new Pessoa();
        p1.peso = 50.00f;
        p1.altura = 170.00f;

        double pesoIdeal = p1.calcularPesoIdeal();

        assertEquals(1.0, pesoIdeal);
    }

    @Test
    public void testaCalcularSituacaoNormal(){
        Pessoa p1 = new Pessoa();

        p1.altura = 1.80;
        p1.peso = 70.0;

        String situacao = p1.getSituacao();

        assertEquals("NORMAL", situacao);
    }
}
