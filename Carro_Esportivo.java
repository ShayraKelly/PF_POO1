public class Carro_Esportivo extends Carro{
    private String potencia_motor;
    private String tipo_carro;
    private int qtd_airbags;

    public Carro_Esportivo(String marca, String modelo, String placa, String ano, double valor_locacao,
            int limite_renovacao, String potencia_motor, String tipo_carro, int qtd_airbags) {
        super(marca, modelo, placa, ano, valor_locacao, limite_renovacao);
        this.potencia_motor = potencia_motor;
        this.tipo_carro = tipo_carro;
        this.qtd_airbags = qtd_airbags;
    }

    public String getPotencia_motor() {
        return potencia_motor;
    }

    public void setPotencia_motor(String potencia_motor) {
        this.potencia_motor = potencia_motor;
    }

    public int getQtd_airbags() {
        return qtd_airbags;
    }

    public void setQtd_airbags(int qtd_airbags) {
        this.qtd_airbags = qtd_airbags;
    }

    public String getTipo_carro() {
        return tipo_carro;
    }

    public void setTipo_carro(String tipo_carro) {
        this.tipo_carro = tipo_carro;
    }

    @Override
    public void setLimite_renovacao(int limite_renovacao) {
        this.setLimite_renovacao(5);
    }
}