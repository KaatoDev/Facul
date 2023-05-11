package psc.A1;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int dest;
        do {
            System.out.print("\nPara quantos destinos pretende calcular o frete? (no máximo 10)\nDestinos: ");
            dest = sc.nextInt();
        } while (dest > 10);

        for (int i=1; i<=dest; i++) {
            System.out.println("\n[Digite em KM as seguintes distancias]");
            System.out.print("O motoboy até o local de retirada: ");
            double km1 = sc.nextDouble();
            System.out.print("Local de retirada até o local de entrega: ");
            double km2 = sc.nextDouble();
            System.out.print("Preco medio do KM: R$");
            double price = sc.nextDouble();
            if (dest>1) System.out.println("\n[Entrega " + i + "]");
            System.out.printf("O preco total do frete é de R$%.2f\n", pedido(km1, km2, price));
            System.out.println("-----------------------");
        }

        sc.close();
    }
    public static double pedido(double distanciaMotoboy, double distanciaEntrega, double valorKM) {
        return distanciaMotoboy*valorKM + distanciaEntrega*valorKM;
    }
}
