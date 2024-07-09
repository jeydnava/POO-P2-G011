package modelo;
import java.util.ArrayList;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public abstract class TransaccionFinanciera {
    protected static int contador=1;
    protected int codigo;
    protected String descripcion;
    protected double valor;
    protected String fechaInicio;
    protected String fechaFin;
    
    public static void incrementarCodigo(){
        contador++;
    }

    //Constructor
    public TransaccionFinanciera(String descripcion, double valor, String fechaInicio, String fechaFin) {
        this.codigo=contador;
        this.descripcion = descripcion;
        this.valor = valor;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        incrementarCodigo();
    }

    // Métodos getters y setters
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public String getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(String fechaFin) {
        this.fechaFin = fechaFin;
    }
    
    //validacion de fechas
    public static boolean esFechaMayor(String fecha1, String fecha2) {
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    try {
        LocalDate date1 = LocalDate.parse(fecha1, formatter);
        LocalDate date2 = LocalDate.parse(fecha2, formatter);
        return date1.isAfter(date2);
        }catch (DateTimeParseException e) {
        System.out.println("Error al analizar las fechas: " + e.getMessage());
        return false;
        }
    }

    public String mostrarInformacion() {
        return String.format("%-10s %-30s %-15s %-15s %-15s %n",codigo,descripcion, valor,fechaInicio,fechaFin);
    }
}
