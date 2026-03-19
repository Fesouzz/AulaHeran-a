/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listatresexcinco;

/**
 *
 * @author fesil
 */
public class Produto {
    double preco;
    
    public Produto (double preco){
        this.preco = preco;
    
    }
    
    public void Info (){
        System.out.println("=------ Sistema de pagamento ------");
        System.out.println("Valor total: " + this.preco);
    }
}
