package introex;

public class testasString {
    public static void main(String[] args) {
        String comum = "Um texto dividido\n"
                     + "em várias linhas, mas\n"
                     + "com caracteres especiais";
        
        String multipla="""
                Um texto dividido
                em várias linhas, mas
                sem caracteres especiais
                """;

        System.out.println(comum + "\n####################\n" + multipla);

        String a = "UFPA";
        String b = " - JAVA";
        String c = "UFPA - JAVA";

        if((a+b).equals(c)) System.out.println("São iguais!");
        else System.out.println("Não são iguais!");


    }
}
