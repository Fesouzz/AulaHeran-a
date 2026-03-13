/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herancaum;

/**
 *
 * @author Admin
 */
public class Professor extends Pessoa{
    int RF;
    String Disciplina;
    
    public Professor(String nome, String cpf, String telefone, String dt_nascimento,int RF, String Disciplina) {
        super(nome, cpf, telefone, dt_nascimento);
        this.RF = RF;
        this.Disciplina = Disciplina;
    }
    
    @Override
    public void Info (){
        System.out.println("=------ Cadastro de Professor ------");
        System.out.println("Nome: " + this.nome);
        System.out.println("CPF: " + this.cpf);
        System.out.println("Telefone: " + this.telefone);
        System.out.println("Data de Nascimento: " + this.dt_nascimento);
        System.out.println("RF: " + this.RF);
        System.out.println("Disciplina: " + this.Disciplina);
    }
}
