/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista.Interaccion;

import InternalFrame.InternalAgregarAlumno;
import Modelo.Alumno;
import Modelo.AlumnoDao;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ramos
 */
public class SeleccionarAlumno extends javax.swing.JFrame {
Alumno vAlumno = new Alumno();
AlumnoDao vAlumnoDao = new AlumnoDao();

 InternalAgregarAlumno internalAgregarAlumno;

 DefaultTableModel modelo = new DefaultTableModel(); //para las tablas
   
    public SeleccionarAlumno() {
        initComponents();
        this.setLocationRelativeTo(null);
        listarBusquedaAlumno();
//        JOptionPane.showMessageDialog(null,  tableBusquedaAlumno );
        listarBusquedaAlumno();
        
        
    }
public void listarBusquedaAlumno() {
    // Obtén la lista de alumnos desde el método obtenerAlumno_busqueda
    List<Alumno> listarAlumnos = vAlumnoDao.obtenerAlumno_busqueda();
    
    // Obtén el modelo de la tabla
    DefaultTableModel modelo = (DefaultTableModel) tableBusquedaAlumno.getModel();
    
    // Limpia las filas existentes en la tabla
    modelo.setRowCount(0);
    
    // Recorre la lista de alumnos y agrega cada uno como una fila en la tabla
    Object[] obj = new Object[3]; // Cambia el tamaño según las columnas de tu tabla
    for (Alumno alumno : listarAlumnos) {
        obj[0] = alumno.getMatricula();
        obj[1] = alumno.getNombreAlumno(); // Cambia según tu método getter
        obj[2] = alumno.getAbreviacion(); // Cambia según tu método getter
        modelo.addRow(obj);
    }
    
    // Asigna el modelo actualizado a la tabla
    tableBusquedaAlumno.setModel(modelo);
}

   
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        lblNombreAlumno = new javax.swing.JLabel();
        txtBusquedaAlumno = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableBusquedaAlumno = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("SELECCIONAR ALUMNOS");

        jLabel1.setText("ALUMNOS");

        lblNombreAlumno.setText("NOMBRE COMPLETO:");

        tableBusquedaAlumno.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tableBusquedaAlumno.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "MATRICULA", "NOMBRE COMPLETO", "LICENCIATURA"
            }
        ));
        tableBusquedaAlumno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableBusquedaAlumnoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableBusquedaAlumno);
        if (tableBusquedaAlumno.getColumnModel().getColumnCount() > 0) {
            tableBusquedaAlumno.getColumnModel().getColumn(0).setPreferredWidth(3);
            tableBusquedaAlumno.getColumnModel().getColumn(1).setPreferredWidth(200);
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(239, 239, 239)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(lblNombreAlumno)
                                .addGap(18, 18, 18)
                                .addComponent(txtBusquedaAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 539, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombreAlumno)
                    .addComponent(txtBusquedaAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 489, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tableBusquedaAlumnoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableBusquedaAlumnoMouseClicked
internalAgregarAlumno= new InternalAgregarAlumno();

//     txtRfcDocente.setEnabled(false);
    int fila = tableBusquedaAlumno.rowAtPoint(evt.getPoint());

    // Verificar si los valores no son nulos antes de asignarlos
    if (tableBusquedaAlumno.getValueAt(fila, 0) != null) {
       internalAgregarAlumno.setBMatricula(tableBusquedaAlumno.getValueAt(fila, 0).toString());
       JOptionPane.showMessageDialog(null,tableBusquedaAlumno.getValueAt(fila, 0).toString() );
    }else{
        System.out.println("hola");
    }
//    if (tableBusquedaAlumno.getValueAt(fila, 1) != null) {
//        txtNombreDocente.setText(tableBusquedaAlumno.getValueAt(fila, 1).toString());
//    }
//    if (tableBusquedaAlumno.getValueAt(fila, 2) != null) {
//        txtPaternoDocente.setText(tableBusquedaAlumno.getValueAt(fila, 2).toString());
//    }
//    if (tableBusquedaAlumno.getValueAt(fila, 3) != null) {
//        txtMaternoDocente.setText(tableBusquedaAlumno.getValueAt(fila, 3).toString());
//    }
//    if (tableBusquedaAlumno.getValueAt(fila, 4) != null) {
//        txtEmailDocente.setText(tableBusquedaAlumno.getValueAt(fila, 4).toString());
//    }
//    if (tableBusquedaAlumno.getValueAt(fila, 5) != null) {
//        txtTelefonoDocente.setText(tableBusquedaAlumno.getValueAt(fila, 5).toString());
//    }

    

  
    }//GEN-LAST:event_tableBusquedaAlumnoMouseClicked

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
            java.util.logging.Logger.getLogger(SeleccionarAlumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SeleccionarAlumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SeleccionarAlumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SeleccionarAlumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SeleccionarAlumno().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblNombreAlumno;
    private javax.swing.JTable tableBusquedaAlumno;
    private javax.swing.JTextField txtBusquedaAlumno;
    // End of variables declaration//GEN-END:variables
}
