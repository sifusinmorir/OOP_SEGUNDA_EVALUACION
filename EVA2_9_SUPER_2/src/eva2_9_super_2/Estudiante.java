/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_9_super_2;

/**
 *
 * @author invitado
 */
            //CLASE DERIVADA extends CLASE BASE
            //CLASE HIJO extends CLASE PADRE
            //SUBCLASE extends SUPERCLASE
public class Estudiante extends Persona {
    private String noControl;

     public Estudiante() {//CONSTRUCTOR DEFAULT
        super();            //CONSTRUCTOR DE LA SUPERCLASE
        this.noControl = "--------";
    }

 
    public Estudiante(String nombre, String apellido, int edad, String noControl) {
        super(nombre, apellido, edad);
        this.noControl = noControl;
    }
    

    public String getNoControl() {
        return noControl;
    }

    public void setNoControl(String noControl) {
        this.noControl = noControl;
    }
    @Override//REMPLAZA RL METO imprimirDatos DE LA SUPERCLASE
    public void imprimirDatos(){
        super.imprimirDatos();//SUPER+. SON LOS METODOS, SUPER+() SON LOS CONSTRUCTORES 
        System.out.println("Numero de control: "+this.noControl);
    }
}
