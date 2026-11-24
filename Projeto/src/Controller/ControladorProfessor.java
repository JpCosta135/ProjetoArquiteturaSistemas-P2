package Controller;

import Model.Professor;
import Model.Projetor;
import Model.Usuario;
import Repository.Repositorio;
import Service.CadastroUsuario;

public class ControladorProfessor {
    private Repositorio repositorio;
    private Professor professor;

    public ControladorProfessor(Repositorio repositorio, Professor professor) {
        this.repositorio = repositorio;
        this.professor = professor;
    }

    public void realizarCadastro(byte tipo, String nome, int matricula, String senha, CadastroUsuario cadastro) {
        cadastro.efetuarCadastro(tipo,nome,matricula,senha);
    }

    public void realizarAutenticacao(String senha) {
        professor.autenticar(senha);
    }

    public void realizarPermutacao(Professor professor, Projetor projetor) {

            professor.permutarProjetor(professor);
            this.professor = professor;

    }














}