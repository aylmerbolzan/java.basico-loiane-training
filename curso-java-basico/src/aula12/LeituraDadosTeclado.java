package aula12;

import java.util.Scanner;

public class LeituraDadosTeclado {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite seu nome completo:");
        String nomeCompleto = scan.nextLine();
        System.out.println("Seu nome completo é: " + nomeCompleto);

        System.out.println("Digite o seu primeiro nome:");
        String primeiroNome = scan.next();
        System.out.println("Seu primeiro nome é: " + primeiroNome);

        System.out.println("Digite a sua idade:");
        int intIdade = scan.nextInt();
        System.out.println("A sua idade é: " + intIdade);

        System.out.println("Digite a sua altura:");
        double altura = scan.nextDouble();
        System.out.println("A sua altura é: " + altura);

        System.out.println("Digite seu primeiro nome, idade, quantidade de filhos, altura e se tem bichos de estimação:");
        String nome = scan.next();
        int idade = scan.nextInt();
        byte qtdFilhos = scan.nextByte();
        float alturaAtual = scan.nextFloat();
        boolean temPet = scan.nextBoolean();
        System.out.println("Primeiro nome: " + nome);
        System.out.println("Idade: " + intIdade);
        System.out.println("Altura: " + alturaAtual);
        System.out.println("Tem bichos de estimação: " + temPet);

    }
}
