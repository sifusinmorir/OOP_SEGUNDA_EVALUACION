/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_4_formato_apa;

/**
 *
 * @author invitado
 */
public class Libro extends Documento{
    private String editorial;
    private String traductor;

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }
    public String getEditorial() {
        return editorial;
    }
    public void setTraductor(String traductor) {
        this.traductor = traductor;
    }
    public String getTraductor() {
        return traductor;
    }
}
