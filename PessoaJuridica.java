public class PessoaJuridica extends Pessoa{
    private String CNPJ;

    PessoaJuridica(){

    }
    
    public String getCNPJ() {
        return CNPJ;
    }

    public void setCNPJ(String cNPJ) {
        CNPJ = cNPJ;
    }
}