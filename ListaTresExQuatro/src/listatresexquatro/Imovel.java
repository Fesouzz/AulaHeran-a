/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listatresexquatro;

/**
 *
 * @author fesil
 */
public class Imovel {
    String tipode_Imovel;
    int ano_Construcao;
    String local;
    String valor;
    String condicao;
    
    public Imovel (String tipode_Imovel, int ano_Construcao, String local, String valor, String condicao){
        this.tipode_Imovel = tipode_Imovel;
        this.ano_Construcao = ano_Construcao;
        this.local = local;
        this.valor = valor;
        this.condicao = condicao;
    }
    
     public void Info (){
        System.out.println("=------ Informacoes do Imovel ------");
        System.out.println("Tipo do Imovel: " + this.tipode_Imovel);
        System.out.println("Ano de construcao: " + this.ano_Construcao);
        System.out.println("Local: " + this.local);
        System.out.println("Valor do Imovel: " + this.valor);
        System.out.println("Condicao: " + this.condicao);
        }
}
