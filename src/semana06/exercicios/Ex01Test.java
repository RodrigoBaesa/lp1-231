package semana06.exercicios;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class Ex01Test {
    @Test
    public void calcularVolume() {
    
        double comprimento = 10.0;
        double altura = 2.0;
        double largura = 3.0;
    
        double soma = Ex01.calcularVolume(comprimento, altura, largura);
    
        assertEquals(0.06, soma);
    }

    @Test
    public void calcularPotencia() {
    
        double volume = 10.0;
        double tempDesejada = 2.0;
        double tempAmbiente = 3.0;
    
        double soma = Ex01.calcularPotencia(volume, tempDesejada, tempAmbiente);
    
        assertEquals(-0.5, soma);
    }

    @Test
    public void calcularFiltragemMin() {
    
        double volume = 10.0;
    
        double soma = Ex01.calcularFiltragemMin(volume);
    
        assertEquals(20, soma);
    }

    @Test
    public void calcularFiltragemMax() {
    
        double volume = 10.0;
    
        double soma = Ex01.calcularFiltragemMax(volume);
    
        assertEquals(30, soma);
    }

}
