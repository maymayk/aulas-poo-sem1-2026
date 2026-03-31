package sistemaDev;

public class Pleno extends Desenvolvedor{
    private int projetosEntregues;
    public Pleno(){
        super();
    }
    public Pleno(String nome, String linguagem, float salario, int projetosEntregues) {
        super(nome, linguagem, salario);
        this.projetosEntregues = projetosEntregues;
    }

    public int getProjetosEntregues() {
        return projetosEntregues;
    }

    public void setProjetosEntregues(int projetosEntregues) {
        this.projetosEntregues = projetosEntregues;
    }
    @Override
    public void codar(){
        System.out.println("sistemaDev.Pleno codando e realizando Code Review");
    }
    @Override
    public double calcularBonus(){
        return super.calcularBonus() + 500;
    }
    @Override
    public String toString(){
        return "sistemaDev.Pleno:\n" +
                super.toString() +
                "\nProjetos entregues: " + this.projetosEntregues;
    }
}
