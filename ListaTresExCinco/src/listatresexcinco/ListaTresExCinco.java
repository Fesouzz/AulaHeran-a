/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package listatresexcinco;

/**
 *
 * @author fesil
 */
public class ListaTresExCinco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Desconto p1 = new Desconto (500.0, 20.0);
       Produto p2 = new Produto (500.0);
       p2.Info();
       p1.CalculoDesconto();
       p1.Info();
    }
    
}
