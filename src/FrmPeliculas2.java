
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */

/**
 *
 * @author usuario
 */
public class FrmPeliculas2 extends javax.swing.JPanel {

    /**
     * Creates new form FrmPeliculas2
     */
    public FrmPeliculas2() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jtpeliculas = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnactualizar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        btneliminar = new javax.swing.JButton();
        txtid = new javax.swing.JTextField();
        btnenviar = new javax.swing.JButton();
        txttitulo = new javax.swing.JTextField();
        btnnuevo = new javax.swing.JButton();
        txtgenero = new javax.swing.JTextField();
        txtduracion = new javax.swing.JTextField();
        txtclasificacion = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(242, 239, 223));

        jtpeliculas.setBackground(new java.awt.Color(208, 217, 212));
        jtpeliculas.setForeground(new java.awt.Color(89, 85, 76));
        jtpeliculas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Id", "Titulo", "Genero", "Duracion", "Clasificacion"
            }
        ));
        jtpeliculas.setGridColor(new java.awt.Color(89, 85, 76));
        jScrollPane1.setViewportView(jtpeliculas);

        jLabel3.setBackground(new java.awt.Color(208, 217, 212));
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("Genero");

        jLabel4.setBackground(new java.awt.Color(208, 217, 212));
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("Duracion");

        btnactualizar.setBackground(new java.awt.Color(89, 85, 76));
        btnactualizar.setForeground(new java.awt.Color(208, 217, 212));
        btnactualizar.setText("Actualizar");
        btnactualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnactualizarActionPerformed(evt);
            }
        });

        jLabel5.setBackground(new java.awt.Color(208, 217, 212));
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("Clasificacion");

        btneliminar.setBackground(new java.awt.Color(89, 85, 76));
        btneliminar.setForeground(new java.awt.Color(208, 217, 212));
        btneliminar.setText("Eliminar");

        txtid.setBackground(new java.awt.Color(208, 217, 212));
        txtid.setForeground(new java.awt.Color(89, 85, 76));
        txtid.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        btnenviar.setBackground(new java.awt.Color(89, 85, 76));
        btnenviar.setForeground(new java.awt.Color(208, 217, 212));
        btnenviar.setText("Enviar");
        btnenviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnenviarActionPerformed(evt);
            }
        });

        txttitulo.setBackground(new java.awt.Color(208, 217, 212));
        txttitulo.setForeground(new java.awt.Color(89, 85, 76));
        txttitulo.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txttitulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttituloActionPerformed(evt);
            }
        });

        btnnuevo.setBackground(new java.awt.Color(89, 85, 76));
        btnnuevo.setForeground(new java.awt.Color(208, 217, 212));
        btnnuevo.setText("Nuevo");
        btnnuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnuevoActionPerformed(evt);
            }
        });

        txtgenero.setBackground(new java.awt.Color(208, 217, 212));
        txtgenero.setForeground(new java.awt.Color(89, 85, 76));
        txtgenero.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        txtduracion.setBackground(new java.awt.Color(208, 217, 212));
        txtduracion.setForeground(new java.awt.Color(89, 85, 76));
        txtduracion.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        txtclasificacion.setBackground(new java.awt.Color(208, 217, 212));
        txtclasificacion.setForeground(new java.awt.Color(89, 85, 76));
        txtclasificacion.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txtclasificacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtclasificacionActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(208, 217, 212));
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Id");

        jTextField6.setBackground(new java.awt.Color(208, 217, 212));
        jTextField6.setForeground(new java.awt.Color(89, 85, 76));
        jTextField6.setText("Buscar.....");
        jTextField6.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(208, 217, 212));
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Titulo");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(154, 154, 154)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnactualizar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btneliminar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnenviar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnnuevo))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(63, 63, 63)
                        .addComponent(txtgenero))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(53, 53, 53)
                        .addComponent(txtduracion))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(34, 34, 34)
                        .addComponent(txtclasificacion))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(91, 91, 91)
                        .addComponent(txtid))
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 387, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(71, 71, 71)
                        .addComponent(txttitulo)))
                .addGap(229, 229, 229))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txttitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtgenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtduracion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtclasificacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnactualizar)
                    .addComponent(btneliminar)
                    .addComponent(btnenviar)
                    .addComponent(btnnuevo))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnactualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnactualizarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnactualizarActionPerformed

    private void btnenviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnenviarActionPerformed
        // TODO add your handling code here:
        this.enviar();
    }//GEN-LAST:event_btnenviarActionPerformed

    private void txttituloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttituloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txttituloActionPerformed

    private void btnnuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnuevoActionPerformed
        // TODO add your handling code here:
        this.nuevo();
    }//GEN-LAST:event_btnnuevoActionPerformed

    private void txtclasificacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtclasificacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtclasificacionActionPerformed

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField6ActionPerformed
   public void nuevo(){
        try {
            PeliculasBeans pb = new PeliculasBeans();
            txtid.setText(""+pb.incremento());
            txttitulo.setText("");
            txtgenero.setText("");
            txtduracion.setText("");
            txtclasificacion.setText("");
            this.mostrar(jtpeliculas, "SELECT * FROM peliculas p");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Error"+ e.toString());
        }
    }
    
    
    public void mostrar(javax.swing.JTable JT, String sql) {
        try {
            PeliculasBeans pb = new PeliculasBeans();
            ResultSet rs;
            DefaultTableModel model = new DefaultTableModel();
            JT.setModel(model);
            rs = pb.consultarTabla(sql);
            ResultSetMetaData rsmd;
            rsmd = rs.getMetaData();
            
            int cantcolum = rsmd.getColumnCount();
            for (int i = 0; i < cantcolum; i++) {
                model.addColumn(rsmd.getColumnLabel(i + 1));

            }
            while (rs.next()) {
                Object[] colum = new Object[cantcolum];
                for (int i = 0; i < cantcolum; i++) {
                    colum[i] = rs.getObject(i + 1);
                }
                model.addRow(colum);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error" + e.toString());
        }
    }
    
    public void enviar(){
        try {
            PeliculasBeans pb = new PeliculasBeans();
            pb.setPelicula_id(Integer.parseInt(txtid.getText()));
            pb.setTitulo(txttitulo.getText());
             pb.setGenero(txtgenero.getText());
              pb.setDuracion(txtduracion.getText());
               pb.setClasificacion(txtclasificacion.getText());
               pb.insertar_pelicula();
            this.mostrar(jtpeliculas, "SELECT * FROM peliculas p");
        } catch (Exception e) {
        }
    }
    private void MouseClick(){
        int fila= jtpeliculas.getSelectedRow();
        txtid.setText(jtpeliculas.getModel().getValueAt(fila, 0).toString());
        txttitulo.setText(jtpeliculas.getModel().getValueAt(fila, 1).toString());
        txtgenero.setText(jtpeliculas.getModel().getValueAt(fila, 2).toString());
        txtduracion.setText(jtpeliculas.getModel().getValueAt(fila, 2).toString());
        txtclasificacion.setText(jtpeliculas.getModel().getValueAt(fila, 2).toString());
    }
    public void Actualizar()throws Exception{
        try {
            PeliculasBeans pb = new PeliculasBeans();
            pb.setPelicula_id((Integer.parseInt(txtid.getText())));
            pb.setTitulo(txttitulo.getText());
            pb.setGenero(txtgenero.getText());
            pb.setDuracion(txtduracion.getText());
            pb.setClasificacion(txtclasificacion.getText());
            pb.actulizar_pelicula();
            
            this.mostrar(jtpeliculas, "SELECT * FROM peliculas p");
            JOptionPane.showMessageDialog(null, "La Transaccion fue Exitosa!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Eror en la Transaccion" + e.toString());
        }
    }
    public void eliminar(){
        try {
            PeliculasBeans cb = new PeliculasBeans();
            cb.setPelicula_id(Integer.parseInt(txtid.getText()));
            cb.actulizar_pelicula();
            this.mostrar(jtpeliculas, "SELECT * FROM peliculas p");
            JOptionPane.showMessageDialog(null, "La actualizacion fue exitosa");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " +e.toString());
        }
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnactualizar;
    private javax.swing.JButton btneliminar;
    private javax.swing.JButton btnenviar;
    private javax.swing.JButton btnnuevo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTable jtpeliculas;
    private javax.swing.JTextField txtclasificacion;
    private javax.swing.JTextField txtduracion;
    private javax.swing.JTextField txtgenero;
    private javax.swing.JTextField txtid;
    private javax.swing.JTextField txttitulo;
    // End of variables declaration//GEN-END:variables
}
