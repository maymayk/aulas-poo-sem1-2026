package projetoSoftware;

public class TestaSoftware {
    public class Main {
        public static void main(String[] args) {

            Programador p1 = new Programador(1, "Ana", "Java");
            Programador p2 = new Programador(2, "Carlos", "Python");

            Projeto projeto = new Projeto();
            projeto.setId(1);
            projeto.setNomeProjeto("Sistema Web");

            projeto.addProgramador(p1);
            projeto.addProgramador(p2);

            projeto.listarProgramadores();
        }
    }
}