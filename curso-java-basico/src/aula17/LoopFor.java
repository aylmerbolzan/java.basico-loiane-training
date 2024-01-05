package aula17;

public class LoopFor {
    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            System.out.println("i tem o valor: " + i);
        }

        for (int i = 0, j = 10; i < j; i++, j--) {
             System.out.println("i = " + i + " e j = " + j);   
        }

        // Executando for com partes ausentes
        int count = 0;

        for (  ;  count < 10; ) {
            System.out.println("Valor de count: " + count);
            count += 2;
        }

        //Que é o mesmo que:
        for (int cont = 0; cont < 10; cont += 2) {
            System.out.println("Valor de cont: " + cont);
        }

        //Loop sem corpo
        int soma = 0;
        for (int i = 1; i < 5; soma += i++);
        System.out.println("O valor da soma é " + soma);

        //Bloco sem chaves
        for (int semChave = 0; semChave < 5; semChave++) 
            System.out.println("semChave tem o valor: " + semChave);
        
    }
}
