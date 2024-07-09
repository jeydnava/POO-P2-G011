/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author jeydnava
 */
public class Banco extends Entidad {
    private String nombreOficialCredito;
    private String telefonoOficialCredito;

    // Constructor que llama al constructor de la clase padre
    public Banco(String nombre, String email, String numeroIdentidad,String fechaRegistro, String nombreOficialCredito, String telefonoOficialCredito) {
        super(nombre, email,numeroIdentidad);
  
        this.nombreOficialCredito = nombreOficialCredito;
        this.telefonoOficialCredito = telefonoOficialCredito;
    }

  
    // Getter y setter para nombreOficialCredito
    public String getNombreOficialCredito() {
        return nombreOficialCredito;
    }

    public void setNombreOficialCredito(String nombreOficialCredito) {
        this.nombreOficialCredito = nombreOficialCredito;
    }

    // Getter y setter para telefonoOficialCredito
    public String getTelefonoOficialCredito() {
        return telefonoOficialCredito;
    }

    public void setTelefonoOficialCredito(String telefonoOficialCredito) {
        this.telefonoOficialCredito = telefonoOficialCredito;
    } 
    
    public String mostrarInformacion(){
        return String.format("%-10s %-15s %-20s %-25s %-25s %-15s %n",codigo,fechaRegistro, numeroIdentidad,nombre,email,"Oficial: "+nombreOficialCredito+"\tTelefono: "+telefonoOficialCredito);
    }
}

