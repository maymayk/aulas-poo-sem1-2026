package sistemaNotificacoes;

import java.util.ArrayList;

public class GerenciadorNotificacoes {

    public static void main(String[] args) {

        ArrayList<CanalNotificacao> lista = new ArrayList<>();

        lista.add(new Email("ana@email.com", "Reunião às 10h", "Aviso"));
        lista.add(new SMS("Carlos", "Seu código chegou", 119999999));
        lista.add(new WhatsApp("Maria", "Oi, tudo bem?", "visualizado"));

        for (CanalNotificacao c : lista) {
            c.enviar();
            System.out.println("---------------------");
        }
    }
}
