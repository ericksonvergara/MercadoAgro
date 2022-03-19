/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import clases.Conexion;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.border.Border;
import javax.swing.table.DefaultTableModel;



/**
 *
 * @author Junior
 */
public class Buscar_Producto extends javax.swing.JFrame {

   Conexion con = new Conexion();
 private DefaultTableModel model; 
 
    public Buscar_Producto() {
        initComponents();
          buscarfamilia.setEnabled(false);
               setLocationRelativeTo(null);
       
        protoquery("producto");
                
    }
    
      

      
    
    
    void protoquery(String producto) {
        int o = 0;
        try {
            Conexion con1 = new Conexion();
            con1.ConexionPostgres();
            String query = "select * from producto order by id_producto";
            ResultSet rs5 = con1.consultar(query);
            ResultSetMetaData rsm = rs5.getMetaData();

            String data[][] = {};
            String[] col = new String[rsm.getColumnCount()];
            for (int i = 1; i <= rsm.getColumnCount(); i++) {
                col[i - 1] = rsm.getColumnName(i);

            }
            model = new DefaultTableModel(data, col);
            datos1.setModel(model);
            int x = 0;
            while (rs5.next()) {

                model.insertRow(x, new Object[]{}); //INSERTA FILA EN TIEMPO DE EJECUCION
                model.setValueAt(rs5.getInt("id_producto"), x, 0);
                model.setValueAt(rs5.getString("nombre_producto"), x, 1);
                model.setValueAt(rs5.getString("descripcion_producto"), x, 2);
                model.setValueAt(rs5.getLong("id_familia"), x, 3);
                model.setValueAt(rs5.getLong("nit_proveedor"), x, 4);
                model.setValueAt(rs5.getInt("stockminimo_producto"), x, 5);
                model.setValueAt(rs5.getInt("existencia_producto"), x, 6);
                model.setValueAt(rs5.getDouble("valor_producto"), x, 7);
                x++;

            }

        } catch (SQLException | ClassNotFoundException | InstantiationException | IllegalAccessException ex) {
            Logger.getLogger(Buscar_Producto.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    void busqueda(String valor) {
        int o = 0;
        try {

            Conexion con1 = new Conexion();
            con1.ConexionPostgres();
            String query = "select * from producto WHERE CONCAT (nombre_producto) ILIKE '" + valor + "%' order by id_producto";
            ResultSet rs5 = con1.consultar(query);
            ResultSetMetaData rsm = rs5.getMetaData();

            String data[][] = {};
            String[] col = new String[rsm.getColumnCount()];
            for (int i = 1; i <= rsm.getColumnCount(); i++) {
                col[i - 1] = rsm.getColumnName(i);

            }
            model = new DefaultTableModel(data, col);
            datos1.setModel(model);
            int x = 0;
            while (rs5.next()) {    

                model.insertRow(x, new Object[]{}); //INSERTA FILA EN TIEMPO DE EJECUCION
                model.setValueAt(rs5.getInt("id_producto"), x, 0);
                model.setValueAt(rs5.getString("nombre_producto"), x, 1);
                model.setValueAt(rs5.getString("descripcion_producto"), x, 2);
                model.setValueAt(rs5.getLong("id_familia"), x, 3);
                model.setValueAt(rs5.getLong("nit_proveedor"), x, 4);
                model.setValueAt(rs5.getInt("stockminimo_producto"), x, 5);
                model.setValueAt(rs5.getInt("existencia_producto"), x, 6);
                model.setValueAt(rs5.getDouble("valor_producto"), x, 7);
                x++;

            }

        } catch (SQLException | ClassNotFoundException | InstantiationException | IllegalAccessException ex) {
            Logger.getLogger(Buscar_Producto.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    
    
    
     void busqueda2(String valor) {
        int o = 0;
        try {

            Conexion con1 = new Conexion();
            con1.ConexionPostgres();
            String query = "select * from producto WHERE CONCAT (id_familia) ILIKE '" + valor + "%' order by id_producto";
            ResultSet rs5 = con1.consultar(query);
            ResultSetMetaData rsm = rs5.getMetaData();

            String data[][] = {};
            String[] col = new String[rsm.getColumnCount()];
            for (int i = 1; i <= rsm.getColumnCount(); i++) {
                col[i - 1] = rsm.getColumnName(i);

            }
            model = new DefaultTableModel(data, col);
            datos1.setModel(model);
            int x = 0;
            while (rs5.next()) {

                model.insertRow(x, new Object[]{}); //INSERTA FILA EN TIEMPO DE EJECUCION
                model.setValueAt(rs5.getInt("id_producto"), x, 0);
                model.setValueAt(rs5.getString("nombre_producto"), x, 1);
                model.setValueAt(rs5.getString("descripcion_producto"), x, 2);
                model.setValueAt(rs5.getLong("id_familia"), x, 3);
                model.setValueAt(rs5.getLong("nit_proveedor"), x, 4);
                model.setValueAt(rs5.getInt("stockminimo_producto"), x, 5);
                model.setValueAt(rs5.getInt("existencia_producto"), x, 6);
                model.setValueAt(rs5.getDouble("valor_producto"), x, 7);
                x++;

            }

        } catch (SQLException | ClassNotFoundException | InstantiationException | IllegalAccessException ex) {
            Logger.getLogger(Buscar_Producto.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        btnbuscarnombre = new javax.swing.JRadioButton();
        buscarnombre = new javax.swing.JTextField();
        btnbuscarfamilia = new javax.swing.JRadioButton();
        buscarfamilia = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        datos1 = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();

        jMenuItem1.setText("AGREGAR");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jPopupMenu1.add(jMenuItem1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnbuscarnombre.setSelected(true);
        btnbuscarnombre.setText("Bucar por Nombre:");
        btnbuscarnombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbuscarnombreActionPerformed(evt);
            }
        });
        jPanel1.add(btnbuscarnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        buscarnombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarnombreActionPerformed(evt);
            }
        });
        buscarnombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                buscarnombreKeyReleased(evt);
            }
        });
        jPanel1.add(buscarnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 20, 127, -1));

        btnbuscarfamilia.setText("Buscar por Categoria:");
        btnbuscarfamilia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbuscarfamiliaActionPerformed(evt);
            }
        });
        jPanel1.add(btnbuscarfamilia, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 20, -1, -1));

        buscarfamilia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                buscarfamiliaKeyReleased(evt);
            }
        });
        jPanel1.add(buscarfamilia, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 20, 138, -1));

        datos1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6"
            }
        ));
        datos1.setComponentPopupMenu(jPopupMenu1);
        jScrollPane1.setViewportView(datos1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 770, 410));

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cerrar.png"))); // NOI18N
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 10, 40, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnbuscarnombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuscarnombreActionPerformed

        if (btnbuscarnombre.isSelected() == true) {
            buscarfamilia.setEnabled(false);
            buscarnombre.setEnabled(true);
            buscarfamilia.setText("");
            busqueda(buscarnombre.getText());
            btnbuscarfamilia.setSelected(false);
        }
    }//GEN-LAST:event_btnbuscarnombreActionPerformed

    private void buscarnombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarnombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buscarnombreActionPerformed

    private void buscarnombreKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_buscarnombreKeyReleased
        busqueda(buscarnombre.getText());
    }//GEN-LAST:event_buscarnombreKeyReleased

    private void btnbuscarfamiliaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuscarfamiliaActionPerformed

        if (btnbuscarfamilia.isSelected() == true) {
            buscarfamilia.setEnabled(true);
            buscarnombre.setEnabled(false);
            buscarnombre.setText("");
            busqueda2(buscarfamilia.getText());
            btnbuscarnombre.setSelected(false);
        }
    }//GEN-LAST:event_btnbuscarfamiliaActionPerformed

    private void buscarfamiliaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_buscarfamiliaKeyReleased
        busqueda2(buscarfamilia.getText());
    }//GEN-LAST:event_buscarfamiliaKeyReleased

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
    
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        this.dispose();
    }//GEN-LAST:event_jLabel10MouseClicked
            
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
            java.util.logging.Logger.getLogger(Buscar_Producto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Buscar_Producto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Buscar_Producto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Buscar_Producto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Buscar_Producto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton btnbuscarfamilia;
    private javax.swing.JRadioButton btnbuscarnombre;
    private javax.swing.JTextField buscarfamilia;
    private javax.swing.JTextField buscarnombre;
    private javax.swing.JTable datos1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
