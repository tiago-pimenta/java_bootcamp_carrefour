package br.com.tiagopimenta.comparators;

import java.util.Comparator;

public class ExercicioAtletaComparator implements Comparator<ExercicioAtletaComparable> {

    @Override
    public int compare(ExercicioAtletaComparable o1, ExercicioAtletaComparable o2) {
        return o1.getIdade() - o2.getIdade();
    }
}
