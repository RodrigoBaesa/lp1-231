package semana06.exercicios;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class Ex02Test {
    @Test
    public void calcularIMC() {
    
        double peso = 100.0;
        double altura = 1.50;
    
        double soma = Ex02.calcularIMC(altura, peso);
    
        assertEquals(44.44444444444444, soma);
    }

    @Test
    public void calcularPesoIdeal() {
    
        double peso = 90.0;
        double altura = 1.60;
    
        double soma = Ex02.calcularPesoIdeal(peso, altura);
    
        assertEquals(26.255999999999993, soma);
    }
}
