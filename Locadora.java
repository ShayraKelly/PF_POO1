import java.util.ArrayList;

public class Locadora{
    private String nome;
    private String endereco;
    private String telefone;
    private ArrayList<Locadora> carros_disponiveis;

    public Locadora(String nome, String endereco, String telefone, ArrayList<Locadora> carros_disponiveis) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.carros_disponiveis = new ArrayList<Locadora>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public ArrayList<Locadora> getCarros_disponiveis() {
        return carros_disponiveis;
    }

    public void setCarros_disponiveis(ArrayList<Locadora> carros_disponiveis) {
        this.carros_disponiveis = carros_disponiveis;
    }
}