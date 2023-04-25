package introex;

public class BoolDemo {
    public static void main(String[] args) {
        
        boolean b; b = false;

        System.out.println("b é: "+ b); b = true;

        System.out.println("b é: "+ b);

        if(b) System.out.println("isso é executado");
        b= false;
        if(b) System.out.println("isso não é executado");
        System.out.println("10>9 é: " + (10>9));


    }
}
