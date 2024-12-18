package ListaHeranca.Frete;

public class Frete {
    private double distancia;
    private double peso;

    public Frete(double distancia, double peso){
        this.distancia = distancia;
        this.peso = peso;
    }

    public double valorFrete(){
        return 0.01*distancia*peso;
    }

    public String toString() {
        return "distancia: " + distancia + " peso: " + peso;
    }
}
