package semana14.exercicios;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.Test;

public class PessoaTest {
    
    @Test
    public void testaCalcularIMC() {

        Pessoa p1 = new Pessoa(170, 80);

        double imc = p1.calcularIMC();

        assertEquals(27.6, imc, 0.01);
    }

    @Test
    public void testaGetFaixa() {

        Pessoa p1 = new Pessoa(170, 60);

        String faixa = p1.getFaixa();

        assertEquals("Classificação: Peso Normal", faixa);
    }

    @Test
    public void testaGetSituacao() {

        Pessoa p1 = new Pessoa(170, 60);

        String situacao = p1.getSituacao();

        assertEquals("GANHAR", situacao);
    }

    @Test
    public void testaGetAltura() {
        
        Pessoa p1 = new Pessoa(170, 70);

        int altura = p1.getAltura();

        assertEquals(170, altura);
    }

    @Test
    public void testaGetPeso() {
        
        Pessoa p1 = new Pessoa(170, 60);

        double peso = p1.getPeso();

        assertEquals(60, peso);
    }

    @Test
    public void testaSetAltura() {
        
        Pessoa p1 = new Pessoa(170, 70);
        p1.setAltura(171);

        double altura = p1.getAltura();

        assertEquals(171, altura);
    }

    @Test
    public void testaSetPeso() {
        
        Pessoa p1 = new Pessoa(170, 55);
        p1.setPeso(60);

        double peso = p1.getPeso();

        assertEquals(60, peso);
    }
}