/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listaumveiculo;

/**
 *
 * @author Admin
 */
public class CarroEletrico extends Veiculo{
    String capacidadeDeBateria;
    
    public CarroEletrico(String marca, String modelo, int ano, String capacidadeDeBateria) {
        super(marca, modelo, ano);
        this.capacidadeDeBateria = capacidadeDeBateria;
    }
    
    @Override
    public void Info (){
        System.out.println("=------ Informações do Carro ------");
        System.out.println("Marca: " + this.marca);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Ano: " + this.ano);
        System.out.println("Capacidade de Bateria: " + this.capacidadeDeBateria);
     }
}
