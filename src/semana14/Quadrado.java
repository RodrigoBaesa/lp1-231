package semana14;

public class Quadrado {
    private double lado;

    // Construtor
    public Quadrado(double lado) {
        setLado(lado);
    }

    public double calcularArea() {
        return lado * lado;
    }

    public double calcularPerimetro() {
        return 4 * lado;
    }

    // getter
    public double getLado() {
        return lado;
    }

    // setter
    public void setLado(double lado) {
        if(lado <= 0.0) 
            throw new RuntimeException("Lado inválido");
        this.lado = lado;
    }
}