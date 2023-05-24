package semana12.exercicios;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class PessoaTest {

    @Test
    public void testarCalcularIMC(){

        Pessoa p1 = new Pessoa(54, 1.81);

        double IMC = p1.calcularIMC();

        assertEquals(16.48, IMC, 0.01);
    }

    @Test
    public void testarGetSituacao(){
        Pessoa p1 = new Pessoa(54, 1.81);

        String situacao = p1.getSituacao();

        assertEquals("GANHAR", situacao);
    }

    @Test
    public void testarGetFaixa(){
        Pessoa p1 = new Pessoa(54, 1.81);

        String faixa = p1.getFaixa();

        assertEquals("classificação de Baixo peso!", faixa);
    }
}
