package helloworld;
import java.util.Scanner;


class HelloWorld{
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("hello world");

        String nome = ler.nextLine();


        System.out.println(nome);

        ler.close();

    }
}