package semana11.exercicios;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class AquarioTest {

    @Test
    public void testaCalcularVolume() {
        Aquario aquario = new Aquario();
        aquario.comprimento = 100.00f;
        aquario.largura = 50.00f;
        aquario.altura = 50.00f;

        double volume = aquario.calcularVolume();

        assertEquals(250.0, volume);
    }

    @Test
    public void testaCalcularPotenciaDoTermostato() {
        Aquario aquario = new Aquario();
        aquario.comprimento = 100.00f;
        aquario.largura = 50.00f;
        aquario.altura = 50.00f;

        float tempDesejada = 20.00f;
        float tempAmbiente = 15.00f;

        double potencia = aquario.calcularPotenciaDoTermostato(tempAmbiente, tempDesejada);

        assertEquals(62.5, potencia);
    }
}