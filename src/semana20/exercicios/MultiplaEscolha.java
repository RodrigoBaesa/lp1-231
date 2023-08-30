package semana20.exercicios;

public class MultiplaEscolha extends Questao{
    public MultiplaEscolha(int numero, String enunciado){
        super(numero, enunciado);
    }

    public void addAlternativa(Alternativa alternativa){
        alternativas.add(alternativa);
    }
}
