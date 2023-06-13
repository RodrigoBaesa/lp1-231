package semana14.exercicios;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import org.junit.Test;

public class AquarioTest {

    @Test
    public void testaInstanciarAquario() {

        Aquario aquario = new Aquario(30.0, 40.0, 50.0);

        assertEquals(30.0, aquario.getComprimento());
        assertEquals(40.0, aquario.getAltura());
        assertEquals(50.0, aquario.getLargura());
    }

    @Test
    public void testaCalcularVolume() {

        Aquario aquario = new Aquario(30.0, 40.0, 50.0);

        double volume = aquario.calcularVolume();

        assertEquals(60.0, volume);
    }

    @Test
    public void testaCalcularPotenciaDoTermostato() {

        Aquario aquario = new Aquario(30.0, 40.0, 50.0);
        double temperaturaDesejada = 30;
        double temperaturaAmbiente = 17;

        double potencia = aquario.calcularPotenciaDoTermostato(temperaturaDesejada, temperaturaAmbiente);

        assertEquals(39.0, potencia);
    }

    @Test 
    public void testaCalcularQuantidadeLitrosFiltro() {

        Aquario aquario = new Aquario(30.0, 40.0, 50.0);
        double [] esperado = {120.0, 180.0};

        double [] filtragem = aquario.calcularQuantidadeLitrosFiltro();

        assertArrayEquals(esperado, filtragem);
    }

    @Test
    public void testaGetComprimento() {

        Aquario aquario = new Aquario(30.0, 40.0, 50.0);

        double comprimento = aquario.getComprimento();

        assertEquals(30.0, comprimento);
    }

    @Test
    public void testaGetAltura() {

        Aquario aquario = new Aquario(30.0, 40.0, 50.0);

        double altura = aquario.getAltura();

        assertEquals(40.0, altura);
    }

    @Test
    public void testaGetLargura() {

        Aquario aquario = new Aquario(30.0, 40.0, 50.0);

        double largura = aquario.getLargura();

        assertEquals(50.0, largura);
    }

    @Test
    public void testaSetComprimento() {

        Aquario aquario = new Aquario(30.0, 40.0, 50.0);
        aquario.setComprimento(20.0);

        double comprimento = aquario.getComprimento();

        assertEquals(20.0, comprimento);
    }

    @Test
    public void testaSetAltura() {

        Aquario aquario = new Aquario(30.0, 40.0, 50.0);
        aquario.setAltura(60.0);

        double altura = aquario.getAltura();

        assertEquals(60.0, altura);
    }

    @Test
    public void testaSetLargura() {

        Aquario aquario = new Aquario(30.0, 40.0, 50.0);
        aquario.setLargura(70.0);

        double largura = aquario.getLargura();

        assertEquals(70.0, largura);
    }
}