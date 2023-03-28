package semana06;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CalculadoraTest {
    
    @Test
    public void somaDoisNumerosPositivos() {
        // AAA

        // Arrange
        double numero1 = 10.0;
        double numero2 = 2.0;

        // Act
        double soma = Calculadora.somar(numero1, numero2);
    }
    @Test
    public void somaUmNumeroPositivoEUmNegativo() {
    
        double numero1 = 10.0;
        double numero2 = -2.0;
    
        double soma = Calculadora.somar(numero1, numero2);
    
        assertEquals(8.0, soma);
    }

    @Test
    public void somaDoisNumerosNegativos() {

        double numero1 = -10.0;
        double numero2 = -2.0;

        double soma = Calculadora.somar(numero1, numero2);

        assertEquals(-12.0, soma);
    }

    @Test
    public void subtraiDoisNumerosPositivos() {

        double numero1 = 10.0;
        double numero2 = 2.0;

        double subtracao = Calculadora.subtrair(numero1, numero2);

        assertEquals(8.0, subtracao);
    }

    @Test
    public void subtraiUmNumeroPositivoEUmNegativo() {

        double numero1 = 10.0;
        double numero2 = -2.0;

        double subtracao = Calculadora.subtrair(numero1, numero2);

        assertEquals(12.0, subtracao);
    }

    @Test
    public void subtraiDoisNumerosNegativos() {

        double numero1 = -10.0;
        double numero2 = -2.0;

        double subtracao = Calculadora.subtrair(numero1, numero2);

        assertEquals(-8.0, subtracao);
    }
    
    @Test
    public void multiplicaDoisNumerosPositivos() {

        double numero1 = 10.0;
        double numero2 = 2.0;

        double multiplicacao = Calculadora.multiplicar(numero1, numero2);

        assertEquals(20.0, multiplicacao);
    }

    @Test
    public void multiplicaUmNumeroPositivoEUmNegativo() {

        double numero1 = 10.0;
        double numero2 = -2.0;

        double multiplicacao = Calculadora.multiplicar(numero1, numero2);

        assertEquals(-20.0, multiplicacao);
    }

    @Test
    public void multiplicaDoisNumerosNegativos() {

        double numero1 = -10.0;
        double numero2 = -2.0;

        double multiplicacao = Calculadora.multiplicar(numero1, numero2);

        assertEquals(20.0, multiplicacao);
    }

    @Test
    public void divideDoisNumerosPositivos() {

        double numero1 = 10.0;
        double numero2 = 2.0;

        double divisao = Calculadora.dividir(numero1, numero2);

        assertEquals(5.0, divisao);
    }

    @Test
    public void divideUmNumeroPositivoEUmNegativo() {

        double numero1 = 10.0;
        double numero2 = -2.0;

        double divisao = Calculadora.dividir(numero1, numero2);

        assertEquals(-5.0, divisao);
    }

    @Test
    public void divideDoisNumerosNegativos() {

        double numero1 = -10.0;
        double numero2 = -2.0;

        double divisao = Calculadora.dividir(numero1, numero2);

        assertEquals(5.0, divisao);
    }
}
