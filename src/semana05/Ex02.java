package semana05;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        System.out.println("\nPrograma para calcular IMC!\n");

        Scanner sc = new Scanner(System.in);
        System.out.println("Insira seu peso em KG: ");
        float peso = sc.nextFloat();
        System.out.println("Insira sua altura em metros: ");
        float altura = sc.nextFloat();
        sc.close();

        float IMC = peso / (altura * altura);
        
        if (IMC < 18.5){
            System.out.println("Seu IMC é de: " + IMC + ", e você se encaixa na classificação de Baixo peso!");
        }
        if (IMC >= 18.5 && IMC <= 24.9){
            System.out.println("Seu IMC é de: " + IMC + ", e você se encaixa na classificação de Peso normal!");
        }
        if (IMC >= 25.0 && IMC <= 29.9){
            System.out.println("Seu IMC é de: " + IMC + ", e você se encaixa na classificação de Excesso de peso!");
        }
        if (IMC >= 30.0 && IMC <=34.9){
            System.out.println("Seu IMC é de: " + IMC + ", e você se encaixa na classificação de Obesidade de Classe 1!");
        }
        if (IMC >= 35.0 && IMC <= 39.9){
            System.out.println("Seu IMC é de: " + IMC + ", e você se encaixa na classificação de Obesidade de Classe 2!");
        }
        if (IMC >= 40.0){
            System.out.println("Seu IMC é de: " + IMC + ", e você se encaixa na classificação de Obesidade de Classe 3!");
        }

        if (IMC <= 18.5 || IMC >= 24.9){
            double pesoIdeal = peso - (24.9 * altura * altura);
            if (pesoIdeal < 0){
                pesoIdeal = pesoIdeal * (-1);
                System.out.printf(" Você precisa ganhar: %.2f KGs!", pesoIdeal);
            } else {
                if (pesoIdeal > 0){
                    System.out.printf("Você precisa perder: %.2f KGs!", pesoIdeal);
                }  
            }

        }
    }
    
}