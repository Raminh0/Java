package CRUD;
import Pessoas.Funcionario;
import Pessoas.PESSOA;

import java.util.ArrayList;
import java.util.*;
public class Crud{
    Funcionario pessoa; //= new Funcionario();
    //Construtor interagir = new Construtor();
    ArrayList<Funcionario> dados = new ArrayList<Funcionario>();
    ArrayList<Funcionario> lixo = new ArrayList<Funcionario>();
    //dados contadorFunc = dados.get(i);
    int i;
    String continuar;
    Scanner leia = new Scanner(System.in);
    public String IAinte() {
        Scanner input = new Scanner(System.in);
        String nome1Usuario, nomeLoc;

        //for(int i=0; i < ola;i++){}

        System.out.println("\n\n* * * * * *   * * * * *  ***             Iniciando...            *** * * * * * *   * * * * *");
        intervalo(1000);
        intervaloP("-Olá!", " Meu", " nome", " é"," Lara"," e"," estou"," aqui"," para"," acompanhar"," você"," durante"," a"," utilização"," do"," nosso"," sistema!"," :)");
        intervalo(500);
        System.out.print("\n-----------------------------------------------------------\n" +
                "Primeiro,eu gostaria de saber como se chama?\n  Nome: ");
        nome1Usuario = input.next();
        System.out.println("\n-----------------------------------------------------------");
        nome1Usuario = nome1Usuario.substring(0, 1).toUpperCase() + nome1Usuario.substring(1);
        System.out.println("\n\n");
        intervaloP("       ***","        ***","      ***","       ***");
        intervaloP("\n\n----------------------------------------------------------------------\n",
                "Olá, ", nome1Usuario+"!","\n Seja", " muito", " bem", " vindo(a)",
                " ao", " Sistema ", " de"," Secretaria", " Escolar"," (SSE)!\n\n");

        intervaloP("*","*","*", "   **\n\n",
                "Ah!", " Uma", " curiosidade", " sobre", " mim,", " sempre", " que", " ver", " o",
                " (***)", " significa", " que ", "\nestou"," processando"," os",
                " dados...\n----------------------------------------------------------------------\n",
                "\n***   ", "***   ", "***   ", "***   ","*","*","*   \n ");

        System.out.print("\n--------------------------------------------------------------\n " +
                "  Lara:\n" +
                "Logo abaixo mostrarei as opções do menu para elaboração do seu \nsistema," +
                " mas antes disso, preciso que dê " +
                "um nome para o seu SSE.\n" +
                "  Nome: ");
        nomeLoc = input.next();
        intervaloP("      ***","         ***","             ***","             ***\n\n"+
                "--------------------------------------------------------------" +
                "\n      OK!"," Seu"," SSE ",nomeLoc," foi"," criado"," com"," sucesso!" +
                "\n--------------------------------------------------------------");
                intervaloP("\n    ***","    ***","    ***","    ***"+
                           "\n            Carregando",".",".",".\n\n");
        intervalo(3000);
        return "_________________________SSE: " + nomeLoc + "________________________" +
                "               \nAdministrador: " + nome1Usuario;
    }

