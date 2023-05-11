package psc.A1.Ex2;

import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("[Criação de jogador iniciada!] \nCrie seu jogador adicionando as seguintes informacoes:");
        System.out.print("Nome do jogador: ");
        String nome = sc.next();
        System.out.print("Idade: ");
        int idade = sc.nextInt();
        System.out.print("Email: ");
        String email = sc.next();

        Jogador p = new Jogador(nome, idade, email);
        verInfo(p);

        p.jogar();
        p.jogar();
        p.jogar();
        p.jogar();
        verInfo(p);

        sc.close();
    }
    public static void verInfo(Jogador jogador) {
        System.out.println("\nInformações do jogador " + jogador.getNome().toUpperCase());
        System.out.println("Idade em anos: " + jogador.getIdade());
        System.out.println("Email: " + jogador.getEmail());
        System.out.println("Categoria: " + jogador.getCategoria());
    }
}
