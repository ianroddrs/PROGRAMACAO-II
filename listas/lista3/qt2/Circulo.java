package listas.lista3.qt1;

public class Circulo {
    private double raio;
    private double x;
    private double y;
    
    public Circulo(double raio, double x, double y) {
        this.raio = raio;
        this.x = x;
        this.y = y;
    }
    
    public double getRaio() {
        return raio;
    }
    
    public double getX() {
        return x;
    }
    
    public double getY() {
        return y;
    }
    
    public void setX(double x) {
        this.x = x;
    }
}