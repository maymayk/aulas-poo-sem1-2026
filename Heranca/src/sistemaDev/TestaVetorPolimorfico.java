package sistemaDev;

public class TestaVetorPolimorfico {
    public static void main(String[] args) {

        Desenvolvedor[] devs = new Desenvolvedor[4];

        devs[0] = new Junior("Ana", "Java", 2000f, "Bruno");
        devs[1] = new Pleno("Bruno","Java", 4000f, 20);
        devs[2] = new Senior("Carlos", "Java", 7000f, 2000f);
        devs[3] = new Desenvolvedor("Dev Genérico", "Java", 3000);

        for (Desenvolvedor d : devs) {
            d.codar();
            System.out.println("Bônus: " + d.calcularBonus());
            System.out.println(d);
            System.out.println("----------------------");
        }
    }
}