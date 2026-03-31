package sistemaDev;

public class TestaDesenvolvedor {
    public static void mostra(Desenvolvedor camaleao){
        camaleao.codar(); //executa o codar() de quem o camaleao representa na chamada do método
        System.out.println("\n" + camaleao.toString() + "\nBônus " + camaleao.calcularBonus());
        //mostra o toString() de quem o camaleao representa na chamada do método
    }
    public static void main(String[] args) {
        //cria um objeto da classe sistemaDev.Desenvolvedor(superclasse)
        Desenvolvedor camaleao;
        camaleao = new Junior("Fulano","Java", 5000, "Beltrano");
        mostra(camaleao);

        camaleao = new Pleno("Beltrano", "Java", 10000, 7);
        mostra(camaleao);

        camaleao = new Senior("Ciclano", "Java", 12000, 3000);
        mostra(camaleao);
    }
}
