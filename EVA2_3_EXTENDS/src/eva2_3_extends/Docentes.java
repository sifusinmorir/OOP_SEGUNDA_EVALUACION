/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_3_extends;

/**
 *
 * @author invitado
 */
            //CLASE DERIVADA extends CLASE BASE
            //CLASE HIJO extends CLASE PADRE
            //SUBCLASE extends SUPERCLASE
public class Docentes extends Persona{
  private String plaza;

  public String getPlaza() {
    return plaza;
  }

  public void setPlaza(String plaza) {
    this.plaza = plaza;
    
  }
  
  
}
