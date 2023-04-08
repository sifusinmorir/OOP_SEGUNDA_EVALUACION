/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_22_has_a_direccion;

//import com.sun.javafx.scene.traversal.Direction;

/**
 *
 * @author invitado
 */
public class EVA2_22_HAS_A_DIRECCION {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Persona perso = new Persona();
        perso.setNombre("Sinue Abelardo");
        perso.setApellido("Mendoza Portillo");
        perso.setEdad(18);
        /*Direccion direc = new Direccion();
        direc.setCalle("Domingo Montoya");
        direc.setCiudad("Chihuahua");
        direc.setColonia("Francisco R. Almadad");
        direc.setCp("310436");
        direc.setEstado("Chihuahua");
        direc.setNumero(5800);
        perso.setDireccion(direc);//*/
        perso.imprimirDatos();
        
    }
    
}
class Direccion{
    private String calle;
    private int numero;
    private String colonia;
    private String cp;
    private String ciudad;
    private String estado;

    public Direccion() {
        this.calle = "";
        this.numero = 0;
        this.colonia = "";
        this.cp = "";
        this.ciudad = "";
        this.estado = "";
    }

    public Direccion(String calle, int numero, String colonia, String cp, String ciudad, String estado) {
        this.calle = calle;
        this.numero = numero;
        this.colonia = colonia;
        this.cp = cp;
        this.ciudad = ciudad;
        this.estado = estado;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getColonia() {
        return colonia;
    }

    public void setColonia(String colonia) {
        this.colonia = colonia;
    }

    public String getCp() {
        return cp;
    }

    public void setCp(String cp) {
        this.cp = cp;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    public void imprimirDatos(){
    System.out.println("Direccion:");
    System.out.println("Estado: " + this.estado+". Ciudad: " + this.ciudad + ". Calle: " + this.calle + ". Numero: " + this.numero + ". Colonia: " + this.colonia + ". Codigo postal: " + this.cp);
}
}

class Persona{
    private String nombre;
    private String apellido;
    private int edad;
    private Direccion direccion;

    public Persona() {
        this.nombre = "-------";
        this.apellido = "-------";
        this.edad = 0;
        this.direccion = null;
    }

    public Persona(String nombre, String apellido, int edad, Direccion direccion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }


public void imprimirDatos(){
    System.out.println("Nombre: " + this.nombre+" Apellido: " + this.apellido);
    System.out.println("Edad: " + this.edad);
    if(direccion == null)
        System.out.println("Sin direccion");
    else 
        direccion.imprimirDatos();
}

    
}