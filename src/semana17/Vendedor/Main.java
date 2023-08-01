package semana17.Vendedor;

public class Main {
    public static void main(String[] args) {

        Vendedor v1 = new Vendedor ("Pedro", 50000.00, 10.00);
        Vendedor v2 = new Vendedor ("João", 100000.00, 12.00);
        VendedorFixo v3 = new VendedorFixo ("Marcia", 200000, 5.00, 2000.00);

        System.out.println(v1.obterSalario());
        System.out.println(v2.obterSalario());
        System.out.println(v3.obterSalario());
    }
}
