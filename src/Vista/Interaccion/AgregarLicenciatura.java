/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista.Interaccion;


import InternalFrame.InternalAgregarAlumno;
import Modelo.Eventos;
import Modelo.Licenciatura;
import Modelo.LicenciaturaDao;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ramos
 */
public class AgregarLicenciatura extends javax.swing.JFrame {
Eventos event = new Eventos();

Licenciatura lic = new Licenciatura();
LicenciaturaDao licenciaturaDao = new LicenciaturaDao();

DefaultTableModel modelo = new DefaultTableModel(); //para las tablas
DefaultTableModel tmp = new DefaultTableModel(); //para reportes

private InternalAgregarAlumno internalAgregarAlumno;


    public AgregarLicenciatura(InternalAgregarAlumno internalAgregarAlumno) {
        initComponents();
        this.internalAgregarAlumno = internalAgregarAlumno;
        
        limpiarLicenciatura();
        limpiarTable();
        listarLicenciatura();
    }

    private AgregarLicenciatura() {
    }

  public void listarLicenciatura(){
    List<Licenciatura> ListarLic = licenciaturaDao. ListarLicenciatura();
    modelo= (DefaultTableModel)tableLicenciatura.getModel();
    Object [] obj = new Object[3];
    for(int i = 0; i<ListarLic.size();i++){
        obj[0]= ListarLic.get(i).getRvoe();
        obj[1]= ListarLic.get(i).getNombreLicenciatura();
        obj[2]= ListarLic.get(i).getAbreviacion();
        modelo.addRow(obj);
        }
    tableLicenciatura.setModel(modelo);  
    }

  public void limpiarTable(){ 
// para que no se repitan los datos del cliente al mostrarse en las tablas
    for (int i=0; i<modelo.getRowCount();i++){
        modelo.removeRow(i);
        i= i-1;
    }
    } 
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtRvoe = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtNombreLicenciatura = new javax.swing.JTextField();
        panelAcciones = new javax.swing.JPanel();
        btnAgregarLicenciatura = new javax.swing.JButton();
        btnModificarLicenciatura = new javax.swing.JButton();
        btnCancelarLicenciatura = new javax.swing.JButton();
        btnEliminarLicenciatura = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableLicenciatura = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        txtAbreviacion = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("APARTADO LICENCIATURA");

        jLabel2.setText("RVOE:");

