/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_3_extends;

/**
 *
 * @author invitado
 */
            //CLASE DERIVADA extends CLASE BASE
            //CLASE HIJO extends CLASE PADRE
            //SUBCLASE extends SUPERCLASE
public class Estudiante extends Persona {
    private String noControl;

    public String getNoControl() {
        return noControl;
    }

    public void setNoControl(String noControl) {
        this.noControl = noControl;
    }
    
}
