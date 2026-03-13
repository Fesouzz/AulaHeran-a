/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package listaumveiculo;

/**
 *
 * @author Admin
 */
public class ListaUmVeiculo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Veiculo v1 = new Veiculo ("Volkswagen", "Nivus", 2024);
        v1.Info();
        
        Carro c1 = new Carro ("Fiat", "Pulse Abarth", 2026, "Híbrido" );
        c1.Info();
        
        CarroEletrico ce1 = new CarroEletrico("BYD", "BYD Dolphin Plus", 2023, "60,48 kWh");
        ce1.Info();
    }
    
}
