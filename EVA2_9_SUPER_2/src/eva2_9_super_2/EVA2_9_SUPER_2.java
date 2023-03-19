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
public class EVA2_9_SUPER_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Estudiante estudiante = new Estudiante("Sinue Abelardo","Mendoza Portillo", 18, "22550353");
        estudiante.imprimirDatos();
        System.out.print("\n");
        
        Docentes docente = new Docentes("Juan", "Mendes", 99, "4545453");
        docente.imprimirDatos();
    }
    
}
