package BACK;

import java.time.LocalTime;

public class TimeDifference {
    private LocalTime horaEntrada = LocalTime.now();
    private LocalTime horaSaida = LocalTime.now();
    private int horaEntradaInt;
    private int minutoEntradaInt;
    private int horaSaidaInt;
    private int minutoSaidaInt;

    public void obterentrada() {
        horaEntradaInt = horaEntrada.getHour();
        minutoEntradaInt = horaEntrada.getMinute();
    }

    public void obtersaida() {
        horaSaidaInt = horaSaida.getHour();
        minutoSaidaInt = horaSaida.getMinute();
    }

    public void caucula() {
        int diferencaHoras = horaSaidaInt - horaEntradaInt;
        int diferencaMinutos = minutoSaidaInt - minutoEntradaInt;
        if (diferencaMinutos < 0) {
            diferencaHoras--;
            diferencaMinutos += 60;
        }

        float tempoTotal = diferencaHoras + (float) diferencaMinutos / 60;
        System.out.println("Tempo total: " + tempoTotal + " horas");
    }
}
