package semana07;

public class exerciciosRevisao {
    public static void main(String[] args) {
        double x = 10;
        double y = 15;
        double z = 1;
        System.out.println("Soma dos três valores: " + somarTresValores(x, y, z));
        System.out.println("Media dos três numeros: " + mediaTresValores(x, y, z));

        int n1 = 9;
        int n2 = 8;
        int n3 = 7;
        System.out.println("Maior valor: " + maiorValor(n1, n2, n3));
        System.out.println("Menor valor: " + menorValor(n1, n2, n3));
        System.out.println("Arrays: " + devolveArray(x, y, z));         
        System.out.println("Soma de Arrays: " + somaArray(null));
        // System.out.println("Média dos 3 Array: " + mediaArray(null));
        System.out.println("Menor dos 3 Array: " + menorArray(x, y, z));
        System.out.println("Maior dos 3 Array: " + maiorArray(null));
    }

    // Escreva um método estático em Java que recebe três parâmetros double e devolve a soma dos valores;
    public static double somarTresValores(double x, double y, double z){
        return x + y + z;
    }

    // 2. Escreva um método estático em Java que recebe três parâmetros double e devolve a média aritmética simples dos valores;
    public static double mediaTresValores(double x, double y, double z){
        return (x + y + z) / 3;
    }

    // 3. Escreva um método estático em Java que recebe três parâmetros int e devolve o maior valor;
    public static int maiorValor(int x, int y, int z){
        if (x > y && x > z){
            return x;
        } else{
            if (y > x && y > z){
                return y;
            } else {
                return z;
            }
        }
    }

    // 4. Escreva um método estático em Java que recebe três parâmetros int e devolve o menor valor;
    public static int menorValor(int x, int y, int z){
        if (x < y && x < z){
            return x;
        } else{
            if (y < x && y < z){
                return y;
            } else {
                return z;
            }
        }
    }    

    // 5. Escreva um método estático em Java que recebe três parâmetros double devolve um array com os valores passados nos parâmetros;
    public static double[] devolveArray(double x, double y, double z){
        double[] array = new double [3];
        array[0] = x;
        array[1] = y;
        array[2] = z;
        return array;
    }

    // 6. Escreva um método estático em Java que recebe um array de double e devolve a soma dos valores;
    public static double somaArray(double[] array){
        double soma = 0;
        for (double valor : array){
            soma += valor;
        }
        return soma;
    }

    // 7. Escreva um método estático em Java que recebe um array de double e devolve a média aritmética;
    // public static double mediaArray(double[] array){
    //    return somarTresValores(array) / array.length;
    //}

    // 8. Escreva um método estático em Java que recebe um array de double e devolve o maior valor;
    public static double maiorArray(double[] array){
        double maior = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[1] > maior){
                maior = array[i];
            }
        }
        return maior;
    }

    // 9. Escreva um método estático em Java que recebe um array de double e devolve o menor valor;
    public static double menorArray(double x, double y, double z){
        double[] array = new double [3];
        array[0] = x;
        array[1] = y;
        array[2] = z;
        if (array[0] < array[1] && array[0] < array[2]){
            return array[0];
        } else{
            if (array[1] < array[0] && array[1] < array[2]){
                return array[1];
            } else {
                return array[2];
            }
        }
    }
    public static int[] juntarArrays (int[] array1, int[] array2) {
        int [] resultado = new int [array1.length + array2.length];
        int indice = 0;
        for (int valor : array1) {
            resultado[indice] = valor;
            indice++;
        }
        for (int valor : array2) {
            resultado[indice] = valor;
            indice++;
        }
        return resultado;
    }
}
