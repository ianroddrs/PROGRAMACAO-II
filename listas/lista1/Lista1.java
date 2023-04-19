package listas.lista1;
import java.util.Scanner;

public class Lista1{
    static void qt1(){
        Scanner ler = new Scanner(System.in);
        
        System.out.print("Digite o primeiro numero: ");
        int a = ler.nextInt();

        System.out.print("Digite o segundo numero: ");
        int b = ler.nextInt();

        ler.close();

        String resposta = """
                SOMA = %d
                DIFERENÇA = %d
                PRODUTO = %d
                MÉDIA = %d
                """;

        System.out.printf(resposta, (a+b), (a-b), (a*b), (a/b));
    }

    static void qt2(){
        Scanner ler = new Scanner(System.in);
        float[] notas = new float[5];
        float soma = 0;
        
        for(int i = 0; i < notas.length; i++){
            System.out.printf("Digite o %dª nota: ", (i+1));
            notas[i] = ler.nextFloat();
            soma += notas[i];
        }

        ler.close();

        System.out.printf("A média entre as notas lidas é: %2.1f", (soma/notas.length));
    }

    static void qt3(){
        Scanner ler = new Scanner(System.in);
        float[] valores = new float[4];
        int[] pesos = new int[]{1,2,3,4} ;
        float somaValores = 0;
        int somaPesos = 0;
        
        for(int i = 0; i < valores.length; i++){
            System.out.printf("Digite o %dº valor: ", (i+1));
            valores[i] = ler.nextFloat();
            somaValores += (pesos[i]*valores[i]);
            somaPesos += pesos[i];
        }

        ler.close();

        System.out.printf("A média ponderada entre os valores lidos é: %2.1f", (somaValores/somaPesos));

    }

    static void qt4(){
        Scanner ler = new Scanner(System.in);

        System.out.print("Digite um valor: ");
        int valor = ler.nextInt();
        ler.close();

        String resposta = """
                NUMERO = %d
                QUADRADO = %.1f
                RAIZ QUADRADA = %.1f
                """;

        System.out.printf(resposta, valor, Math.pow(valor,2), Math.sqrt(valor));
    }

    static void qt5(){
        Scanner ler= new Scanner(System.in);

        System.out.print("Digite o valor da Base do retângulo: ");
        float base = ler.nextFloat();

        System.out.print("Digite o valor da Altura do retângulo: ");
        float altura = ler.nextFloat();

        ler.close();

        float perimetro = ((2*base)+(2*altura));
        float area = (base*altura);
        float diagonal = (float)Math.sqrt(Math.pow(altura,2) + Math.pow(base,2));

        String resposta = """
                PERIMETRO = %.1f
                AREA = %.1f
                DIAGONAL = %.1f
                """;
        
        System.out.printf(resposta, perimetro, area, diagonal) ;

        
    }

    public static void main(String[] args) {
        qt5();
    }
}