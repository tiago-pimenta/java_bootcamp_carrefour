package br.com.tiagopimenta.comparators;

public class ExercicioAtletaComparable implements Comparable<ExercicioAtletaComparable> {

    private final String nome;
    private final Integer idade;

    public ExercicioAtletaComparable(String nome, Integer idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public Integer getIdade() {
        return idade;
    }

    @Override
    public String toString() {
        return nome + " - " + idade;
    }

    @Override
    public int compareTo(ExercicioAtletaComparable o) {
        return this.getIdade() - o.getIdade();
    }
}
