package semana05;

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

        int volume = (comprimento * altura * largura) / 1000;
        double potencia = volume * 0.05 * (tempDesejada - tempAmbiente);
        int filtragemMin =  volume * 2;
        int filtragemMax = volume * 3;

        System.out.println("O volume do seu aquário é de: " + volume + "Litros!");
        System.out.println("A potência do termostato do seu aquário deve ser de: " + potencia);
        System.out.println("A filtragem por hora do ser aquário deve ser de no mínimo: " + filtragemMin + "\nE de no máximo: " + filtragemMax);
    }
    
}