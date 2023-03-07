/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_1_uml;

import MisClases.Automovil;
import MisClases.Persona;
import MisClases.Television;

/**
 *
 * @author invitado
 */
public class EVA2_1_UML {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Persona perso1 = new Persona(22550353,"SinueUwU", 18);
        perso1.imprimirDato(); 
        System.out.print("\n");

        Television Tele1 = new Television(false, 20, 14);
        Tele1.imprimirDato();
        /*Tele1.cambiarPower();
        Tele1.subirVolumen();
        Tele1.bajarCanal();
        Tele1.cambiarPower();*/
        System.out.print("\n");
        
        Automovil Auto1 = new Automovil("tony", "soprano", 2004);
        Auto1.imprimirDato();
    }          
}
