package com.tallerplus.gestion;

import com.tallerplus.files.Ficheros;
import com.tallerplus.objetos.Cita;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class GestionCitas {
    /**
     * añade una cita para un vehiculo en la lista de citas que le pasamos 
     * @param matricula matricula del vehiculo de la cita
     * @param fechaHora fecha y hora de la cita en cuestion
     * @param descripcion descripcion del problema del vehiculo
     * @param precio precio de la reparacion
     * @param estado estado de la reparacion
     */
    public static void anadirCita(String matricula,String fechaHora,String descripcion,float precio,String estado){
        boolean encontrado=false;
        for(int i=0;i<Ficheros.citas.size();i++){
            if(Ficheros.citas.get(i).getMatricula().equals(matricula) && Ficheros.citas.get(i).getFechaHora().equals(fechaHora)){
                JOptionPane.showMessageDialog(null,"La cita ya existe en el sistema","cita no valida",0);
                encontrado=true;
                break;
            }
            else;
        }
        if(encontrado==false){
            Ficheros.citas.add(new Cita(matricula,fechaHora,descripcion,precio,estado));
            Ficheros.escribirFicheroCitas();
        }
    }
    /**
     * borra las citas de la lista de citas que tenemos 
     * @param matricula matricula del vehiculo que tiene la cita a eliminar
     * @param fechaHora momento de la cita

     */
    public static  boolean borrarCita(String matricula,String fechaHora){
        boolean borrado=false; // indicador de borrado que solo cambia a true si se encuentra la cita en cuestion
        for(int i=0;i<Ficheros.citas.size();i++){
            if(Ficheros.citas.get(i).getMatricula().equals(matricula) && Ficheros.citas.get(i).getFechaHora().equals(fechaHora)){
                Ficheros.citas.remove(i);
                borrado=true;
                break;
            }
        }
        // implementar en graficos
        if(borrado==true){
            JOptionPane.showMessageDialog(null,"cita eliminada","gestión de citas",1);
            Ficheros.escribirFicheroCitas();
        }
        else JOptionPane.showMessageDialog(null,"cita no encontrada","gestión de citas",0);
        
        return borrado;
    }
    /**
     * modifica las citas ya creadas dentro de una lista de citas 
     * @param matricula matricula de la cita a modificar , este dato no puede ser modificado
     * @param fechaHora fecha y hora de la cita a modificar , este dato no puede ser modificado
     * @param descripcion descripcion de la cita, modificada o no 
     * @param precio precio de la reparacion, introducida o no
     * @param estado estado de la reparacion, modificada o no
     */
    public static void modificarCita(String matricula,String fechaHora,String descripcion,float precio,String estado){ // no se pueden modificar los campo clave matricula y fecha, en caso de que esos datos esten mal hay que borrar la cita y generar una nueva
        boolean modificado=false;
        for(int i=0;i<Ficheros.citas.size();i++){
            if(Ficheros.citas.get(i).getMatricula().equals(matricula) || Ficheros.citas.get(i).getFechaHora().equals(fechaHora))
                if (!Ficheros.citas.get(i).getDescripcion().equals(descripcion)){
                    Ficheros.citas.get(i).setDescripcion(descripcion);
                    modificado=true;
                }
            if(Ficheros.citas.get(i).getPrecio()!=precio){
                Ficheros.citas.get(i).setPrecio(precio);
                modificado=true;
            }
            if(!Ficheros.citas.get(i).getDescripcion().equals(descripcion)){
                Ficheros.citas.get(i).setDescripcion(descripcion);
                modificado=true;
            }
            break;
        }
        
        if (modificado==true){
           JOptionPane.showMessageDialog(null,"cita modificada","modificación de citas",0);
           Ficheros.escribirFicheroCitas();
        }
        else JOptionPane.showMessageDialog(null,"cita no encontrada, no se ha podido modificar","modificación de citas",0);
    }
    /**
     * consulta la cita de una determinada hora de un determinado dia
     * @param fechaHora dato de fecha y hora para realizar la consulta
     * @return encontradas Lista de citas encontradas en esa fecha
     */
    public static ArrayList<Cita> consultarCitaFecha(String fechaHora){ // podemos consultar una cita segun su hora, si no se sabe la hora de una cita de una determinada matricula se debe usar el historial del vehiculo
        ArrayList<Cita> encontradas=new ArrayList();
        boolean encontrado=false;
        Cita citaConsultada=new Cita();
        for(int i=0;i<Ficheros.citas.size();i++){
            if(Ficheros.citas.get(i).getFechaHora().equals(fechaHora)){
                citaConsultada=Ficheros.citas.get(i);
                encontradas.add(citaConsultada);
                encontrado=true;
            }
        }
        
        if(encontrado==false){
            JOptionPane.showMessageDialog(null, "Cita no encontrada","Búsqueda",0);
        }
        return encontradas;
    }
    /**
     * Consulta las citas con una matrícula determinada.
     * @param matricula dato matrícula para realizar la búsqueda
     * @return encontradas Lista de citas encontradas con esa matrícula
     */
    public static ArrayList<Cita> consultarCitaMatricula(String matricula){ // podemos consultar una cita segun su hora, si no se sabe la hora de una cita de una determinada matricula se debe usar el historial del vehiculo
        ArrayList<Cita> encontradas=new ArrayList();
        boolean encontrado=false;
        Cita citaConsultada=new Cita();
        for(int i=0;i<Ficheros.citas.size();i++){
            if(Ficheros.citas.get(i).getMatricula().equals(matricula)){
                citaConsultada=Ficheros.citas.get(i);
                encontradas.add(citaConsultada);
                encontrado=true;
            }
        }
        
        if(encontrado==false){
            JOptionPane.showMessageDialog(null, "Cita no encontrada","Búsqueda",0);
        }
        return encontradas;
    }
    /**
     * ver el historial de citas de un determinado vehiculo
     * @param matricula matricula del vehiculo que queremos sacar su historial
     * @param citas lista con el historial de citas 
     * @return citaCoche lista de todas las citas de ese determinado vehiculo
     */
    public static ArrayList<Cita> verHistorial(String matricula){ // ver historial de un determinado vehiculo
        ArrayList<Cita>citaCoche=new ArrayList<>();
        for(int i=0;i<Ficheros.citas.size();i++){
            if(Ficheros.citas.get(i).getMatricula().equals(matricula)){
                citaCoche.add(Ficheros.citas.get(i));
            }
            
        }
        return citaCoche;
    }
}
