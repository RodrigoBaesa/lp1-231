package semana12.exercicios;

public class Aquario {
    public float comprimento;
    public float altura;
    public float largura;

    public Aquario(float comprimento, float altura, float largura) {
        this.comprimento = comprimento;
        this.altura = altura;
        this.largura = largura;
    }

    public Aquario(float medidas) {
        this(medidas, medidas, medidas);
    }

    public float calcularVolume(){
        return (comprimento * altura * largura) / 1000;
    }

    public float calcularPotenciaDoTermostato(float tempAmbiente, float tempDesejada){
        return calcularVolume() * 0.05f * (tempDesejada - tempAmbiente);
    }

    public float[] calcularQuantidadeLitrosFiltro(){
        float [] litros = {calcularVolume() * 2, calcularVolume() * 3};
        return litros;
    }
}
