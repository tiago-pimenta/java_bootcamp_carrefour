package br.com.tiagopimenta.stream;

import br.com.tiagopimenta.comparators.Estudante;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Exercicio {

    public static void main(String[] args) {

        // Crie uma lista

        List<ExercicioEstudante> estudantes = new ArrayList<>();

        // Adicione os dados

        estudantes.add(new ExercicioEstudante("Pedro", 19));
        estudantes.add(new ExercicioEstudante("Carlos", 23));
        estudantes.add(new ExercicioEstudante("Mariana", 21));
        estudantes.add(new ExercicioEstudante("João", 18));
        estudantes.add(new ExercicioEstudante("Thiago", 20));

        // Transfome cada estudante em uma string com atributos do objeto

        estudantes.stream().peek(System.out::println).collect(Collectors.toList());

        // Conte a quantidade de estudantes tem na coleção

        System.out.println("Contagem: " + estudantes.stream().count());

        // Filtre estudantes com idade igual ou superior a 18 anos

        System.out.println("Com idade igual ou maior a 18 anos: " + estudantes.stream().filter((estudante) -> estudante.getIdade() >= 18).collect(Collectors.toList()));

        // Exiba cada elemento no console

        System.out.println(estudantes);

        // Retorne estudantes com nome que possui a letra B

        System.out.println("Com a letra B no nome: " + estudantes.stream().filter((estudante) -> estudante.getNome().contains("B")).collect(Collectors.toList()));

        // Retorne se existe ao menos um estudante com a letra D

        System.out.println("Existe algum estudante com a letra D no nome? " + estudantes.stream().anyMatch((estudante) -> estudante.getNome().contains("D")));

        // Retorne o estudante mais velho (idade) e o mais novo também

        System.out.println("Mais velho: " + estudantes.stream().max(Comparator.comparingInt(ExercicioEstudante::getIdade)));
        System.out.println("Mais velho: " + estudantes.stream().min(Comparator.comparingInt(ExercicioEstudante::getIdade)));

    }

}
