package psc.Aula1;

import java.time.LocalDateTime;
import java.util.Scanner;

/**
 * [Aula 1] <p>
 * Questões da primeira atividade
 * da aula de PSC.
 */
public class Aula1 {
    /**
     * [Questão L] <p>
     * Calcula a idade de acordo
     * com o ano de nascimento.
     *
     * @param sc Scanner utilizado.
     */
    public static void l(Scanner sc) {
        System.out.println("\n    [Calcular idade]");
        System.out.print("Ano de nascimento: ");
        int i = sc.nextInt();
        System.out.printf("Idade atual: %d - %d = %d anos\n", LocalDateTime.now().getYear(), i, LocalDateTime.now().getYear()-i);
    }
    /**
     * [Questão K] <p>
     * Faz o cálculo do salário final de
     * acordo com o total das comissões.
     *
     * @param sc Scanner utilizado.
     */
    public static void k(Scanner sc) {
        float s, c=0;
        System.out.println("\n    [Calculo de salario com comissao]");
        System.out.print("Salario: R$");
        s = sc.nextFloat();
        System.out.print("Itens vendidos: ");
        int q = sc.nextInt();
        for (int i=0; i<q; i++) {
            System.out.print("Preco do item " + (i+1) + ": R$");
            c += sc.nextFloat();
        }
        System.out.printf("\nComissao: R$%.2f x 0.04 = R$%.2f\n", c, c*0.04);
        System.out.printf("Salario final: R$%.2f + R$%.2f = R$%.2f\n", s, c*0.04, s+c*0.04);
    }
    /**
     * [Questão J] <p>
     * Calcula a nota média semestral com
     * pesos: 2 na primeira nota e 3 na segunda.
     *
     * @param sc Scanner utilizado.
     */
    public static void j(Scanner sc) {
        float n1, n2;
        System.out.println("\n    [Calculo de media semestral]");
        System.out.print("Primeira nota: ");
        n1 = sc.nextFloat()*2;
        System.out.print("Segunda nota: ");
        n2 = sc.nextFloat()*3;
        System.out.printf("Nota media: %.1f + %.1f / 5 = %.1f\n", n1, n2, (n1+n2)/5);
    }
    /**
     * [Questão I] <p>
     * Calcula a idade total de uma pessoa
     * ao chegar na virada do século 22.
     *
     * @param sc Scanner utilizado.
     */
    public static void i(Scanner sc) {
        System.out.println("\n    [Calculo da idade no inicio do seculo 22]");
        System.out.print("Idade atual: ");
        int i = sc.nextInt();
        System.out.printf("Idade necessaria: 2101 - %s + %d = %d anos\n", LocalDateTime.now().getYear(), i, 2101-LocalDateTime.now().getYear()+i);
    }
    /**
     * [Questão H] <p>
     * Calcula a quantidade de litro necessária
     * para percorrer uma certa distância.
     *
     * @param sc Scanner utilizado.
    */
    public static void h(Scanner sc) {
        double a1, a2;
        System.out.println("\n    [Combustivel por distancia]");
        System.out.print("Distancia (Km): ");
        a1 = sc.nextDouble();
        System.out.print("Litro por Km: ");
        a2 = sc.nextDouble();
        System.out.printf("Combustivel gasto: %.2f x %.2f = %.2f litros\n", a1, a2, a1*a2);
    }
    /**
     * [Questão G] <p>
     * Calcula a área de um círculo.
     *
     * @param sc Scanner utilizado.
     */
    public static void g(Scanner sc) {
        System.out.println("\n    [Calculo da area de um circulo]");
        System.out.print("Raio: ");
        double a = sc.nextDouble();
        System.out.printf("Area do circulo: %.2f... x %.2f² = %.2f m²\n", Math.PI, a, Math.PI*a*a);
    }
    /**
     * [Questão F] <p>
     * Calcula a área de um triângulo.
     *
     * @param sc Scanner utilizado.
     */
    public static void f(Scanner sc) {
        double a1, a2;
        System.out.println("\n    [Calculo da area de um triangulo]");
        System.out.print("Base: ");
        a1 = sc.nextDouble();
        System.out.print("Altura: ");
        a2 = sc.nextDouble();
        System.out.printf("Area do quadrado: %.2f x %.2f / 2 = %.2f m²", a1, a2, a1*a2/2);
    }
    /**
     * [Questão E] <p>
     * Calcula a área de um quadrado
     * ou de um retângulo.
     *
     * @param sc Scanner utilizado.
     */
    public static void e(Scanner sc) {
        double a1, a2;
        System.out.println("\n    [Calculo da area de um quadrado/retangulo]");
        System.out.print("Area 1: ");
        a1 = sc.nextDouble();
        System.out.print("Area 2: ");
        a2 = sc.nextDouble();
        String a = "retangulo";
        if (a1 == a2)
            a = "quadrado";
        System.out.printf("Area do %s: %.2f x %.2f = %.2f m²\n", a, a1, a2, a1*a2);
    }
    /**
     * [Questão D] <p>
     * Faz o cálculo do salário com a soma da
     * gratificação e o desconto do imposto.
     *
     * @param sc Scanner utilizado.
     */
    public static void d(Scanner sc) {
        System.out.println("\n    [Calculo de salario com gratificacao]");
        System.out.print("Salario base: R$");
        float s = sc.nextFloat();
        System.out.println("Salario base - imposto + gratificacao");
        System.out.printf("Salario atual: R$%.2f - R$%.2f + R$%.2f = R$%.2f\n", s, s*0.07, s*0.05, s*1.05-s*0.07);
    }
    /**
     * [Questão C] <p>
     * Faz o cálculo do aumento
     * de 25% do salário.
     *
     * @param sc Scanner utilizado.
     */
    public static void c(Scanner sc) {
        System.out.println("\n    [Aumento de 25% do salario]");
        System.out.print("Salario antigo: R$");
        float s = sc.nextFloat();
        System.out.printf("Salario liquido: R$%.2f + R$%.2f = R$%.2f\n", s, s*0.25, s*1.25);
    }
    /**
     * [Questão B] <p>
     * Calcula a média semestral do aluno com pesos:
     * 3 na primeira e na segunda nota e 4 na terceira nota.
     *
     * @param sc Scanner utilizado.
     */
    public static void b(Scanner sc) {
        float p1, p2, p3;
        System.out.println("\n    [Calculo de media semestral]");
        System.out.print("Nota p1: ");
        p1 = sc.nextFloat()*3;
        System.out.print("Nota p2: ");
        p2 = sc.nextFloat()*3;
        System.out.print("Nota p3: ");
        p3 = sc.nextFloat()*4;
        System.out.printf("Nota media: %.1f + %.1f + %.1f / 10 = %.1f\n", p1, p2, p3, (p1+p2+p3)/10);
    }
    /**
     * [Questão A] <p>
     * Faz a multiplicação de 3
     * números fornecidos.
     *
     * @param sc Scanner utilizado.
     */
    public static void a(Scanner sc) {
        int r1, r2, r3;
        System.out.println("\n    [Digite 3 numeros para serem multiplicados entre si]");
        System.out.print("Primeiro: ");
        r1 = sc.nextInt();
        System.out.print("Segundo: ");
        r2 = sc.nextInt();
        System.out.print("Terceiro: ");
        r3 = sc.nextInt();
        System.out.printf("Conta: %dx%dx%d = %d\n", r1, r2, r3, r1*r2*r3);
    }
}