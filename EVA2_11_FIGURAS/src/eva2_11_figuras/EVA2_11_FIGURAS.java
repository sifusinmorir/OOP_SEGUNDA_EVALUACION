/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_11_figuras;

/**
 *
 * @author invitado
 */
public class EVA2_11_FIGURAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Circulo circu1 = new Circulo();
        Circulo circu2 = new Circulo(8.0);
        Triangulo trian1 = new Triangulo();
        Triangulo trian2 = new Triangulo(8.0, 6.0);
        System.out.println(circu1);
        System.out.println(circu2);
        System.out.println(trian1);
        System.out.println(trian2);
    }
    
}
