/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista.Interaccion;

import Modelo.Alumno;
import Modelo.AlumnoDao;
import Modelo.AlumnoGrupo;
import Modelo.AlumnoGrupoDao;
import Modelo.Grupo;
import Modelo.GrupoDao;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author ramos
 */
public class AsignarGrupoAlumno extends javax.swing.JFrame {

 Grupo vGrupo = new Grupo();
 GrupoDao vGrupoDao = new GrupoDao();
 
 Alumno vAlumno = new Alumno();
 AlumnoDao vAlumnoDao = new AlumnoDao();
 
 AlumnoGrupo vAlumnoGrupo = new AlumnoGrupo();
 AlumnoGrupoDao vAlumnoGrupoDao = new AlumnoGrupoDao();
 
 
    
    public AsignarGrupoAlumno() {
        this.setTitle("Asignar grupo");
      
       
        initComponents();
        cargaComboCompletoGrupo_alumno();
        
        
    }
    //**************** carga de  grupo *******************//
   public void cargaComboCompletoGrupo_alumno() {
       cbxGrupoAsignarGrupo.removeAllItems();
        // Cargar datos de las ciudades en el combo box
        cargarGrupos();
        mostrarClaveGrupo();
        // Añadir listener para el cambio de selección en el combo box
        cbxGrupoAsignarGrupo.addActionListener(e -> mostrarClaveGrupo());
    }
    // Método para cargar los nombres  en el combo box
    public void cargarGrupos() {
        List<Grupo> grp = vGrupoDao.obtenerGrupo();
        for (Grupo vGrupo : grp) {
            cbxGrupoAsignarGrupo.addItem(vGrupo.getNombreGrupo());
        }
    }
    // Método para mostrar id se selecciona una licenciatura
    public void mostrarClaveGrupo() {
        String nombreSeleccionada = (String) cbxGrupoAsignarGrupo.getSelectedItem();
        List<Grupo> grp = vGrupoDao.obtenerGrupo();
        for (Grupo vGrupo : grp) {
            if (vGrupo.getNombreGrupo().equals(nombreSeleccionada)) {
                txtClaveGrupo.setText(vGrupo.getCveGrupo());
                break;
            }
        }
    }
    
    

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        MATRICULA = new javax.swing.JLabel();
        cbxMatriculaAsignarGrupo = new javax.swing.JComboBox<>();
        GRUPO = new javax.swing.JLabel();
        cbxGrupoAsignarGrupo = new javax.swing.JComboBox<>();
        panelAcciones = new javax.swing.JPanel();
        btnAgregarGrupoAlumno = new javax.swing.JButton();
        btnModificarGrupoAlumno = new javax.swing.JButton();
        btnCancelarGrupoAlumno = new javax.swing.JButton();
        btnEliminarGrupoAlumno = new javax.swing.JButton();
        txtMatriculaAlumno = new javax.swing.JTextField();
        txtClaveGrupo = new javax.swing.JTextField();
        btnRefrescarAsignarGrupoAlumno = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jLabel1.setText("ASIGNAR GRUPO");

        MATRICULA.setText("MATRICULA: ");

        cbxMatriculaAsignarGrupo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        GRUPO.setText("GRUPO:");

        cbxGrupoAsignarGrupo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        panelAcciones.setBackground(new java.awt.Color(204, 255, 204));

