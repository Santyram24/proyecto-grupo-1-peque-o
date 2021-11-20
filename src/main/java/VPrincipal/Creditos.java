/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package VPrincipal;

/**
 *
 * @author AsusTek
 */
public class Creditos extends javax.swing.JFrame {

    /** Creates new form Creditos */
    public Creditos() {
        setBounds(450,150,500,500); // centrar el panel
      
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        listar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(102, 153, 255));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setText("\n           Ana Ximena Vanegas Mateus\n             Santiago Ramirez Muñoz\n           Diego Alexander Garcia Gil\n                           UDEC");
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 21, 280, 120));

        listar.setBackground(new java.awt.Color(102, 153, 255));
        listar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        listar.setForeground(new java.awt.Color(255, 255, 255));
        listar.setText("Volver");
        listar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listarActionPerformed(evt);
            }
        });
        getContentPane().add(listar, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 170, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo2.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 300, 220));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void listarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listarActionPerformed
       vPrincipal CambiaVentana = new vPrincipal();
      CambiaVentana.setVisible(true);
      this.setVisible(false);
    }//GEN-LAST:event_listarActionPerformed

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JButton listar;
    // End of variables declaration//GEN-END:variables

}
