package introex;

public class Saida {
    public static void main(String[] args) {
        System.out.println("1234"); 
        System.out.println(2.36); 
        System.out.println("Palavra");
        System.out.println("Uma frase com palavras");
        int numero=1234;
        System.out.println(numero);//imprime valor da variável
        System.out.println(numero*10+33);//imprime o resultado de uma expressão
        int a = 1000000;
        int b = 3;
        System.out.printf("%d / %d = %3d (divisão inteira)\n", a, b, (a / b));
        System.out.printf("%d / %d = %6.2f (divisão exata)\n", a, b, ((double)a / b));

    }
}