    public static void Userinte() {

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
        Scanner leia = new Scanner(System.in);

        pessoa = new Funcionario();

        System.out.println("* * * * * *   * * * * *  *** <- LARA -> *** * * * * * *   * * * * *");
        System.out.println("\n\n          --------------------------------------------");
        System.out.println("   *      |        Registro de um novo cadastro      |     * ");
        System.out.println("          --------------------------------------------");
        System.out.println("------------------------------------------------------------------------" +
                "\n     Preencha os campos abaixo com as informações do professor" +
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
        System.out.println("Sexo: (M/F)");
        char sexo = leia.next().charAt(0);
        pessoa.setSexo(sexo);
        System.out.println("E-mail:");
        String email = leia.next();
        pessoa.setEmail(email);
        //System.out.println("Data de Nascimento:");
        //Date data_nasc = leia.next();
        dados.add(pessoa);
        System.out.print("-----------------------------------------------------------\n" +
                         "  Lara:\n     Pronto! Professor cadastrado com sucesso!\n");
        System.out.println("-----------------------------------------------------------");
        //System.out.println("Digite qualquer número para continuar :)");
        //continuar = leia.next();
    }


    public void opc2_buscar() {
        int cont=0;
        System.out.println("* * * * * *   * * * * *  *** <- LARA -> *** * * * * * *   * * * * *");
        System.out.println("\n\n          --------------------------------------------");
        System.out.println("   *      |                  Registros               |     * ");
        System.out.println("          --------------------------------------------");
        System.out.println("------------------------------------------------------------------------" +
                "\n     Irei te mostrar todos os registros de Professores cadastrados" +
                "\n-------------------------------------------------------------------------\n");
        for (int i = 0; i < dados.size(); i++) {
            //System.out.println(dados.toString());
            cont++;
            System.out.print("\nNome: " + dados.get(i).getNome() + "\nMatricula: " + dados.get(i).getMatricula() + "\nCargo: " + dados.get(i).getCargo() + "\nSexo: " + dados.get(i).getSexo() + "\nEmail: " + dados.get(i).getEmail() + "\n\n");
        }
        if (cont == 0){
            System.out.println("----------------------------------------------\nNenhum registros foi encontrado!" +
                    "\n     Você precisa registrar o professor." +
                    "\n----------------------------------------------");
        }else if(cont == 1){
            System.out.println("----------------------------------------------\n" +
                    "Lara:\n    "+cont+" Registro foi encontrado.\\n\\n" +
                    "\n----------------------------------------------");
        }else{
            System.out.println("----------------------------------------------\n" +
                    "Lara:\n    "+cont+" Registros foram encontrados." +
                    "\n----------------------------------------------");
        }
        System.out.println("Informe 0 para voltar ao menu.)");
        continuar = leia.next();
    }


    public String opc3_alterar() {
        Funcionario alterar = new Funcionario();
        Scanner leia = new Scanner(System.in);
        boolean seguir = false;
        int cont=0;
        System.out.println("* * * * * *   * * * * *  *** <- LARA -> *** * * * * * *   * * * * *");
        System.out.println("\n\n          --------------------------------------------");
        System.out.println("    *     |         Alteração  de  Cadastrados:      |     * ");
        System.out.println("          --------------------------------------------");
        System.out.println("------------------------------------------------------------------------------\n" +
                "     Aqui você pode alterar o registro de um professor cadastrado! :D\n" +
                "------------------------------------------------------------------------------");
        //do {
            System.out.println("\n        Registros:\n==================================");
            for (i = 0; i < dados.size(); i++) {
                System.out.println("\n Nome: " + dados.get(i).getNome() +
                                "\n Matricula: " + dados.get(i).getMatricula());
                cont++;
            }
        if (cont == 0) {
            intervaloP("-----------------------------------------------------------" +
                    "\n Lara:", "\n  Matrícula" ,  " não", " encontrada.\n");
            return "0";
        }
            System.out.println("===================FIM================\n");
        System.out.println("Informe a matrícula do professor que deseja alterar.");
            String idMatricula = leia.next();
            for (i = 0; i < dados.size(); i++) {
                if (idMatricula.equals(dados.get(i).getMatricula())) {
                    System.out.println("Ok! Vamos alterar o cadastro de " + dados.get(i).getNome());
                    System.out.println("Nome:");
                    String nome = leia.next();
                    dados.get(i).setNome(nome);
                    System.out.println("Matrícula:");
                    String matricula = leia.next();
                    dados.get(i).setMatricula(matricula);
                    System.out.println("Cargo:");
                    String cargo = leia.next();
                    dados.get(i).setCargo(cargo);
                    System.out.println("Sexo:");
                    char sexo = leia.next().charAt(0);
                    dados.get(i).setSexo(sexo);
                    System.out.println("Email:");
                    String email = leia.next();
                    dados.get(i).setEmail(email);
                    intervaloP("-----------------------------------------------------------" ,

                            "\n    Lara:\n" , " O"," registro", " foi"," alterado" , " com" , " sucesso!\n", "-----------------------------------------------------------\n");
                    //seguir = true;
                }
            }
        return "";
    }

    public String opc4_deletar() {
        Scanner input = new Scanner(System.in);
        int qtd = 0, esse;
        System.out.println("* * * * * *   * * * * *  *** <- LARA -> *** * * * * * *   * * * * *");
        System.out.println("\n\n          --------------------------------------------");
        System.out.println("   *      |           Exclusão de Registro          |      *");
        System.out.println("          --------------------------------------------");
        System.out.println("-------------------------------------------------------------" +
                "\n     Aqui você vai excluir um registro do cadastro" +
                "\n-------------------------------------------------------------" +
                "\n\n                     " +
                "Cadastrados:\n" +
                "=============================================================");
        //Mostrando a lista de cadstro__________________________________________________________________________________
        for (int i = 0; i < dados.size(); i++) {
            qtd++;
            System.out.printf("Registro %d", qtd);
            System.out.println("\n Nome: " + dados.get(i).getNome() +
                    "\n Matricula: " + dados.get(i).getMatricula() +
                    "\n Cargo: " + dados.get(i).getCargo()+
                    "\n-------------------------------------------------------------");

        }
        System.out.println("========================== FIM ===============================");
        //Fim da lista de cadstro__________________________________________________________________________________

        //Verificando a lista______________________________________________________________________________________
        if(qtd < 1) {
            intervaloP("               ***"," ***"," ***\n",
                    "----------------------------------------------------------" +
                    "\n Lara:\n           Não há registro no cadastro!" +
                    "\n  Você precisa registrar o professor no cadastro primeiro." +
                    "\n----------------------------------------------------------\n");
            return "0";
        }
        //Acabou a Verificação______________________________________________________________________________________

        //Excluindo_________________________________________________________________________________________________
        System.out.println("\nInforme o número do resgistro do funcionário para exclusão:  ");
        esse = input.nextInt();
        esse = esse-1;
        qtd--;
        System.out.println("Qtd. Registro: "+ qtd);

        for (int i = 0; i < dados.size(); i++) {

                try {
                    if (i == esse){
                        dados.remove(i);
                    }
                } catch (IndexOutOfBoundsException e) {
                    System.out.printf("\nErro: posição inválida (%s).",
                            e.getMessage());
                }
            //}else{


        }
        return "1";

    }//Excluido!(Fim do método)_________________________________________________________________________________________________
    
    public int Sair(int opc) {
        int opcM = -1;
        int cont = 2;
        while ((cont < 0) || (cont > 1)){
            Scanner input = new Scanner(System.in);
            int fim;
            System.out.println("* * * * * *   * * * * *  *** <- LARA -> *** * * * * * *   * * * * *");
            System.out.println("\n\n-----------------------------------------------------------\n" +
                    "\nDeseja realmente finalizar o programa?(0.Sim/1.Não)\n----------------------------------------------------------- ");
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
    public void intervalo(int a){
        try{Thread.sleep(a); } catch (Exception erro){}
    }
    public void intervaloP(String ... palavra){
        int tempo=200;
        for (String n : palavra) {
            System.out.print(n);
            intervalo(tempo);
        }
    }
}
