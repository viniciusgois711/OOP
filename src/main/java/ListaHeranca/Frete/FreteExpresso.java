package ListaHeranca.Frete;

public class FreteExpresso extends Frete{
    private double seguro;

    public FreteExpresso(double distancia, double peso, double seguro){
        super(distancia, peso);
        this.seguro = seguro;
    }

    @Override
    public double valorFrete(){
        return super.valorFrete() + 0.01*seguro;
    }

    @Override
    public String toString() {
        return super.toString() + " seguro: " + seguro;
    }
}
