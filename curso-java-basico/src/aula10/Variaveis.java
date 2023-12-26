package aula10;

public class Variaveis {
    public static void main(String[] args){
//        Convenção Java
        int idade = 20;
        String nome = "Aylmer";
        String nomeDoMeuCachorro = "Jimmy";

//        Aceito mas não utilizado
        int _idade;
        int $idade;
        String ano2014 = "2014";

//        Não é convenção Java
        String nome_do_meu_cachorro;
        String NomeDoMeuCachorro;

//        Má prática
        int a = 10;
        String b = "Bolzan";

        idade = 25;

        System.out.println("Idade = " + idade);

    }
}