/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista.Interaccion;

import InternalFrame.InternalDocente;
import InternalFrame.InternalGrupoAlumno;
import Modelo.Docente;
import Modelo.DocenteDao;
import Modelo.DocenteGrupo;
import Modelo.DocenteGrupoDao;
import Modelo.Grupo;
import Modelo.GrupoDao;
import Modelo.Licenciatura;
import java.util.List;
import javax.swing.JOptionPane;
import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;

/**
 *
 * @author ramos
 */
public class AsignarGrupoDocente extends javax.swing.JFrame {
    Grupo vGrupo = new Grupo();
    GrupoDao vGrupoDao = new GrupoDao();
      
    Docente vDocente = new Docente();
    DocenteDao vDocenteDao = new DocenteDao();
    
    DocenteGrupo vDocenteGrupo = new DocenteGrupo();
    DocenteGrupoDao vDocenteGrupoDao = new DocenteGrupoDao();
    
    
  public InternalGrupoAlumno internalGrupoAlumno;
  public InternalDocente internalDocente;
   
    public AsignarGrupoDocente (InternalDocente internalDocente, InternalGrupoAlumno internalGrupoAlumno) {
        initComponents();
       
        cargaComboCompletoGrupo();
        cargaComboCompletoDocente();
        
       
        
        AutoCompleteDecorator.decorate(cbxNombreAsignarGrupo);
        AutoCompleteDecorator.decorate(cbxNombreAsignarDocente);
        
        
    }

    public AsignarGrupoDocente() {
        
    }
    
    


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ASIGNAR_DOCENTE_TITLE = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        cbxNombreAsignarDocente = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        cbxNombreAsignarGrupo = new javax.swing.JComboBox<>();
        panelAcciones = new javax.swing.JPanel();
        btnAgregarGrupoDocente = new javax.swing.JButton();
        btnModificarGrupoDocente = new javax.swing.JButton();
        btnCancelarGrupoDocente = new javax.swing.JButton();
        btnEliminarGrupDocente = new javax.swing.JButton();
        txtCveGrupoDocente = new javax.swing.JTextField();
        txtRfcDocente = new javax.swing.JTextField();
        btnRefrescarCampos = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        ASIGNAR_DOCENTE_TITLE.setText("ASIGNAR GRUPO A LOS DOCENTES");

        jLabel1.setText("DOCENTE:");

        cbxNombreAsignarDocente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel2.setText("GRUPO:");

        cbxNombreAsignarGrupo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        panelAcciones.setBackground(new java.awt.Color(204, 255, 204));

        btnAgregarGrupoDocente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/20xAgregar.png"))); // NOI18N
        btnAgregarGrupoDocente.setText("Asignar Grupo");
        btnAgregarGrupoDocente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarGrupoDocenteActionPerformed(evt);
            }
        });

        btnModificarGrupoDocente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/20xModificar.png"))); // NOI18N
        btnModificarGrupoDocente.setText("Modificar");
        btnModificarGrupoDocente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarGrupoDocenteActionPerformed(evt);
            }
        });

        btnCancelarGrupoDocente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/20xCancelar.png"))); // NOI18N
        btnCancelarGrupoDocente.setText("Cancelar");
        btnCancelarGrupoDocente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarGrupoDocenteActionPerformed(evt);
            }
        });

        btnEliminarGrupDocente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/20xEliminar.png"))); // NOI18N
        btnEliminarGrupDocente.setText("Eliminar");
        btnEliminarGrupDocente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarGrupDocenteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelAccionesLayout = new javax.swing.GroupLayout(panelAcciones);
        panelAcciones.setLayout(panelAccionesLayout);
        panelAccionesLayout.setHorizontalGroup(
            panelAccionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAccionesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnAgregarGrupoDocente, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnModificarGrupoDocente)
                .addGap(26, 26, 26)
                .addComponent(btnCancelarGrupoDocente)
                .addGap(18, 18, 18)
                .addComponent(btnEliminarGrupDocente)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelAccionesLayout.setVerticalGroup(
            panelAccionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelAccionesLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelAccionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregarGrupoDocente)
                    .addComponent(btnModificarGrupoDocente)
                    .addComponent(btnCancelarGrupoDocente)
                    .addComponent(btnEliminarGrupDocente))
                .addContainerGap())
        );

        btnRefrescarCampos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/x20Refresh.png"))); // NOI18N
        btnRefrescarCampos.setText("Refrescar ");
        btnRefrescarCampos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefrescarCamposActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(panelAcciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(59, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(ASIGNAR_DOCENTE_TITLE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cbxNombreAsignarDocente, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel2)))
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cbxNombreAsignarGrupo, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnRefrescarCampos, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtRfcDocente, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtCveGrupoDocente, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(155, 155, 155))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ASIGNAR_DOCENTE_TITLE)
                    .addComponent(btnRefrescarCampos))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCveGrupoDocente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtRfcDocente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cbxNombreAsignarDocente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(cbxNombreAsignarGrupo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addComponent(panelAcciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(21, 21, 21))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnRefrescarCamposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefrescarCamposActionPerformed
         cargaComboCompletoGrupo();
        cargaComboCompletoDocente();
    }//GEN-LAST:event_btnRefrescarCamposActionPerformed

    private void btnAgregarGrupoDocenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarGrupoDocenteActionPerformed
      
        if(!"".equals(cbxNombreAsignarDocente.getSelectedItem())&& !"".equals(cbxNombreAsignarGrupo.getSelectedItem())){
        vDocenteGrupo.setRfcDocente(txtRfcDocente.getText());
        vDocenteGrupo.setCveGrupo(txtCveGrupoDocente.getText());  
        vDocenteGrupoDao.agregarDocenteGrupo(vDocenteGrupo); //se manda a traer del DAO grupo la funcion registrar
        JOptionPane.showMessageDialog(null, "Acción registrada con exito!!");
        //limpiarTable();
        limpiarDocenteGrupo();
        //listarLicenciatura();
         
       
        
        }else{
        JOptionPane.showMessageDialog(null, "HAY CAMPOS VACIOS"); 
       
        
    }   
        
        
        
    }//GEN-LAST:event_btnAgregarGrupoDocenteActionPerformed

    private void btnModificarGrupoDocenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarGrupoDocenteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnModificarGrupoDocenteActionPerformed

    private void btnCancelarGrupoDocenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarGrupoDocenteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCancelarGrupoDocenteActionPerformed

    private void btnEliminarGrupDocenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarGrupDocenteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEliminarGrupDocenteActionPerformed
