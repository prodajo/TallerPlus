/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tallerplus.gestion;

import java.awt.Desktop;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 * Clase con un método que genera una factura con los parámetros de una cita recibida
 * @author dani_
 */
public class GestionFacturas {
    /**
     * Genera un archivo de texto a modo de factura con los parámetros recibidos y la fecha en la que se genera.
     * Abre la factura en un editor de texto.
     * @param matricula matrícula del cliente
     * @param descripcion descripción de la avería
     * @param precio precio de la factura
     */
    public static void generarFactura(String matricula, String descripcion, float precio){
        Date fecha=new Date();
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        String cadenaFecha = formato.format(fecha);
        
        try {
            FileWriter escribir;
            escribir = new FileWriter("src/com/tallerplus/facturas/factura.txt");
            escribir.write(
                    "Fecha factura: "+cadenaFecha+"         "+"Matricula: "+matricula+"         \n"+
                    "         \n"+
                    "Descripcion: \n"+descripcion+"\n"+"\n         "+
                    "Total ---> "+precio+"€"
            );
            escribir.close();
        } catch (IOException ex) {
            System.out.println("Error al escribir");
        }
        
        File fichero=new File("src/com/tallerplus/facturas/factura.txt");
        try {
            Desktop.getDesktop().open(fichero);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null,"Error al abrir la factura","Error",0);
        }
    }
}
