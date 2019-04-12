/*
 * 
 */
package ec.edu.ups.interfaces;

/**
 *
 * @author Byron PC
 * @since 12-April-2019
 * @version IDE 8.2
 * ----------Interface----------
 */
public abstract class Empleado {
    
    private int codigo;
    private int experiencia;
    
    public Empleado(){
        
    }

    public Empleado(int codigo, int experiencia) {
        this.codigo = codigo;
        this.experiencia = experiencia;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }

    @Override
    public String toString() {
        return "Empleado{" + "codigo=" + codigo + ", experiencia=" + experiencia + '}';
    }
    
    
}