        txtRvoe.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtRvoeKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtRvoeKeyTyped(evt);
            }
        });

        jLabel3.setText("NOMBRE LICENCIATURA:");

        txtNombreLicenciatura.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNombreLicenciaturaKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreLicenciaturaKeyTyped(evt);
            }
        });

        panelAcciones.setBackground(new java.awt.Color(204, 255, 204));

        btnAgregarLicenciatura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/20xAgregar.png"))); // NOI18N
        btnAgregarLicenciatura.setText("Agregar");
        btnAgregarLicenciatura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarLicenciaturaActionPerformed(evt);
            }
        });

        btnModificarLicenciatura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/20xModificar.png"))); // NOI18N
        btnModificarLicenciatura.setText("Modificar");
        btnModificarLicenciatura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarLicenciaturaActionPerformed(evt);
            }
        });

        btnCancelarLicenciatura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/20xCancelar.png"))); // NOI18N
        btnCancelarLicenciatura.setText("Cancelar");
        btnCancelarLicenciatura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarLicenciaturaActionPerformed(evt);
            }
        });

        btnEliminarLicenciatura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/20xEliminar.png"))); // NOI18N
        btnEliminarLicenciatura.setText("Eliminar");
        btnEliminarLicenciatura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarLicenciaturaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelAccionesLayout = new javax.swing.GroupLayout(panelAcciones);
        panelAcciones.setLayout(panelAccionesLayout);
        panelAccionesLayout.setHorizontalGroup(
            panelAccionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAccionesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnAgregarLicenciatura, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(btnModificarLicenciatura)
                .addGap(54, 54, 54)
                .addComponent(btnCancelarLicenciatura)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addComponent(btnEliminarLicenciatura)
                .addGap(87, 87, 87))
        );
        panelAccionesLayout.setVerticalGroup(
            panelAccionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelAccionesLayout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(panelAccionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregarLicenciatura)
                    .addComponent(btnModificarLicenciatura)
                    .addComponent(btnCancelarLicenciatura)
                    .addComponent(btnEliminarLicenciatura))
                .addContainerGap())
        );

        tableLicenciatura.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "RVOE", "NOMBRE LICENCIATURA", "ABREVIACION"
            }
        ));
        tableLicenciatura.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableLicenciaturaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableLicenciatura);

        jLabel4.setText("ABREVIACIÓN: ");

        txtAbreviacion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtAbreviacionKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtAbreviacionKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jScrollPane1))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(340, 340, 340)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addComponent(txtAbreviacion, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtRvoe, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNombreLicenciatura, javax.swing.GroupLayout.PREFERRED_SIZE, 403, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(panelAcciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtRvoe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addComponent(txtAbreviacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNombreLicenciatura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelAcciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarLicenciaturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarLicenciaturaActionPerformed
       if(!"".equals(txtRvoe.getText())&& !"".equals(txtNombreLicenciatura.getText())){
        lic.setRvoe(txtRvoe.getText());
        lic.setNombreLicenciatura(txtNombreLicenciatura.getText());  
        lic.setAbreviacion(txtAbreviacion.getText());
        licenciaturaDao.agregarLicenciatura(lic); //se manda a traer del DAO grupo la funcion registrar
        JOptionPane.showMessageDialog(null, "Licenciatura Registrada con exito!!");
        limpiarTable();
        limpiarLicenciatura();
        listarLicenciatura();
         
       
        internalAgregarAlumno.cargaComboCompletoLicenciatura();
        }else{
        JOptionPane.showMessageDialog(null, "HAY CAMPOS VACIOS"); 
       
        txtRvoe.requestFocus();
    }   
        
    }//GEN-LAST:event_btnAgregarLicenciaturaActionPerformed

    private void btnModificarLicenciaturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarLicenciaturaActionPerformed
       if("".equals(txtRvoe.getText())){
            JOptionPane.showMessageDialog(null, "Seleccione una fila");
        }else{  
        if(!"".equals(txtRvoe.getText()) && !"".equals(txtNombreLicenciatura.getText())){
         
          
         lic.setRvoe(txtRvoe.getText());
         lic.setNombreLicenciatura(txtNombreLicenciatura.getText()); 
         lic.setAbreviacion(txtAbreviacion.getText());
         
        licenciaturaDao.modificarLicenciatura(lic);
       
        limpiarLicenciatura();
        limpiarTable();
        listarLicenciatura();
        
       internalAgregarAlumno.cargaComboCompletoLicenciatura();

        }else{
        JOptionPane.showMessageDialog(null,"HAY CAMPOS VACIOS");
        }
      } 
    }//GEN-LAST:event_btnModificarLicenciaturaActionPerformed

    private void btnCancelarLicenciaturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarLicenciaturaActionPerformed
     
        limpiarLicenciatura();
    }//GEN-LAST:event_btnCancelarLicenciaturaActionPerformed

    private void btnEliminarLicenciaturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarLicenciaturaActionPerformed
      
        if (!"".equals(txtRvoe.getText())) {
        int pregunta = JOptionPane.showConfirmDialog(null, "¿Estás seguro de eliminar?");
        
        if (pregunta == 0) {
            String id = txtRvoe.getText();
            boolean eliminado = licenciaturaDao.eliminarLicenciatura(id);
            limpiarLicenciatura();
            if (eliminado) {
                JOptionPane.showMessageDialog(null, "Eliminado correctamente!!");
                limpiarLicenciatura();
                limpiarTable();
                listarLicenciatura();
               internalAgregarAlumno.cargaComboCompletoLicenciatura();
                
            } else {
                // No es necesario un mensaje adicional aquí porque el DAO ya muestra el mensaje de error
            }
        }
    } else {
        JOptionPane.showMessageDialog(null, "Seleccione un registro para eliminar.");
    }
        
        
        
    }//GEN-LAST:event_btnEliminarLicenciaturaActionPerformed

    private void txtRvoeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRvoeKeyReleased
       String mayus = txtRvoe.getText().toUpperCase();
       txtRvoe.setText(mayus);
    }//GEN-LAST:event_txtRvoeKeyReleased

    private void txtRvoeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRvoeKeyTyped
       if (txtRvoe.getText().length() >= 13) {
            evt.consume();
        }
                                          
    }//GEN-LAST:event_txtRvoeKeyTyped

    private void txtNombreLicenciaturaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreLicenciaturaKeyReleased
       String mayus = txtNombreLicenciatura.getText().toUpperCase();
       txtNombreLicenciatura.setText(mayus);
    }//GEN-LAST:event_txtNombreLicenciaturaKeyReleased

    private void txtNombreLicenciaturaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreLicenciaturaKeyTyped
        event.textKeyPress(evt);
    }//GEN-LAST:event_txtNombreLicenciaturaKeyTyped

    private void tableLicenciaturaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableLicenciaturaMouseClicked
       
        txtRvoe.setEnabled(false);
        int fila = tableLicenciatura.rowAtPoint(evt.getPoint());
        
        txtRvoe.setText(tableLicenciatura.getValueAt(fila,0).toString());
        txtNombreLicenciatura.setText(tableLicenciatura.getValueAt(fila,1).toString());
        
       licenciaturaMouseClicked();
    }//GEN-LAST:event_tableLicenciaturaMouseClicked

    private void txtAbreviacionKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAbreviacionKeyReleased
        String mayus = txtAbreviacion.getText().toUpperCase();
        txtAbreviacion.setText(mayus);
        
    }//GEN-LAST:event_txtAbreviacionKeyReleased

    private void txtAbreviacionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAbreviacionKeyTyped
        if (txtAbreviacion.getText().length() >= 3) {
            evt.consume();
        }
         event.textKeyPress(evt);
    }//GEN-LAST:event_txtAbreviacionKeyTyped

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
            java.util.logging.Logger.getLogger(AgregarLicenciatura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AgregarLicenciatura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AgregarLicenciatura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AgregarLicenciatura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AgregarLicenciatura().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarLicenciatura;
    private javax.swing.JButton btnCancelarLicenciatura;
    private javax.swing.JButton btnEliminarLicenciatura;
    private javax.swing.JButton btnModificarLicenciatura;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panelAcciones;
    private javax.swing.JTable tableLicenciatura;
    private javax.swing.JTextField txtAbreviacion;
    private javax.swing.JTextField txtNombreLicenciatura;
    private javax.swing.JTextField txtRvoe;
    // End of variables declaration//GEN-END:variables

    private void limpiarLicenciatura() {
        
        txtRvoe.setText("");
        txtNombreLicenciatura.setText("");
        txtAbreviacion.setText("");
        
        agregarLicenciatura();
    }
    
    private void agregarLicenciatura(){
      txtRvoe.setEnabled(true);
      
      btnAgregarLicenciatura.setEnabled(true);
      btnModificarLicenciatura.setEnabled(false);
      btnCancelarLicenciatura.setEnabled(true);
      btnEliminarLicenciatura.setEnabled(false);
              
    }
    private void licenciaturaMouseClicked() {
    btnAgregarLicenciatura.setEnabled(false);
    btnModificarLicenciatura.setEnabled(true);
    btnCancelarLicenciatura.setEnabled(true);
    btnEliminarLicenciatura.setEnabled(true);

}
    
    
}
