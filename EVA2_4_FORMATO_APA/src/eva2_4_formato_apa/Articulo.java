package eva2_4_formato_apa;

public class Articulo extends Documento{
    private String paginas;
    private String Editor; 
    
    public void setPaginas(String paginas) {
        this.paginas = paginas;
    }
    public String getPaginas() {
        return paginas;
    }
    public void setEditor(String editor) {
        Editor = editor;
    }
    public String getEditor() {
        return Editor;
    }
}
