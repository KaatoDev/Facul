import java.util.Scanner;
import java.util.regex.Pattern;

import static psc.Aula1.*;

public class Main {
    public static void main(String[] args) {
        psc1();
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