package introex;
import java.util.Scanner;

public class Entrada {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        int i = ler.nextInt();
        double preco = ler.nextDouble();
        String palavra = ler.next(); 
        String frase = ler.nextLine();
        ler.close();

        System.out.println(i+preco+palavra+frase);
    }
}
