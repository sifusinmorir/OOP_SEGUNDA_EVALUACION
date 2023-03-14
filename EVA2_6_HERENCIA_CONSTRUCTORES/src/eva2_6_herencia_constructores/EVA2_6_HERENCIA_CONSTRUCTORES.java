/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_6_herencia_constructores;

/**
 *
 * @author invitado
 */
public class EVA2_6_HERENCIA_CONSTRUCTORES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
        System.out.println("CLASE ANIMAL");
        System.out.print("\n");
        
        Animal animal1 = new Animal();
        animal1.comer();
        animal1.respirar();
        
        System.out.print("\n");
        System.out.println("CLASE MAMIFERO");
        System.out.print("\n");
        
        Mamifero mamifero1 = new Mamifero();
        mamifero1.respirar();
        mamifero1.respirar();
        mamifero1.tenerPelo();
    }
    
}
