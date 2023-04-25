package introex;

public class Hypot {

    public static void main(String[] args) {
        double x,y,z;

        x = 3;
        y = 4;

        z = Math.sqrt(Math.pow(x,2)+Math.pow(y,2));

        System.out.printf("Hipotenusa é: %.2f\n", z);

        System.out.println("Hipotenusa é: " + z);
    }
    
}
