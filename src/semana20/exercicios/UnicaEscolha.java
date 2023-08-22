package semana20.exercicios;

public class UnicaEscolha extends Questoes{
    boolean escolha1, escolha2, escolha3;
    boolean escolha;
    public UnicaEscolha(int numero, String enunciado, boolean alternativa1, boolean alternativa2, boolean alternativa3){
        super(numero, enunciado, alternativa1, alternativa2, alternativa3);
    }

    public void questao() {
        if (escolha == escolha1 && escolha1 == false){
            System.out.println("Você errou a questão!");
        } else if (escolha == escolha2 && escolha2 == false){
            System.out.println("Você errou a questão!");
        } else
            System.out.println("Vocẽ acertou a questão!");
            pontos = pontos + 1;
        return; 
    }
}
