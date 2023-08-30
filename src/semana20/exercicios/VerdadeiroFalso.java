package semana20.exercicios;

public class VerdadeiroFalso extends Questao{
    public VerdadeiroFalso(int numero, String enunciado){
        super(numero, enunciado);
    }

    @Override
    public void addAlternativa(Alternativa alternativa){
        alternativas.add(alternativa);
    }
}