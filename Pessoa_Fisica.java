public class Pessoa_Fisica extends Pessoa{
    private String cpf;
    private Locacao qtd_veiculos;

    public Pessoa_Fisica(String nome, String telefone, String endereco, String cpf, Locacao qtd_veiculos) {
        super(nome, telefone, endereco);
        this.cpf = cpf;
        this.qtd_veiculos = qtd_veiculos;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Locacao getQtd_veiculos() {
        return qtd_veiculos;
    }

    public void setQtd_veiculos(Locacao qtd_veiculos) {
        this.qtd_veiculos = qtd_veiculos;
    }
}