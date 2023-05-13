package CRUD;
import Pessoas.*;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.*;
public class Crud {
    Funcionario pessoa; //= new Funcionario();
    construtor interagir = new construtor();
    ArrayList<Funcionario> dados = new ArrayList<Funcionario>();
    //dados contadorFunc = dados.get(i);
    int i;

    public String IAinte() {
        Scanner input = new Scanner(System.in);
        String nome1Usuario;
        String nome2Usuario;
        String nomeLoc;

        System.out.println("\n****************  ****************   ***************  **************");
        System.out.println("-Olá, Mundo! \nMe chamo Lara e estou aqui para acompanhar você durante a utilização \ndo nosso programa! ;)");
        System.out.println("****************  ****************   ***************  **************");
        System.out.print("\n-----------------------------------------------------------\nLara:\n" +
                "Primeiro,eu gostaria de saber como se chama?\n  Nome: ");
        nome1Usuario = input.next();
        System.out.print("  Sobrenome: ");
        nome2Usuario = input.next();
        System.out.println("\n-----------------------------------------------------------");
        nome1Usuario = nome1Usuario.substring(0, 1).toUpperCase() + nome1Usuario.substring(1);
        nome2Usuario = nome2Usuario.substring(0, 1).toUpperCase() + nome2Usuario.substring(1);
        System.out.println("\n\n");
        System.out.print("*** *** *** *** ***");
        System.out.println("\n\n----------------------------------------------------------------------\n" +
                "Lara: \n Olá, " + nome1Usuario + " " + nome2Usuario + "!\n Seja muito bem vindo(a)" +
                " ao Sistema de Secretaria Escolar(SSE)!\n" +
                "----------------------------------------------------------------------\n");

        System.out.println("*** **----------------------------------------------------------------------\n" +
                "Lara:\nAh! Uma curiosidade sobre mim, sempre que ver o '***', significa que " +
                "\nestou processando os dados...\n----------------------------------------------------------------------\n" +
                "\n*** *** *** *** *** ");
        System.out.print("\n\n--------------------------------------------------------------\nLara:\n" +
                "Logo abaixo mostrarei as opções do menu para elaboração do seu \nsistema," +
                " mas antes disso, preciso que dê " +
                "um nome para o seu SSE.\n" +
                "  Nome: ");
        nomeLoc = input.next();
        System.out.println("*** *** *** *** ***\n\n\n\n" +
                "--------------------------------------------------------------\nLara:\nOK! Seu SSE " + nomeLoc +
                " foi criado com sucesso!\n--------------------------------------------------------------" +
                "\n*** *** *** *** ***\n");
        return "_________________________SSE: " + nomeLoc + "________________________" +
                "               \nAdministrador: " + nome1Usuario + " " + nome2Usuario;
    }

    public final static void Userinte() {

        Scanner input = new Scanner(System.in);

        System.out.print("          ----------\n" +
                         "          |  Menu  |\n" +
                         "          ----------\n" +
                         "1. Cadastrar Professores\n" +
                         "2. Buscar Cadastro de Professor\n" +
                         "3. Alterar Cadastro de Professor\n" +
                         "4. Excluir Cadastro de Professor\n" +
                         "\n0.Fechar Programa");
        System.out.println("\nAgora, digite o número da opção desejada: ");

    }

    public void cadastroProfessor() {
        int cont=0;
        Scanner leia = new Scanner(System.in);

        pessoa = new Funcionario();

        System.out.println("* * * * * *   * * * * *  *** <- LARA -> *** * * * * * *   * * * * *");
        System.out.println("          --------------------------------------------");
        System.out.println("   *      |        Registro de um novo cadastro      |     * ");
        System.out.println("          --------------------------------------------");
        System.out.println("------------------------------------------------------------------------" +
                "\nLara: \nPreencha os campos abaixo com as informações do professor" +
                "\n-------------------------------------------------------------------------\n");
        System.out.println("Nome: ");
        String nome = leia.nextLine();
        pessoa.setNome(nome);
        System.out.println("Matricula: ");
        String matricula = leia.nextLine();
        pessoa.setMatricula(matricula);
        System.out.println("Cargo: ");
        String cargo = leia.next();
        pessoa.setCargo(cargo);
        System.out.println("Sexo:");
        String sexo = leia.next();
        pessoa.setSexo(sexo);
        System.out.println("E-mail:");
        String email = leia.next();
        pessoa.setEmail(email);
        //System.out.println("Data de Nascimento:");
        //Date data_nasc = leia.next();
        dados.add(pessoa);
        cont++;
        System.out.print("-----------------------------------------------------------\n" +
                "Lara:\nPronto! Professor cadastrado com sucesso!\n" +
                "-----------------------------------------------------------");
        if (cont == 1){
            System.out.println("      "+cont+" Registro no cadastro\n\n");
        }else{
                System.out.println("      "+cont+" Registros no cadastro\n\n");
        }
    }


