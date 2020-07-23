package br.com.tiagopimenta.comparators;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Exercicio {

    public static void main(String[] args) {

        // Crie uma lista

        List<ExercicioAtletaComparable> atletas = new ArrayList<>();

        //Adicione elementos nessa lista

        atletas.add(new ExercicioAtletaComparable("Paulo", 18));
        atletas.add(new ExercicioAtletaComparable("João", 19));
        atletas.add(new ExercicioAtletaComparable("Tiago", 20));
        atletas.add(new ExercicioAtletaComparable("José", 21));
        atletas.add(new ExercicioAtletaComparable("Fulano", 22));

        // Ordene implementando a interface Comparator

        Collections.sort(atletas, new ExercicioAtletaComparator());
        System.out.println(atletas);

        // Ordene implementando um novo objeto com a interface Comparable

        Collections.sort(atletas);
        System.out.println(atletas);

        // Ordene usando uma exmpressão lambda na chamada de .sort

        atletas.sort((first, second) -> first.getIdade() - second.getIdade());
        System.out.println(atletas);

    }

}
