package aulas.oo.part02.construtores.exemplo003;

public class ExemploInstanciaObjeto {

    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa("Marco");

        System.out.println(pessoa.getNome());

        Carro carro = new Carro("GM", "Astra", 2011);

        carro.setVariante("Tiago");

        System.out.println(carro.getMarca());
        System.out.println(carro.getModelo());
        System.out.println(carro.getAno());
        System.out.println(carro.getVariante());

    }

}
