public class Carro_Luxo extends Carro{
    private boolean gps_integrado;
    private boolean controle_cruzeiro;
    private int qtd_airbags;

    public Carro_Luxo(String marca, String modelo, String placa, String ano, double valor_locacao, int limite_renovacao,
            boolean gps_integrado, boolean controle_cruzeiro, int qtd_airbags) {
        super(marca, modelo, placa, ano, valor_locacao, limite_renovacao);
        this.gps_integrado = gps_integrado;
        this.controle_cruzeiro = controle_cruzeiro;
        this.qtd_airbags = qtd_airbags;
    }

    public int getQtd_airbags() {
        return qtd_airbags;
    }

    public void setQtd_airbags(int qtd_airbags) {
        this.qtd_airbags = qtd_airbags;
    }

    public boolean isGps_integrado() {
        return gps_integrado;
    }

    public void setGps_integrado(boolean gps_integrado) {
        this.gps_integrado = gps_integrado;
    }

    public boolean isControle_cruzeiro() {
        return controle_cruzeiro;
    }

    public void setControle_cruzeiro(boolean controle_cruzeiro) {
        this.controle_cruzeiro = controle_cruzeiro;
    }

    @Override
    public void setLimite_renovacao(int limite_renovacao) {
        this.setLimite_renovacao(3);
    }
}
