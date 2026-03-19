/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listatresextres;

/**
 *
 * @author fesil
 */
public class IngressoNormal extends Ingresso {
    
    public IngressoNormal(String tipo_Ingresso, double valor) {
        super(tipo_Ingresso, valor);
    }
    
    @Override
     public void Info (){
        System.out.println("=------ Informacoes do ingresso ------");
        System.out.println("Tipo do Ingresso: " + this.tipo_Ingresso);
        System.out.println("Valor do Ingresso: " + this.valor);
        }
    
}
