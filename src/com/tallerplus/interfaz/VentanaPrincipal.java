/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tallerplus.interfaz;

import com.tallerplus.gestion.Login;

/**
 *
 * @author dani_
 */
public class VentanaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form VentanaPrincipal
     */
    public VentanaPrincipal() {
        initComponents();
        setLocationRelativeTo(null);
        setVisible(true);
        setResizable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        panelprincipal = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        busuario = new javax.swing.JLabel();
        bcliente = new javax.swing.JLabel();
        bfactura = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        bborrarcita = new javax.swing.JLabel();
        banadircita = new javax.swing.JLabel();
        bhistorialcliente = new javax.swing.JLabel();
        bbuscarcita = new javax.swing.JLabel();
        bcerrarcita = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(240, 240, 240));
        jLabel17.setText("Buscar Cita");

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(240, 240, 240));
        jLabel18.setText("Buscar Cita");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ventana principal");
        setMinimumSize(new java.awt.Dimension(900, 500));
        setSize(new java.awt.Dimension(900, 500));

        panelprincipal.setBackground(new java.awt.Color(109, 132, 180));
        panelprincipal.setMinimumSize(new java.awt.Dimension(900, 500));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(240, 240, 240));
        jLabel1.setText("TALLER");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(240, 240, 240));
        jLabel2.setText("ADMINISTRACIÓN");

        busuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/tallerplus/icon/social.png"))); // NOI18N
        busuario.setAlignmentY(0.0F);
        busuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                busuarioMouseClicked(evt);
            }
        });

        bcliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/tallerplus/icon/007-chico.png"))); // NOI18N
        bcliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bclienteMouseClicked(evt);
            }
        });

        bfactura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/tallerplus/icon/recepcion.png"))); // NOI18N
        bfactura.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bfacturaMouseClicked(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(240, 240, 240));
        jLabel6.setText("Usuarios");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(240, 240, 240));
        jLabel7.setText("Facturas");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(240, 240, 240));
        jLabel8.setText("Clientes");

        bborrarcita.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/tallerplus/icon/004-error.png"))); // NOI18N
        bborrarcita.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bborrarcitaMouseClicked(evt);
            }
        });

        banadircita.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/tallerplus/icon/002-mas.png"))); // NOI18N
        banadircita.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                banadircitaMouseClicked(evt);
            }
        });

        bhistorialcliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/tallerplus/icon/historial.png"))); // NOI18N
        bhistorialcliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bhistorialclienteMouseClicked(evt);
            }
        });

        bbuscarcita.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/tallerplus/icon/busqueda.png"))); // NOI18N
        bbuscarcita.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bbuscarcitaMouseClicked(evt);
            }
        });

        bcerrarcita.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/tallerplus/icon/003-exito.png"))); // NOI18N
        bcerrarcita.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bcerrarcitaMouseClicked(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(240, 240, 240));
        jLabel14.setText("Añadir Cita");

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(240, 240, 240));
        jLabel15.setText("Borrar Cita");

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(240, 240, 240));
        jLabel16.setText("Buscar Cita");

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(240, 240, 240));
        jLabel19.setText("Cerrar Cita");

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(240, 240, 240));
        jLabel20.setText("Historial cliente");

        javax.swing.GroupLayout panelprincipalLayout = new javax.swing.GroupLayout(panelprincipal);
        panelprincipal.setLayout(panelprincipalLayout);
        panelprincipalLayout.setHorizontalGroup(
            panelprincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelprincipalLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(panelprincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelprincipalLayout.createSequentialGroup()
                        .addGroup(panelprincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelprincipalLayout.createSequentialGroup()
                                .addGroup(panelprincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(busuario)
                                    .addComponent(jLabel6)
                                    .addComponent(banadircita, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(panelprincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelprincipalLayout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel8)
                                        .addGap(105, 105, 105))
                                    .addGroup(panelprincipalLayout.createSequentialGroup()
                                        .addGroup(panelprincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(panelprincipalLayout.createSequentialGroup()
                                                .addGap(65, 65, 65)
                                                .addComponent(bcliente))
                                            .addGroup(panelprincipalLayout.createSequentialGroup()
                                                .addGap(45, 45, 45)
                                                .addGroup(panelprincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel15)
                                                    .addComponent(bborrarcita, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                        .addGap(45, 45, 45))))
                            .addGroup(panelprincipalLayout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addGap(290, 290, 290)))
                        .addGroup(panelprincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bbuscarcita, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelprincipalLayout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jLabel7))
                            .addComponent(jLabel16)
                            .addComponent(bfactura, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                        .addGroup(panelprincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bcerrarcita, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel19))
                        .addGap(47, 47, 47)
                        .addGroup(panelprincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel20)
                            .addComponent(bhistorialcliente, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36))
                    .addGroup(panelprincipalLayout.createSequentialGroup()
                        .addGroup(panelprincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(21, 21, 21))))
        );
        panelprincipalLayout.setVerticalGroup(
            panelprincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelprincipalLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel2)
                .addGap(19, 19, 19)
                .addGroup(panelprincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelprincipalLayout.createSequentialGroup()
                        .addGroup(panelprincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelprincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(bcliente)
                            .addComponent(busuario)))
                    .addGroup(panelprincipalLayout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(bfactura)))
                .addGap(18, 18, 18)
                .addGroup(panelprincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelprincipalLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                        .addGroup(panelprincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelprincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bborrarcita, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(banadircita, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelprincipalLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(panelprincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel19, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel20, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelprincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bbuscarcita, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(bcerrarcita, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(bhistorialcliente, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addGap(38, 38, 38))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelprincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelprincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    /**
     * Evento al clickar foto "Añadir Cita"
     * @param evt 
     */
    private void banadircitaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_banadircitaMouseClicked
        AnadirCita ventanaAnadirCita=new AnadirCita();
        dispose();

    }//GEN-LAST:event_banadircitaMouseClicked
    /**
     * Evento al clickar foto "Borrar Cita"
     * @param evt 
     */
    private void bborrarcitaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bborrarcitaMouseClicked
        BorrarCita ventanaBorrarCita=new BorrarCita();
        dispose();
    }//GEN-LAST:event_bborrarcitaMouseClicked
    /**
     * Evento al clickar foto "Buscar Cita"
     * @param evt 
     */
    private void bbuscarcitaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bbuscarcitaMouseClicked
        BuscarCita ventanaBuscarCita=new BuscarCita();
        dispose();
    }//GEN-LAST:event_bbuscarcitaMouseClicked
    /**
     * Evento al clickar foto "Cerrar Cita"
     * @param evt 
     */
    private void bcerrarcitaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bcerrarcitaMouseClicked
        CerrarCita ventanaCerrarCita=new CerrarCita();
        dispose();
    }//GEN-LAST:event_bcerrarcitaMouseClicked
    /**
     * Evento al clickar foto "Historial Cliente"
     * @param evt 
     */
    private void bhistorialclienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bhistorialclienteMouseClicked
        HistorialCliente ventanaHistorialCliente=new HistorialCliente();
        dispose();
    }//GEN-LAST:event_bhistorialclienteMouseClicked
    /**
     * Evento al clickar foto "Usuarios"
     * @param evt 
     */
    private void busuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_busuarioMouseClicked
        Usuarios ventanaUsuarios=new Usuarios();
        dispose();
    }//GEN-LAST:event_busuarioMouseClicked
    /**
     * Evento al clickar foto "Clientes"
     * @param evt 
     */
    private void bclienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bclienteMouseClicked
        Clientes ventanaClientes=new Clientes();
        dispose();
    }//GEN-LAST:event_bclienteMouseClicked
    /**
     * Evento al clickar foto "Facturas"
     * @param evt 
     */
    private void bfacturaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bfacturaMouseClicked
        Facturas ventanaFacturas=new Facturas();
        dispose();
    }//GEN-LAST:event_bfacturaMouseClicked

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
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
            }
        });
    }
