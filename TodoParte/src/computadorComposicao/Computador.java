package computadorComposicao;

public class Computador {
    private int id;
    private String marca;
    private Processador processador;

    public Computador(int id, String marca, String marcaProc, String modeloProc, double freqProc) {
        this.id = id;
        this.marca = marca;
        this.processador = new Processador(marcaProc, modeloProc, freqProc);
    }

    @Override
    public String toString() {
        return "Computador: " + id +
                "\nMarca: " + marca +
                "\n" + processador;
    }
}
