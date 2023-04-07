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
public abstract class Ropa extends Productos{
    private String talla;
    private String marca;
    private String color; 

    public Ropa() {
        super();
        this.talla = "";
        this.marca = "";
        this.color = "";
    }

    public Ropa(String talla, String marca, String color, double precio, String nombre, String unidadVenta) {
        super(precio, nombre, unidadVenta);
        this.talla = talla;
        this.marca = marca;
        this.color = color;
    }

    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


}
