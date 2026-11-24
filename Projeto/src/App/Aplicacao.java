import Controller.ControladorAtendente;
import Controller.ControladorUsuario;
import Model.*;
import Repository.Repositorio;
import Service.CadastroUsuario;
import java.util.*;
public class Aplicacao {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);

      Repositorio repositorio = Repositorio.getInstancia();
      ControladorAtendente c1 = new ControladorAtendente(repositorio, (Atendente) repositorio.getUsuario(2345786));
      ControladorUsuario c2 = new ControladorUsuario(repositorio, repositorio.getUsuario(2097453));
      CadastroUsuario c3 = new CadastroUsuario(repositorio);
      c1.realizarEmprestimo((Professor) (repositorio.getUsuario(2097453)), repositorio.getProjetor("PAT-100235"));
      c2.realizarPermutacao((Professor) (repositorio.getUsuario(2234566)), repositorio.getProjetor("PAT-100235"));
      c1.realizarDevolucao((Professor) (repositorio.getUsuario(2234566)), repositorio.getProjetor("PAT-100235"));
      c2.realizarAutenticacao("ebt325"); // Instanciação dos objetos e operações básicas do sistema

      System.out.println("Digite 1 para cadastrar Professor");
      System.out.println("Digite 2 para cadastrar Atendente");
      byte opcao = input.nextByte();

      if (opcao == 1) {
         System.out.println("Digite o nome do professor: ");
         String nomeP = input.nextLine();
         System.out.println("Digite a matricula do professor: ");
         int matriculaP = input.nextInt();
         System.out.println("Digite a senha do professor: ");
         String senhaP = input.nextLine();
         c3.efetuarCadastro((byte) 1, nomeP, matriculaP, senhaP);
         System.out.println(c3.lerUsuario(1890298));
         c3.atualizarUsuario(1890298, "Armando Alves", 1890298, "3737hr");
         c3.removerUsuario(1890298);


      } else if (opcao == 2) {
         System.out.println("Digite o nome do atendente: ");
         String nomeA = input.nextLine();
         System.out.println("Digite a matricula do atendente: ");
         int matriculaA = input.nextInt();
         System.out.println("Digite a senha do atendente: ");
         String senhaA = input.nextLine();
         c3.efetuarCadastro((byte) 2, nomeA, matriculaA, senhaA);
         System.out.println(c3.lerUsuario(1943675));
         c3.atualizarUsuario(1943675, "Caio Ferreira", 1943675, "en3tb");
         c3.removerUsuario(1943675);



      }


      Projetor p1 = new Projetor("BenQ MS550", "PAT-100233", true);
      c1.realizarCadastroProjetor(p1);
      System.out.println(c1.lerProjetor("PAT-100233"));
      c1.atualizarProjetor("PAT-100233", "BenQ MS550", "PAT-100233", false);
      c1.removerProjetor("PAT-100233");


      input.close();


   }
}
