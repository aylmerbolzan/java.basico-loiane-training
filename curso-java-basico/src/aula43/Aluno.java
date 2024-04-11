package aula43;

import java.util.Arrays;

public class Aluno  {
    

    private String curso;
    private double[] notas;

    public void verificarAcesso(){
        // this.nomeVisibilidade = "Maria";
        // super.nomeVisibilidade = "Teste";
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

    public String obterEtiquetaEndereco(){
        String s = "Endereço do Aluno: ";
        // s += super.getEndereco();

        return s;
    }

    public void imprimirEtiquetaEndereco() {
        System.out.println(this.obterEtiquetaEndereco());
        throw new UnsupportedOperationException("Unimplemented method 'imprimirEtiquetaEndereco'");
    }

    public String toString(){
        String s = curso + "\n";
        for (double nota : notas){
            s += nota + " ";
        }
        return s;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        
        Aluno other = (Aluno) obj;
        if(curso.equalsIgnoreCase(other.getCurso())){
            return true;
        }
        return true;
    }

}
