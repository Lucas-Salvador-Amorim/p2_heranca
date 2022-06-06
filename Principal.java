public class Principal {
    public static void main(String[] args) {
        PessoaFisica PessoaFisica = new PessoaFisica();
        PessoaJuridica PessoaJuridica = new PessoaJuridica();
   
        // Inserir informações pelo método SET
        PessoaFisica.setCPF("222-222-222-2");
        PessoaFisica.setNome("Lucas S.");
        PessoaFisica.setEndereco("Pompeia-SP");
   
        PessoaJuridica.setCNPJ("333-333-333-3");
        PessoaJuridica.setNome("Mario");
        PessoaJuridica.setEndereco("Marilia-SP");
   
   
        // Exibir informações pelo método GET
        System.out.println("\nInformações de " + PessoaFisica.getNome() + ":");
        System.out.println("CPF:" + PessoaFisica.getCPF() + ".");
        System.out.println("Endereço:" + PessoaFisica.getEndereco() + ".");
   
   
        System.out.println("\nInformações de " + PessoaJuridica.getNome() + ":");
        System.out.println("CPF:" + PessoaJuridica.getCNPJ() + ".");
        System.out.println("Endereço:" + PessoaJuridica.getEndereco() + ".");
    }   
   }