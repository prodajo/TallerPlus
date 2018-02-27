package com.tallerplus.gestion;

import com.tallerplus.objetos.Coche;
import java.util.ArrayList;

public class GestionClientes {
    /**
     * Añade un cliente al ArrayList de clientes que recibe y lo devuelve
     * @param matricula matricula del vehiculo a reparar
     * @param motor tipo de combustible, diesel o gasolina
     * @param cilindrada cilindrada del vehiculo en cuestion
     * @param caballos potencia del vehiculo expresada en caballos de vapor
     * @param nombreDueño nombre del propietario del vehiculo
     * @param dni numero de identificacion personal del dueño del vehiculo
     * @param telefono telefono de contacto del dueño del vehiculo
     * @param coches lista de coches que son reparados en el taller
     * @return coches lista de coches que son reparados en el taller, una vez añadimos el nuevo vehiculo
     */
    public static ArrayList<Coche> anadirCliente(String matricula,String motor,String cilindrada,String caballos,String nombreDueño,String dni,String telefono,ArrayList<Coche>coches){
    coches.add(new Coche(matricula,motor,cilindrada,caballos,nombreDueño,dni,telefono));
    return coches;
    }
    /**
     * Elimina un vehiculo de la lista de vehiculos que tenemos en el taller
     * @param matricula matricula del vehiculo a eliminar
     * @param coches lista de coches con los que trabajamos en el taller
     * @return coches lista de coches que trabajamos en el taller, con el vehiculo en cuestion ya eliminado
     */
    public static ArrayList<Coche> borrarCliente(String matricula,ArrayList<Coche>coches){
        boolean borrado=false; // indicador de borrado que solo salta a true en caso de que se encuentre el coche, posteriormente trataremos que no se encuentre con el 
        for(int i=0;i<coches.size();i++){
            if(coches.get(i).getMatricula().equals(matricula)){
                coches.remove(i);
                borrado=true;
                break;
            }
        
        }
        // implementar en graficos
        if(borrado==true)
            System.out.println("vehiculo borrado");
        else System.out.println("no se ha encontrado el vehiculo a eliminar");
        return coches;
    }
    
}


