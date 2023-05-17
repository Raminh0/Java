package Pessoas;

//import java.util.Date;

public class Funcionario extends PESSOA {//HERANÇA -> Funcionário é uma sub classe que recebe
                                         // a extensão de Pessoa.

    public Funcionario(String nome, String matricula, char sexo, String email, String cargo){
        super(nome, matricula, sexo, email, cargo);
    }

    public Funcionario() {

    }


    public String toString(){
        return "\nNome: " + getNome() + "\nMatricula: " + getMatricula() + "\nSexo: " + getSexo() + "\nEmail: " + getEmail();
    }
}



