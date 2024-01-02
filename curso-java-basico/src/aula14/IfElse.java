package aula14;

import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com a sua idade");

        int idade = scan.nextInt();

        if (idade >= 18) {
            System.out.println("É maior de idade.");
        } else {
            System.out.println("Não é maior de idade.");
        }

        // Barato: menor que R$10,00
        // Mediano: entre R$10,00 e R$15,00
        // Pesquisar mais: de R$15,00 a R$17,00
        // Muito caro: maior que R$17,00

        System.out.println("Entre com o preço do item");

        double valor = scan.nextDouble();

        if (valor <= 10) {
            System.out.println("Está barato, pode comprar");
        } else if (valor > 10 && valor < 15) {
            System.out.println("Você pode pedir um desconto");
        } else if (valor >= 15 && valor < 17) {
            System.out.println("Pode pesquisar mais");
        } else {
            System.out.println("Está muito caro");
        }
    }
}
