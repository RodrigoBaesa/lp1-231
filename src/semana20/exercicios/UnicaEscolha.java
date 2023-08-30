package semana20.exercicios;

public class UnicaEscolha extends Questao{
    public UnicaEscolha(int numero, String enunciado){
        super(numero, enunciado);
    }

    public void addAlternativa(Alternativa alternativa){
        alternativas.add(alternativa);
    }
}
