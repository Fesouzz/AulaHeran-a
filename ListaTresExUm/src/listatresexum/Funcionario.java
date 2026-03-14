/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listatresexum;

/**
 *
 * @author Admin
 */
public class Funcionario {
    String numeroDeMatricula;
    String nome;
    
    public Funcionario (String numeroDeMatricula, String nome) {
    
    this.numeroDeMatricula = numeroDeMatricula;
    this.nome = nome;
}
    
     public void Info (){
        System.out.println("------ Gerenciamento de Funcionarios ------");
        System.out.println("Numero de Matricula: " + this.numeroDeMatricula);
        System.out.println("Nome: " + this.nome);
     }
}