//**************** carga de  grupo *******************//
   public void cargaComboCompletoGrupo() {
        cbxNombreAsignarGrupo.removeAllItems();
        // Cargar datos de las ciudades en el combo box
        cargarGrupos();
        mostrarClaveGrupo();
        // Añadir listener para el cambio de selección en el combo box
        cbxNombreAsignarGrupo.addActionListener(e -> mostrarClaveGrupo());
    }
    // Método para cargar los nombres  en el combo box
    public void cargarGrupos() {
        List<Grupo> grp = vGrupoDao.obtenerGrupo();
        for (Grupo vGrupo : grp) {
            cbxNombreAsignarGrupo.addItem(vGrupo.getNombreGrupo());
        }
    }
    // Método para mostrar id se selecciona una licenciatura
    public void mostrarClaveGrupo() {
        String nombreSeleccionada = (String) cbxNombreAsignarGrupo.getSelectedItem();
        List<Grupo> grp = vGrupoDao.obtenerGrupo();
        for (Grupo vGrupo : grp) {
            if (vGrupo.getNombreGrupo().equals(nombreSeleccionada)) {
                txtCveGrupoDocente.setText(vGrupo.getCveGrupo());
                break;
            }
        }
    }
    
    //**************** carga de  docentes *******************//   
    public void cargaComboCompletoDocente() {
        cbxNombreAsignarDocente.removeAllItems();
        // Cargar datos de las ciudades en el combo box
        cargarDocente();
        mostrarClaveDocente();
        // Añadir listener para el cambio de selección en el combo box
        cbxNombreAsignarDocente.addActionListener(e -> mostrarClaveDocente());
    }
    // Método para cargar los nombres  en el combo box
    public void cargarDocente() {
        List<Docente> doce = vDocenteDao.obtenerDocente();
        for (Docente vDocente : doce) {
            cbxNombreAsignarDocente.addItem(vDocente.getNombreDocente());
        }
}
    // Método para mostrar id se selecciona una licenciatura
    public void mostrarClaveDocente() {
        String nombreSeleccionada = (String) cbxNombreAsignarDocente.getSelectedItem();
        List<Docente> doce = vDocenteDao.obtenerDocente();
        for (Docente vDocente : doce) {
            if (vDocente.getNombreDocente().equals(nombreSeleccionada)) {
                txtRfcDocente.setText(vDocente.getRfcDocente());
                break;
            }
        }
    }
    
    
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
            java.util.logging.Logger.getLogger(AsignarGrupoDocente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AsignarGrupoDocente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AsignarGrupoDocente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AsignarGrupoDocente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AsignarGrupoDocente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ASIGNAR_DOCENTE_TITLE;
    private javax.swing.JButton btnAgregarGrupoDocente;
    private javax.swing.JButton btnCancelarGrupoDocente;
    private javax.swing.JButton btnEliminarGrupDocente;
    private javax.swing.JButton btnModificarGrupoDocente;
    private javax.swing.JButton btnRefrescarCampos;
    private javax.swing.JComboBox<String> cbxNombreAsignarDocente;
    private javax.swing.JComboBox<String> cbxNombreAsignarGrupo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel panelAcciones;
    private javax.swing.JTextField txtCveGrupoDocente;
    private javax.swing.JTextField txtRfcDocente;
    // End of variables declaration//GEN-END:variables

    private void limpiarDocenteGrupo() {
     
       cbxNombreAsignarDocente.setSelectedIndex(0);
       cbxNombreAsignarGrupo.setSelectedIndex(0);
        
        agregarDocenteGrupo();
    }

    private void agregarDocenteGrupo(){
    
      btnAgregarGrupoDocente.setEnabled(true);
      btnModificarGrupoDocente.setEnabled(false);
      btnCancelarGrupoDocente.setEnabled(true);
      btnEliminarGrupDocente.setEnabled(false);
      
    }
    
    
    
    
    
}
