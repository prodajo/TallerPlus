package com.tallerplus.gestion;

import com.tallerplus.files.Ficheros;
import com.tallerplus.objetos.Usuario;
import javax.swing.JOptionPane;

public class GestionUsuarios {
    /**
     * Añade un usuario al ArrayList que recibe y lo devuelve.
     * @param usuario parámetro "usuario" del la clase "Usuario"
     * @param contrasena parámetro "contrasena" de la clase "Usuario"
     * @param tipo parámetro "tipo" de la clase "Usuario"
     */
    public static void anadirUsuario(String usuario,String contrasena, String tipo){
        Ficheros.usuarios.add(new Usuario(usuario,contrasena,tipo));
        Ficheros.escribirFicheroUsuarios();
    }
    /**
     * Borra un usuario al ArrayList que recibe y lo devuelve con el mismo borrado.
     * @param usuario Nombre del usuario que se desea borrar
     */
    public static boolean borrarUsuario(String usuario){
        boolean bandera=true;
        if (!usuario.equals("admin")){
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
        }else{
            bandera=false;
            JOptionPane.showMessageDialog(null,"No puede borrar 'ADMIN'","Error", 0);
        }
        return bandera;
    }
}