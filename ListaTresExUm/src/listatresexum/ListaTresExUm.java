/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package listatresexum;

/**
 *
 * @author Admin
 */
public class ListaTresExUm {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Funcionario f1 = new Funcionario ("Joao", "5184209");
        f1.Info();
        
        AssistenteAdministrativo adm1 = new AssistenteAdministrativo ("Brenda", "2846103", "Ensino Medio Completo", 
        "Organizacao, suporte, controle de planilhas e apoio a processos");
        adm1.Info();
        
        AssistenteTecnico tec1 = new AssistenteTecnico ("Pilar", "7952481", "Desenvolvimento de Sistemas",
        "Office 365, HTML, CSS, SQL, Phyton, Java e JavaScript", "Um ano e meio");
        tec1.Info();
    }
    
}
