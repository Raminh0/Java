package CRUD;
import Pessoas.*;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.util.*;
public class Crud {
    Funcionario pessoa; //= new Funcionario();
    construtor interagir = new construtor();
    ArrayList<Funcionario> dados = new ArrayList<Funcionario>();
    //dados contadorFunc = dados.get(i);
    int i;

    public String IAinte() {
        Scanner input = new Scanner(System.in);
        String nomeUsuario1;
        String nomeUsuario2;
        String nomeLoc;

        System.out.println("\n****************  ****************   ***************  ****************");
        System.out.println("-Olá, Mundo! \nMe chamo Lara e estou aqui para acompanhar você durante a utilização \ndo nosso programa! ;)");
        System.out.println("****************  ****************   ***************  ****************");
        System.out.printf("\nPrimeiro, gostaria de saber como se chama \n  Nome: ");
        nomeUsuario1 = input.next();
        nomeUsuario1= nomeUsuario1.substring(0, 1).toUpperCase() + nomeUsuario1.substring(1);
        System.out.printf("  Sobrenome: ");
        nomeUsuario2 = input.next();
        nomeUsuario2= nomeUsuario2.substring(0, 1).toUpperCase() + nomeUsuario2.substring(1);
        System.out.println("\n\n");
        System.out.println("****************  ****************   ***************  ****************");
        System.out.println("Lara: \n Olá, " + nomeUsuario1 +" "+ nomeUsuario2 +  "!\n Seja muito bem vindo(a)" +
                " ao Sistema de Secretaria Escolar(SSE)!");
        System.out.println("****************  ****************   ***************  ****************");
        System.out.println("Ah! Uma curiosidade sobre mim, sempre que ver o '***', significa que \nestou processando os dados...\n");
        System.out.print("Logo abaixo mostrarei as opções do menu para elaboração do seu sistema, mas antes preciso que crie" +
                " \num nome para o seu SSE.\n" +
                "  Nome: ");
        nomeLoc = input.next();
        System.out.println("****************  ****************   ***************  ****************" +
                "    Laura: OK! Seu SSE "+ nomeLoc +" foi criado com sucesso!\n" +
                "****************  ****************   ***************  ****************\n\n\n\n");
    return "_________________________SSE: "+nomeLoc+"________________________" +
            "\nUsuario: "+nomeUsuario1+" "+nomeUsuario2+"\n";
    }

    public final static void Userinte() {

        Scanner input = new Scanner(System.in);

        System.out.printf("-- Menu --\n\n1. Cadastrar Professores\n" +
                "2. Buscar Cadastro de Professor\n" +
                "3. Alterar Cadastro de Professor\n" +
                "4. Excluir Cadastro de Professor\n" +
                "\n0.Fechar Programa");
        System.out.println("\nAgora, digite o número da opção desejada: ");
    }

    public void cadastroProfessor() {

        Scanner leia = new Scanner(System.in);

        pessoa = new Funcionario();

        System.out.println("xxxxxxxxxxx----------xxxxxxxxxxx---- <- LARA -> ----xxxxxxxxxxx----------xxxxxxxxxxx-x-x-x");
        System.out.println("Hora de Cadastrar um novo professor! Por favor, informe os dados: \n");
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
        System.out.println("Pronto! Professor cadastrado com sucesso.");
        System.out.println("1.Novo cadastro\n2.Ir para menu\n3.Sair do programa");
    }


    public void opc2_buscar() {

        System.out.println("xxxxxxxxxxx----------xxxxxxxxxxx---- <- LARA -> ----xxxxxxxxxxx----------xxxxxxxxxxx-x-x-x");
        System.out.println("Irei mostrar a você a lista dos Professores cadastrados:");
        System.out.println("\n * \n * \n *\n");
        System.out.println("\n\nxxxxxxxxxxx----------xxxxxxxxxxx----------xxxxxxxxxxx----------xxxxxxxxxxx-x-x-x");
        for(int i = 0; i < dados.size(); i++) {
            //System.out.println(dados.toString());
            //System.out.print("\n\n--------------------------------------------------------------------------------\n\n" + dados.get(i) + "\n\n--------------------------------------------------------------------------------\n\n");
            System.out.print("\nNome: " + dados.get(i).getNome() + "\nMatricula: " + dados.get(i).getMatricula() + "\nCargo: " + dados.get(i).getCargo() + "\nSexo: " + dados.get(i).getSexo() + "\nEmail: " + dados.get(i).getEmail() + "\n\n");
        }
        System.out.println("\n\nxxxxxxxxxxx----------xxxxxxxxxxx----------xxxxxxxxxxx----------xxxxxxxxxxx-x-x-x");
    }



    public void opc3_alterar(){

    }
    public void opc4_deletar(){
        int deletar;
        System.out.println("xxxxxxxxxxx----------xxxxxxxxxxx---- <- LARA -> ----xxxxxxxxxxx----------xxxxxxxxxxx-x-x-x");
        System.out.println("Irei mostrar a você a lista dos Professores cadastrados:");
        System.out.println("\n * \n * \n *\n");
        System.out.println("\n\nxxxxxxxxxxx----------xxxxxxxxxxx----------xxxxxxxxxxx----------xxxxxxxxxxx-x-x-x");
        for(int i = 0; i < dados.size(); i++) {
            //System.out.println(dados.toString());
            //System.out.print("\n\n--------------------------------------------------------------------------------\n\n" + dados.get(i) + "\n\n--------------------------------------------------------------------------------\n\n");
            System.out.print("\nNome: " + dados.get(i).getNome() + "\nMatricula: " + dados.get(i).getMatricula() + "\nCargo: " + dados.get(i).getCargo() + "\nSexo: " + dados.get(i).getSexo() + "\nEmail: " + dados.get(i).getEmail() + "\n\n");
        }
        System.out.println("\n\n--------------------------------------------------------------------------------");

    }

    //public void opc0_sair(){}
}