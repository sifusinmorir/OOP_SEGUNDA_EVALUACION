/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MisClases;

/**
 *
 * @author invitado
 */
public class Persona {
    private int ID;
    private String nombre;
    private int edad;
    
    public Persona(int id, String name, int age){
        ID = id;
        nombre = name;
        edad = age;
    }
    public int getID(){
        return ID; 
    }
    public void ID(int iD){
        ID = iD;
    }
    public String getNombe(){
        return nombre; 
    }
    public void setNombre(String nAme){
        nombre = nAme;
    }
    public int getEdad(){
        return edad; 
    }
    public void setNombre(int aGe){
        edad = aGe;
    }
    public void imprimirDato(){
        System.out.println("ID: "+ID);
        System.out.println("Nombre: "+nombre);
        System.out.println("Edad: "+edad);
    }
}
