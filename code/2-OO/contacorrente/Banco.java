package contacorrente;

public class Banco {
    public static void main(String[] args) {
        ContaCorrente conta1 = new ContaCorrente("12345", 1000.00);

        conta1.creditar(1537.97);

        conta1.debitar(523.29);

        conta1.imprimir();
        
    }
}
