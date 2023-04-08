/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_20_polimosfismo_figuras;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA2_20_POLIMOSFISMO_FIGURAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*Circulo circulo = new Circulo(5.0);
        circulo.imprimirDatos();
        //FIGURA ES PADRE DE CIRCULO
        //PODEMOS ASIGNAR UN OBJETO CIRCULO S UNS VSRISBLR
        Figuras fig = circulo;
        System.out.println("USANDO FIGURAS");
        System.out.println("Area: " + fig.calcularArea());
        System.out.println("Perimetro: " + fig.calcularPerimetro());
        */
        /*REPAZO DE ARREGLOS
        int[] arreglo = new int[10];
        //posiciones donde inicia y donde termins
        //primer posicion 0
        //ultima posicion N - 1, N cantidad de elementos del arreglo
        arreglo[0] = 100;
        System.out.println(arreglo[0]);*/
        /*Scanner input = new Scanner(System.in);
        int cant = input.nextInt();
        //Figuras[] figuras = new Figuras[cant];
        Circulo[] circulos = new Circulo[cant];
        for (int i = 0; i < circulos.length; i++){
            circulos[i] = new Circulo();
        }
        for (int i = 0; i < circulos.length; i++){
            circulos[i].imprimirDatos();
        }*/
        
        System.out.println("Cuantas figuras necesitas??");
        Scanner input = new Scanner(System.in);
        int cant = input.nextInt();
        Figuras[] figuras = new Figuras[cant];
        for (int i = 0; i < figuras.length; i++){
            System.out.println("QUE TIPOD DE FIGURAS NECESITAS: 1.CIRCULO 2.TRIANGULO");
            int tipo = input.nextInt();
            if(tipo == 1){
                Circulo circ = new Circulo();
                System.out.println("INTRODUCE RADIO");
                circ.setRadio(input.nextDouble());
                figuras[i] = circ;
            }
             else{
                Triangulo trian = new Triangulo();
                System.out.println("INTRODUCE ALTURA");
                trian.setAltura(input.nextDouble());
                System.out.println("INTRODUCE BASE");
                trian.setBase(input.nextDouble());
                figuras[i] = trian;
            }
        }
        for (int i = 0; i < figuras.length; i++){
            if(figuras[i] instanceof Circulo){
                System.out.println("Circulo "+ i);
                Circulo circ = (Circulo)(figuras[i]);
                circ.imprimirDatos();
            }
            else {
                System.out.println("Triangulo "+ i);
                Triangulo trian = (Triangulo)(figuras[i]);
                trian.imprimirDatos();
            }
            //System.out.println("Area: " + figuras[i].calcularArea());
            //System.out.println("Perimetro : " + figuras[i].calcularPerimetro());
        }
    }
    
}
