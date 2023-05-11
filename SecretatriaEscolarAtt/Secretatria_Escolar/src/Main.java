import CRUD.Crud;
import java.util.*;
import Pessoas.construtor;
import Pessoas.Funcionario;

public class Main {
    public static void main(String[] args) {
        //VARIÁVEIS

        int opc=-1;
        boolean ou;
        Scanner input = new Scanner(System.in);
        Crud crud = new Crud();


        //ArrayList

        //INTERAÇÃO

        crud.IAinte();
        do{
            int chances=3;
            while ((opc != 0) && (opc != 1) && (opc != 2) && (opc != 3) && (opc != 4)){
                Crud.Userinte();
                opc = input.nextInt();
                if ((opc != 0) && (opc != 1) && (opc != 2) && (opc != 3) && (opc != 4)){
                    --chances;
                    System.out.println("Lara:  ***OPÇÃO INVÁLIDA!***\n--TENTE NOVAMENTE--");
                    if (chances == 0) {
                        opc = 0;
                    }
                    else {
                        continue;
                    }
                }

            }

        //CRUD
            switch (opc){
                case 1:
                    while (opc == 1) {
                        crud.cadastroProfessor();
                        opc = input.nextInt();
                        if (opc == 1){
                            continue;
                        }
                        if (opc == 2) {
                            break;
                        }
                    }
                case 2:
                        crud.opc2_buscar();
                        break;
                case 0:
                    do{
                        System.out.println("***Lara: \nVocê realmente deseja finalizar o programa?(0.Sim/1.Não)");
                        opc = input.nextInt();
                        if((opc != 0) || (opc != 1)){
                            System.out.println("***OPÇÃO INVÁLIDA!*** ");
                        }
                    }while((opc != 0) || (opc != 1));
                    break;
        }
        } while(opc != 0);
        System.out.print("--------------------------------------------------------\nLara: " +
                "\n Programa finalizado com Sucesso!" +
                "\n\n                                Até mais..." +
                "\n--------------------------------------------------------");
    }
}