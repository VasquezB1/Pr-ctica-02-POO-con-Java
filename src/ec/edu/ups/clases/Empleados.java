/*
 * 
 */
package ec.edu.ups.clases;

import java.util.Date;

/**
 *
 * @author Byron PC
 * @since 12-April-2019
 * @version IDE 8.2
 * ----------Class Padre 1----------
 */ 
public abstract class Empleados extends Persona {
////////////////////////////////////////////////////////////////////////////////
    ///////////////////Declaracion de Variables    
    private String empresa;
    private double sueldo;
    private Date fechaContratacion;
    private Date vacaciones;
    
    public Empleados(){
        
    }
////////////////////////////////////////////////////////////////////////////////
    //Constructor
    public Empleados(String nombre, String cedula, int edad, String genero) {
        super(nombre, cedula, edad, genero);
    }
////////////////////////////////////////////////////////////////////////////////
    //Get and Set   

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public Date getFechaContratacion() {
        return fechaContratacion;
    }

    public void setFechaContratacion(Date fechaContratacion) {
        this.fechaContratacion = fechaContratacion;
    }

    public Date getVacaciones() {
        return vacaciones;
    }

    public void setVacaciones(Date vacaciones) {
        this.vacaciones = vacaciones;
    }
/////////////////////////////////////////////////////////////////////////////////
    //To String

    @Override
    public String toString() {
        return "Empleados{" + "empresa=" + empresa + ", sueldo=" + sueldo + ", fechaContratacion=" + fechaContratacion + ", vacaciones=" + vacaciones + '}';
    }
    
    
}
