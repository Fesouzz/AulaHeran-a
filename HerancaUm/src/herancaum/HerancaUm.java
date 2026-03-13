/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package herancaum;

/**
 *
 * @author Admin
 */
public class HerancaUm {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
     Funcionario f1 = new Funcionario("Lucas", "355.277.904-95","11 94444-9959", "17/09/1975", "89673", "Coordenador");
     f1.Info();
     
     Pessoa p1 = new Pessoa("Fernanda", "333.222.444-93","11 99999-9999", "10/10/2010");
     p1.Info();
    
     Aluno a1 = new Aluno("Fernanda", "333.222.444-93","11 99999-9999", "10/10/2010", "26593", "Gastronomia");
     a1.Info();
     
     Professor pf1 = new Professor ("Fabíola", "123.232.454-98","11 98888-9988", "15/02/1993", 7897 , "Matemática");
     pf1.Info();
    }
    
}