        btnAgregarGrupoAlumno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/20xAgregar.png"))); // NOI18N
        btnAgregarGrupoAlumno.setText("Asignar Grupo");
        btnAgregarGrupoAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarGrupoAlumnoActionPerformed(evt);
            }
        });

        btnModificarGrupoAlumno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/20xModificar.png"))); // NOI18N
        btnModificarGrupoAlumno.setText("Modificar");
        btnModificarGrupoAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarGrupoAlumnoActionPerformed(evt);
            }
        });

        btnCancelarGrupoAlumno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/20xCancelar.png"))); // NOI18N
        btnCancelarGrupoAlumno.setText("Cancelar");
        btnCancelarGrupoAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarGrupoAlumnoActionPerformed(evt);
            }
        });

        btnEliminarGrupoAlumno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/20xEliminar.png"))); // NOI18N
        btnEliminarGrupoAlumno.setText("Eliminar");
        btnEliminarGrupoAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarGrupoAlumnoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelAccionesLayout = new javax.swing.GroupLayout(panelAcciones);
        panelAcciones.setLayout(panelAccionesLayout);
        panelAccionesLayout.setHorizontalGroup(
            panelAccionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAccionesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnAgregarGrupoAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnModificarGrupoAlumno)
                .addGap(26, 26, 26)
                .addComponent(btnCancelarGrupoAlumno)
                .addGap(18, 18, 18)
                .addComponent(btnEliminarGrupoAlumno)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelAccionesLayout.setVerticalGroup(
            panelAccionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelAccionesLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelAccionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregarGrupoAlumno)
                    .addComponent(btnModificarGrupoAlumno)
                    .addComponent(btnCancelarGrupoAlumno)
                    .addComponent(btnEliminarGrupoAlumno))
                .addContainerGap())
        );

        btnRefrescarAsignarGrupoAlumno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/x20Refresh.png"))); // NOI18N
        btnRefrescarAsignarGrupoAlumno.setText("Refrescar");
        btnRefrescarAsignarGrupoAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefrescarAsignarGrupoAlumnoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(panelAcciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(264, 264, 264)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(MATRICULA)
                                        .addGap(18, 18, 18)
                                        .addComponent(cbxMatriculaAsignarGrupo, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(txtMatriculaAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(150, 150, 150)))
                                .addComponent(GRUPO)))
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbxGrupoAsignarGrupo, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtClaveGrupo, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btnRefrescarAsignarGrupoAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(btnRefrescarAsignarGrupoAlumno))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MATRICULA)
                    .addComponent(cbxMatriculaAsignarGrupo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(GRUPO)
                    .addComponent(cbxGrupoAsignarGrupo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMatriculaAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtClaveGrupo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(panelAcciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(27, 27, 27))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnRefrescarAsignarGrupoAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefrescarAsignarGrupoAlumnoActionPerformed
        
        cargaComboCompletoGrupo_alumno();
    }//GEN-LAST:event_btnRefrescarAsignarGrupoAlumnoActionPerformed

    private void btnAgregarGrupoAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarGrupoAlumnoActionPerformed
       
        
        
        if(!"".equals(txtMatriculaAlumno.getText())&& !"".equals(txtClaveGrupo.getText())){
        
        vAlumnoGrupo.setMatricula(txtMatriculaAlumno.getText());
        vAlumnoGrupo.setCveGrupo(txtClaveGrupo.getText());
        
        vAlumnoGrupoDao.agregarAlumnoGrupo(vAlumnoGrupo); //se manda a traer del DAO grupo la funcion registrar
        JOptionPane.showMessageDialog(null, "Acción registrada con exito!!");
        //limpiarTable();
        limpiarAlumnoGrupo();
        //listarLicenciatura();
         
       
        
        }else{
        JOptionPane.showMessageDialog(null, "HAY CAMPOS VACIOS"); 
       
        
    }   
        
        
    }//GEN-LAST:event_btnAgregarGrupoAlumnoActionPerformed

    private void btnModificarGrupoAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarGrupoAlumnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnModificarGrupoAlumnoActionPerformed

    private void btnCancelarGrupoAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarGrupoAlumnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCancelarGrupoAlumnoActionPerformed

    private void btnEliminarGrupoAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarGrupoAlumnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEliminarGrupoAlumnoActionPerformed

    
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AsignarGrupoAlumno().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel GRUPO;
    private javax.swing.JLabel MATRICULA;
    private javax.swing.JButton btnAgregarGrupoAlumno;
    private javax.swing.JButton btnCancelarGrupoAlumno;
    private javax.swing.JButton btnEliminarGrupoAlumno;
    private javax.swing.JButton btnModificarGrupoAlumno;
    private javax.swing.JButton btnRefrescarAsignarGrupoAlumno;
    private javax.swing.JComboBox<String> cbxGrupoAsignarGrupo;
    private javax.swing.JComboBox<String> cbxMatriculaAsignarGrupo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel panelAcciones;
    private javax.swing.JTextField txtClaveGrupo;
    private javax.swing.JTextField txtMatriculaAlumno;
    // End of variables declaration//GEN-END:variables

    private void limpiarAlumnoGrupo() {
        cbxGrupoAsignarGrupo.setSelectedIndex(0);
        cbxMatriculaAsignarGrupo.setSelectedIndex(0);
        agregarAlumno();
    }
    private void agregarAlumno(){
      btnAgregarGrupoAlumno.setEnabled(true);
      btnModificarGrupoAlumno.setEnabled(false);
      btnCancelarGrupoAlumno.setEnabled(true);
      btnEliminarGrupoAlumno.setEnabled(false);
    }


}
