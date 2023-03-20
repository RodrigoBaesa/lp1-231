package semana04.exercicios;

import java.util.Scanner;

public class Ex04_Char {
    /*O código identificador de funcionários de uma empresa contém 7 caracteres, inicia com a sequência de caracteres BR, em seguida apresenta um número inteiro entre 0001 e 9999 e finaliza com o caractere X. 
    Exemplos válidos:
    BR0001X, BR1236X, BR9999X
    Exemplos inválidos:
    br0001X, BR126X, BR99999X, BR9999Y 
    Crie um programa em Java que solicita ao usuário um identificador e apresenta se o que foi informado é um valor válido ou inválido. 
     */
    public static void main(String[] args) {
        System.out.println("Programa para verificar o código identificador de funcionários de uma empresa!");

        Scanner sc = new Scanner(System.in);
        System.out.println("Insira o seu Código de Identificação: ");
        String id = sc.nextLine();
        char terceiroChar = id.charAt(2);
        char quartoChar = id.charAt(3);
        char quintoChar = id.charAt(4);
        char sextoChar = id.charAt(5);
        sc.close();

        if (Character.isDigit(terceiroChar) && Character.isDigit(quartoChar) && Character.isDigit(quintoChar) && Character.isDigit(sextoChar) && id.startsWith("BR") && id.endsWith("X") && id.length() == 7){
            System.out.println("Seu código é valido!");
        } else {
            System.out.println("Seu código é invalido!");
        }
    }
    
}