public void mostrar(){
    setVisible(true);
}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel banadircita;
    private javax.swing.JLabel batras;
    private javax.swing.JLabel batras1;
    private javax.swing.JLabel bañadircita;
    private javax.swing.JLabel bañadircita1;
    private javax.swing.JLabel bborrarcita;
    private javax.swing.JLabel bbuscarcita;
    private javax.swing.JLabel bcancelarcita;
    private javax.swing.JLabel bcancelarcita1;
    private javax.swing.JLabel bcerrarcita;
    private javax.swing.JLabel bcliente;
    private javax.swing.JLabel bfactura;
    private javax.swing.JLabel bhistorialcliente;
    private javax.swing.JLabel busuario;
    private javax.swing.JTextField indescripcion;
    private javax.swing.JTextField indescripcion1;
    private javax.swing.JTextField inestado;
    private javax.swing.JTextField inestado1;
    private javax.swing.JTextField infechahora;
    private javax.swing.JTextField infechahora1;
    private javax.swing.JTextField inmatricula;
    private javax.swing.JTextField inmatricula1;
    private javax.swing.JTextField inprecio;
    private javax.swing.JTextField inprecio1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel labelfechahora;
    private javax.swing.JLabel labelfechahora1;
    private javax.swing.JPanel panelacita;
    private javax.swing.JPanel panelacita1;
    public static javax.swing.JPanel panelprincipal;
    // End of variables declaration//GEN-END:variables
}
