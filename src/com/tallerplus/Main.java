package com.tallerplus;

import com.tallerplus.files.Ficheros;
import com.tallerplus.gestion.Login;
import com.tallerplus.interfaz.VentanaPrincipal;

public class Main {
    
    public static void main(String[] args) {
        Ficheros.leerFicheroCoches();
        Ficheros.leerFicheroCitas();
        Ficheros.leerFicheroUsuarios();
        
        
        
        Ficheros.escribirFicheroCoches();
        Ficheros.escribirFicheroCitas();
        Ficheros.escribirFicheroUsuarios();
        
        //Lanzamos ventana Login para iniciar el programa.
        Login.lanzarVentana();
        VentanaPrincipal v=new VentanaPrincipal();
        
    }
}
