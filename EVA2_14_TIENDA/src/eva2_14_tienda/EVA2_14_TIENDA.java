/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_14_tienda;

import Productos.Computadora;
import Productos.Jeans;

/**
 *
 * @author invitado
 */
public class EVA2_14_TIENDA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Computadora compu = new Computadora();
        Computadora compu2 = new Computadora(8, 500, 18, "INTEL", "HP", "666", 12, 12000, "JUDE", "Pieza");
        System.out.println(compu);
        System.out.println(compu2);
        Jeans jean = new Jeans();
        System.out.println(jean);
    }
    
}
