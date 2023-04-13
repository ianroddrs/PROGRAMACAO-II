package veiculos;

public class Veiculo3 extends Veiculo{

    Veiculo3(int x, int y, int z){
        passageiros = x;
        ccombustivel = y;
        consumo = z;
    }

    double necombustivel(int distKm){
        return (double) distKm/consumo;
    };

    void info(int dist){
        System.out.println("autonomia: "+autonomia()+
        "\nnecessidade de combustivel para "+ dist + " Km = " + 
        necombustivel(dist));
    }
}
