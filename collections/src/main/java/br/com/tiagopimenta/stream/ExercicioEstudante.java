package br.com.tiagopimenta.stream;

public class ExercicioEstudante implements Comparable<ExercicioEstudante> {

    private final String nome;
    private final Integer idade;

    public ExercicioEstudante(String nome, Integer idade) {
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
    public int compareTo(ExercicioEstudante o) {
        return this.getIdade() - o.getIdade();
    }
}
