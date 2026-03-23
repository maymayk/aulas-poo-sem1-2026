package computadorComposicao;

public class TestaComputador {
    public class Main {
        public static void main(String[] args) {

            Computador pc = new Computador(
                    1,
                    "Dell",
                    "Intel",
                    "i5",
                    3.2
            );

            System.out.println(pc);
        }
    }
}
