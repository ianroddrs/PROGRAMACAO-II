package listas.lista3.qt1;

public class Principal {
    public static void main(String[] args) {
        Circulo circulo = new Circulo(5.0, 10.0, 20.0);
        System.out.println("Coordenadas do circulo: raio=" + circulo.getRaio() + ", x=" + circulo.getX() + ", y=" + circulo.getY());
        circulo.setX(circulo.getX() + 17.0);
        System.out.println("Coordenadas do circulo após deslocamento de x: raio=" + circulo.getRaio() + ", x=" + circulo.getX() + ", y=" + circulo.getY());
    }
}