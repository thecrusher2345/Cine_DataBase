

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author usuario
 */
public class FrmFunciones extends javax.swing.JFrame {

    /**
     * Creates new form FrmFunciones
     */
    public FrmFunciones() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtfuncionid = new javax.swing.JTextField();
        txtpeliculaid = new javax.swing.JTextField();
        txtsalaid = new javax.swing.JTextField();
        txtfecha = new javax.swing.JTextField();
        btnactualizar = new javax.swing.JButton();
        btneliminar = new javax.swing.JButton();
        btnenviar = new javax.swing.JButton();
        btnnuevo = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtpelicula = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtsalas = new javax.swing.JTable();
        jTextField5 = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        jtfunciones = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("FuncionID");

        jLabel2.setText("PeliculaID");

        jLabel3.setText("SalaID");

        jLabel4.setText("Fecha");

        btnactualizar.setText("Actualizar");
        btnactualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnactualizarActionPerformed(evt);
            }
        });

        btneliminar.setText("Eliminar");

        btnenviar.setText("Enviar");
        btnenviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnenviarActionPerformed(evt);
            }
        });

        btnnuevo.setText("Nuevo");
        btnnuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnuevoActionPerformed(evt);
            }
        });

        jtpelicula.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jtpelicula.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtpeliculaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtpelicula);

        jtsalas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jtsalas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtsalasMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jtsalas);

        jTextField5.setText("jTextField5");

        jtfunciones.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(jtfunciones);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(btnactualizar)
                        .addGap(18, 18, 18)
                        .addComponent(btneliminar)
                        .addGap(18, 18, 18)
                        .addComponent(btnenviar)
                        .addGap(18, 18, 18)
                        .addComponent(btnnuevo))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtfuncionid, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel4))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtfecha)
                                            .addComponent(txtsalaid)
                                            .addComponent(txtpeliculaid)))
                                    .addComponent(jTextField5)))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtfuncionid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtpeliculaid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtsalaid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtfecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane3))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnactualizar)
                    .addComponent(btneliminar)
                    .addComponent(btnenviar)
                    .addComponent(btnnuevo))
                .addGap(34, 34, 34))
        );

        pack();
    }// </editor-fold>                        
