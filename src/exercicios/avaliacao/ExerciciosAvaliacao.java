/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios.avaliacao;

import java.util.Scanner;

import gestaoFuncionarios_controller.GerirFuncionario;

/**
 *
 * @author JBP1996 Atec
 */
public class ExerciciosAvaliacao {
    
    /*
    *   Fazer 2 exercicios para avaliacao e criar um CaseStudy(" Situacao pratica em que o sistema se aplica ") 
    */
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        GerirFuncionario gerir =new GerirFuncionario();
        int opcao=0;
        System.out.println("GESTAO DE FUNCIONARIOS");
        while(opcao!=4){
            System.out.println("Escolha uma opcao:\n 1- Adicionar um novo Funcionario\n 2- Listar Funcionarios\n 3- Editar dados do Funcionario\n 4- Eliminar Funcionario\n 5- Sair");
            opcao=new Scanner(System.in).nextInt();
                 
            switch(opcao){
                case 1:
                    System.out.println("ADICIONAR FUNCIONARIO");
                    
                    System.out.println("Digite o Id do funcionario");
                    int id= new Scanner(System.in).nextInt();
                    
                    System.out.println("Digite o nome do funcionario");
                    String nome= new Scanner(System.in).nextLine();
                    
                    System.out.println("Digite o morada do funcionario");
                    String morada= new Scanner(System.in).nextLine();
                    
                    System.out.println("Digite o idade do funcionario");
                    int idade= new Scanner(System.in).nextInt();
                    
                    System.out.println("Digite o salario do funcionario");
                    float salario= new Scanner(System.in).nextFloat();
    
                    gerir.adicionarFuncionario(id,nome,morada,idade,salario);
                    break;

                case 2:
                    gerir.listarFuncionario();
                    break;

                case 3:
                    break;

                case 4:
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("OPCAO INEXISTENTE\n");
            }
        };
    }
    
}
