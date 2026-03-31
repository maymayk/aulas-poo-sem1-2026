package sistemaNotificacoes;

public class CanalNotificacao {
    protected String destinatario;
    protected String mensagem;

    public CanalNotificacao() {
    }

    public CanalNotificacao(String destinatario, String mensagem) {
        this.destinatario = destinatario;
        this.mensagem = mensagem;
    }
    public void exibirDados(){
        System.out.println(destinatario);
        System.out.println(mensagem);
    }

    public void enviar() {
    }
}
