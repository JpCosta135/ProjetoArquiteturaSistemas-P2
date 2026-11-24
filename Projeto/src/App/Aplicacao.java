import Controller.ControladorAtendente;
import Model.*;
import Repository.Repositorio;
import Service.CadastroUsuario;
import java.util.*;

public class Aplicacao {
   public static void main(String[] args) {

      Scanner input = new Scanner(System.in);
      Repositorio repositorio = Repositorio.getInstancia();
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


      input.close();


   }
}
