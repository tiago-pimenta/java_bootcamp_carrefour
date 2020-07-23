package br.com.tiagopimenta.classes.pessoa;

import br.com.tiagopimenta.classes.cliente.Cliente;

public class ProgramaDoCliente {

    public static void main(String[] args) {
        final var cliente = new Cliente(18);

        cliente.getIdade();

        cliente.getPeso();

        System.out.println(cliente.relatorio()); //OK
    }

}
