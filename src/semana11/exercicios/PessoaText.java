package semana11.exercicios;

import org.junit.jupiter.api.Test;

public class PessoaText {
    @Test
    public void testaCalcularPesoIdeal() {
        Pessoa p1 = new Pessoa();
        p1.peso = 50.00f;
        p1.altura = 170.00f;

        double pesoIdeal = p1.calcularPesoIdeal();

        assertEquals(1.0, pesoIdeal);
    } 
}
