/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listatresexquatro;

/**
 *
 * @author fesil
 */
public class ImovelNovo extends Imovel {
    
    public ImovelNovo(String tipode_Imovel, int ano_Construcao, String local, String valor, String condicao) {
        super(tipode_Imovel, ano_Construcao, local, valor, condicao);
    }
    
    @Override
    public void Info (){
        System.out.println("=------ Informacoes do Imovel ------");
        System.out.println("Tipo do Imovel: " + this.tipode_Imovel);
        System.out.println("Ano de construcao: " + this.ano_Construcao);
        System.out.println("Local: " + this.local);
        System.out.println("Valor do Imovel: " + this.valor);
        System.out.println("Condicao: " + this.condicao);
        }
}
