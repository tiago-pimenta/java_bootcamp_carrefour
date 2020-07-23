package aulas.trabalhandoComDatas.javaCalendar;

import java.util.Calendar;

public class Exercicio {

    public static void main(String[] args) {

        Calendar agora = Calendar.getInstance();

        agora.add(Calendar.DATE, 10);
        System.out.println(agora.getTime());

        verificaFinalDeSemana(agora);

        System.out.println(agora.getTime());

    }

    public static Calendar verificaFinalDeSemana(Calendar data){

        /** Verifica se é Sábado ou Domingo */

        if (data.get(Calendar.DAY_OF_WEEK) == Calendar.SATURDAY) {

            data.add(Calendar.DATE, 2);

        }

        if (data.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY) {

            data.add(Calendar.DATE, 1);

        }

        return data;
    }

}
