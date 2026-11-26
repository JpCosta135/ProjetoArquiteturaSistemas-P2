package Controller;

import Repository.Repositorio;

public abstract class ControladorUsuario {
    private Repositorio repositorio;
    private Usuario usuario;

    public ControladorUsuario(Repositorio repositorio, Usuario usuario) {
        this.repositorio = repositorio;
        this.usuario = usuario;
    }


    public abstract void realizarAutenticacao(String senha);





}
