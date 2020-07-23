package aulas.trabalhandoComDatas.javaLocalDate;

import java.time.LocalDateTime;

public class Exercicio {

    public static void main(String[] args) {

        //LocalDateTime momento = LocalDateTime.of(2020-05-15, 10:00:00.000);
        LocalDateTime momento = LocalDateTime.of(2010,05,15,10,00,00);

        System.out.println(momento);
        // 010-05-15T10:00

        LocalDateTime futuro = momento.plusYears(4).plusMonths(6).plusHours(13);

        System.out.println(futuro);
        // 2014-11-15T23:00

    }

}
