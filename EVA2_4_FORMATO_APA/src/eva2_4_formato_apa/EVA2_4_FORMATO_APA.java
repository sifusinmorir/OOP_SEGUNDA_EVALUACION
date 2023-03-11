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
public class EVA2_4_FORMATO_APA {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // TODO code application logic here
    Documento docu = new Documento();
    docu.setTitulo("Documento");
    System.out.println(docu.getTitulo());
    System.out.print("\n");

    Libro libro1 = new Libro();
    libro1.setTitulo("Libro");
    System.out.println(libro1.getTitulo());
    libro1.setEditorial("El pepe");
    System.out.println(libro1.getEditorial());
    libro1.setTraductor("HALO4");
    System.out.println(libro1.getTraductor());
    
    System.out.print("\n");

    Articulo artic = new Articulo();
    artic.setTitulo("Articulo");
    System.out.println(artic.getTitulo());
    artic.setPaginas("25-65");
    System.out.println(artic.getPaginas());
    artic.setEditor("Juannull");
    System.out.println(artic.getEditor());

    System.out.println("\n");

    Informe info = new Informe();
    info.setTitulo("Informe");
    System.out.println(info.getTitulo());
    info.setTipo_de_informe("Nose");
    System.out.println(info.getTipo_de_informe());
    info.setDepartamento("ElJoKerII");
    System.out.println(info.getDepartamento());

    System.out.print("\n");

    Sitio_Web sweb = new Sitio_Web();
    sweb.setTitulo("Sitio Web");
    System.out.println(sweb.getTitulo());
    sweb.setURL("https://www.youtube.com/watch?v=dQw4w9WgXcQ&ab_channel=RickAstley");
    System.out.println(sweb.getURL());
    sweb.setSoporte("Yo te soporto");
    System.out.println(sweb.getSoporte());

  }
  
}
