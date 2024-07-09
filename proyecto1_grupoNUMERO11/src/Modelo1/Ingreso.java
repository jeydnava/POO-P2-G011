package modelo;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
public class Ingreso extends TransaccionFinanciera{
    private Categoria categoria;
    private String repeticion;

    //Constructor
    public Ingreso( String descripcion, double valor, String fechaInicio, String fechaFin, Categoria categoria, String repeticion) {
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

    @Override
    public String mostrarInformacion() {
        return String.format("%-10s %-30s %-15s %-15s %-15s %-15s %-15s %n",codigo,descripcion, valor,fechaInicio,fechaFin,categoria.getNombre(),repeticion);
    }
    
    public  String mostrarReporte(){
         return String.format("%-20s %-20s %n", categoria.getNombre(), valor);
    } 
}
