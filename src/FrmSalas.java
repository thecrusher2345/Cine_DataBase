/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author usuario
 */

import java.awt.event.*;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.DefaultComboBoxModel;
import jdk.internal.foreign.abi.aarch64.TypeClass;


public class FrmSalas extends javax.swing.JFrame {

    /**
     * Creates new form FrmSalas
     */
    public FrmSalas() {
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

        lblID = new javax.swing.JLabel();
        lblnombresala = new javax.swing.JLabel();
        lblcapacidad = new javax.swing.JLabel();
        txtid = new javax.swing.JTextField();
        txtnombre = new javax.swing.JTextField();
        txtcapacidad = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTsalas = new javax.swing.JTable();
        btnnuevo = new javax.swing.JButton();
        btnenviar = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        combjframe = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        lblID.setText("ID");

        lblnombresala.setText("Nombre");

        lblcapacidad.setText("Cantidad");

        txtid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtidActionPerformed(evt);
            }
        });

        txtnombre.setText("A-1");

        jTextField4.setText("jTextField4");

        JTsalas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Id", "Nombre", "Cantidad"
            }
        ));
        JTsalas.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                JTsalasAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        JTsalas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JTsalasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(JTsalas);

        btnnuevo.setText("Nuevo");
        btnnuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnuevoActionPerformed(evt);
            }
        });

        btnenviar.setText("Enviar");
        btnenviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnenviarActionPerformed(evt);
            }
        });

        jButton3.setText("Actualizar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Eliminar");

        combjframe.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Seleccione", "Cliente", "Salas" }));
        combjframe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combjframeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField4)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblID)
                            .addComponent(lblnombresala)
                            .addComponent(lblcapacidad))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtid, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 214, Short.MAX_VALUE)
                            .addComponent(txtnombre, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtcapacidad))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(combjframe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 444, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton3)
                        .addGap(18, 18, 18)
                        .addComponent(jButton4)
                        .addGap(18, 18, 18)
                        .addComponent(btnenviar)
                        .addGap(18, 18, 18)
                        .addComponent(btnnuevo)
                        .addGap(47, 47, 47))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblID)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(combjframe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblnombresala)
                    .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblcapacidad)
                    .addComponent(txtcapacidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnnuevo)
                    .addComponent(btnenviar)
                    .addComponent(jButton3)
                    .addComponent(jButton4))
                .addGap(52, 52, 52))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtidActionPerformed

    private void btnnuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnuevoActionPerformed
        // TODO add your handling code here:
        this.nuevo();
    }//GEN-LAST:event_btnnuevoActionPerformed

    private void btnenviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnenviarActionPerformed
        // TODO add your handling code here:
        this.enviar();
    }//GEN-LAST:event_btnenviarActionPerformed

    private void JTsalasAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_JTsalasAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_JTsalasAncestorAdded

    private void JTsalasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JTsalasMouseClicked
        // TODO add your handling code here:
        this.MouseClick();
    }//GEN-LAST:event_JTsalasMouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try {
            // TODO add your handling code here:
            this.Actualizar();
        } catch (Exception ex) {
            Logger.getLogger(FrmSalas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
       this.mostrar(JTsalas, "SELECT * FROM salas s");
    }//GEN-LAST:event_formWindowOpened

    private void combjframeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combjframeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combjframeActionPerformed

    /**
     * @param args the command line arguments
     */
    public void nuevo() {
        try {
            SalaBeans sl = new SalaBeans();
            txtid.setText(""+sl.incremento());
            txtnombre.setText("");
            txtcapacidad.setText("");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error" + e.toString());
        }

    }

    public void enviar() {
        try {
            SalaBeans sb = new SalaBeans();
            sb.setSala_id((Integer.parseInt(txtid.getText())));
            sb.setNombre(txtnombre.getText());
            sb.setCapacidad(txtcapacidad.getText());
            sb.insertar_salas();
            this.mostrar(JTsalas, "SELECT * FROM salas s");
            JOptionPane.showMessageDialog(null, "La Transaccion fue Exitosa!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Eror en la Transaccion" + e.toString());
        }
    }

    private void mostrar(javax.swing.JTable JT, String sql) {
        try {
            SalaBeans sl = new SalaBeans();
            ResultSet rs;
            DefaultTableModel model = new DefaultTableModel();
            JT.setModel(model);
            rs = sl.consultarTabla(sql);
            ResultSetMetaData rsmd;
            rsmd = rs.getMetaData();
            int cantcolum = rsmd.getColumnCount();
            for (int i = 0; i < cantcolum; i++) {
                model.addColumn(rsmd.getColumnLabel(i+1));

            }
            while (rs.next()) {
                Object[] colum = new Object[cantcolum];
                for (int i = 0; i < cantcolum; i++) {
                    colum[i] = rs.getObject(i + 1);

                }
                model.addRow(colum);

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al Mostrar" + e.toString());
        }

    }
    
    private void MouseClick(){
        int fila= JTsalas.getSelectedRow();
        txtid.setText(JTsalas.getModel().getValueAt(fila, 0).toString());
        txtnombre.setText(JTsalas.getModel().getValueAt(fila, 1).toString());
        txtcapacidad.setText(JTsalas.getModel().getValueAt(fila, 3).toString());
        
    }
    
    
    
    public void Actualizar()throws Exception{
        try {
            SalaBeans sl = new SalaBeans();
            sl.setSala_id((Integer.parseInt(txtid.getText())));
            sl.setNombre(txtnombre.getText());
            sl.setCapacidad(txtcapacidad.getText());
            sl.actulizar_salas();
            
            this.mostrar(JTsalas, "SELECT * FROM salas s");
            JOptionPane.showMessageDialog(null, "La Transaccion fue Exitosa!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Eror en la Transaccion" + e.toString());
        }
    }
    public void eliminar(){
        try {
            SalaBeans sl = new SalaBeans();
            sl.setSala_id((Integer.parseInt(txtid.getText())));
            sl.actulizar_salas();
            this.mostrar(JTsalas, "SELECT * FROM clientes c");
            JOptionPane.showMessageDialog(null, "La actualizacion fue exitosa");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " +e.toString());
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable JTsalas;
    private javax.swing.JButton btnenviar;
    private javax.swing.JButton btnnuevo;
    private javax.swing.JComboBox<String> combjframe;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JLabel lblID;
    private javax.swing.JLabel lblcapacidad;
    private javax.swing.JLabel lblnombresala;
    private javax.swing.JTextField txtcapacidad;
    private javax.swing.JTextField txtid;
    private javax.swing.JTextField txtnombre;
    // End of variables declaration//GEN-END:variables
}