package Pessoas;

import java.util.Date;

public class Funcionario extends construtor {

    private String cargo;
    private float salario;
    int contador = 0;

    public Funcionario(String nome, String matricula, String sexo, String email, Date data_nasc , String cargo, float salario){
        super(nome, matricula, sexo, email, data_nasc);
    }

    public Funcionario() {

    }
    public String getCargo(){
        return this.cargo;
    }
    public void setCargo(String cargo){
        this.cargo = cargo;
    }
    public float getSalario(){
        return this.salario;
    }
    public void setSalario(float salario){
        this.salario = salario;
    }

    public String toString(){
        return "\nNome: " + getNome() + "\nMatricula: " + getMatricula() + "\nSexo: " + getSexo() + "\nEmail: " + getEmail() + "\nData de Nascimento: " + getData();
    }
}



