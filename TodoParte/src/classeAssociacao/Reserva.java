package classeAssociacao;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Reserva {
    private int idReserva, poltrona;
    private LocalDateTime dataReserva;
    private Passageiro passageiro;
    private Voo voo;

    public Reserva() {
    }

    public Reserva(int idReserva, int poltrona, LocalDateTime dataReserva, Passageiro passageiro, Voo voo) {
        this.idReserva = idReserva;
        this.poltrona = poltrona;
        this.dataReserva = dataReserva;
        this.passageiro = passageiro;
        this.voo = voo;
    }

    public int getIdReserva() {
        return idReserva;
    }

    public void setIdReserva(int idReserva) {
        this.idReserva = idReserva;
    }

    public int getPoltrona() {
        return poltrona;
    }

    public void setPoltrona(int poltrona) {
        this.poltrona = poltrona;
    }

    public LocalDateTime getDataReserva() {
        return dataReserva;
    }

    public void setDataReserva(LocalDateTime dataReserva) {
        this.dataReserva = dataReserva;
    }

    public Passageiro getPassageiro() {
        return passageiro;
    }

    public void setPassageiro(Passageiro passageiro) {
        this.passageiro = passageiro;
    }

    public Voo getVoo() {
        return voo;
    }

    public void setVoo(Voo voo) {
        this.voo = voo;
    }

    @Override
    public String toString() {
        DateTimeFormatter formatoBR = DateTimeFormatter.ofPattern("dd/MM/yyyy 'às' HH:mm");
        return "Reserva id " + idReserva +
                ": \nPoltrona: " + poltrona + " \nData da Reserva: " + dataReserva.format(formatoBR) +
                "\n" + passageiro + "\n" + voo;
    }
}
