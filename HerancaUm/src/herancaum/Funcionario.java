/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herancaum;

/**
 *
 * @author Admin
 */
public class Funcionario extends Pessoa {
    
    String RGM;
    String Cargo;
    
    public Funcionario(String nome, String cpf, String telefone, String dt_nascimento, String RGM, String Cargo) {
        super(nome, cpf, telefone, dt_nascimento);
        this.RGM = RGM;
        this.Cargo = Cargo;
    }
    @Override
     public void Info (){
        System.out.println("=------ Cadastro de Funcionário ------");
        System.out.println("Nome: " + this.nome);
        System.out.println("CPF: " + this.cpf);
        System.out.println("Telefone: " + this.telefone);
        System.out.println("Data de Nascimento: " + this.dt_nascimento);
        System.out.println("RGM: " + this.RGM);
        System.out.println("Cargo: " + this.Cargo);
    }
}
