package associacaoClinicaMedica;

import java.time.LocalDateTime;

public class TestaAgenda {
    public static void main(String[] args) {
        Medico med1 = new Medico("Alberto", 125, "clínico-geral");
        Paciente paci1 = new Paciente(206, "Maria da Silva", "123456");
        LocalDateTime dataConsulta = LocalDateTime.of(2026, 05, 20, 10, 0);
        Consulta consulta1 = new Consulta(dataConsulta, 45.90f, med1, paci1);

        System.out.println(consulta1.toString());

    }
}
