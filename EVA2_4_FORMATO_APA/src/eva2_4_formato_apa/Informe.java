package eva2_4_formato_apa;

public class Informe extends Documento {
    private String tipo_de_informe;
    private String departamento;

    public String getTipo_de_informe() {
        return tipo_de_informe;
    }
    public void setTipo_de_informe(String tipo_de_informe) {
        this.tipo_de_informe = tipo_de_informe;
    }
    public String getDepartamento() {
        return departamento;
    }
    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
}
