public class Pessoa_Juridica extends Pessoa{
    private String cnpj;
    private Pessoa_Fisica Pessoa_Fisica;

    public Pessoa_Juridica(String nome, String telefone, String endereco, String cnpj, Pessoa_Fisica pessoa_Fisica) {
        super(nome, telefone, endereco);
        this.cnpj = cnpj;
        Pessoa_Fisica = pessoa_Fisica;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public Pessoa_Fisica getPessoa_Fisica() {
        return Pessoa_Fisica;
    }

    public void setPessoa_Fisica(Pessoa_Fisica pessoa_Fisica) {
        Pessoa_Fisica = pessoa_Fisica;
    }

}