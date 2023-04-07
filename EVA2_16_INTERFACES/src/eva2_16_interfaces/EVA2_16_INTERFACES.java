/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_16_interfaces;

/**
 *
 * @author invitado
 */
public class EVA2_16_INTERFACES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //MostrarDatos obj = new MostrarDatos(); no se puede instanciar un 
        Persona perso = new Persona("Tony Somprano", 40);
        perso.imprimirDatos();
        Computadora compu = new Computadora("Lenovo","Intel i7", 2500,"Lenovo Legion");
        compu.imprimirDatos();
    }
    
}
