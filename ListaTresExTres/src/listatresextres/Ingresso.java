/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listatresextres;

/**
 *
 * @author fesil
 */
public class Ingresso {
    String tipo_Ingresso;
    double valor;
    
    public Ingresso (String tipo_Ingresso, double valor){
        this.tipo_Ingresso = tipo_Ingresso;
        this.valor = valor;
    
    }
    
    public void Info (){
        System.out.println("=------ Informacoes do ingresso ------");
        System.out.println("Tipo do Ingresso: " + this.tipo_Ingresso);
        System.out.println("Valor do Ingresso: " + this.valor);
        }
}
