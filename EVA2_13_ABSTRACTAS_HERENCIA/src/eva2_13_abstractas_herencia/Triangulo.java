/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_13_abstractas_herencia;

/**
 *
 * @author invitado
 */
public class Triangulo extends Figuras{//PARA IMPLEMENTAR HERENCIA DE 
                                       //UNA CLASE ABSTRACTA TIENES QUE 
                                       //IMPLEMENTAR TODOS SUS METODOS ABSTRACTOS 
    private double base;
    private double altura; 

    public Triangulo(){
        this.altura = 4;
        this.base = 3;
    }
    
    public Triangulo(double altura, double base){
        this.altura = altura;
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }
    public double getBase() {
        return base;
    }
    public void setBase(double base) {
        this.base = base;
    }

    @Override
    public double calcularArea(){
        return this.base*this.altura/2;
    }
    @Override
    public double calcularPerimetro(){
        return this.base + this.altura +(Math.sqrt(altura*altura + base*base));
    }
    @Override
    public String toString(){
        String cade = "Datos del triangulo: \n" +
                      "Perimetro: "+ this.calcularArea() + "\n" +
                      "Area: "+ this.calcularPerimetro() + "\n";
        return cade;
    }
}
