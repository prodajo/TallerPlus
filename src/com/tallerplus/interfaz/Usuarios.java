/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tallerplus.interfaz;

import com.tallerplus.files.Ficheros;
import com.tallerplus.gestion.GestionUsuarios;
import com.tallerplus.objetos.Usuario;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author dani_
 */
public class Usuarios extends javax.swing.JFrame {

    DefaultTableModel tabla = new DefaultTableModel();
    boolean edicion = false;
    int usuario_editar;
    /**
     * Creates new form Usuarios
     */
    public Usuarios() {
        initComponents();
        setLocationRelativeTo(null);
        setVisible(true);
        setResizable(false);

        //Columnas de la tabla
        tabla.addColumn("Usuario");
        tabla.addColumn("Contraseña");
        tabla.addColumn("Tipo");
        //Filas de la tabla
        for (Usuario elemento : Ficheros.usuarios) {
            String anadir[] = new String[3];
            anadir[0] = elemento.getUsuario();
            anadir[1] = elemento.getContrasena();
            anadir[2] = elemento.getTipo();
            tabla.addRow(anadir);
        }

        this.tablausuarios.setModel(tabla);
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
        batras = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablausuarios = new javax.swing.JTable();
        titulousuarios = new javax.swing.JLabel();
        bborrarusuario = new javax.swing.JLabel();
        beditarusuario = new javax.swing.JLabel();
        banadirusuario = new javax.swing.JLabel();
        inusuario = new javax.swing.JTextField();
        incontrasena = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        combotipo = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Usuarios");
        setMinimumSize(new java.awt.Dimension(900, 500));
        setResizable(false);
        setSize(new java.awt.Dimension(900, 500));

        jPanel1.setBackground(new java.awt.Color(109, 132, 180));

        batras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/tallerplus/icon/flecha-hacia-la-izquierda.png"))); // NOI18N
        batras.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                batrasMouseClicked(evt);
            }
        });

        tablausuarios.setColumnSelectionAllowed(true);
        jScrollPane1.setViewportView(tablausuarios);
        tablausuarios.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        titulousuarios.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        titulousuarios.setForeground(new java.awt.Color(255, 255, 255));
        titulousuarios.setText("Usuarios");

        bborrarusuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/tallerplus/icon/002-usuario-1.png"))); // NOI18N
        bborrarusuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bborrarusuarioMouseClicked(evt);
            }
        });

        beditarusuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/tallerplus/icon/001-usuario-2.png"))); // NOI18N
        beditarusuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                beditarusuarioMouseClicked(evt);
            }
        });

        banadirusuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/tallerplus/icon/003-usuario.png"))); // NOI18N
        banadirusuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                banadirusuarioMouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Contraseña");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Tipo");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Usuario");

        combotipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "mecanico", "recepcion", "admin" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(titulousuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(batras))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(inusuario, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(banadirusuario)
                                .addGap(18, 18, 18)
                                .addComponent(beditarusuario)
                                .addGap(18, 18, 18)
                                .addComponent(bborrarusuario))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(combotipo, javax.swing.GroupLayout.Alignment.LEADING, 0, 131, Short.MAX_VALUE)
                                .addComponent(incontrasena, javax.swing.GroupLayout.Alignment.LEADING)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 529, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(30, 30, 30))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(titulousuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(batras))
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(inusuario, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(incontrasena, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(combotipo, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(76, 76, 76)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(beditarusuario, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(bborrarusuario, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(banadirusuario, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void batrasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_batrasMouseClicked
        VentanaPrincipal venanaprincipal = new VentanaPrincipal();
        edicion = false;
        dispose();
    }//GEN-LAST:event_batrasMouseClicked
    /**
     * Botón añadir usuario.
     *
     * @param evt
     */
    private void banadirusuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_banadirusuarioMouseClicked
        if (edicion == false) {
            String anadir[] = new String[3];
            anadir[0] = inusuario.getText();
            anadir[1] = incontrasena.getText();
            anadir[2] = (String) combotipo.getSelectedItem();
            boolean repetido = GestionUsuarios.anadirUsuario(anadir[0], anadir[1], anadir[2]);
            if (repetido == false) {
                tabla.addRow(anadir);
            }
        } else {
            if (usuario_editar==0) {
                GestionUsuarios.editarUsuario(usuario_editar,"admin", incontrasena.getText(), "admin");
                JOptionPane.showMessageDialog(null, "Al usuario Admin sólo se le puede cambiar la contraseña, contraseña cambiada", "Información", 1);
            } else {
                GestionUsuarios.editarUsuario(usuario_editar,inusuario.getText(), incontrasena.getText(), (String) combotipo.getSelectedItem());
            }

            //Borramos contenido anterior de la tabla
            for (int i = 0; i < tabla.getRowCount(); i++) {
                tabla.removeRow(i);
                i -= 1;
            }
            //Filas de la tabla
            for (Usuario elemento : Ficheros.usuarios) {
                String anadir[] = new String[3];
                anadir[0] = elemento.getUsuario();
                anadir[1] = elemento.getContrasena();
                anadir[2] = elemento.getTipo();
                tabla.addRow(anadir);
            }
            this.tablausuarios.setModel(tabla);
            edicion = false;
        }
        inusuario.setText("");
        incontrasena.setText("");
    }//GEN-LAST:event_banadirusuarioMouseClicked
    /**
     * Botón para eliminar un usuario.
     *
     * @param evt
     */
    private void bborrarusuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bborrarusuarioMouseClicked
        int eliminar = tablausuarios.getSelectedRow();
        if (eliminar >= 0) {
            boolean correcto = GestionUsuarios.borrarUsuario(Ficheros.usuarios.get(eliminar).getUsuario());
            if (correcto != false) {
                tabla.removeRow(eliminar);
            }
        } else {
            JOptionPane.showMessageDialog(null, "No hay usuarios para eliminar.", "Error", 0);
        }
        edicion = false;
    }//GEN-LAST:event_bborrarusuarioMouseClicked

    private void beditarusuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_beditarusuarioMouseClicked
        int editar = tablausuarios.getSelectedRow();
        if (editar >= 0) {
            inusuario.setText(tablausuarios.getValueAt(editar, 0).toString());
            incontrasena.setText(tablausuarios.getValueAt(editar, 1).toString());
            if(tablausuarios.getValueAt(editar,2).equals("admin"))
                    combotipo.setSelectedIndex(2);
            else if(tablausuarios.getValueAt(editar,2).equals("recepcion"))
                    combotipo.setSelectedIndex(1);
            else
                combotipo.setSelectedIndex(0);
            usuario_editar=editar;
            edicion = true;
        } else {
            JOptionPane.showMessageDialog(null, "Seleccione un usuario", "Error", 1);
        }
    }//GEN-LAST:event_beditarusuarioMouseClicked

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
            java.util.logging.Logger.getLogger(Usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Usuarios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel banadirusuario;
    private javax.swing.JLabel batras;
    private javax.swing.JLabel bborrarusuario;
    private javax.swing.JLabel beditarusuario;
    private javax.swing.JComboBox<String> combotipo;
    private javax.swing.JTextField incontrasena;
    private javax.swing.JTextField inusuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablausuarios;
    private javax.swing.JLabel titulousuarios;
    // End of variables declaration//GEN-END:variables
}
