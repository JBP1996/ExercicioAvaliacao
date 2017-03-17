/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestaoFuncionarios_model;

/**
 *
 * @author JBP1996 Atec
 */
public class Funcionario {
    
    private int id;
    private String nome;
    private String morada;
    private int idade;
    private float salario; 
    
    public Funcionario(int id,String nome,String morada,int idade,float salario){
        this.id=id;
        this.nome=nome;
        this.morada=morada;
        this.idade=idade;
        this.salario=salario;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMorada() {
        return morada;
    }

    public void setMorada(String morada) {
        this.morada = morada;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
}
