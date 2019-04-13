/*
 *
 */
package ec.edu.ups.pruebas;

import ec.edu.ups.clases.EmpleadoAsalariado;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;
import ec.edu.ups.clases.ProfesorContratado;
import ec.edu.ups.clases.ProfesorSustituto;
import ec.edu.ups.clases.Taxista;

 /*
 * @author Byron PC
 * @since 12-April-2019
 * @version IDE 8.2 ----------Interfaz----------
 */
public class Prueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//////////////////////////////////////////////////////////////////////////////
        GregorianCalendar fechacontratacion = new GregorianCalendar(1997,3,16);
        GregorianCalendar vacaciones = new GregorianCalendar(2002,3,16);
        GregorianCalendar contratotaxi = new GregorianCalendar(2005,0,18);
        GregorianCalendar vacataxi = new GregorianCalendar(2005,3,12);
        
        EmpleadoAsalariado antony = new EmpleadoAsalariado(9,2856,420.60,"Empresa XYZ",460.30,fechacontratacion.getTime(),vacaciones.getTime(),"Antony Pim","0102659875",23,"Masculino");
        System.out.println(antony);
        System.out.println(antony.comer());
        System.out.println(antony.descansar());
        System.out.println(antony.dormir());
        System.out.println(antony.viajar());
        System.out.println(antony.verTelevision());
        System.out.println(antony.verCelular());
        
        Taxista wade = new Taxista(20,2630,"Noche","0987815996","CuencaTaxi",260.30,contratotaxi.getTime(),vacataxi.getTime(),"Wade Wilson","0105948574",23,"Masculino");
        System.out.println(wade);
        System.out.println("\t"+wade.comer());
        System.out.println("\t"+wade.contestar());
        System.out.println("\t"+wade.descansar());
        System.out.println("\t"+wade.dormir());
        System.out.println("\t"+wade.verWhatsapp());
        System.out.println("\t"+wade.trabajar());
    }
}
