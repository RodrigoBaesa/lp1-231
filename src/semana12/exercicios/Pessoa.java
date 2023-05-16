package semana12.exercicios;

public class Pessoa {
    public double peso;
    public double altura;

    public Pessoa(double peso, double altura) {
        this.peso = peso;
        this.altura = altura;
    }

    public double calcularIMC(){
        double IMC = peso / (altura * altura);
        return IMC;
    }

    public String getFaixa(){
        if (calcularIMC() < 18.5){
            return "classificação de Baixo peso!";
        }
        if (calcularIMC() >= 18.5 && calcularIMC() <= 24.9){
            return "classificação de Peso normal!";
        }
        if (calcularIMC() >= 25.0 && calcularIMC() <= 29.9){
            return "classificação de Excesso de peso!";
        }
        if (calcularIMC() >= 30.0 && calcularIMC() <=34.9){
            return "classificação de Obesidade de Classe 1!";
        }
        if (calcularIMC() >= 35.0 && calcularIMC() <= 39.9){
            return "classificação de Obesidade de Classe 2!";
        }else{
            return "classificação de Obesidade de Classe 3!";
        }
    }

    public double calcularPesoIdeal(){
        return peso - (24.9 * altura * altura);
    }

    public String getSituacao(){
        if (calcularIMC() < 18.5){
            return "GANHAR";
        }
        if (calcularIMC() >= 18.5 && calcularIMC() <= 24.9){
            return "NORMAL";
        } else {
            return "PERDER";
        }
    }
}
