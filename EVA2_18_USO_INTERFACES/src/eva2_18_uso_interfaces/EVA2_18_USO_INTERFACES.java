/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_18_uso_interfaces;

/**
 *
 * @author invitado
 */
public class EVA2_18_USO_INTERFACES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Figuras fig = new Figuras(); nose puede 
        //MostrarDatos mos = new MostrarDatos(); no se puede unu
        Circulo circ = new Circulo();
        circ.setRadio(50);
        Triangulo triang = new Triangulo(4.0,5.0);
        circ.imprimirDatos();
        triang.imprimirDatos();
    }
}
