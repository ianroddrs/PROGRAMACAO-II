package veiculos;

public class Veiculo {
    int passageiros;
    int ccombustivel;
    int consumo;
    String Tipo;

    int autonomia(){
        return ccombustivel*consumo;
    }
}