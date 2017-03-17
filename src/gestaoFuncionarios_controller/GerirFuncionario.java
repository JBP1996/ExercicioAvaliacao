/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestaoFuncionarios_controller;

import gestaoFuncionarios_model.Funcionario;
import java.util.ArrayList;

/**
 *
 * @author JBP1996 Atec
 */
public class GerirFuncionario {
    ArrayList<Funcionario> func;
    
    public GerirFuncionario(){
        func = new ArrayList<>();
    }
    
    public void adicionarFuncionario(int id,String nome,String morada,int idade,float salario){
        
        Funcionario novo= new Funcionario(id,nome,morada,idade,salario);
        
        func.add(novo);        
    }
    
    public void listarFuncionario(){
        for(int i=0;i<func.size();i++){
            System.out.println(" ID: "+func.get(i).getId()+"\n Nome:"+func.get(i).getNome()+
                    "\n Morada: "+func.get(i).getMorada()+"\n Idade: "+func.get(i).getIdade()+
                    "\n Salario: "+func.get(i).getSalario()+" €/mês \n");
        }
    }
}
