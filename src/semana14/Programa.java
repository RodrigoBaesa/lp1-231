package semana14;

public class Programa {
    public static void main(String[] args) {
        Quadrado quadrado = new Quadrado(10.0);

        // quadrado.lado = 5.0;
        quadrado.setLado(-5.0);

        System.out.println(quadrado.getLado());

        System.out.println(quadrado.calcularArea());

        System.out.println(quadrado.calcularPerimetro());
        
        Retangulo r1 = new Retangulo(10.0, 5.0);
        Retangulo r2 = new Retangulo(15.0);

        System.out.println(r1.calcularArea() + ", " + r1.calcularPerimetro());
        System.out.println(r2.calcularArea() + ", " + r2.calcularPerimetro());

        Circulo c1 = new Circulo(6.0);

        System.out.println(c1.calcularArea() + ", " + c1.calcularCircunferencia());
    }
}