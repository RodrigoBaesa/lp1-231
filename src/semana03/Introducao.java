package semana03;

import java.util.Scanner;

public class Introducao {
    
    public static void main(String[] args){
        // Comentário de uma linha

        /*
         * Comentário de várias
         * linhas
         */

         // Tipos primitivos
         // Inteiros
         // byte, short, int, long

         byte n1 = 100; // -128 a 127 (1 byte)
         short n2 = 3000; // -32768 a 32767 (2 bytes)
         int n3 = 32134242; // 2 bilhoes (4 bytes)
         int n4 = 324553583; //8 bytes (8 bytes)

         // Ponto flutuante
         float nota1 = 10.34343f;
         // char
         char letra = 'A';

         // boolean
         boolean ligado = true;
         boolean teste = false;

         //String
         String nome = "João da SIlva";
         System.out.println(nome);
         System.out.println(nome.toLowerCase());
         System.out.println(nome.toUpperCase());

         // variáveis e constantes
         int idade = 20;
         int idade2;
         idade2 = 30;

         // Java 10 - inferência de tipo com var
         var idade3 = 15;
         var nome2 = "Maria";

         // Constante - keyword final
         final double TESTE = 20.2;
         final double PI = 3.14;

         // Entrada e saída de dados

         // Entrada - Classe Scanner
         // Saida - System.out

         Scanner sc = new Scanner(System.in);

         System.out.println("Entre com  o seu nome");
         String nomeInformado = sc.nextLine();

         System.out.println("Entre com a sua idade");
         int idadeInformada = sc.nextInt();

         System.out.println(nomeInformado + " " + idadeInformada);

         sc.close();
    }
}
