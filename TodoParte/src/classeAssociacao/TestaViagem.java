package classeAssociacao;

import java.time.LocalDateTime;

public class TestaViagem {
    public static void main(String[] args) {
        Passageiro p1 = new Passageiro("1234", "Fulano");
        LocalDateTime datavoo = LocalDateTime.of(2026, 7, 12, 10, 0);
        Voo voo1 = new Voo(999, "Congonhas", "BRB", datavoo);
        LocalDateTime dataAtual = LocalDateTime.now();
        Reserva reserva1 = new Reserva(1, 25, dataAtual, p1, voo1);
        System.out.println(reserva1.toString());
    }
}
