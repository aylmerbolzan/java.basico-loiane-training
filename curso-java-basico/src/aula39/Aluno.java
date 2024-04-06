package aula39;

public class Aluno extends Pessoa {
    

    private String curso;
    private double[] notas;

    public void verificarAcesso(){
        this.nomeVisibilidade = "Maria";
        super.nomeVisibilidade = "Teste";
    }

    public String getCurso() {
        return curso;
    }
    public void setCurso(String curso) {
        this.curso = curso;
    }
    public double[] getNotas() {
        return notas;
    }
    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    public double calcularMedia(){
        return 0;
    }
        
    public boolean verificarArprovado(){
        return true;
    }

}
