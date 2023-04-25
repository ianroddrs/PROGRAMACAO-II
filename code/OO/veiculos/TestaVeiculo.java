package veiculos;

public class TestaVeiculo {
    public static void main(String[] args){
        Veiculo minivan = new Veiculo();

        minivan.passageiros = 10;
        minivan.ccombustivel = 90;
        minivan.consumo = 10;
        minivan.Tipo = "Minivan";

        int autonomia = minivan.autonomia();

        System.out.println("Veiculo: " + minivan.Tipo + "\nCapacidade de combustivel: " + minivan.ccombustivel + "\nConsumo: " + minivan.consumo + "\nAutonomia: " + autonomia + "\nQuantidade de passageiros: " + minivan.passageiros);

        /////////////////////////////////////////////////


        Veiculo sportcar = new Veiculo();

        sportcar.passageiros = 2;
        sportcar.ccombustivel = 100;
        sportcar.consumo = 60;
        sportcar.Tipo = "Sportcar";
        
        int autonomia2 = sportcar.autonomia();
        
        System.out.println("Veiculo: " + sportcar.Tipo + "\nCapacidade de combustivel: " + sportcar.ccombustivel + "\nConsumo: " + sportcar.consumo + "\nAutonomia: " + autonomia2 + "\nQuantidade de passageiros: " + sportcar.passageiros);
        
    }
}
