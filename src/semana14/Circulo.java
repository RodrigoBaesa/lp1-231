package semana14;

public class Circulo {
    private double raio;

    public Circulo(double raio) {
        setRaio(raio);
    }

    public double calcularArea() {
        return Math.PI * (raio * raio);
    }

    public double calcularCircunferencia() {
        return 2 * Math.PI * raio;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        if(raio <= 0)
            throw new RuntimeException("Raio inválido");
        this.raio = raio;
    }
}