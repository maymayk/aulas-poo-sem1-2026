package streaming;

public class Streaming {

    private String usuario;
    private String plano;
    private float mensalidade;
    private boolean ativo;
    private String ultimoFilmeAssistido;

    // Construtor
    public Streaming(String usuario, String plano) {
        this.usuario = usuario;
        this.plano = plano;

        // Definindo mensalidade com base no plano
        if (plano.equalsIgnoreCase("Básico")) {
            this.mensalidade = 25.90f;
        } else if (plano.equalsIgnoreCase("Premium")) {
            this.mensalidade = 45.90f;
        } else if (plano.equalsIgnoreCase("Família")) {
            this.mensalidade = 60.90f;
        } else {
            System.out.println("Plano inválido! Definindo como Básico.");
            this.plano = "Básico";
            this.mensalidade = 25.90f;
        }

        this.ativo = true;
        this.ultimoFilmeAssistido = "";
    }

    // Método para assistir filme
    public void assistirFilme(String nomeFilme) {
        if (ativo) {
            this.ultimoFilmeAssistido = nomeFilme;
            System.out.println("Assistindo: " + nomeFilme);
        } else {
            System.out.println("Conta suspensa! Pague a fatura para assistir.");
        }
    }

    // Cancelar assinatura
    public void cancelarAssinatura() {
        this.ativo = false;
    }

    // toString
    @Override
    public String toString() {
        String status = ativo ? "Ativo" : "Suspenso";

        return "Usuário: " + usuario +
                "\nPlano: " + plano +
                "\nMensalidade: R$" + mensalidade +
                "\nStatus: " + status +
                "\nÚltimo filme assistido: " + ultimoFilmeAssistido;
    }
}