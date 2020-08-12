package Model;
public class clsOperaciones {
    private double a, b;
    public double getA() {
        return a;
    }
    public void setA(double a) {
        this.a = a;
    }
    public double getB() {
        return b;
    }
    public void setB(double b) {
        this.b = b;
    }
    public double areaCuadrado(){
        return a*a;
    }
    public double PerimetroCuadrado(){
        return 4*a;
    }
    public double areaTriangulo(){
        return ( a * b ) /2;
    }
    public double perimetrotriangulo(){
        return 3 * a;
    }
    public double areaRectangulo(){
        return a * b;
    }
    public double perimetroRectagulo(){
        return (2 * a) + (2*b);
    }
}
