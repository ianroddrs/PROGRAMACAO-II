package contacorrente;

public class ContaCorrente {
    String numConta;
    double saldoConta;

    ContaCorrente(String numero, double saldo){
        numConta = numero;
        saldoConta = saldo;
    }

    void creditar(double credito){
        saldoConta += credito;
    }

    void debitar(double debito){
        if(saldoConta >= debito){
            saldoConta -= debito;
        }
    }

    void imprimir(){
        System.out.println("Conta: " + numConta);
        System.out.println("Saldo: " + saldoConta);
    }

}
