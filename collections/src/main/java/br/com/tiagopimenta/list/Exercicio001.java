package br.com.tiagopimenta.list;

import java.util.*;

public class Exercicio001 {

    public static void main(String[] args) {

        // Adicionar 5 nomes: Juliana, Pedro, Carlos, Larissa, João

        List<String> nomes = new ArrayList<>();

        nomes.add("Juliana");
        nomes.add("Pedro");
        nomes.add("Carlos");
        nomes.add("Larissa");
        nomes.add("João");

        // Navegue na lista exibindo cada nome no console

        for (String nomeDoItem: nomes){

            System.out.println(nomeDoItem);

        }

        // Substitua o nome Carlos por Roberto

        nomes.set(2, "Roberto");

        // Retorne o nome da posição 1

        String nome = nomes.get(1);

        System.out.println(nome);

        // Remova o nome da posição 4

        nomes.remove(4);

        // Remova o nome João

        nomes.remove("João");

        // Retorne a quantidade de itens na lista

        int tamanho = nomes.size();

        System.out.println(tamanho);

        // Verifique se o nome Juliano existe na lista

        boolean temJuliano = nomes.contains("Juliano");

        System.out.println(temJuliano);

        // Crie uma nova lista com os nomes Ismael e Rodrigo. Adicione todos os itens da nova lista na primeira.

        List<String> nomesNovos = new ArrayList<>();

        nomesNovos.add("Ismael");
        nomesNovos.add("Rodrigo");

        for (String nomeDosItensNovos: nomesNovos){

            nomes.add(nomeDosItensNovos);

        }

        // Ordene os itens da lista por ordem alfabética

        Collections.sort(nomes);

        // Verifique se a lista está vazia

        boolean listaVazia = nomes.isEmpty();

        System.out.println(listaVazia);

    }

}
