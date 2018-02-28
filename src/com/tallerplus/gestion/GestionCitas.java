package com.tallerplus.gestion;

import com.tallerplus.objetos.Cita;
import java.util.ArrayList;

public class GestionCitas {
    /**
     * añade una cita para un vehiculo en la lista de citas que le pasamos 
     * @param matricula matricula del vehiculo de la cita
     * @param fechaHora fecha y hora de la cita en cuestion
     * @param descripcion descripcion del problema del vehiculo
     * @param precio precio de la reparacion
     * @param estado estado de la reparacion
     * @param citas lista de citas de los vehiculos 
     * @return citas lista de citas de todos los vehiculos con la nueva cita añadida
     */
    public static ArrayList<Cita>anadirCita(String matricula,String fechaHora,String descripcion,float precio,String estado,ArrayList<Cita>citas){
        citas.add(new Cita(matricula,fechaHora,descripcion,precio,estado));
        return citas;
    }
    /**
     * borra las citas de la lista de citas que tenemos 
     * @param matricula matricula del vehiculo que tiene la cita a eliminar
     * @param fechaHora momento de la cita
     * @param citas lista de citas 
     * @return citas con la cita en cuestion eliminada, siempre que fuera encontrada 
     */
    public static ArrayList<Cita>borrarCita(String matricula,String fechaHora,ArrayList<Cita>citas){
        boolean borrado=false; // indicador de borrado que solo cambia a true si se encuentra la cita en cuestion
        for(int i=0;i<citas.size();i++){
            if(citas.get(i).getMatricula()==matricula || citas.get(i).getFechaHora()==fechaHora)
                citas.remove(i);
                borrado=true;
                break;
        }
        // implementar en graficos
        if(borrado==true)
            System.out.println("cita eliminada");
        else System.out.println("cita no encontrada");
        return citas;
        
    }
    /**
     * modifica las citas ya creadas dentro de una lista de citas 
     * @param matricula matricula de la cita a modificar , este dato no puede ser modificado
     * @param fechaHora fecha y hora de la cita a modificar , este dato no puede ser modificado
     * @param descripcion descripcion de la cita, modificada o no 
     * @param precio precio de la reparacion, introducida o no
     * @param estado estado de la reparacion, modificada o no
     * @param citas lista de citas 
     * @return citas con la cita ya modificada
     */
    public static ArrayList<Cita>modificarCita(String matricula,String fechaHora,String descripcion,float precio,String estado,ArrayList<Cita>citas){ // no se pueden modificar los campo clave matricula y fecha, en caso de que esos datos esten mal hay que borrar la cita y generar una nueva
        boolean modificado=false;
        for(int i=0;i<citas.size();i++){
            if(citas.get(i).getMatricula().equals(matricula) || citas.get(i).getFechaHora().equals(fechaHora))
                if (!citas.get(i).getDescripcion().equals(descripcion)){
                    citas.get(i).setDescripcion(descripcion);
                    modificado=true;
                }
            if(citas.get(i).getPrecio()!=precio){
                citas.get(i).setPrecio(precio);
                modificado=true;
            }
            if(!citas.get(i).getDescripcion().equals(descripcion)){
                citas.get(i).setDescripcion(descripcion);
                modificado=true;
            }
            break;
        }
        // implementar
        if (modificado==true)
            System.out.println("cita modificada");
        else System.out.println("cita no encontrada, no se ha podido modificar");
        return citas;
    }
    /**
     * consulta la cota de una determinada hora de un determinado dia
     * @param fechaHora dato de fecha y hora para realizar la consulta
     * @param citas lista de citas
     * @return citaConsultada la cita concreta que buscamos
     */
    public static Cita consultarCita(String fechaHora,ArrayList<Cita>citas){ // podemos consultar una cita segun su hora, si no se sabe la hora de una cita de una determinada matricula se debe usar el historial del vehiculo
        Cita citaConsultada=new Cita();
        for(int i=0;i<citas.size();i++){
            if(citas.get(i).getFechaHora().equals(fechaHora))
                citaConsultada=citas.get(i);
        }
        return citaConsultada;
    }
    /**
     * ver el historial de citas de un determinado vehiculo
     * @param matricula matricula del vehiculo que queremos sacar su historial
     * @param citas lista con el historial de citas 
     * @return citaCoche lista de todas las citas de ese determinado vehiculo
     */
    public static ArrayList<Cita> verHistorial(String matricula,ArrayList<Cita>citas){ // ver historial de un determinado vehiculo
        ArrayList<Cita>citaCoche=new ArrayList<>();
        for(int i=0;i<citas.size();i++){
            if(citas.get(i).getMatricula().equals(matricula)){
                citaCoche.add(citas.get(i));
            }
            
        }
        return citaCoche;
    }
}
