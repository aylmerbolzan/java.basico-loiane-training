package aula29;

public class TesteCarro {
    public static void main(String[] args) {

        Carro van = new Carro();

        van.marca = "Volkswagen";
        van.modelo = "Gol";
        van.numPassageiros = 5;
        van.capCombustivel = 90;
        van.consumoCombustivel = 0.15;

        System.out.println(van.marca + " - " + van.modelo + " - " + van.numPassageiros + " - " + van.capCombustivel + " - " + van.consumoCombustivel);

        // Forma mais limpa
        Carro van2 = new Carro("Fiat", "Ducato", 10, 100, 0.2);

        System.out.println(van2.marca + " - " + van2.modelo + " - " + van2.numPassageiros + " - " + van2.capCombustivel + " - " + van2.consumoCombustivel);
    }
}
