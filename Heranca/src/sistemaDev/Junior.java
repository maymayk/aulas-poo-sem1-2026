package sistemaDev;

public class Junior extends Desenvolvedor{
    private String mentor;

    public Junior(){
        super(); //chama o construtor do pai
    }
    public Junior(String nome, String linguagem, float salario, String mentor){
        super(nome,linguagem,salario);
        this.mentor = mentor;
    }
    public void setMentor(String mentor) {
        this.mentor = mentor;
    }
    public String getMentor() {
        return this.mentor;
    }
    @Override
    public void codar(){
        System.out.println("sistemaDev.Junior escrevendo código com apoio do mentor " + this.mentor);
    }
    @Override
    public String toString(){
        return "Júnior" + super.toString() + "\nMentor: " + this.mentor;
    }
}
