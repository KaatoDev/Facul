import psc.Aula3.Pessoa;

import javax.swing.*;
import java.util.Scanner;
import java.util.regex.Pattern;

import static psc.Aula1.Aula1.*;

public class Main {
    public static void main(String[] args) {
        psc2();
    }

    private static void psc2() {
        String menu = "1-Cadastrar \n2-Atualizar \n3-Apagar \n4-Listar \n0-Sair";
        int op;

        do {
            op = Integer.parseInt(JOptionPane.showInputDialog(menu));
            String nome, fone, email;
            Pessoa p;
            int id;
            switch (op) {
                case 1:
                    nome = JOptionPane.showInputDialog("Nome:");
                    fone = JOptionPane.showInputDialog("Fone: ");
                    email = JOptionPane.showInputDialog("Email: ");
                    p = new Pessoa();
                    p.setNome(nome);
                    p.setFone(fone);
                    p.setEmail(email);
                    p.put();
                    break;
                case 2:
                    nome = JOptionPane.showInputDialog("Nome:");
                    fone = JOptionPane.showInputDialog("Fone: ");
                    email = JOptionPane.showInputDialog("Email: ");
                    id = Integer.parseInt(JOptionPane.showInputDialog("ID: "));
                    p = new Pessoa();
                    p.setNome(nome);
                    p.setFone(fone);
                    p.setEmail(email);
                    p.setId(id);
                    p.update();
                    break;
                case 3:
                    id = Integer.parseInt(JOptionPane.showInputDialog("ID: "));
                    p = new Pessoa();
                    if (p.contem(id)) {
                        p.setId(id);
                        p.delete();
                    } else JOptionPane.showMessageDialog(null, "Este id nao existe.");
                    break;
                case 4:
                    p = new Pessoa();
                    p.list();
                    break;
                case 0:
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida.");
            }
        } while (op != 0);
    }
    private static void psc1() {
        final Pattern p1 = Pattern.compile("[a-l]");
        Scanner sc = new Scanner(System.in);
        boolean w = true;
        String ww = "a";
        while (w) {
            System.out.print("Digite a letra da questao: ");
            ww = sc.next().toLowerCase();
            if (p1.matcher(ww).matches())
                w = false;
            else System.out.println("A questao digitada nao existe!");
        }
        switch (ww) {
            case "a" -> a(sc);
            case "b" -> b(sc);
            case "c" -> c(sc);
            case "d" -> d(sc);
            case "e" -> e(sc);
            case "f" -> f(sc);
            case "g" -> g(sc);
            case "h" -> h(sc);
            case "i" -> i(sc);
            case "j" -> j(sc);
            case "k" -> k(sc);
            case "l" -> l(sc);
        }
        sc.close();
    }
}