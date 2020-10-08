package edu.upc.eetac.dsa.oo.figuras;

public class Rectangle extends Figura{
    private double l1;
    private double l2;

    public Rectangle(double l1, double l2){
        this.l1=l1;
        this.l2=l2;
    }

    @Override
    public double area() {
        return this.l1 * this.l2;
    }

    @Override
    public String toString() {
        return "Rectangle l1:" + this.l1 +"  l2:"+ this.l2 + "  area: (("+ this.area()+"))";
    }

    public double getL1() {
        return l1;
    }

    public double getL2() {
        return l2;
    }
}
