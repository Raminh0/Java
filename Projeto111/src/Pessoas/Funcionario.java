package Pessoas;

public class Funcionario extends Construtor {
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

