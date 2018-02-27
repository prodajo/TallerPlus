package com.tallerplus.gestion;

import com.tallerplus.objetos.Usuario;
import java.util.ArrayList;

public class GestionUsuarios {
    public static ArrayList<Usuario> anadirUsuario(String usuario,String contrasena, String tipo,ArrayList<Usuario> usuarios){
        usuarios.add(new Usuario(usuario,contrasena,tipo));
        return usuarios;
    }
    
    public static ArrayList<Usuario> borrarUsuario(String usuario,ArrayList<Usuario> usuarios){
        int posicion=0;
        for(int i=0;i<usuarios.size();i++){
            if(usuarios.get(i).equals(usuario)){
                posicion=i;
                break;
            }
        }
        usuarios.remove(posicion);
        return usuarios;
    }
}
