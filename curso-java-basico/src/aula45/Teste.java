package aula45;

public class Teste {
    
    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        Pessoa pessoaAluno = aluno; //upcasting
    
        Pessoa aluno2 = (Pessoa) new Aluno();
    
        Pessoa aluno3 = new Pessoa();
        Aluno aluno4 = (Aluno) aluno3;

        Pessoa pessoa = new Pessoa();
        Aluno aluno5 = new Aluno();
        Professor professor = new Professor();


    }
}
