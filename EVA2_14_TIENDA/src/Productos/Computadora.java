/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Productos;

import SuperClases.Electronica;

/**
 *
 * @author invitado
 */
public final class Computadora extends Electronica{
    private int memoria;
    private double discoduro;
    private double tamañoPantalla;
    private String procesador; 

    public Computadora() {
        super();
        this.memoria = 0;
        this.discoduro = 0.0;
        this.tamañoPantalla = 0.0;
        this.procesador = "0";
    }

    public Computadora(int memoria, double discoduro, double tamañoPantalla, String procesador, String fabricante, String modelo, int garantia, double precio, String nombre, String unidadVenta) {
        super(fabricante, modelo, garantia, precio, nombre, unidadVenta);
        this.memoria = memoria;
        this.discoduro = discoduro;
        this.tamañoPantalla = tamañoPantalla;
        this.procesador = procesador;
    }

    public int getMemoria() {
        return memoria;
    }

    public void setMemoria(int memoria) {
        this.memoria = memoria;
    }

    public double getDiscoduro() {
        return discoduro;
    }

    public void setDiscoduro(double discoduro) {
        this.discoduro = discoduro;
    }

    public double getTamañoPantalla() {
        return tamañoPantalla;
    }

    public void setTamañoPantalla(double tamañoPantalla) {
        this.tamañoPantalla = tamañoPantalla;
    }

    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    @Override
    public double precioVenta(int cant) {
        if(cant >= 10)
            return precio * cant;
        else 
            return precio*0.8 * cant;
    }
    @Override
    public String toString(){
        String cade = "Datos: \n" +
                      "Procesador: "+ this.procesador + "\n" +
                      "Memoria: "+ this.memoria + "\n"+
                      "Tamaño de pantalla: "+ this.tamañoPantalla + "\n"+
                      "Discoduro: "+ this.discoduro + "\n" +
                      "Fabricante: "+ this.getFabricante() + "\n" +
                      "Modelo: "+ this.getModelo() + "\n" +
                      "Nombre: "+ this.getNombre() + "\n" +
                      "Garantia: "+ this.getGarantia() + "\n" +
                      "Precio: "+ this.precio + "\n" +
                      "Precio de venta: "+ this.precioVenta(11) + "\n" 
                      ;
        return cade;
    }
}

//Final-----> no se puede herdar de una clase marcada por final
/*class Laptop extends Computadora{
}*/