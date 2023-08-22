package semana20.exercicios;

public class Questoes {
    protected int numero;
    protected int pontos;
    protected String enunciado;
    protected boolean alternativa1;
    protected boolean alternativa2;
    protected boolean alternativa3;

    public Questoes(int numero, String enunciado, boolean alternativa1, boolean alternativa2, boolean alternativa3) {
        this.numero = numero;
        this.alternativa1 = alternativa1;
        this.alternativa2 = alternativa2;
        this.alternativa3 = alternativa3;
    }
}
