package modelo1;
public class Categoria {
    private TipoCategoria tipoCategoria;
    private String nombre;

    //Constructor
    public Categoria(TipoCategoria tipoCategoria, String nombre) {
        this.tipoCategoria = tipoCategoria;
        this.nombre = nombre;
    }

    //Metodos
    public TipoCategoria getTipoCategoria() {
        return tipoCategoria;
    }

    public void setTipoCategoria(TipoCategoria tipoCategoria) {
        this.tipoCategoria = tipoCategoria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
