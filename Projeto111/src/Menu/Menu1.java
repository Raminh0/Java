package Menu;
import java.util.*;
public class Menu1 {
    public static void Main() {
        Scanner input = new Scanner(System.in);

        String nomeUsuario;
        int enter , numInteracao = 0;

        System.out.println("\n\nxxxxxxxxxxx----------xxxxxxxxxxx----------xxxxxxxxxxx----------xxxxxxxxxxx-x-x-x");
        System.out.println("Olá! meu nome é Lara, e irei guiar você durante a utilização do nosso sistema! :)");
        System.out.println("xxxxxxxxxxx----------xxxxxxxxxxx----------xxxxxxxxxxx----------xxxxxxxxxxx-x-x-x");
        System.out.printf("\n\nPrimeiro, preciso que informe seu nome: ");
        nomeUsuario = input.next();
        System.out.println("\n\n");
        System.out.println("-----------------------------  -----------------------------  --------");
        System.out.println("Olá " + nomeUsuario + "! seja muito bem vindo(a) ao sistema de secretaria escolar!");
        System.out.println("-----------------------------  -----------------------------  --------\n");
        System.out.println("Ah! uma curiosidade sobre mim, sempre que ver o '*', significa que estou processando os dados.\n");
        System.out.println("Irei apresentar a você as interações do nosso sistema logo abaixo. Aproveite!\n" +
                "Pressione qualquer tecla para prosseguir.");
        enter = input.nextInt();
        System.out.printf("\n1. Consultar Professores.\n" +
                "2. Cadastrar Professores.\n" +
                "3. Alterar Professores\n" +
                "4. Excluir Professores.\n" +
                "5.Sair\n");
        System.out.println("Agora, digite o número para a interação desejada.");
        numInteracao = input.nextInt();
    }
    }
}
