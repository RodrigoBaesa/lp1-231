package semana03;

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
         float nota1 = 10.34343f; // 4 bytes
         double nota2 = 10.3434343; // 8 bytes

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
    }
}
