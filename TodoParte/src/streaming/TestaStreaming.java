package streaming;

public class TestaStreaming {
    public static void main(String[] args) {

        Streaming perfil = new Streaming("Maria", "Premium");

        perfil.assistirFilme("Interestelar");
        System.out.println(perfil);

        perfil.cancelarAssinatura();

        perfil.assistirFilme("Matrix");
        System.out.println(perfil);
    }
}