// </editor-fold>                        
// </editor-fold>                        
// </editor-fold>                        

    private void btnactualizarActionPerformed(java.awt.event.ActionEvent evt) {                                              
        // TODO add your handling code here:
    }                                             

    private void btnenviarActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
        this.enviar();

    }                                         

    private void btnnuevoActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        this.nuevo();

    }                                        

    private void jtpeliculaMouseClicked(java.awt.event.MouseEvent evt) {                                        
        // TODO add your handling code here:
        this.MouseClickpeliculas();
    }                                       

    private void jtsalasMouseClicked(java.awt.event.MouseEvent evt) {                                     
        // TODO add your handling code here:
        this.MouseClicksalas();
    }                                    

    /**
     * @param args the command line arguments
     */
    public void nuevo() {
        try {
            FuncionesBeans fb = new FuncionesBeans();
            LocalDateTime horactual = LocalDateTime.now();
            DateTimeFormatter formated = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
            String horactualformat = horactual.format(formated);
            txtfuncionid.setText(""+fb.incremento());
            txtpeliculaid.setText("");
            txtsalaid.setText("");
            txtfecha.setText(horactualformat);
            this.mostrar(jtpelicula, "SELECT * FROM peliculas p");
            this.mostrar(jtsalas, "SELECT * FROM salas s");
            this.mostrar(jtfunciones, "SELECT funciones.funcion_id, peliculas.titulo, salas.nombre, funciones.fecha_hora FROM funciones INNER JOIN peliculas ON funciones.pelicula_id = peliculas.pelicula_id join salas on funciones.sala_id=salas.sala_id;");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error" + e.toString());
        }

    }
    


    public void enviar() {
        try {
            FuncionesBeans fb = new FuncionesBeans();
            fb.setFuncion_id((Integer.parseInt(txtfuncionid.getText())));
            fb.setPelicula_id((Integer.parseInt(txtpeliculaid.getText())));
            fb.setSala_id((Integer.parseInt(txtsalaid.getText())));
            fb.setFecha_hora(txtfecha.getText());
            fb.insertar_funcion();
            this.mostrar(jtpelicula, "SELECT * FROM peliculas p");
            this.mostrar(jtsalas, "SELECT * FROM salas s");
            this.mostrar(jtfunciones, "SELECT funciones.funcion_id, peliculas.titulo, salas.nombre, funciones.fecha_hora FROM funciones INNER JOIN peliculas ON funciones.pelicula_id = peliculas.pelicula_id join salas on funciones.sala_id=salas.sala_id;");
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
    
    private void MouseClickpeliculas(){
        int fila1= jtpelicula.getSelectedRow();
        txtpeliculaid.setText(jtpelicula.getModel().getValueAt(fila1, 0).toString());
        
        
    }
    private void MouseClicksalas(){
        
        int fila2= jtsalas.getSelectedRow();
        txtsalaid.setText(jtsalas.getModel().getValueAt(fila2, 0).toString());
        
        
    }
    
    public void Actualizar()throws Exception{
        try {
            FuncionesBeans fb = new FuncionesBeans();
            fb.setFuncion_id((Integer.parseInt(txtfuncionid.getText())));
            fb.setPelicula_id(Integer.parseInt(txtpeliculaid.getText()));
            fb.setSala_id(Integer.parseInt(txtsalaid.getText()));
            fb.setSala_id(Integer.parseInt(txtfecha.getText()));
            fb.actulizar_funcion();
            
            this.mostrar(jtfunciones, "SELECT funciones.funcion_id, peliculas.titulo, salas.nombre, funciones.fecha_hora FROM funciones INNER JOIN peliculas ON funciones.pelicula_id = peliculas.pelicula_id join salas on funciones.sala_id=salas.sala_id;");
            JOptionPane.showMessageDialog(null, "La Transaccion fue Exitosa!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Eror en la Transaccion" + e.toString());
        }
    }
    
    public void eliminar(){
        try {
            FuncionesBeans fb = new FuncionesBeans();
            fb.setFuncion_id(Integer.parseInt(txtfuncionid.getText()));
            fb.actulizar_funcion();
            this.mostrar(jtfunciones, "SELECT funciones.funcion_id, peliculas.titulo, salas.nombre, funciones.fecha_hora FROM funciones INNER JOIN peliculas ON funciones.pelicula_id = peliculas.pelicula_id join salas on funciones.sala_id=salas.sala_id;");
  JOptionPane.showMessageDialog(null, "La actualizacion fue exitosa");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " +e.toString());
        }
    }
    
/*
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtfuncionid = new javax.swing.JTextField();
        txtpeliculaid = new javax.swing.JTextField();
        txtsalaid = new javax.swing.JTextField();
        txtfecha = new javax.swing.JTextField();
        btnactualizar = new javax.swing.JButton();
        btneliminar = new javax.swing.JButton();
        btnenviar = new javax.swing.JButton();
        btnnuevo = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtpelicula = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtsalas = new javax.swing.JTable();
        jTextField5 = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        jtfunciones = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("FuncionID");

        jLabel2.setText("PeliculaID");

        jLabel3.setText("SalaID");

        jLabel4.setText("Fecha");

        btnactualizar.setText("Actualizar");
        btnactualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnactualizarActionPerformed(evt);
            }
        });

        btneliminar.setText("Eliminar");

        btnenviar.setText("Enviar");
        btnenviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnenviarActionPerformed(evt);
            }
        });

        btnnuevo.setText("Nuevo");
        btnnuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnuevoActionPerformed(evt);
            }
        });

        jtpelicula.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jtpelicula.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtpeliculaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtpelicula);

        jtsalas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jtsalas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtsalasMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jtsalas);

        jTextField5.setText("jTextField5");

        jtfunciones.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(jtfunciones);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 50, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jTextField5)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtfuncionid, javax.swing.GroupLayout.DEFAULT_SIZE, 255, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel4))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(txtsalaid, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 257, Short.MAX_VALUE)
                                            .addComponent(txtfecha, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtpeliculaid))))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(19, 19, 19))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                                .addGap(24, 24, 24))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(btnactualizar)
                                .addGap(18, 18, 18)
                                .addComponent(btneliminar)
                                .addGap(18, 18, 18)
                                .addComponent(btnenviar)
                                .addGap(18, 18, 18)
                                .addComponent(btnnuevo)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtfuncionid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtpeliculaid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtsalaid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtfecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnactualizar)
                            .addComponent(btneliminar)
                            .addComponent(btnenviar)
                            .addComponent(btnnuevo))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 473, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnactualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnactualizarActionPerformed

    }//GEN-LAST:event_btnactualizarActionPerformed

    private void btnenviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnenviarActionPerformed

    }//GEN-LAST:event_btnenviarActionPerformed

    private void btnnuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnuevoActionPerformed

    }//GEN-LAST:event_btnnuevoActionPerformed

    private void jtpeliculaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtpeliculaMouseClicked
  
    }//GEN-LAST:event_jtpeliculaMouseClicked

    private void jtsalasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtsalasMouseClicked

    }//GEN-LAST:event_jtsalasMouseClicked

   
*/
        
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnactualizar;
    private javax.swing.JButton btneliminar;
    private javax.swing.JButton btnenviar;
    private javax.swing.JButton btnnuevo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTable jtfunciones;
    private javax.swing.JTable jtpelicula;
    private javax.swing.JTable jtsalas;
    private javax.swing.JTextField txtfecha;
    private javax.swing.JTextField txtfuncionid;
    private javax.swing.JTextField txtpeliculaid;
    private javax.swing.JTextField txtsalaid;
    // End of variables declaration//GEN-END:variables
}

