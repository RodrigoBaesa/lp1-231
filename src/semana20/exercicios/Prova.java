package semana20.exercicios;

import java.util.List;

public class Prova {
    //Crie o diagrama de classes e o código em Java de um sistemas para questões. O sistema deve ter três tipos de questões: Verdadeiro/falso, única escolha e múltipla escolha. Uma questão deve ser identificada com um número e um enunciado. Uma prova deve conter múltiplas questões e a pontuação. Cada questão vale 1 ponto.  
    int pontuacao;
    List<Questao> questoes;

    public int somarPontuacao(){
        int pontuacao = 0;
        for (Questao questao : questoes) {
            if(questao.correcao == true){
                pontuacao++;
            }
        }
        return pontuacao;
    }

    public void removeQuestao(Questao questao){
        questoes.remove(questao);
    }
    
    public void addQuestao(Questao questao) {
        questoes.add(questao);
    }

}
