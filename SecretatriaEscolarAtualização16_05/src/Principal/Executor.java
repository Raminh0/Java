package Principal;

import CRUD.Crud;

import java.util.*;

public class Executor {
    public static void main(String[] args) {

        //VARIÁVEIS
        int opcM=1, opcCad=1, opcAlt=1, opcDel=1, cont=0;
        Scanner input = new Scanner(System.in);
        Crud crud = new Crud();


        //ArrayList

        //INTERAÇÃO

        System.out.println(crud.IAinte());
        while(opcM != 0){
            crud.Userinte();
            opcM = input.nextInt();
            if (crud.Sair(0) != 0){
                opcM = -1;
            }

            //CRUD

            switch (opcM){
                case -1:
                    System.out.println("\n\n\n\n\n");
                    break;
                case 0:
                    crud.intervaloP
                    ("-----------------------------------------------------------------" +
                            "\n Lara:","\n   Ok!"," Foi"," um"," prazer"," te"," acompanhar!","\nEspero",
                            " que"," você"," também"," tenha",
                            " gostado"," de"," interagir,", " comigo.\n",
                            "                          Até"," mais!"," :p" +
                            "\n-----------------------------------------------------------------\n" +
                                    "          ***Programa finalizado.");
                    crud.intervalo(200);
                    break;
                case 1:
                    while(true) {
                        crud.cadastroProfessor();
                        cont++;
                        if (cont == 1){
                            System.out.println("      "+cont+" Registro no cadastro\n\n");
                        }else{
                            System.out.println("      "+cont+" Registros no cadastro\n\n");
                        }
                        System.out.println("Deseja realizar um novo registro?(1.Sim/0.Não)" +
                                "\n-----------------------------------------------------");
                        opcCad = input.nextInt();
                        if (opcCad ==0){
                            break;
                        }else{
                            continue;
                        }
                    }
                    break;
                case 2:
                    crud.opc2_buscar();
                    break;
                case 3:
                    while(crud.opc3_alterar()!="0") {
                        System.out.println("    Deseja alterar outro registro?(1.Sim/0.Não)" +
                                "\n-----------------------------------------------------");
                        opcAlt = input.nextInt();
                        if (opcAlt ==0){
                            break;
                        }else{
                            continue;
                        }
                    }
                    break;
                case 4:
                    while(crud.opc4_deletar() != "0"){
                        cont--;
                        if (cont > 1) {
                            System.out.println("-----------------------------------------------------\n" +
                                    " Lara:\n     " + cont + "  Registros.");
                        } else if (cont == 1) {
                            System.out.println("-----------------------------------------------------\n" +
                                    " Lara:\n   " + cont + "  Registros." );
                        }
                        System.out.println("    Deseja excluir mais um registro?(1.Sim/0.Não)" +
                                           "\n-----------------------------------------------------");
                        opcDel = input.nextInt();
                        if (opcDel ==0){
                            break;
                        }else{
                            continue;
                        }
                    }
                    break;
                case 5:

                    break;
                default:
                    System.out.println("***          ***         ***" +
                            "-----------------------------------" +
                            "\n  Lara:\n    OPÇÃO INVÁLIDA!" +
                            "\n-----------------------------------\n");
                    crud.intervalo(300);
                    break;
            }
        }
    }
}