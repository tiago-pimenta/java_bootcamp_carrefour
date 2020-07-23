package br.com.tiagopimenta.set;

import java.util.HashSet;
import java.util.Set;

public class Exercicio {

    public static void main(String[] args) {

        // Crie um set

        Set<Integer> numeros = new HashSet<>();

        // Adicione 5 numeros inteiros: 3, 88, 20, 44, 3

        numeros.add(3);
        numeros.add(88);
        numeros.add(20);
        numeros.add(44);
        numeros.add(3);

        // Navegue no Set exibindo cada numero

        System.out.println(numeros);

        // Remova o primeiro item

        numeros.remove(3);

        // Adicione um novo numero: 23

        numeros.add(23);

        // Verifique o tamanho do set

        System.out.println(numeros.size());

        // Verifique se o set está vazio

        System.out.println(numeros.isEmpty());

    }

}
