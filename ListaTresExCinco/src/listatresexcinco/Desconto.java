/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listatresexcinco;

/**
 *
 * @author fesil
 */
public class Desconto extends Produto {
    
    double desconto;
    
    public Desconto(double preco, double desconto) {
        super(preco);
        this.desconto = desconto;
    }
    
    public void CalculoDesconto (){
        this.desconto = (this.preco * this.desconto)/100;
        preco = preco - desconto;
    }
    
    @Override
    public void Info (){
        System.out.println("=------ Sistema de pagamento ------");
        System.out.println("O desconto foi aplicado");
        System.out.println("Valor total:" + this.preco);
        System.out.println("Valor do desconto: " + this.desconto);
    }
    
}
