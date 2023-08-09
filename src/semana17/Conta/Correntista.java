package semana17.Conta;

import java.util.ArrayList;
import java.util.List;

public class Correntista {

    private int codigo;
    private String nome;
    private List<Conta> Conta;

    public Correntista(int codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
        Conta = new ArrayList<>();
    }
}
