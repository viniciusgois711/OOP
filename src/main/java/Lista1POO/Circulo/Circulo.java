package Lista1POO.Circulo;

public class Circulo {
    private int raio;


    public Circulo(int raio){
        this.setRaio(raio);
    }

    public double area(){
        return this.raio*this.raio*3.14;
    }

    public double circunferencia(){
        return 2*3.14*this.raio;
    }

    public void setRaio(int raio){
        if(raio < 0){
            this.raio = 0;
        }else {
            this.raio = raio;
        }
    }

    public int getRaio(){
        return this.raio;
    }

}
