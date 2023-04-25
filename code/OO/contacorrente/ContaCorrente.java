package code.OO.contacorrente;

public class ContaCorrente {
    private String numConta;
    private double saldoConta;

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

    double getSaldo(){
        return saldoConta;
    }

    String getNumConta() {
        return numConta;
    }

    public void setNumConta(String numConta) {
        this.numConta = numConta;
    }

    public void setSaldoConta(double saldoConta) {
        this.saldoConta = saldoConta;
    }

    void imprimir(){
        System.out.println("Conta: " + numConta);
        System.out.println("Saldo: " + saldoConta);
    }

}
