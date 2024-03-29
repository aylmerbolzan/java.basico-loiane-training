package aula36;

public class Teste {
    public static void main(String[] args) {

        Contato contato = new Contato();

        contato.setNome("Tyrion");
        // contato.setEndereco("Kings Landing");
        // contato.setTelefone("11 99999-9999");

        //Relacionamento tem-um Endereço
        Endereco endereco = new Endereco();
        endereco.setNomeRua("Rua Game of Thrones");
        endereco.setNumero("N/A");
        endereco.setComplemento("-");
        endereco.setCidade("Kings Landing");
        endereco.setEstado("Westeros");
        endereco.setCep("99.999-999");

        contato.setEndereco(endereco);

        //Relacionamento tem-um Telefone
        Telefone telefone = new Telefone();
        telefone.setTipo("Celular");
        telefone.setDdd("11");
        telefone.setNumero("99999-9999");

        //Relacionamento tem-um Telefone
        Telefone telefone2 = new Telefone();
        telefone2.setTipo("Celular");
        telefone2.setDdd("11");
        telefone2.setNumero("88888-8888");

        Telefone[] telefones = new Telefone[2];
        telefones[0] = telefone;
        telefones[1] = telefone2;

        contato.setTelefones(telefones);

        // contato.setTelefone(telefone);

        //Teste de saída no console
        System.out.println(contato.getNome());

        if (contato != null && contato.getEndereco() != null) {
            System.out.println(contato.getEndereco().getCidade());
        }

        // if (contato != null && contato.getTelefone() != null) {
        //     System.out.println(contato.getTelefone().getDdd() + " " + contato.getTelefone().getNumero());
        // }

        if (contato != null && contato.getTelefones() != null) {
            for(Telefone t : contato.getTelefones()){
                System.out.println(t.getDdd() + " " + t.getNumero());
            }
        }

    }

}
