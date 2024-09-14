public class Devolucao {
    private double valor;
    private Locacao multa;
    private Carro valor_locacao;

    public Devolucao(double valor, Locacao multa, Carro valor_locacao) {
        this.valor = valor;
        this.multa = multa;
        this.valor_locacao = valor_locacao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Locacao getMulta() {
        return multa;
    }

    public void setMulta(Locacao multa) {
        this.multa = multa;
    }

    public Carro getValor_locacao() {
        return valor_locacao;
    }

    public void setValor_locacao(Carro valor_locacao) {
        this.valor_locacao = valor_locacao;
    }

    public void calcular_Total(int multa, int valor_locacao){
        setValor(multa + valor_locacao);
    }

}