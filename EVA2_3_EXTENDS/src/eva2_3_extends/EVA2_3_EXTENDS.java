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
public class EVA2_3_EXTENDS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Estudiante estu = new Estudiante();
        estu.setNombre("Sifu");
        estu.setApellido("Sin Morir");
        estu.setEdad(20);
        estu.setNoControl("22550353");
        System.out.println(estu.getNombre());
        System.out.println(estu.getApellido());
        System.out.println(estu.getEdad());
        System.out.println(estu.getNoControl());
        System.out.print("\n");
        Docentes doce1 = new Docentes();
        doce1.setNombre("Tony");
        doce1.setApellido("Sopranp");
        doce1.setEdad(68);
        doce1.setPlaza("ASDFGH");
        System.out.println(doce1.getNombre());
        System.out.println(doce1.getApellido());
        System.out.println(doce1.getEdad());
        System.out.println(doce1.getPlaza());
    }
    
}
