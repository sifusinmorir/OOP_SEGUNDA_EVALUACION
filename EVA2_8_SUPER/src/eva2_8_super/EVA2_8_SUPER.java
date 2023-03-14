/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_8_super;

/**
 *
 * @author invitado
 */
public class EVA2_8_SUPER {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Animal ani1 = new Animal();
        Mamifero mami1 = new Mamifero();
        Mamifero mami2 = new Mamifero("Negro",50);
        Perros perr1 = new Perros(); 
    }
    
}

class Animal{
    private int peso; 
    
    public Animal(){
        System.out.println("El animal esta vivo");
    }

    public Animal(int peso) {
        this.peso = peso;
        System.out.println("El animal esta vivo // constructor 2");
    }
    
    public void respirar(){
        System.out.println("Estoy respirando");
    } 
    
    public void comer(){
        System.out.println("Estoy comiendo");
    }
    
    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

}

class Mamifero extends Animal{
    private String colorPelo;

    public String getColorPelo() {
        return colorPelo;
    }

    public void setColorPelo(String colorPelo) {
        this.colorPelo = colorPelo;
    }
    public Mamifero(){
        super();//LLAMADA AL CONSTRUCOR DE LA SUPERCLASE
                //EN NUESTRO CASO, LLAMA a Animal();
                //Siempre debemos llamar primero al 
                //constructor de la superclase
        System.out.println("SOY EL MAMI");
    }

    public Mamifero(String colorPelo, int peso) {
        super(peso);
        this.colorPelo = colorPelo;
    }       
}

class Perros extends Mamifero{
   //SIMPRE INVOCAR CONSTRUCTOR SUPERCLASE
    public Perros(){
        super();
        System.out.print("Soy pegamento me cai y me pegue");
    }
}