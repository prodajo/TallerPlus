package com.tallerplus.gestion;

import com.tallerplus.files.Ficheros;
import com.tallerplus.objetos.Usuario;
import java.util.ArrayList;

public class GestionUsuarios {
    /**
     * Añade un usuario al ArrayList que recibe y lo devuelve.
     * @param usuario parámetro "usuario" del la clase "Usuario"
     * @param contrasena parámetro "contrasena" de la clase "Usuario"
     * @param tipo parámetro "tipo" de la clase "Usuario"
     * @param usuarios ArrayList de usuarios.
     */
    public static void anadirUsuario(String usuario,String contrasena, String tipo){
        Ficheros.usuarios.add(new Usuario(usuario,contrasena,tipo));
        Ficheros.escribirFicheroUsuarios();
    }
    /**
     * Borra un usuario al ArrayList que recibe y lo devuelve con el mismo borrado.
     * @param usuario Nombre del usuario que se desea borrar
     */
    public static void borrarUsuario(String usuario){
        boolean borrado=false;
        for(int i=0;i<Ficheros.usuarios.size();i++){
            if(Ficheros.usuarios.get(i).getUsuario().equals(usuario)){
                Ficheros.usuarios.remove(i);
                borrado=true;
                break;
            }
        }
        if(borrado==true)
            Ficheros.escribirFicheroUsuarios();
        else
            System.out.println("No se han encontrado usuarios.");
    }
}
