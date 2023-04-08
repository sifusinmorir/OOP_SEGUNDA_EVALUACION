/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_21_polimorfismo_vehiculos;

/**
 *
 * @author invitado
 */
public class EVA2_21_POLIMORFISMO_VEHICULOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Automovil auto1 = new Automovil("Volskeagen",1968,"Vocho",2000);
        modificarVel(auto1, 10);
        Bicicleta bici1 = new Bicicleta("Montaña", "Apache",0);
        modificarVel(bici1, 5);
    }
    public static void modificarVel(ControlarDatos datos, int vel){
    datos.cambiarVelocidad(vel);
    datos.tablero();
}
}

class Vehiculo{
    private String marca;
    protected int velocidad;

    public Vehiculo() {
        this.marca = "";
        this.velocidad = 0;
    }

    public Vehiculo(String marca, int velocidad) {
        this.marca = marca;
        this.velocidad = velocidad;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }
    
}
interface ControlarDatos{
    void cambiarVelocidad(int cambio);
    void tablero();
}

class Automovil extends Vehiculo implements ControlarDatos{
    private String modelo;
    private int año;

    public Automovil() {
        super();
        this.modelo = "";
        this.año = 0;
    }

    public Automovil(String modelo, int año, String marca, int velocidad) {
        super(marca, velocidad);
        this.modelo = modelo;
        this.año = año;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    @Override
    public void cambiarVelocidad(int cambio) {
        int vel = velocidad + cambio;
        if (vel >= 0)
            velocidad = vel;
    }

    @Override
    public void tablero() {
         System.out.println("Automovil ");
         System.out.println("Velocidad; " + velocidad);
         System.out.println("Combustible (pendiente)");
         System.out.println("Revoluciones (pendiente)");
    }
    
}

class Bicicleta extends Vehiculo implements ControlarDatos{
    private String tipo;

    public Bicicleta() {
        super();
        this.tipo = "";
    }

    public Bicicleta(String tipo, String marca, int velocidad) {
        super(marca, velocidad);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public void cambiarVelocidad(int cambio) {
        int vel = velocidad + cambio;
        if (vel >= 0)
            velocidad = vel;
    }

    @Override
    public void tablero() {
        System.out.println("Bicicleta");
        System.out.println("Automovil " + velocidad);
    }
    
}