package Pessoas;

import java.util.Date;

public class PESSOA {//HERANÇA -> Pessoa é uma super classe que se estende para Funcionário

    private String nome;
    private String matricula;
    private char sexo;
    private String email;
    private String data_nasc;
    private String cargo;
    private float salario;

    public PESSOA(String nome, String matricula, char sexo, String email,String cargo){
        this.nome = nome;
        this.matricula = matricula;
        this.sexo = sexo;
        this.email = email;
        //this.data_nasc = data_nasc;
        this.cargo = cargo;
        //this.salario = salario;
    }

    public PESSOA() {

    }
    public String getNome(){
        return this.nome;
    }
    public void setNome(String nome){
        this.nome= nome;
    }
    public String getMatricula(){
        return this.matricula;
    }
    public void setMatricula(String matricula){
        this.matricula = matricula;
    }
    public char getSexo () {
        return this.sexo;
    }
    public void setSexo(char sexo){
        this.sexo = sexo;
    }
    public String getEmail(){
        return this.email;
    }
    public void setEmail(String email){
        this.email = email;
    }
    //public void setData_Nasc(String data_nasc){
        //this.data_nasc = data_nasc;
    //}
    /*public String getData() {
        return this.data_nasc;
    }*/
    public String getNome(String nome){
        return this.nome;
    }
    public String getCargo(){
        return this.cargo;
    }
    public void setCargo(String cargo){
        this.cargo = cargo;
    }
    /*public float getSalario(){
        return this.salario;
    }
    public void setSalario(float salario){
        this.salario = salario;
    }*/



}
