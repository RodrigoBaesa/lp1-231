package semana11.exercicios;

public class Aquario {
    float comprimento = 5.0f;
    float altura = 8.0f;
    float largura = 3.0f;

    public float calcularVolume(){
        return (comprimento * altura * largura) / 1000;
    }

    public float calcularPotenciaDoTermostato(float tempAmbiente, float tempDesejada){
        return calcularVolume() * 0.05f * (tempDesejada - tempAmbiente);
    }

    public float[] calcularQuantidadeLitrosFiltro(){
        float [] Litros = {calcularVolume() * 2, calcularVolume() * 3};
        return Litros;
    }

}
