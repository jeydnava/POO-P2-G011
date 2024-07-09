package modelo;
import entidades.Persona;
public class Prestamo extends TransaccionFinanciera {
    private Persona deudor;
    private String fechaDePrestamo;
    private int cuota;

    //Constructor
    public Prestamo( String descripcion, double valor, String fechaInicio, String fechaFin, Persona deudor, String fechaDePrestamo, int cuota) {
        super(descripcion, valor, fechaInicio, fechaFin);
        this.deudor= deudor;
        this.fechaDePrestamo=fechaDePrestamo;
        this.cuota= cuota;
     }

    //Metodos
    //Sobreescritura de mostrarInformacion
    public String mostrarInformacion() {
        return String.format("%-15s %-15s %-15s %-30s %-20s %-15s %n",codigo,deudor.getNombre(), valor,descripcion,fechaDePrestamo,cuota);
    }
    
    public Persona getDeudor() {
        return deudor;
    }

    public void setDeudor(Persona deudor) {
        this.deudor = deudor;
    }

    public String getFechaDePrestamo() {
        return fechaDePrestamo;
    }

    public void setFechaDePrestamo(String fechaDePrestamo) {
        this.fechaDePrestamo = fechaDePrestamo;
    }

    public int getCuota() {
        return cuota;
    }

    public void setCuota(int cuota) {
        this.cuota = cuota;
    }
}
