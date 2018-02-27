package com.tallerplus.gestion;

import com.tallerplus.objetos.Usuario;
import java.util.ArrayList;

public class GestionUsuarios {
    /**
     * Añade un usuario al ArrayList que recibe y lo devuelve.
     * @param usuario parámetro "usuario" del la clase "Usuario"
     * @param contrasena parámetro "contrasena" de la clase "Usuario"
     * @param tipo parámetro "tipo" de la clase "Usuario"
     * @param usuarios ArrayList de usuarios.
     * @return ArrayList con usuario añadido.
     */
    public static ArrayList<Usuario> anadirUsuario(String usuario,String contrasena, String tipo,ArrayList<Usuario> usuarios){
        usuarios.add(new Usuario(usuario,contrasena,tipo));
        return usuarios;
    }
    /**
     * Borra un usuario al ArrayList que recibe y lo devuelve con el mismo borrado.
     * @param usuario Nombre del usuario que se desea borrar
     * @param usuarios ArrayList del que se va a borrar el usuario.
     * @return ArrayList con el usuario borrado, en el caso de que exista.
     */
    public static ArrayList<Usuario> borrarUsuario(String usuario,ArrayList<Usuario> usuarios){
        boolean borrado=false;
        for(int i=0;i<usuarios.size();i++){
            if(usuarios.get(i).equals(usuario)){
                usuarios.remove(i);
                borrado=true;
                break;
            }
        }
        
        //Implementar en gráficos.
        if(borrado==true)
            System.out.println("Usuario borrado.");
        else
            System.out.println("No se han encontrado usuarios.");
        return usuarios;
    }
}
