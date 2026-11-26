package Controller;

import Model.Projetor;
import Service.CadastroUsuario;

public class ControladorProfessor extends ControladorUsuario {
    private Repositorio repositorio;
    private Professor professor;

    public ControladorProfessor(Repositorio repositorio, Professor professor) {
        super(repositorio, professor);
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