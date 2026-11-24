import Repository.Repositorio;
import Service.CadastroUsuario;
import java.util.*;

public class Aplicacao {
   public static void main(String[] args) {

      Scanner input = new Scanner(System.in);

      Repositorio repositorio = Repositorio.getInstancia();
      CadastroUsuario c3 = new CadastroUsuario(repositorio);









      input.close();


   }
}
