package com.tallerplus.gestion;

import com.tallerplus.interfaz.Login_users;
import com.tallerplus.objetos.Usuario;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Login {
    /**
     * Comprueba el usuario introducido en el formulario, si coincide con los usuarios ya registrados le abre su ventana correspondiente, si no
     * abre una ventana emergente informando al usuario.
     * @param usuario usuario introducido en el formulario "Login_users".
     * @param contrasena contraseña introducida en el formulario "Login_users".
     * @param usuarios ArrayList con los usuarios almacenados.
     */
    public static void comprobarUsuario(String usuario, String contrasena, ArrayList<Usuario> usuarios){
        boolean encontrado=false;
        for(int i=0;i<usuarios.size();i++){
            if((usuarios.get(i).getUsuario().equals(usuario))&&(usuarios.get(i).getContrasena().equals(contrasena))){
                if(usuarios.get(i).getTipo().equals("admin"))
                    //Abrir ventana administrador.
                    System.out.println("Abrir ventana admin");
                else if(usuarios.get(i).getTipo().equals("recepcion"))
                    //Abrir ventana recepcion
                    System.out.println("Abrir ventana recepcion");
                    else
                    //abrir ventana mecanico
                    System.out.println("Abrir ventana mecanico");
                
                encontrado=true;  
            }
            
        }
        
        if(encontrado==false)
            JOptionPane.showMessageDialog(null, "Los datos no coinciden, vuelva a intentarlo.", "Usuario o contraseña errónea", 0);
            
    }
    /**
     * Lanza la ventana inicial del proyecto, la ventana "Login_users".
     */
    public static void lanzarVentana(){
        Login_users login=new Login_users();
    }
    
}
