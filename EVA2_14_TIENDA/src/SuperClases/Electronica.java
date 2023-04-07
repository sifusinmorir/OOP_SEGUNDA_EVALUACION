/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package SuperClases;

/**
 *
 * @author invitado
 */
public abstract class Electronica extends Productos{
    private String fabricante;
    private String modelo; 
    private int garantia;

    public Electronica() {
        super();
        this.fabricante = "0";
        this.modelo = "0";
        this.garantia = 0;
    }
    
    public Electronica(String fabricante, String modelo, int garantia, double precio, String nombre, String unidadVenta) {
        super(precio, nombre, unidadVenta);
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.garantia = garantia;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getGarantia() {
        return garantia;
    }

    public void setGarantia(int garantia) {
        this.garantia = garantia;
    }
    
    
}
