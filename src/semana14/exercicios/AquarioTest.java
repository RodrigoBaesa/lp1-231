package semana14.exercicios;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.Test;

public class AquarioTest {

    @Test
    public void testaGetComprimento() {

        Aquario aquario = new Aquario(40.0, 10.0, 10.0);

        double comprimento = aquario.getComprimento();

        assertEquals(40.0, comprimento);
    }

    @Test
    public void testaGetAltura() {

        Aquario aquario = new Aquario(10.0, 40.0, 10.0);

        double altura = aquario.getAltura();

        assertEquals(40.0, altura);
    }

    @Test
    public void testaGetLargura() {

        Aquario aquario = new Aquario(10.0, 10.0, 40.0);

        double largura = aquario.getLargura();

        assertEquals(40.0, largura);
    }

    @Test
    public void testaSetComprimento() {

        Aquario aquario = new Aquario(40.0, 10.0, 10.0);
        aquario.setComprimento(40.0);

        double comprimento = aquario.getComprimento();

        assertEquals(40.0, comprimento);
    }

    @Test
    public void testaSetAltura() {

        Aquario aquario = new Aquario(10.0, 40.0, 10.0);
        aquario.setAltura(40.0);

        double altura = aquario.getAltura();

        assertEquals(40.0, altura);
    }

    @Test
    public void testaSetLargura() {

        Aquario aquario = new Aquario(10.0, 10.0, 40.0);
        aquario.setLargura(40.0);

        double largura = aquario.getLargura();

        assertEquals(40.0, largura);
    }
}