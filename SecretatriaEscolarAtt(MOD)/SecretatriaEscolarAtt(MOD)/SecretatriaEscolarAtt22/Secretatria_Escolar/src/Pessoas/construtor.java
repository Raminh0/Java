package Pessoas;

import java.util.Date;
import java.util.ArrayList;

public class construtor {

    private String nome;
    private String matricula;
    private String sexo;
    private String email;
    private Date data_nasc;

    private int contador;

    public construtor(String nome, String matricula, String sexo, String email, Date data_nasc){
        nome= nome.substring(0, 1).toUpperCase() + nome.substring(1);
        this.nome = nome;
        this.matricula = matricula;
        this.sexo = sexo;
        this.email = email;
        this.data_nasc = data_nasc;
    }

    public construtor() {

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
    public String getSexo () {
        return this.sexo;
    }
    public void setSexo(String sexo){
        this.sexo = sexo;
    }
    public String getEmail(){
        return this.email;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public void setData_Nasc(Date data_nasc){
        this.data_nasc = data_nasc;
    }
    public Date getData() {
        return this.data_nasc;
    }
    public String getNome(String nome){
        return this.nome;
    }



}
