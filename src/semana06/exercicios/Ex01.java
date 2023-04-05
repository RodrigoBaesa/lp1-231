package semana06.exercicios;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        System.out.println("\nPrograma para calcular informações de um aquário!\n");

        Scanner sc = new Scanner(System.in);

        System.out.println("Insira o comprimento, a altura e a largura do aquário em cm: ");
        int comprimento = sc.nextInt();
        int altura = sc.nextInt();
        int largura = sc.nextInt();

        System.out.println("Insira a temperatura ambiente e a temperatura desejada da água: ");
        float tempAmbiente = sc.nextFloat();
        float tempDesejada = sc.nextFloat();
        sc.close();

        double volume = calcularVolume(comprimento, altura, largura);

        System.out.println("O volume do seu aquário é de: " + calcularVolume(comprimento, altura, largura) + "Litros!");
        System.out.println("A potência do termostato do seu aquário deve ser de: " + calcularPotencia(volume, tempDesejada, tempAmbiente));
        System.out.println("A filtragem por hora do ser aquário deve ser de no mínimo: " + calcularFiltragemMin(tempDesejada) + "\nE de no máximo: " + calcularFiltragemMax(tempDesejada));
    }

    public static double calcularVolume(double comprimento, double altura, double largura){
        return (comprimento * altura * largura) / 1000;
    }
    public static double calcularPotencia(double volume, double tempDesejada, double tempAmbiente){
        return volume * 0.05 * (tempDesejada - tempAmbiente);
    }
    public static double calcularFiltragemMin(double volume){
        return (volume * 2);
    }
    public static double calcularFiltragemMax(double volume){
        return (volume * 3);
    }
    
}
