package aula11;

public class SequenciaEscape {
    public static void main(String[] args) {
        // "ln" após o print, é equivalente ao \n (quebra de linha) e \r (retorno do carro) 
        System.out.print("\"Hello, World!\"\n\r");

        // 1/4
        System.out.println("1\\4");
    }
}
