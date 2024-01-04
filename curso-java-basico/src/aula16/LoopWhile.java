package aula16;

public class LoopWhile {
    public static void main(String[] args) {
        
        int i = 0;
        int max = 10;

        System.out.println("Contando até " + max);

        while (i < max) {
            i++;
            System.out.println("Valor de i: " + i);
        }

        do {
            i++;
            System.out.println("Agora o valor de i é: " + i);
        } while (i < 15);
    }
}
