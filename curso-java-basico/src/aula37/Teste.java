package aula37;

public class Teste {
    public static void main(String[] args) {
        /*
        Aluno aluno = new Aluno()
        Professor professor = new Professor()
        Pessoa pessoa = new Pessoa()

        aluno.setNome("Maria");
        aluno.getNome();

        professor.setTelefoneCelular("(99)99999-9999");
        professor.getTelefoneCelular();
        */

        Pessoa aluno = new Aluno();
        aluno.getNome();

        Pessoa professor = new Professor();
        professor.getCpf();

    }
}
