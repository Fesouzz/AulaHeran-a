/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listatresexum;

/**
 *
 * @author Admin
 */
public class AssistenteTecnico extends Funcionario{
    String area;
    String conhecimentoBasico;
    String tempoDeFormacao;
    public AssistenteTecnico(String numeroDeMatricula, String nome, String area, String conhecimentoBasico, String tempoDeFormacao) {
        super(numeroDeMatricula, nome);
        this.area = area;
        this.conhecimentoBasico = conhecimentoBasico;
        this.tempoDeFormacao = tempoDeFormacao;
    }
    @Override
    public void Info (){
        System.out.println("------ Gerenciamento de Funcionarios ------");
        System.out.println("A area do funcionario e: " + this.area);
        System.out.println("Os conhecimentos basicos dele sao: " + this.conhecimentoBasico);
        System.out.println("O tempo de formacao na area e de: " + this.tempoDeFormacao);
     }
}
