/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herancaum;

/**
 *
 * @author Admin
 */
public class Aluno extends Pessoa{
    
    String RM;
    String Curso;

    public Aluno(String nome, String cpf, String telefone, String dt_nascimento, String RM, String Curso) {
        super(nome, cpf, telefone, dt_nascimento);
        this.RM = RM;
        this.Curso = Curso;
    }
    
    @Override
    public void Info (){
        System.out.println("=------ Cadastro de estudante ------");
        System.out.println("Nome: " + this.nome);
        System.out.println("CPF: " + this.cpf);
        System.out.println("Telefone: " + this.telefone);
        System.out.println("Data de Nascimento: " + this.dt_nascimento);
        System.out.println("RM: " + this.RM);
        System.out.println("Curso: " + this.Curso);
    }
}
