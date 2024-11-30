package Lista1POO.Rectangle;

public class Rectangle {
    private double base, height;

    public Rectangle(double base, double height){
        this.base = base;
        this.height = height;
    }

    public String toString(){
        return "Rectangle { base = " + base + ", height = " + height + "}";
    }

    public double calcArea(){
        return base*height;
    }
    public double diagonal(){
        return Math.sqrt(base*base+height*height);
    }

    public void setBase(double base){
        this.base = base;
    }
    public void setHeight(double height){
        this.height = height;
    }
    public double getBase(){
        return base;
    }
    public double getHeight(){
        return height;
    }
}
