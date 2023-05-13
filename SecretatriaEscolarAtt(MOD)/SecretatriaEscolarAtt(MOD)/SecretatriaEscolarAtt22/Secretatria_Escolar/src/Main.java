import CRUD.Crud;
import java.util.*;
import Pessoas.construtor;
import Pessoas.Funcionario;

public class Main {
    public static void main(String[] args) {
        //VARIÁVEIS

        int opcM=1;
        Scanner input = new Scanner(System.in);
        Crud crud = new Crud();


        //ArrayList

        //INTERAÇÃO

        crud.IAinte();
        while(opcM != 0){

            crud.Userinte();
            opcM = input.nextInt();
            if (opcM == 0){
                crud.Sair(0);
            }

            //CRUD
            switch (opcM){
                case -1:
                    System.out.println("\n\n\n\n\n");
                    break;
                case 0:
                    System.out.println("-----------------------------------------------------------------\nLara:\nOk! Foi um prazer te acompanhar!\nEspero que você também tenha " +
                            "gostado de interagir comigo.\n                          Até  mais! :p" +
                            "-----------------------------------------------------------------\n          ***Programa finalizado.");
                    break;
                case 1:
                    crud.cadastroProfessor();
                    break;
                case 2:
                    crud.opc2_buscar();
                    break;
                case 3:
                    crud.opc3_alterar();
                    break;
                case 4:
                    crud.opc4_deletar();
                default:
                    System.out.println("Opção Inválida!");
            }
        }
    }
}