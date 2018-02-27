package com.tallerplus;

import com.tallerplus.gestion.Login;
import com.tallerplus.objetos.Cita;
import com.tallerplus.objetos.Coche;
import com.tallerplus.objetos.Usuario;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {
    
        //Listas
        static ArrayList<Usuario> usuarios=new ArrayList();
        static ArrayList<Coche> coches=new ArrayList();
        static ArrayList <Cita> citas=new ArrayList();
        
        //Array Atributos
        static String[] atributoscoche=new String[7];
        static String[] atributosusuario=new String[3];
        static String[] atributoscita=new String[5];
        
        //Ficheros
        static File ficherocoches=new File("/com/tallerplus/files/coche.txt");
        static File ficherousuarios=new File("/com/tallerplus/files/usuario.txt");
        static File ficherocitas=new File("/com/tallerplus/files/cita.txt");

    public static void main(String[] args) {
        leerFicheros();
        escribirFicheros();
        
        //Lanzamos ventana Login para iniciar el programa.
        Login.lanzarVentana();
        
    }
    
    public static void leerFicheros(){
        Scanner sc = null;
        String linea;
        
            try {
                sc=new Scanner(ficherocoches);
                while(sc.hasNext()){
                    linea=sc.next();
                    atributoscoche=linea.split(",");
                    Coche c=new Coche(atributoscoche[0],atributoscoche[1],atributoscoche[2],atributoscoche[3],atributoscoche[4],atributoscoche[5],atributoscoche[6]);
                    coches.add(c);
                }
            } catch (FileNotFoundException ex) {
                System.out.println("Error al leer coches");
            }finally{
                sc.close();
            }
            
            try {
                sc=new Scanner(ficherousuarios);
                while(sc.hasNext()){
                    linea=sc.next();
                    atributosusuario=linea.split(",");
                    Usuario c=new Usuario(atributosusuario[0],atributosusuario[1],atributosusuario[2]);
                    usuarios.add(c);
                }
            } catch (FileNotFoundException ex) {
                System.out.println("Error al leer usuarios");
            }finally{
                sc.close();
            }

            try {
                sc=new Scanner(ficherocitas);
                while(sc.hasNext()){
                    linea=sc.next();
                    atributoscita=linea.split(",");
                    Cita c=new Cita(atributoscita[0],atributoscita[1],atributoscita[2],Float.parseFloat(atributoscita[3]),atributoscita[4]);
                    citas.add(c);
                }
            } catch (FileNotFoundException ex) {
                System.out.println("Error al leer citas");
            }finally{
                sc.close();
            }            
        
    }
    
    public static void escribirFicheros(){
        FileWriter escribir = null;
        
            try {
                escribir=new FileWriter(ficherocoches);
                for(Coche elemento: coches){
                    escribir.write(elemento.getMatricula()+
                            ","+elemento.getMotor()+
                            ","+elemento.getCilindrada()+
                            ","+elemento.getCaballos()+
                            ","+elemento.getNombreDueño()+
                            ","+elemento.getDni()+
                            ","+elemento.getTelefono());
                }
            } catch (IOException ex) {
                System.out.println("Error al escribir");
            } finally{
                try {
                    escribir.close();
                } catch (IOException ex) {
                System.out.println("Error al cerrar escritura");
                }
            }

            try {
                escribir=new FileWriter(ficherousuarios);
                for(Usuario elemento: usuarios){
                    escribir.write(elemento.getUsuario()+
                            ","+elemento.getContrasena()+
                            ","+elemento.getTipo());
                }
            } catch (IOException ex) {
                System.out.println("Error al escribir");
            } finally{
                try {
                    escribir.close();
                } catch (IOException ex) {
                System.out.println("Error al cerrar escritura");
                }
            }

            try {
                escribir=new FileWriter(ficherocitas);
                for(Cita elemento: citas){
                    escribir.write(elemento.getMatricula()+
                            ","+elemento.getFechaHora()+
                            ","+elemento.getDescripcion()+
                            ","+elemento.getPrecio()+
                            ","+elemento.getEstado());
                }
            } catch (IOException ex) {
                System.out.println("Error al escribir");
            } finally{
                try {
                    escribir.close();
                } catch (IOException ex) {
                    System.out.println("Error al cerrar escritura");
                }
            }
    }
}
