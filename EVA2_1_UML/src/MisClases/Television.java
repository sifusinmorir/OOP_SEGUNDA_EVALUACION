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
public class Television {
    private boolean power;
    private int volumen;
    private int canal; 
    //metodos: comportamientos 
    //constructor: 
    public Television(boolean poder, int volume, int channel){// constructor default 
        power = poder; //apagad0
        volumen = volume; 
        canal = channel;
    }
    public boolean getPower(){
        return power; 
    }
    public void setPower(Boolean poWer){
        power = poWer;
    }
    public int getVolumen(){
        return volumen; 
    }
    public void setVolumen(int voluMen){
        volumen = voluMen;
    }
    public int getCanal(){
        return canal; 
    }
    public void setCanal(int caNal){
        canal = caNal;
    }
    public void imprimirDato(){
        System.out.println("Power: "+power);
        System.out.println("Volumen: "+volumen);
        System.out.println("Canal: "+canal);
    }
    /*public void cambiarPower(){
        if(power == false){//apagado
            power = true; //encendimos la tele
            System.out.println("TELEVISION ENCENDIDA");
        }
            else{ 
            power = false;
            System.out.println("TELEVISION APAGADA");
        }
    }
    public void subirVolumen(){
        if(power == true){
            if(volumen < 100){
            volumen = volumen + 5;
            System.out.println("Volumen "+volumen);
            }
        }
    }
    public void bajarVolumen(){
        if(power == true){
            if(volumen > 0){
            volumen = volumen - 5;
            System.out.println("Volumen "+volumen);
        }
        }
    }
    public void subirCanal(){
        if(power == true){
            if(canal < 100) canal = canal + 1;
            else canal = 0;  
            System.out.println("Canal "+canal);
        }
    }
    public void bajarCanal(){
        if(power == true){
            if(canal > 0) canal = canal - 1;
            else canal = 100;
            System.out.println("Canal "+canal);
        
        }
    }*/
}
