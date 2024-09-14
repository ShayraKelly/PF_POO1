public class Carro {
    private String marca;
    private String modelo;
    private String placa;
    private String ano;
    private double valor_locacao;
    private int limite_renovacao;

    public Carro(String marca, String modelo, String placa, String ano, double valor_locacao, int limite_renovacao) {
        this.marca = marca;
        this.modelo = modelo;
        this.placa = placa;
        this.ano = ano;
        this.valor_locacao = valor_locacao;
        this.limite_renovacao = limite_renovacao;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public double getValor_locacao() {
        return valor_locacao;
    }

    public void setValor_locacao(double valor_locacao) {
        this.valor_locacao = valor_locacao;
    }

    public int getLimite_renovacao() {
        return limite_renovacao;
    }

    public void setLimite_renovacao(int limite_renovacao) {
        this.limite_renovacao = limite_renovacao;
    }
    
}