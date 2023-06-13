package semana14.exercicios;

public class Pessoa {

    private int altura;
    private double peso;

    public Pessoa(int altura, double peso) {
        setAltura(altura);
        setPeso(peso);
    }

    public double calcularIMC() {
        return peso / ((altura / 100.0) * (altura / 100.0));
    }

    public String getFaixa() {
        if(calcularIMC() < 18.5) {
            return "Classificação: Baixo Peso";

        } else if(calcularIMC() >= 18.5 && calcularIMC() < 25) {
            return "Classificação: Peso Normal";

        } else if(calcularIMC() >= 25 && calcularIMC() < 30) {
            return "Classificação: Excesso de peso";

        } else if(calcularIMC() >= 30 && calcularIMC() < 35) {
            return "Classificação: Obesidade classe 1";

        } else if(calcularIMC() >= 35 && calcularIMC() < 40) {
            return "Classificação: Obesidade classe 2";

        } else {
            return "Classificação: Obesidade classe 3";    
        }
    }

    public String getSituacao() {
        double pesoAPerder = peso - (24.9 * (altura / 100.0) * (altura / 100.0));

        if(pesoAPerder < 0) {
            return "GANHAR";

        } else  if(pesoAPerder > 1) {
            return "PERDER";

        } else {
            return "NORMAL";
        }
    }

    public int getAltura() {
        return altura;
    }

    public double getPeso() {
        return peso;
    }
    
    public void setAltura(int altura) {
        if(altura <= 0) 
            throw new RuntimeException("Altura inválida");
        this.altura = altura;
    }

    public void setPeso(double peso) {
        if(peso <= 0.0) 
            throw new RuntimeException("Peso inválido");
        this.peso = peso;
    }
}