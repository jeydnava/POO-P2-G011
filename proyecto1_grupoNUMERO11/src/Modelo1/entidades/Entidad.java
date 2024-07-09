package entidades;
import modelo.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Entidad {
    protected static int contador=1;
    protected int codigo;
    protected String fechaRegistro;
    protected String nombre;
    protected String email;
    protected String numeroIdentidad;
    private static final LocalDate fechaActual = LocalDate.now();
    private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    protected static final String fechaFormateada = fechaActual.format(formatter);
    
    //Métodos
    public static void incrementarCodigo(){
        contador++;
    }
    
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    
    public String getNumeroIdentidad() {
        return numeroIdentidad;
    }

    public void setNumeroIdentidad(String numeroIdentidad) {
        this.numeroIdentidad = numeroIdentidad;
    }
    public String getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(String fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }
    

    // Constructor
    public Entidad(String nombre, String email,String numeroIdentidad) {
        this.codigo= contador;
        this.nombre = nombre;
        this.email = email;
        this.numeroIdentidad=numeroIdentidad;
        this.fechaRegistro= fechaFormateada;
        incrementarCodigo();
    }

    // Getters y setters para nombre
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Getters y setters para email
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public String mostrarInformacion(){
        return String.format("%-10s %-30s %-15s %n",codigo,fechaRegistro, numeroIdentidad);
    }
}
