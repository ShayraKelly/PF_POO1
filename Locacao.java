import java.util.ArrayList;

public class Locacao {
    private double multa;
    private int qtd_veiculos;
    private Carro carro;
    private ArrayList<Locacao> carros_locados;


    public Locacao(double multa, int qtd_veiculos, Carro carro, ArrayList<Locacao> carros_locados) {
        this.multa = multa;
        this.qtd_veiculos = qtd_veiculos;
        this.carro = carro;
        this.carros_locados = new ArrayList<Locacao>(carros_locados);
    }

    public double getMulta() {
        return multa;
    }
    
    public void setMulta(double multa) {
        this.multa = multa;
    }
    
    public Carro getCarro() {
        return carro;
    }
    
    public void setCarro(Carro carro) {
        this.carro = carro;
    }

    public int getQtd_veiculos() {
        return qtd_veiculos;
    }

    public void setQtd_veiculos(int qtd_veiculos) {
        this.qtd_veiculos = qtd_veiculos;
    }
    
    public void renovar_Aluguel(int renovacao, int limite_renovacao){
        for(renovacao = 0; renovacao < limite_renovacao; renovacao++);
    }

    public ArrayList<Locacao> getCarros_locados() {
        return carros_locados;
    }

    public void setCarros_locados(ArrayList<Locacao> carros_locados) {
        this.carros_locados = carros_locados;
    }
}
