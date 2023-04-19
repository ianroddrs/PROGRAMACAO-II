package introex;
import java.util.Scanner;

public class calc {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int a = ler.nextInt();
        int b = ler.nextInt();
        ler.close();

        String resposta = """
                Soma = %d
                Subtração = %d
                Multiplicação = %d
                Divisão = %d
                """;

        System.out.printf(resposta, (a+b), (a-b), (a*b), (a/b));

    }
}
