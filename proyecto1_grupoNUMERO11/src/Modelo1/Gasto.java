package modelo;
public class Gasto extends TransaccionFinanciera {
    private Categoria categoria;
    private String repeticion;

    //Constructor
    public Gasto(String descripcion, double valor, String fechaInicio, String fechaFin, Categoria categoria, String repeticion) {
        super(descripcion, valor, fechaInicio, fechaFin);
        this.categoria = categoria;
        this.repeticion = repeticion;
    }

    //Metodos
    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public String getRepeticion() {
        return repeticion;
    }

    public void setRepeticion(String repeticion) {
        this.repeticion = repeticion;
    }
    
    public String mostrarInformacion() {
        return String.format("%-10s %-30s %-15s %-15s %-15s %-15s %-15s %n",codigo,descripcion, valor,fechaInicio,fechaFin,categoria.getNombre(),repeticion);
    }
}
