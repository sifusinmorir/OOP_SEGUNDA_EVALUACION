/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_19_polimorfismo;

/**
 *
 * @author invitado
 */
public class EVA2_19_POLIMORFISMO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here}
        Docentes docente = new Docentes("Juan","Ramos",18,"1254163");
        Estudiante estudiante = new Estudiante("Sinue","UwU",18,"22550353");
        //docente.imprimirDatos();
        //estudiante.imprimirDatos();
        //ESTO SI ES POLIMORFISMO
        //OCULTAMOS PROPIEDADES
        Persona persona = docente;
        persona.imprimirDatos();
        Persona persona2 = estudiante; 
        persona2.imprimirDatos();
        //AL REVEZ
        //no se puede hacer conversion de superclase a subclase
        //EN ESTE XASO , NO EXISTE LA PLAZA
        Persona perso = new Persona();
        //Docentes doce = perso;
    }
    
}
