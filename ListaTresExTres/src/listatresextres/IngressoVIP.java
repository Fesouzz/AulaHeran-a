/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listatresextres;

/**
 *
 * @author fesil
 */
public class IngressoVIP extends Ingresso{
    String camarote_Superior;
    
    public IngressoVIP(String tipo_Ingresso, double valor, String camarote_Superior) {
        super(tipo_Ingresso, valor);
        this.camarote_Superior = camarote_Superior;
    }
    
    @Override
     public void Info (){
        System.out.println("=------ Informacoes do ingresso ------");
        System.out.println("Tipo do Ingresso: " + this.tipo_Ingresso);
        System.out.println("Valor do Ingresso: " + this.valor);
        System.out.println("Tipo de camarote: " + this.camarote_Superior);
        }
}
