package br.com.tiagopimenta.queue;

import java.util.LinkedList;
import java.util.Queue;

public class Exercicio {

    public static void main(String[] args) {

        // Criar uma fila
        Queue<String> filaExercicio = new LinkedList<>();

        // Adicionar Juliana, Pedro, Carlos, Larissa e João

        filaExercicio.add("Juliana");
        filaExercicio.add("Pedro");
        filaExercicio.add("Carlos");
        filaExercicio.add("Larissa");
        filaExercicio.add("João");

        // Navegue na fila exibindo cada nome no console

        for (String loopFila: filaExercicio) {

            System.out.println(loopFila);

        }

        // Retorne o primeiro sem remove-lo

        String primeiroSemRemover = filaExercicio.peek();

        System.out.println(primeiroSemRemover);

        System.out.println(filaExercicio);

        // Retorne o primeiro removendo

        String primeiroRemovendo = filaExercicio.poll();

        System.out.println(primeiroRemovendo);

        System.out.println(filaExercicio);

        // Adicione Daniel e verifique a posição que ele assumiu na fila

        filaExercicio.add("Daniel");

        System.out.println(filaExercicio);

        // Retorne o tamanho da lista

        System.out.println(filaExercicio.size());

        // Verifique se a lista está vazia

        System.out.println(filaExercicio.isEmpty());

        // Verifique se o nome Carlos está na lista

        System.out.println(filaExercicio.contains("Carlos"));

    }

}
