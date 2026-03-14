/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listatresexum;

/**
 *
 * @author Admin
 */
public class AssistenteAdministrativo extends Funcionario{
    
    String formacaoAcademica;
    String funcoes;
    
    public AssistenteAdministrativo(String numeroDeMatricula, String nome, String formacaoAcademica, String funcoes) {
        super(numeroDeMatricula, nome);
        this.formacaoAcademica = formacaoAcademica;
        this.funcoes = funcoes;
    }
    @Override
     public void Info (){
        System.out.println("------ Gerenciamento de Funcionarios ------");
        System.out.println("Formacao academica exigida: " + this.formacaoAcademica);
        System.out.println("As funcoes do funcionario sao: " + this.funcoes);
     }
}
