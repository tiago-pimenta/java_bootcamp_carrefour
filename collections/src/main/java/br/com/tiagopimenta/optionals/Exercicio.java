package br.com.tiagopimenta.optionals;

import java.util.Optional;

public class Exercicio {

    public static void main(String[] args) {

        // Crie com estado vazio

        Optional<Integer> optionalVazio = Optional.empty();

        // Crie com estado presente

        Optional<Integer> optionalPresente = Optional.of(1);

        // Crie com estado null

        //Optional<String> optionalNull = Optional.of(null);

        // Se presente, exiba o valor no console

        optionalPresente.ifPresentOrElse(System.out::println, () -> System.out.println("optionalPresente não está presente"));

        // Se vazio, lançe uma exceção IlegalStateException

        Optional<String> optionalErro = Optional.empty();
        System.out.println(optionalErro.orElseThrow(IllegalStateException::new));

        // Se vazio, exiba "Optional vazio" no console

        optionalVazio.ifPresentOrElse(System.out::println, () -> System.out.println("optinalVazio não está presente"));

        // Se presente, transforme o valor exiba no console

        Optional<String> optionalString = Optional.of("String");
        optionalString.map((valor) -> valor.concat("***")).ifPresent(System.out::println);

        // Se presente, pegue o valor do optional e atribua em uma variavel

        if (optionalString.isPresent()) {

            String valor = optionalString.get();
            System.out.println(valor);

        }

        // Se presente, filtre o optional com uma determinada regra de negocio

        if (optionalPresente.isPresent()) {

            Integer valor = optionalPresente.get();
            System.out.println(valor * 0.1);

        }

    }

}
