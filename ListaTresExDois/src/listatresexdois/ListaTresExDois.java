/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package listatresexdois;

/**
 *
 * @author fesil
 */
public class ListaTresExDois {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Animal a1 = new Animal ();
        a1.caminhar();
        
        Cachorro c1 = new Cachorro ();
        c1.caminhar();
        c1.latir();
        
        Gato g1 = new Gato ();
        g1.caminhar();
        g1.miar();
    }
    
}
