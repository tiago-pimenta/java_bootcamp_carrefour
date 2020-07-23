package aulas.oo.part01.paradigma.exemplo001;

public class ExemploMetodos {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();

        System.out.println(pessoa.falarMeuProprioNome());
        // Olá, meu nome é Marco

        System.out.println(pessoa.andar());

        Carro carro = new Carro();

        System.out.println(carro.getModelo());
        System.out.println(carro.totalPassageiros());
        System.out.println(carro.entrar());
        System.out.println(carro.sair());

    }
}
