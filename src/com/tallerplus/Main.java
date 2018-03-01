package com.tallerplus;

import com.tallerplus.files.Ficheros;
import com.tallerplus.gestion.Login;

public class Main {
    
    public static void main(String[] args) {
        Ficheros.leerFicheroCoches();
        Ficheros.leerFicheroCitas();
        Ficheros.leerFicheroUsuarios();
        
        //Lanzamos ventana Login para iniciar el programa.
        Login.lanzarVentanaLogin();
        
        
    }
}
