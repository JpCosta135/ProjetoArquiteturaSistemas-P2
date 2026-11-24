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

      System.out.println("Selecione opção do menu");
      System.out.println("1 - realizar empréstimo");
      System.out.println("2 - realizar permutação");
      System.out.println("3 - realizar devolução");
      System.out.println("4 - realizar autenticação");
      System.out.println("5 - menu usuário");
      System.out.println("6 - menu projetor ");

       byte opcao = input.nextByte();
      switch (opcao) {
         case 1:

         case 2:

         case 3:

         case 4:

         case 5:


         case 6:

       }


      c1.realizarEmprestimo((Professor) (repositorio.getUsuario(2097453)), repositorio.getProjetor("PAT-100235"));
      c2.realizarPermutacao((Professor) (repositorio.getUsuario(2234566)), repositorio.getProjetor("PAT-100235"));
      c1.realizarDevolucao((Professor) (repositorio.getUsuario(2234566)), repositorio.getProjetor("PAT-100235"));
      c2.realizarAutenticacao("ebt325");


      System.out.println("Digite 1 para cadastrar Professor");
      System.out.println("Digite 2 para cadastrar Atendente");
      byte tipo = input.nextByte();

      if (tipo == 1) {
         System.out.println("Digite o nome do professor: ");
         String nomeP = input.nextLine();
         System.out.println("Digite a matricula do professor: ");
         int matriculaP = input.nextInt();
         System.out.println("Digite a senha do professor: ");
         String senhaP = input.nextLine();
         c3.efetuarCadastro((byte) 1, nomeP, matriculaP, senhaP);
      } else if (tipo == 2) {
         System.out.println("Digite o nome do atendente: ");
         String nomeA = input.nextLine();
         System.out.println("Digite a matricula do atendente: ");
         int matriculaA = input.nextInt();
         System.out.println("Digite a senha do atendente: ");
         String senhaA = input.nextLine();
         c3.efetuarCadastro((byte) 2, nomeA, matriculaA, senhaA);
      }

      System.out.println(c3.lerUsuario(1890298));
      c3.atualizarUsuario(1890298, "Armando Alves", 1890298, "3737hr");
      c3.removerUsuario(1890298);
      System.out.println(c3.lerUsuario(1943675));
      c3.atualizarUsuario(1943675, "Caio Ferreira", 1943675, "en3tb");
      c3.removerUsuario(1943675);

      Projetor p1 = new Projetor("BenQ MS550", "PAT-100233", true);
      c1.realizarCadastroProjetor(p1);
      System.out.println(c1.lerProjetor("PAT-100233"));
      c1.atualizarProjetor("PAT-100233", "BenQ MS550", "PAT-100233", false);
      c1.removerProjetor("PAT-100233");


      input.close();


   }
}
