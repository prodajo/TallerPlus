/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tallerplus.interfaz;

import com.tallerplus.files.Ficheros;
import com.tallerplus.gestion.GestionCitas;
import com.tallerplus.gestion.GestionFacturas;
import com.tallerplus.objetos.Cita;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author dani_
 */
public class Facturas extends javax.swing.JFrame {
    DefaultTableModel tabla=new DefaultTableModel();
    ArrayList<Cita> encontradas = new ArrayList();
    ArrayList<Cita> cerradas = new ArrayList();
    /**
     * Creates new form Facturas
     */
    public Facturas() {
        initComponents();
        setLocationRelativeTo(null);
        setVisible(true);
        setResizable(false);
        //Columnas de la tabla
        tabla.addColumn("Matrícula");
        tabla.addColumn("Descripción");
        tabla.addColumn("Precio");
        
        //Recibimos la citas encontradas
        encontradas = Ficheros.citas;
        //Desechamos las cerradas
        for(int i=0;i<encontradas.size();i++){
            if(encontradas.get(i).getEstado().equals("Cerrado"))
                cerradas.add(encontradas.get(i));
        }

        //Añadimos las citas encontadas a la tabla
        for (Cita elemento : cerradas) {
                String anadir[] = new String[3];
                anadir[0] = elemento.getMatricula();
                anadir[1] = elemento.getDescripcion();
                anadir[2] = Float.toString(elemento.getPrecio());
                tabla.addRow(anadir);
        }
        this.tablabusqueda.setModel(tabla);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        batras1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        infecha = new javax.swing.JTextField();
        bbuscarfecha = new javax.swing.JLabel();
        inmatricula = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        bbuscarmatricula = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablabusqueda = new javax.swing.JTable();
        titulousuarios = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        bgenerar = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Facturas");
        setMinimumSize(new java.awt.Dimension(900, 500));
        setResizable(false);
        setSize(new java.awt.Dimension(900, 500));

        jPanel1.setBackground(new java.awt.Color(109, 132, 180));

        batras1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/tallerplus/icon/flecha-hacia-la-izquierda.png"))); // NOI18N
        batras1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                batras1MouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Búsqueda por fecha");

        infecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                infechaActionPerformed(evt);
            }
        });

        bbuscarfecha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/tallerplus/icon/busqueda-p.png"))); // NOI18N
        bbuscarfecha.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bbuscarfechaMouseClicked(evt);
            }
        });

        inmatricula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inmatriculaActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Búsqueda por matrícula");

        bbuscarmatricula.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/tallerplus/icon/busqueda-p.png"))); // NOI18N
        bbuscarmatricula.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bbuscarmatriculaMouseClicked(evt);
            }
        });

        tablabusqueda.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Matrícula", "Descripcion", "Precio"
            }
        ));
        jScrollPane2.setViewportView(tablabusqueda);

        titulousuarios.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        titulousuarios.setForeground(new java.awt.Color(255, 255, 255));
        titulousuarios.setText("Generar factura:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Seleccione la cita y haga click en el icono para generar la factura");

        bgenerar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/tallerplus/icon/generar.png"))); // NOI18N
        bgenerar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bgenerarMouseClicked(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Busque la cita de la que desea generar la factura ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel3)
                                        .addComponent(inmatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(18, 18, 18)
                                    .addComponent(bbuscarmatricula))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel1)
                                        .addComponent(infecha, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(18, 18, 18)
                                    .addComponent(bbuscarfecha))
                                .addComponent(jLabel5))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(titulousuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(3, 3, 3)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 482, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(bgenerar)
                            .addComponent(batras1))))
                .addGap(34, 34, 34))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(batras1)
                    .addComponent(titulousuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(infecha, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(19, 19, 19)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(inmatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addComponent(bbuscarfecha)
                                .addGap(44, 44, 44)
                                .addComponent(bbuscarmatricula)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(bgenerar)
                        .addGap(22, 22, 22))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
/**
 * Botón para volver a la pantalla principal.
 * @param evt 
 */
    private void batras1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_batras1MouseClicked
        VentanaPrincipal venanaprincipal=new VentanaPrincipal();
        dispose();
    }//GEN-LAST:event_batras1MouseClicked
/**
 * Introdución de fecha para búsqueda
 * @param evt 
 */
    private void infechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_infechaActionPerformed

    }//GEN-LAST:event_infechaActionPerformed
/**
 * Botón buscar cita por fecha
 * @param evt 
 */
    private void bbuscarfechaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bbuscarfechaMouseClicked
        ArrayList<Cita> encontradas=new ArrayList();
        String fecha=infecha.getText();

        //Recibimos la citas encontradas
        encontradas=GestionCitas.consultarCitaFecha(fecha);

        //Borramos contanido anterior de la tabla
        for (int i = 0; i < tabla.getRowCount(); i++) {
            tabla.removeRow(i);
            i-=1;
        }

        //Añadimos las citas encontadas a la tabla
        for(Cita elemento: encontradas){
            String anadir[]=new String [3];
            anadir[0]=elemento.getMatricula();
            anadir[1]=elemento.getDescripcion();
            anadir[2]=Float.toString(elemento.getPrecio());
            tabla.addRow(anadir);
        }
        this.tablabusqueda.setModel(tabla);
    }//GEN-LAST:event_bbuscarfechaMouseClicked
/**
 * Introdución de texto para buscar por matrícula.
 * @param evt 
 */
    private void inmatriculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inmatriculaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inmatriculaActionPerformed
/**
 * Botón de buscar por matrícula.
 * @param evt 
 */
    private void bbuscarmatriculaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bbuscarmatriculaMouseClicked
        ArrayList<Cita> encontradas=new ArrayList();
        String matricula=inmatricula.getText();

        //Recibimos la citas encontradas
        encontradas=GestionCitas.consultarCitaMatricula(matricula);

        //Borramos contenido anterior de la tabla
        for (int i = 0; i < tabla.getRowCount(); i++) {
            tabla.removeRow(i);
            i-=1;
        }

        //Añadimos las citas encontadas a la tabla
        for(Cita elemento: encontradas){
            String anadir[]=new String [3];
            anadir[0]=elemento.getMatricula();
            anadir[1]=elemento.getDescripcion();
            anadir[2]=Float.toString(elemento.getPrecio());
            tabla.addRow(anadir);
        }
        this.tablabusqueda.setModel(tabla);
    }//GEN-LAST:event_bbuscarmatriculaMouseClicked

    private void bgenerarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bgenerarMouseClicked
        int seleccionado=tablabusqueda.getSelectedRow();
        
        if(seleccionado>=0){
            String matricula=cerradas.get(seleccionado).getMatricula();
            String descripcion=cerradas.get(seleccionado).getDescripcion();
            Float precio=cerradas.get(seleccionado).getPrecio();
            GestionFacturas.generarFactura(matricula, descripcion, precio);
        }
    }//GEN-LAST:event_bgenerarMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Facturas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Facturas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Facturas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Facturas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Facturas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel batras1;
    private javax.swing.JLabel bbuscarfecha;
    private javax.swing.JLabel bbuscarmatricula;
    private javax.swing.JLabel bgenerar;
    private javax.swing.JTextField infecha;
    private javax.swing.JTextField inmatricula;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tablabusqueda;
    private javax.swing.JLabel titulousuarios;
    // End of variables declaration//GEN-END:variables
}
