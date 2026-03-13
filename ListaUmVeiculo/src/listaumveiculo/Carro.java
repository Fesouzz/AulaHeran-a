
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listaumveiculo;

/**
 *
 * @author Admin
 */
public class Carro extends Veiculo {
      String tipoDeCombustivel;
  
    public Carro(String marca, String modelo, int ano, String tipoDeCombustivel) {
        super(marca, modelo, ano);
        this.tipoDeCombustivel = tipoDeCombustivel;
    }
    
      @Override
     public void Info (){
        System.out.println("=------ Informações do Carro ------");
        System.out.println("Marca: " + this.marca);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Ano: " + this.ano);
        System.out.println("Tpo de Combustível: " + this.tipoDeCombustivel);
     }
       
}
