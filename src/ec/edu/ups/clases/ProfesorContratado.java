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
 * ----------Class Hija 3 de Profesor----------
 */
public final class ProfesorContratado extends Profesor {
////////////////////////////////////////////////////////////////////////////////
    ///////////////////Declaracion de Variables    
    private Date fechaContratacion;
    private int horasContratado;
    private Date evaluaciones;
    private int cursoACargo;
////////////////////////////////////////////////////////////////////////////////
    //Constructor

    public ProfesorContratado(String nombre, String cedula, int edad, String genero) {
        super(nombre, cedula, edad, genero);
    }
////////////////////////////////////////////////////////////////////////////////
    //Get and Set   

    public Date getFechaContratacion() {
        return fechaContratacion;
    }

    public void setFechaContratacion(Date fechaContratacion) {
        this.fechaContratacion = fechaContratacion;
    }

    public int getHorasContratado() {
        return horasContratado;
    }

    public void setHorasContratado(int horasContratado) {
        this.horasContratado = horasContratado;
    }

    public Date getEvaluaciones() {
        return evaluaciones;
    }

    public void setEvaluaciones(Date evaluaciones) {
        this.evaluaciones = evaluaciones;
    }

    public int getCursoACargo() {
        return cursoACargo;
    }

    public void setCursoACargo(int cursoACargo) {
        this.cursoACargo = cursoACargo;
    }
/////////////////////////////////////////////////////////////////////////////////
    //To String

    @Override
    public String toString() {
        return "ProfesorContratado{" + "fechaContratacion=" + fechaContratacion + ", horasContratado=" + horasContratado + ", evaluaciones=" + evaluaciones + ", cursoACargo=" + cursoACargo + '}';
    }

    
}
