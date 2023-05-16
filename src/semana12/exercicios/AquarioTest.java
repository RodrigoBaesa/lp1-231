package semana12.exercicios;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class AquarioTest {

    @Test
    public void testaCalcularVolume() {
        Aquario aquario = new Aquario(50, 50, 50);

        double volume = aquario.calcularVolume();

        assertEquals(125.0, volume);
    }

    @Test
    public void testaCalcularPotenciaDoTermostato() {
        Aquario aquario = new Aquario(25, 25, 25);

        float tempDesejada = 20.00f;
        float tempAmbiente = 15.00f;

        double potencia = aquario.calcularPotenciaDoTermostato(tempAmbiente, tempDesejada);

        assertEquals(3.9, potencia, 0.01);
    }

    @Test
    public void calcularQuantidadeDeLitrosNoFiltro(){
        Aquario aquario = new Aquario(33, 33, 33);

        float [] litros = aquario.calcularQuantidadeLitrosFiltro();
        float [] esperado = {71.874f, 107.811005f};

        assertArrayEquals(esperado, litros);
    }
    
}
