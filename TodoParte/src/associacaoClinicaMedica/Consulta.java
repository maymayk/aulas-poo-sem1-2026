package associacaoClinicaMedica;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Consulta {
    private LocalDateTime dataDaConsulta;
    private float valorDaConsulta;
    private Medico medico;
    private Paciente paciente;

    public Consulta() {
    }

    public Consulta(LocalDateTime dataDaConsulta, float valorDaConsulta, Medico medico, Paciente paciente) {
        this.dataDaConsulta = dataDaConsulta;
        this.valorDaConsulta = valorDaConsulta;
        this.medico = medico;
        this.paciente = paciente;
    }

    public LocalDateTime getDataDaConsulta() {
        return dataDaConsulta;
    }

    public void setDataDaConsulta(LocalDateTime dataDaConsulta) {
        this.dataDaConsulta = dataDaConsulta;
    }

    public float getValorDaConsulta() {
        return valorDaConsulta;
    }

    public void setValorDaConsulta(float valorDaConsulta) {
        this.valorDaConsulta = valorDaConsulta;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    @Override
    public String toString() {
        DateTimeFormatter formatoBR = DateTimeFormatter.ofPattern("dd/MM/yyyy 'às' HH:mm");
        return "Informações da consulta médica agendada:\n" +
                "Data: " + dataDaConsulta.format(formatoBR) +
                "\nValor da consulta: R$ " + valorDaConsulta +
                "\n" + medico + "\n" + paciente;
    }
}
