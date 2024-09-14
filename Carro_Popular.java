public class Carro_Popular extends Carro{
    private boolean ar_condicionado;
    private boolean direcao_hidraulica;
        
    public Carro_Popular(String marca, String modelo, String placa, String ano, double valor_locacao,
            int limite_renovacao, boolean ar_condicionado, boolean direcao_hidraulica) {
        super(marca, modelo, placa, ano, valor_locacao, limite_renovacao);
        this.ar_condicionado = ar_condicionado;
        this.direcao_hidraulica = direcao_hidraulica;
    }

    public boolean isAr_condicionado() {
        return ar_condicionado;
    }
    
    public void setAr_condicionado(boolean ar_condicionado) {
        this.ar_condicionado = ar_condicionado;
    }
    
    public boolean isDirecao_hidraulica() {
        return direcao_hidraulica;
    }
    
    public void setDirecao_hidraulica(boolean direcao_hidraulica) {
        this.direcao_hidraulica = direcao_hidraulica;
    }

    @Override
    public void setLimite_renovacao(int limite_renovacao) {
        this.setLimite_renovacao(1);
    }
}