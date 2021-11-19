/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VPrincipal;

import BaseDatos.Conexion;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author santy
 */
public class ingresar extends javax.swing.JFrame {

    Conexion con = new Conexion();
    Connection cn;
    PreparedStatement ps;
    Statement st;
    ResultSet rs;

    DefaultTableModel modelo = new DefaultTableModel();

    /**
     * Creates new form ingresar
     */
    public ingresar() {
        setBounds(450, 150, 500, 500); // centrar el panel
        initComponents();
        Listar();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jplaca = new javax.swing.JLabel();
        PLacatxt = new javax.swing.JTextField();
        jplaca1 = new javax.swing.JLabel();
        NombrePropietario = new javax.swing.JTextField();
        entrada = new javax.swing.JLabel();
        HoraEntrada = new javax.swing.JTextField();
        Salida = new javax.swing.JLabel();
        HoraSalida = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        registrar = new javax.swing.JButton();
        Volver = new javax.swing.JButton();
        BotonEliminar = new javax.swing.JButton();
        BotonRegistrarSalida = new javax.swing.JButton();
        EliminarTodo = new javax.swing.JButton();
        Buscar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jplaca.setBackground(new java.awt.Color(255, 255, 255));
        jplaca.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jplaca.setForeground(new java.awt.Color(255, 255, 255));
        jplaca.setText("Registro de placa");

        PLacatxt.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        PLacatxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PLacatxtActionPerformed(evt);
            }
        });

        jplaca1.setBackground(new java.awt.Color(255, 255, 255));
        jplaca1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jplaca1.setForeground(new java.awt.Color(255, 255, 255));
        jplaca1.setText("Nombre propietario");

        NombrePropietario.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        NombrePropietario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NombrePropietarioActionPerformed(evt);
            }
        });

        entrada.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        entrada.setForeground(new java.awt.Color(255, 255, 255));
        entrada.setText("Hora de entrada");

        HoraEntrada.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        HoraEntrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HoraEntradaActionPerformed(evt);
            }
        });

        Salida.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Salida.setForeground(new java.awt.Color(255, 255, 255));
        Salida.setText("Hora de Salida");

        HoraSalida.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        //TABLA NO EDITABLE
        jTable1 = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex,int colIndex){
                return false;
            }
        };
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Placa", "Nombre", "Hora entrada", "Hora salida"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        registrar.setBackground(new java.awt.Color(102, 153, 255));
        registrar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        registrar.setForeground(new java.awt.Color(255, 255, 255));
        registrar.setText("Registrar");
        registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarActionPerformed(evt);
            }
        });

        Volver.setBackground(new java.awt.Color(102, 153, 255));
        Volver.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Volver.setForeground(new java.awt.Color(255, 255, 255));
        Volver.setText("Volver");
        Volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VolverActionPerformed(evt);
            }
        });

        BotonEliminar.setText("Eliminar");
        BotonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonEliminarActionPerformed(evt);
            }
        });

        BotonRegistrarSalida.setText("Registrar Salida");
        BotonRegistrarSalida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonRegistrarSalidaActionPerformed(evt);
            }
        });

        EliminarTodo.setText("Eliminar todo");
        EliminarTodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarTodoActionPerformed(evt);
            }
        });

        Buscar.setText("Buscar Placa");
        Buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jplaca, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jplaca1, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(PLacatxt, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                    .addComponent(NombrePropietario))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(EliminarTodo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BotonEliminar)
                        .addGap(101, 101, 101)
                        .addComponent(Volver, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 491, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(entrada)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(25, 25, 25)
                                        .addComponent(Buscar)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(HoraEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(Salida, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(HoraSalida, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(BotonRegistrarSalida, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(46, 46, 46)
                                        .addComponent(registrar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(21, 21, 21)))))
                        .addContainerGap(14, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jplaca, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PLacatxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jplaca1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NombrePropietario, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(entrada, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Salida, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(HoraEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(HoraSalida, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(registrar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonRegistrarSalida)
                    .addComponent(Buscar))
                .addGap(33, 33, 33)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EliminarTodo)
                    .addComponent(Volver, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonEliminar))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PLacatxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PLacatxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PLacatxtActionPerformed

    private void NombrePropietarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NombrePropietarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NombrePropietarioActionPerformed

    private void registrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarActionPerformed
        Agregar();
        Listar();
        limpiarTxt();
    }//GEN-LAST:event_registrarActionPerformed

    private void VolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VolverActionPerformed
        limpiarTxt();
        vPrincipal CambiaVentana = new vPrincipal();
        CambiaVentana.setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_VolverActionPerformed

    private void BotonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonEliminarActionPerformed
        Eliminar();
        Listar();
        limpiarTxt();
    }//GEN-LAST:event_BotonEliminarActionPerformed

    private void EliminarTodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarTodoActionPerformed
        EliminarTodo();
        Listar();
        limpiarTxt();
    }//GEN-LAST:event_EliminarTodoActionPerformed

    private void BotonRegistrarSalidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonRegistrarSalidaActionPerformed
        editarSalida();
        Listar();
        limpiarTxt();

    }//GEN-LAST:event_BotonRegistrarSalidaActionPerformed

    private void HoraEntradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HoraEntradaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_HoraEntradaActionPerformed

    private void BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarActionPerformed
        buscar();
    }//GEN-LAST:event_BuscarActionPerformed
    public void Eliminar() {
        String sql = "DELETE FROM registrodia WHERE placa ='"
                + PLacatxt.getText() + "'";
        int i = JOptionPane.showConfirmDialog(null, "¿Seguro que desea eliminar?");
        if (i == 0) {
            try {
                cn = con.getConnection();
                st = cn.createStatement();
                st.executeUpdate(sql);
                JOptionPane.showMessageDialog(null, "Usuario eliminado");

            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "No se puede eliminar ");
            }
        } else {
            JOptionPane.showMessageDialog(null, "eliminacion cancelada");
        }

    }

    public void EliminarTodo() {

        String sql = "DELETE from registrodia";
        try {
            cn = con.getConnection();
            st = cn.createStatement();
            st.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Se borro todo con exito ");

        } catch (Exception e) {

        }

    }

    public void Agregar() {
        String nombre = NombrePropietario.getText();
        String placa = PLacatxt.getText();
        String entrada = HoraEntrada.getText();
        String salida = "00:00:00";
        if (nombre.equals("") | placa.equals("") | entrada.equals("")) {
            JOptionPane.showMessageDialog(null, "Las cajas estan vacias");

        } else {
            String sql = "insert into registrodia(nombre,placa,horaentrada,horasalida)"
                    + "values('" + nombre + "','" + placa + "','" + entrada + "','" + salida + "')";
            try {
                cn = con.getConnection();
                st = cn.createStatement();
                st.executeUpdate(sql);
                JOptionPane.showMessageDialog(null, "Registrado");

            } catch (Exception e) {
            }
        }

    }

    public void Listar() {
        LimpiaTabla();
        String sql = "select * from registrodia";
        try {
            cn = con.getConnection();
            st = cn.createStatement();
            rs = st.executeQuery(sql);
            Object[] vehiculo = new Object[4];
            modelo = (DefaultTableModel) jTable1.getModel();
            while (rs.next()) {

                vehiculo[0] = rs.getString("placa");
                vehiculo[1] = rs.getString("nombre");
                vehiculo[2] = rs.getTime("horaentrada");
                vehiculo[3] = rs.getTime("horasalida");

                modelo.addRow(vehiculo);
            }
            jTable1.setModel(modelo);
        } catch (SQLException e) {
        }
    }

    public void LimpiaTabla() {
        for (int i = modelo.getRowCount() - 1; i >= 0; i--) {
            modelo.removeRow(i);
        }
    }

    public void editarSalida() {
        try {
            ps = cn.prepareStatement("UPDATE registrodia SET nombre=?, "
                    + "horaentrada=?, horasalida=? WHERE registrodia.placa=? ");
            ps.setString(1, NombrePropietario.getText());
            ps.setString(2, HoraEntrada.getText());
            ps.setString(3, HoraSalida.getText());
            ps.setString(4, PLacatxt.getText());
            ps.executeLargeUpdate();
            JOptionPane.showMessageDialog(null, Tarifa());
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No se puede modificar" + e);
        }

    }

    public String Tarifa() {
        
        return "Tarifa Parqueadero: $" ;
    }

    public void buscar() {
        try {
            ps = cn.prepareStatement("SELECT * FROM registrodia WHERE placa = ? ");
            ps.setString(1, PLacatxt.getText());

            rs = ps.executeQuery();
            if (rs.next()) {
                HoraSalida.setText(rs.getString("horasalida"));
                NombrePropietario.setText(rs.getString("nombre"));
                HoraEntrada.setText(rs.getString("horaentrada"));
            } else {
                JOptionPane.showMessageDialog(null, "verifique la placa");
                limpiarTxt();

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "no existe este usuario");
        }
    }

    public void limpiarTxt() {
        HoraSalida.setText("");
        PLacatxt.setText("");
        NombrePropietario.setText("");
        HoraEntrada.setText("");
    }

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
            java.util.logging.Logger.getLogger(ingresar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ingresar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ingresar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ingresar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ingresar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonEliminar;
    private javax.swing.JButton BotonRegistrarSalida;
    private javax.swing.JButton Buscar;
    private javax.swing.JButton EliminarTodo;
    private javax.swing.JTextField HoraEntrada;
    private javax.swing.JTextField HoraSalida;
    private javax.swing.JTextField NombrePropietario;
    private javax.swing.JTextField PLacatxt;
    private javax.swing.JLabel Salida;
    private javax.swing.JButton Volver;
    private javax.swing.JLabel entrada;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel jplaca;
    private javax.swing.JLabel jplaca1;
    private javax.swing.JButton registrar;
    // End of variables declaration//GEN-END:variables
}
