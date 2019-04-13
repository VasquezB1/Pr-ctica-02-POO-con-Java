/*
 *
 */
package ec.edu.ups.clases;

import ec.edu.ups.interfaces.Interface;
import java.util.Date;

/**
 *
 * @author Byron PC
 * @since 12-April-2019
 * @version IDE 8.2
 * ----------Class Hija 3 de Profesor----------


>>>>>>> origin/master
 */


public final class ProfesorContratado extends Profesor implements Interface {
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
        return super.toString()+ "ProfesorContratado{" + "fechaContratacion=" + fechaContratacion + ", horasContratado=" + horasContratado + ", evaluaciones=" + evaluaciones + ", cursoACargo=" + cursoACargo + '}';
    }
/////////////////////////////////////////////////////////////////////////////////
    //Interface

    @Override
    public String comer() {
        return "La persona " + this.getNombre() + " está comiendo";
    }

    @Override
    public String descansar() {
        return "La persona " + this.getNombre() + " está descansando";
    }

    @Override
    public String dormir() {
        return "La persona " + this.getNombre() + " está durmiendo";
    }

    public String exponer() {
        return "El preadolescente " + super.getNombre() + " está exponiendo";
    }

    public String vestirse() {
        return "El preadolescente " + super.getNombre() + " está vistiendose";
    }

    public String caminar() {
        return "El preadolescente " + super.getNombre() + " está caminando";
    }
 
}
