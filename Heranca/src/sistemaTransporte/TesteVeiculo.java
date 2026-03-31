package sistemaTransporte;

public class TesteVeiculo {
    public static void main(String[] args) {

        Veiculo v;

        v = new Aviao("Boeing", "737", 850, 12000);
        v.mover();

        v = new CarroEletrico("Tesla", "Model 3", 120, 400);
        v.mover();
    }
}