    public void opc2_buscar() {
        int cont=0;
        System.out.println("* * * * * *   * * * * *  *** <- LARA -> *** * * * * * *   * * * * *");
        System.out.println("          --------------------------------------------");
        System.out.println("   *      |                  Registros               |     * ");
        System.out.println("          --------------------------------------------");
        System.out.println("------------------------------------------------------------------------" +
                "\nLara: \nIrei te mostrar todos os registros de Professores cadastrados" +
                "\n-------------------------------------------------------------------------\n");
        //System.out.println("\n * \n * \n *\n");
        //System.out.println("\n\nxxxxxxxxxxx----------xxxxxxxxxxx----------xxxxxxxxxxx----------xxxxxxxxxxx-x-x-x");
        for (int i = 0; i < dados.size(); i++) {
            //System.out.println(dados.toString());
            cont++;
            System.out.print("\nNome: " + dados.get(i).getNome() + "\nMatricula: " + dados.get(i).getMatricula() + "\nCargo: " + dados.get(i).getCargo() + "\nSexo: " + dados.get(i).getSexo() + "\nEmail: " + dados.get(i).getEmail() + "\n\n");
        }
        if (cont == 0){
            System.out.println("----------------------------------------------\nLara:\nNenhum registros foi encontrado!" +
                    "\nVocê precisa registrar o professor." +
                    "\n----------------------------------------------");
        }else if(cont == 1){
            System.out.println("----------------------------------------------\nLara:\n" +
                    ""+cont+" Registro foi encontrado.\\n\\n" +
                    "\n----------------------------------------------");
        }else{
            System.out.println("----------------------------------------------\nLara:\n" +
                    ""+cont+" Registros foram encontrados.\\n\\n" +
                    "\n----------------------------------------------");
        }
    }


    public void opc3_alterar() {

        Funcionario alter = new Funcionario();
        Scanner leia = new Scanner(System.in);
        int cont=0;

        System.out.println("* * * * * *   * * * * *  *** <- LARA -> *** * * * * * *   * * * * *");
        System.out.println("          --------------------------------------------");
        System.out.println("    *     |         Alteração  de  Cadastrados:      |     * ");
        System.out.println("          --------------------------------------------");
        System.out.println("------------------------------------------------------------------------------\n" +
                "Lara:\n Aqui você pode alterar o registro de um professor cadastrado! :D\n" +
                "------------------------------------------------------------------------------");
        System.out.println("*** *** *** *** ***\nInforme a matrícula do Professor que deseja alterar.");
        String nome = leia.next();
        for (int i = 0; i < dados.size(); i++) {

            if (nome.equals(pessoa.getMatricula())) {
                //System.out.println("sos");
                cont++;
                System.out.println("Ok! Vamos alterar o cadastro de: " + dados.get(i).getNome());
                System.out.println("Nome: ");
                nome = leia.next();
                pessoa.setNome(nome);
                System.out.println("Matricula: ");
                String matricula = leia.next();
                pessoa.setMatricula(matricula);
                System.out.println("Cargo: ");
                String cargo = leia.next();
                pessoa.setCargo(cargo);
                System.out.println("Sexo:");
                String sexo = leia.next();
                pessoa.setSexo(sexo);
                System.out.println("E-mail:");
                String email = leia.next();
                pessoa.setEmail(email);
            }
        }
        System.out.println("-----------------------------------------------------------" +
                "Lara:\n"+cont+ "Registros foram alterados\n-----------------------------------------------------------");
    }

    public String opc4_deletar() {
        Scanner input = new Scanner(System.in);
        int qtd = 0, esse;
        System.out.println("* * * * * *   * * * * *  *** <- LARA -> *** * * * * * *   * * * * *");
        System.out.println("          --------------------------------------------");
        System.out.println("   *      |           Excluisão de Registro          |      *");
        System.out.println("          --------------------------------------------");
        System.out.println("-------------------------------------------------------------" +
                "\nLara:\nAqui você vai excluir um registro do cadastro" +
                "\n-------------------------------------------------------------\n\nCadastrados:\n" +
                "=============================================================");
        for (int i = 0; i < dados.size(); i++) {
            qtd++;
            System.out.printf("Registro %d", qtd);
            System.out.println("\nNome: " + dados.get(i).getNome() + "\nMatricula: " + dados.get(i).getMatricula() +
                    "\nCargo: " + dados.get(i).getCargo()+" \n\n");
            System.out.println("\n\n-------------------------------------------------------------");
        }
        System.out.print("=============================================================");
        if (qtd > 1) {
            System.out.println("-----------------------------------------\nLara:\n" + qtd + " Registros." +
                    "-----------------------------------------\n\n");
        } else if (qtd == 1) {
            System.out.println("-----------------------------------------\n" + qtd + " Registros." +
                    "----------------------------------------\n\n");
        } else {
            System.out.println("----------------------------------------------\nLara:\nNão há registro no cadastro!" +
                    "\nVocê precisa registrar o professor no cadastro primeiro." +
                    "\n----------------------------------------------");
            return "";
        }
        System.out.println("\nInforme o número do resgistro do funcionário para exclusão:  ");
        esse = input.nextInt();
        qtd = dados.size();
        for (int i = 0; i < dados.size(); i++) {

                try {
                    dados.remove(i);
                } catch (IndexOutOfBoundsException e) {
                    System.out.printf("\nErro: posição inválida (%s).",
                            e.getMessage());
                }

        }
        return "";
    }

    public int Sair(int opc) {
        int opcM = 0;
        int cont = 2;
        while ((cont < 0) || (cont > 1)){
            Scanner input = new Scanner(System.in);
            int fim;
            System.out.println("-----------------------------------------------------------\n" +
                    "Lara:\nDeseja realmente finalizar o programa?(0.Sim/1.Não)\n----------------------------------------------------------- ");
            fim = input.nextInt();
            if (fim == 0){
                cont = 0;
                opcM = 0;

            } else if (fim == 1){
                cont = 1;
                opcM = -1;
            } else {
                System.out.println("Opção Inválida!");
            }
        }
    return opcM;}
}