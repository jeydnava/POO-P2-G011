/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author ivand
 */
public class Persona extends Entidad{
    
    private String telefono;
    // Constructor que llama al constructor de la clase padre
    
    public Persona(String nombre, String email, String numeroIdentidad,String fechaRegistro, String telefono) {
        super(nombre, email, numeroIdentidad);
    
        this.telefono = telefono ;
    }
    

  
    // Getter y setter para telefono
    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    @Override
    public String mostrarInformacion(){
        return String.format("%-10s %-15s %-20s %-25s %-25s %-15s %n",codigo,fechaRegistro, numeroIdentidad,nombre,email,telefono);
        
    
    }
    
    
}
