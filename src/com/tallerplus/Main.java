package com.tallerplus;

import com.tallerplus.gestion.Login;
import com.tallerplus.objetos.Coche;
import com.tallerplus.objetos.Usuario;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Usuario> usuarios=new ArrayList();
        ArrayList<Coche> coches=new ArrayList();
        
        
        //Lanzamos ventana Login para iniciar el programa.
        Login.lanzarVentana();
        
    }
}
