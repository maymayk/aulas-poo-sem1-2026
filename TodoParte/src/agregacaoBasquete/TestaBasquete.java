package agregacaoBasquete;

public class TestaBasquete {
    public static void main(String[] args) {
        Atleta a = new Atleta(1, "Fulano de Tal", "Pivô");
        Atleta a2 = new Atleta(2, "Ciclano", "Armador");
        Time time1 = new Time(120, "Franca", "Tecnico do Franca");

        // contratando atletas
        time1.contratarAtleta(a);
        time1.contratarAtleta(a2);

        // anulando o time
        time1 = null;

        // provando que o atleta ainda existe
        System.out.println(a);
        System.out.println(a2);
    }
}
