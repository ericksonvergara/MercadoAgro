/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import clases.Conexion;
import java.awt.Color;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author SENA
 */
public class usuariovista extends javax.swing.JFrame {
public long ced_usu;
    int    xMouse, yMouse;
    
    public usuariovista() {
        initComponents();
       
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        imgfondo = new javax.swing.JPanel();
        btnminimi = new javax.swing.JLabel();
        btncerrar = new javax.swing.JLabel();
        btnentrar = new javax.swing.JLabel();
        checkbox1 = new java.awt.Checkbox();
        imglogo = new javax.swing.JLabel();
        usuario = new javax.swing.JTextField();
        contraseña = new javax.swing.JPasswordField();
        lgusuario = new javax.swing.JLabel();
        lgpassword = new javax.swing.JLabel();
        fondousu = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);

        imgfondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnminimi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/minimizar.png"))); // NOI18N
        btnminimi.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnminimi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnminimiMouseClicked(evt);
            }
        });
        imgfondo.add(btnminimi, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 0, -1, -1));

        btncerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/apagar.png"))); // NOI18N
        btncerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btncerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btncerrarMouseClicked(evt);
            }
        });
        imgfondo.add(btncerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 0, -1, 30));

        btnentrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btninicio2.png"))); // NOI18N
        btnentrar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnentrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnentrarMouseClicked(evt);
            }
        });
        imgfondo.add(btnentrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 310, 130, 30));

        checkbox1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        checkbox1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        checkbox1.setLabel("Recuerdame");
        imgfondo.add(checkbox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 260, -1, -1));

        imglogo.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        imglogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logo.png"))); // NOI18N
        imgfondo.add(imglogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, -1, -1));

        usuario.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        usuario.setForeground(new java.awt.Color(204, 204, 204));
        usuario.setText("Ingrese Usuario");
        usuario.setToolTipText("");
        usuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                usuarioKeyPressed(evt);
            }
        });
        imgfondo.add(usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, 168, 35));

        contraseña.setForeground(new java.awt.Color(204, 204, 204));
        contraseña.setText("******");
        contraseña.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                contraseñaKeyPressed(evt);
            }
        });
        imgfondo.add(contraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 210, 168, 35));

        lgusuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/lgusuario2.png"))); // NOI18N
        imgfondo.add(lgusuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 160, -1, 35));

        lgpassword.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/contrasena2.png"))); // NOI18N
        imgfondo.add(lgpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 210, -1, 35));

        fondousu.setBackground(new java.awt.Color(51, 255, 255));
        fondousu.setForeground(new java.awt.Color(51, 255, 255));
        fondousu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondolog.jpg"))); // NOI18N
        imgfondo.add(fondousu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 500));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(imgfondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(imgfondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnentrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnentrarMouseClicked
    
        try {
            Conexion con = new Conexion();
            con.ConexionPostgres();

            String query ="select * from usuario where user_usuario = '"+ usuario.getText()+"' and pass_usuario ='"+String.valueOf(contraseña.getPassword())+"'";

            ResultSet rs = con.consultar(query);
            
            if(rs.next()){
                
                iniciovista abrir = new iniciovista();
                abrir.setVisible(true);
                
                usuariovista.this.dispose();
                
            }
            else{
                JOptionPane.showMessageDialog(this, "¡El usuario o Contraseña son incorrectos!");
            }
            con.cerrar();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(usuariovista.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(usuariovista.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(usuariovista.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(usuariovista.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_btnentrarMouseClicked

    private void usuarioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_usuarioKeyPressed
        // TODO add your handling code here:
        if(usuario.getText().equals("Ingrese Usuario")){
            usuario.setText("");
            usuario.setForeground(Color.BLACK);
        }
        
        if(String.valueOf(contraseña.getPassword()).isEmpty()){
            contraseña.setText("******");
            contraseña.setForeground(Color.GRAY);
            
        }
    }//GEN-LAST:event_usuarioKeyPressed

    private void contraseñaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_contraseñaKeyPressed
        // TODO add your handling code here:
        if(String.valueOf(contraseña.getPassword()).equals("******")){
            contraseña.setText("");
            contraseña.setForeground(Color.BLACK);
        }
        
        if(usuario.getText().isEmpty()){
            usuario.setText("Ingrese Usuario");
            usuario.setForeground(Color.GRAY);
        }
    }//GEN-LAST:event_contraseñaKeyPressed

    private void btncerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btncerrarMouseClicked

        try{
            int dialogButton =  JOptionPane.YES_NO_OPTION;
            int result = JOptionPane.showConfirmDialog(null,"Desea cerrar el sistema?", "EXIT", dialogButton);
            if(result == 0){
                System.exit(0);
            }
        } catch(Exception e){
            JOptionPane.showMessageDialog(this, e);
        }

    }//GEN-LAST:event_btncerrarMouseClicked

    private void btnminimiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnminimiMouseClicked

        this.setState(GUI.iniciovista.ICONIFIED);
    }//GEN-LAST:event_btnminimiMouseClicked

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
            java.util.logging.Logger.getLogger(usuariovista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(usuariovista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(usuariovista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(usuariovista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new usuariovista().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btncerrar;
    private javax.swing.JLabel btnentrar;
    private javax.swing.JLabel btnminimi;
    private java.awt.Checkbox checkbox1;
    private javax.swing.JPasswordField contraseña;
    private javax.swing.JLabel fondousu;
    private javax.swing.JPanel imgfondo;
    private javax.swing.JLabel imglogo;
    private javax.swing.JLabel lgpassword;
    private javax.swing.JLabel lgusuario;
    public static javax.swing.JTextField usuario;
    // End of variables declaration//GEN-END:variables
}
