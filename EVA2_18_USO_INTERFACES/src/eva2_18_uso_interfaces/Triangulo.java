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
public class Triangulo implements Figuras, MostrarDatos{
    private double base;
    private double altura;

    public Triangulo() {
        this.base = 3.0;
        this.altura = 4.0;
    }

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return base*altura/2;
    }

    @Override
    public double calcularPerimetro() {
        return base + altura + Math.sqrt(base*base + altura*altura);
    }

    @Override
    public void imprimirDatos() {
        System.out.println("Datos del Triangulo: ");
        System.out.println("Base: " + base);
        System.out.println("Altura: " + altura);
        System.out.println("Area: " + calcularArea());
        System.out.println("Perimetro: " + calcularPerimetro());
        System.out.print("\n");
    }
    
}
