package psc.A1.Ex2;

import java.util.Random;

public class Jogador {
    private final String nome, email;
    private final int idade;
    private int categoria;

    public Jogador(String nome, int idade, String email) {
        this.nome = nome;
        this.idade = idade;
        this.email = email;
    }


    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public int getCategoria() {
        return categoria;
    }

    public int getIdade() {
        return idade;
    }

    private void subirCategoria() {
        System.out.println("Subindo jogador de categoria...");
        categoria++;
    }
    public void jogar() {
        System.out.println("\nJogando....");
        boolean sd = new Random().nextBoolean();
        if (sd) {
            System.out.println("Voce ganhou!!!");
            subirCategoria();
        } else System.out.println("Voce perdeu.");
    }
}
