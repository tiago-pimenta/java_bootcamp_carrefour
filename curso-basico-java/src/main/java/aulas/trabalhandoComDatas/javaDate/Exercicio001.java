package aulas.trabalhandoComDatas.javaDate;

import java.util.Date;

public class Exercicio001 {


    public static void main(String[] args) {

        Date dataNascimento = new Date(397044000000L);
        Date dataVerificacao = new Date(1273460400000L);

        System.out.println(dataNascimento);
        System.out.println(dataVerificacao);

        int compareData = dataNascimento.compareTo(dataVerificacao);

        System.out.println(compareData);
    }

}
