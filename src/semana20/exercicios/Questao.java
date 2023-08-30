package semana20.exercicios;

import java.util.List;

public abstract class Questao {
    public boolean correcao;    
    protected int numero;
    protected String enunciado;
    protected List<Alternativa> alternativas;
    public int size = alternativas.size();

    protected Questao(int numero, String enunciado){
        this.numero = numero;
        this.enunciado = enunciado;
    }

    abstract protected void addAlternativa(Alternativa alternativa);

    public void removeAlternativa(Alternativa alternativa){
            alternativas.remove(alternativa);
    }

    public String getEnunciado(){
        return enunciado;
    }

    public int getNumero(){
        return numero;
    }
}
