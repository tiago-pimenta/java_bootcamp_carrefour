package br.com.tiagopimenta.classes.pessoa;

import br.com.tiagopimenta.classes.usuario.SuperUsuario;

public class Usuario extends SuperUsuario {

    public Usuario(final String login, final String senha) {
        super(login, senha);
    }
}
