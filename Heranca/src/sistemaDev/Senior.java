package sistemaDev;

public class Senior extends Desenvolvedor{
    private float verbaLideranca;

    public Senior() {
        super();
    }
    public Senior(String nome, String linguagem, float salario, float verbaLideranca) {
        super(nome, linguagem, salario);
        this.verbaLideranca = verbaLideranca;
    }

    public float getVerbaLideranca() {
        return verbaLideranca;
    }

    public void setVerbaLideranca(float verbaLideranca) {
        this.verbaLideranca = verbaLideranca;
    }
    @Override
    public void codar(){
        System.out.println("sistemaDev.Senior desenhando a arquitetura e orientando a equipe.");
    }
    @Override
    public double calcularBonus(){
        return super.calcularBonus() + this.salario * 0.15 + 1000;
    }
    @Override
    public String toString() {
        return "sistemaDev.Senior: " +
                super.toString() + "\nVerba Liderança: " + this.verbaLideranca;
    }
}
