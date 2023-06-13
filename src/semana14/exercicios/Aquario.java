package semana14.exercicios;

public class Aquario {

    private double comprimento;
    private double altura;
    private double largura;

    public Aquario(double comprimento, double altura, double largura) {
        setComprimento(comprimento);
        setAltura(altura);
        setLargura(largura);
    }

    public Aquario(double valor) {
        this(valor, valor, valor);
    }

    public double calcularVolume() {
        return (comprimento * altura * largura) / 1000;
    }

    public double calcularPotenciaDoTermostato(double temperaturaDesejada, double temperaturaAmbiente) {
        return calcularVolume() * 0.05 * Math.abs(temperaturaDesejada - temperaturaAmbiente);
    }

    public double [] calcularQuantidadeLitrosFiltro() {
        double [] filtragem = {calcularVolume() * 2, calcularVolume() * 3};
        return filtragem;
    }

    public double getComprimento() {
        return comprimento;
    }

    public double getAltura() {
        return altura;
    }

    public double getLargura() {
        return largura;
    }

    public void setComprimento(double comprimento) {
        if(comprimento <= 0.0)
            throw new RuntimeException("Comprimento inválido");
        this.comprimento = comprimento;
    }

    public void setAltura(double altura) {
        if(altura <= 0.0)
            throw new RuntimeException("Altura inválida");
        this.altura = altura;
    }

    public void setLargura(double largura) {
        if(largura <= 0.0)
            throw new RuntimeException("Largura inválida");
        this.largura = largura;
    }
}