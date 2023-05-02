package Meu_CRUD;
import java.util.*;
//Programa em java desenvolvido para o curso de ADS (POO)

class Funcionario{
    private int idFunc;
    private String nomeFunc, cargo;
    //private String cargo;
    private float salario;

    int contador=0;

    Funcionario(int idFunc, String nomeFunc, String cargo, float salario){
        this.idFunc= idFunc;
        this.nomeFunc= nomeFunc;
        this.cargo= cargo;
        this.salario= salario;
    }
    public int getIdFunc(){
        return idFunc;
    }
    public String getNomeFunc(){
        return nomeFunc;
    }
    private String getCargo(){
        return cargo;
    }
    private float getSalario(){
        return salario;
    }
    public String tostring(){
        return "Funcionário"+(contador++)+"\n--------------------------\n"+"\nMatrícula :n° "+idFunc+"\nNome: "+nomeFunc+"\nOcupação: "+cargo+"\nRemuneração: "+salario+"\n-------------------------------------\n";
    }

}

public class Sistema{
    public void Main(String[] args){
        Collection<Funcionario> func = new ArrayList<Funcionario>();
        Scanner ler= new Scanner(System.in);
        Scanner ler1= new Scanner(System.in);
        Scanner lerf= new Scanner(System.in);
        int opc, cont=0;

        do {
            System.out.print("\n  Menu:  \n  ----  \n1.Cadastrar");
            System.out.println("2.Cadastros");
            System.out.println("3.Busar");
            System.out.println("4.Atualizar");
            System.out.println("5.Excluir");
            System.out.println("0.Sair\n\nEscolha a opção que você deseja realizar");
            opc = ler.nextInt();
            switch (opc) {
                case 1:
                    cont++;
                    System.out.print("    --CADASTRO DE FUNCIONÁRIOS--\nFuncionário "+cont+":\nMatrícula: ");
                    int idFunc= ler1.nextInt();
                    System.out.println("Nome: ");
                    String nomeFunc= ler.nextLine();
                    System.out.println("Ocupação: ");
                    String cargo= ler.nextLine();
                    System.out.println("Salário: ");
                    float salario= lerf.nextFloat();

                    func.add(new Funcionario(idFunc, cargo, nomeFunc, salario));
                break;
                case 2:
                    System.out.println("  --LISTA DE FUNCIONÁRIOS--\n--------------------------\n"+func+"\n--------------------------\n");
                    //Interator<Funcionario>=
                break;
                case 3:
                    boolean achou = false;
                    System.out.println("Informe a matrícula para bucar: ");
                    idFunc= ler1.nextInt();
                    Iterator i= func.iterator();
                break;

            }
        }while(opc != 0);
    }
}
