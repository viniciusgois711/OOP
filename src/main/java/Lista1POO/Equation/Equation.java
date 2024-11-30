package Lista1POO.Equation;

public class Equation {
    private double a, b, c, deltaValue;
    private double roots[] = new double[2];

    public Equation(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }


    public String toString() {
        return "a = " + a + ", b = " + b + " c = " + c;
    }

    public double delta(){
        return (b*b)-4*a*c;
    }

    public double[] rootsMethod(){
        deltaValue = delta();
        if(deltaValue>0) {
            roots[0] = (-b + Math.sqrt(deltaValue)) / 2 * a;
            roots[1] = (-b - Math.sqrt(deltaValue)) / 2 * a;
        }else if(deltaValue==0){
            roots[0] = (-b)/(2*a);
        }
        return roots;
    }

    public double getA(){
        return a;
    }
    public double getB(){
        return b;
    }
    public double getC(){
        return c;
    }
    public void setA(double a){
        this.a = a;
    }
    public void setB(double b){
        this.b = b;
    }
    public void setC(double c){
        this.c = c;
    }

}
