package veiculos;

public class TestaVeiculo3 {  
    public static void main(String[] args){
        Veiculo3 minivan = new Veiculo3();
    
        int dist = 1000;
        minivan.consumo = 11;

        double litros = minivan.necombustivel(dist);

        System.out.println("\nCombustivel necessario para percorrer " + dist + "Km: " + litros + " litros");

        
    }
}
