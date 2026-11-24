import Repository.Repositorio;
import Service.CadastroUsuario;
import java.util.*;

public class Aplicacao {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);

      Repositorio repositorio = Repositorio.getInstancia();
      CadastroUsuario c3 = new CadastroUsuario(repositorio);
      System.out.println("Digite 1 para efetuar login");
      System.out.println("Digite 2 para efetuar cadastro");
      byte opcao = input.nextByte();

      if (opcao == 1) {
         System.out.println("Informe sua matricula");
         int matricula = input.nextInt();
         System.out.println("Informe sua senha");
         String senha = input.next();

      } else if (opcao == 2) {

      }









      input.close();


   }
}
