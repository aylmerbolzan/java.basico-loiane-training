package aula44;

public class Cachorro extends Mamifero implements AnimalDomesticado, AnimalEstimacao {
    
    private int tamanho;
    private String raça;

    public int getTamanho() {
        return tamanho;
    }
    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }
    public String getRaça() {
        return raça;
    }
    public void setRaça(String raça) {
        this.raça = raça;
    }
    @Override
    public void amamentar() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'amamentar'");
    }
    @Override
    public void emitirSom() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'emitirSom'");
    }
    @Override
    public void levarVeterinario() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'levarVeterinario'");
    }
    @Override
    public void alimentar() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'alimentar'");
    }
    @Override
    public void brincar() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'brincar'");
    }
    @Override
    public void leaverPassear() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'leaverPassear'");
    }

}
