package ex1;

import java.util.Scanner;

public class Calculadora {
    
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        int a, b;

        System.out.print("Informe o primeiro valor: ");
        a = ler.nextInt();
        System.out.print("Informe o segundo valor: ");
        b = ler.nextInt();

        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println((double) a/b);
        
        ler.close();

    }

}
