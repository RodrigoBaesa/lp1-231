package semana10;

public class Programa {
    public static void main(String[] args) {
        // Calcular área e perímetro retangulo
        // area = base * altura
        // perimetro = 2 * (base + altura)

        double baseRet1 = 10.0;
        double alturaRet1 = 5.0;

        double areaRet1 = baseRet1 * alturaRet1;
        double perimetroRet1 = 2 * (baseRet1 + alturaRet1);

        System.out.println(areaRet1);
        System.out.println(perimetroRet1);

        double baseRet2 = 30.0;
        double alturaRet2 = 10.0;

        double areaRet2 = baseRet2 * alturaRet2;
        double perimetroRet2 = 2 * (baseRet2 + alturaRet2);

        System.out.println(areaRet2);
        System.out.println(perimetroRet2);
    }
}
