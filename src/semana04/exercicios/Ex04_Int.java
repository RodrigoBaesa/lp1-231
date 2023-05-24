package semana04.exercicios;

import java.util.Scanner;

public class Ex04_Int {
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
        String iid = sc.nextLine();
        sc.close();

        if (iid.startsWith("BR") && iid.endsWith("X") && iid.length() == 7 && !iid.equals("BR0000X")){
            String digitoMeio = iid.substring(2,6);;
            try {
                Integer.parseInt(digitoMeio);
                System.out.println("Seu código é valido!");
            }
            catch (Exception e){
                System.out.println("Seu código é invalido!");
            }
        }
        else {
            System.out.println("Seu código é invalido!");
        }
    }
    
}