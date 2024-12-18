package ListaHeranca.Figuras;

public class Retangulo {
    private double base;
    private double height;

    public Retangulo(double base, double height){
        this.base = base;
        this.height = height;
    }
    public String toString(){
        return "base : " + base + " height: " + height;
    }

    public double calcArea(){
        return base*height;
    }
    public double calcDiagonal(){
        return Math.sqrt(base*base + height*height);
    }

    public double getBase(){
        return base;
    }
    public double getHeight(){
        return height;
    }
}
