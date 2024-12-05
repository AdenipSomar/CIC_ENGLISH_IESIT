/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista.JDialog;

import Modelo.Alumno;
import Modelo.AlumnoDao;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ramos
 */
public class SeleccionarAlumno extends javax.swing.JDialog {

    Alumno vAlumno = new Alumno();
    AlumnoDao vAlumnoDao = new AlumnoDao();
    
    
   DefaultTableModel modelo = new DefaultTableModel(); //para las tablas
   
    public SeleccionarAlumno(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
        limpiarTable();       
        listarSeleccionarAlumno();
        
        
        
        
        
        
        
        // INICIA FILTRADO DE ALUMNOS
        /// METODO PARAPODER FILTRAR EN TIEMPO REAL LA TABLA DE BUSQUEDA DE ALUMNOS
        txtBuscarAlumnos.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                limpiarTable();
                listarSeleccionarAlumno(); // Llama al método cuando se inserta texto
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                limpiarTable();
                listarSeleccionarAlumno(); // Llama al método cuando se elimina texto
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                limpiarTable();
                listarSeleccionarAlumno(); // Llama al método cuando hay cambios de formato (normalmente no aplica)
            }
        }
        );       
        /// TERMINA FILTRADO DE ALUMNOS
          
    }

    
    
       public void limpiarTable(){ 
// para que no se repitan los datos al mostrarse en las tablas
    for (int i=0; i<modelo.getRowCount();i++){
        modelo.removeRow(i);
        i= i-1;
    }
    }
    public void listarSeleccionarAlumno(){
        limpiarTable();
        String filtro = txtBuscarAlumnos.getText().trim();
    List<Alumno> Listar = vAlumnoDao.listarAlumnos(filtro);
    modelo= (DefaultTableModel)tablaAlumnos.getModel();
    Object [] obj = new Object[13];
    for(int i = 0; i<Listar.size();i++){
        obj[0]= Listar.get(i).getMatricula();
        obj[1]= Listar.get(i).getNombreAlumno();
        obj[2]= Listar.get(i).getApellidoPaterno();
        obj[3]= Listar.get(i).getApellidoMaterno();
        obj[4]= Listar.get(i).getGeneracion();
        obj[5]= Listar.get(i).getSemestre();
        obj[6]= Listar.get(i).getStatusConstancia();
        obj[7]= Listar.get(i).getObservaciones();
        obj[8]= Listar.get(i).getCveGrupo();
        obj[9]= Listar.get(i).getNombreGrupo();
        obj[10]= Listar.get(i).getRvoeLicenciatura();
        obj[11]= Listar.get(i).getNombreLicenciatura();
        obj[12]= Listar.get(i).getAbreviacion();
        
        modelo.addRow(obj);
        }
    tablaAlumnos.setModel(modelo);  
    }
     

   
   
   
   private Alumno SelectedData;
   
   public Alumno getSelectedData(){
       return SelectedData;
   }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tablaAlumnos = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtBuscarAlumnos = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        tablaAlumnos.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tablaAlumnos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "MATRICULA", "NOMBRE", "PATERNO", "MATERNO", "Title 5", "Title 6", "Title 7", "Title 8", "Title 9", "Title 10", "Title 11", "LICENCIATURA", "LICENCIATURA"
            }
        ));
        tablaAlumnos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaAlumnosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaAlumnos);
        if (tablaAlumnos.getColumnModel().getColumnCount() > 0) {
            tablaAlumnos.getColumnModel().getColumn(4).setMinWidth(0);
            tablaAlumnos.getColumnModel().getColumn(4).setPreferredWidth(0);
            tablaAlumnos.getColumnModel().getColumn(4).setMaxWidth(0);
            tablaAlumnos.getColumnModel().getColumn(5).setMinWidth(0);
            tablaAlumnos.getColumnModel().getColumn(5).setPreferredWidth(0);
            tablaAlumnos.getColumnModel().getColumn(5).setMaxWidth(0);
            tablaAlumnos.getColumnModel().getColumn(6).setMinWidth(0);
            tablaAlumnos.getColumnModel().getColumn(6).setPreferredWidth(0);
            tablaAlumnos.getColumnModel().getColumn(6).setMaxWidth(0);
            tablaAlumnos.getColumnModel().getColumn(7).setMinWidth(0);
            tablaAlumnos.getColumnModel().getColumn(7).setPreferredWidth(0);
            tablaAlumnos.getColumnModel().getColumn(7).setMaxWidth(0);
            tablaAlumnos.getColumnModel().getColumn(8).setMinWidth(0);
            tablaAlumnos.getColumnModel().getColumn(8).setPreferredWidth(0);
            tablaAlumnos.getColumnModel().getColumn(8).setMaxWidth(0);
            tablaAlumnos.getColumnModel().getColumn(9).setMinWidth(0);
            tablaAlumnos.getColumnModel().getColumn(9).setPreferredWidth(0);
            tablaAlumnos.getColumnModel().getColumn(9).setMaxWidth(0);
            tablaAlumnos.getColumnModel().getColumn(10).setMinWidth(0);
            tablaAlumnos.getColumnModel().getColumn(10).setPreferredWidth(0);
            tablaAlumnos.getColumnModel().getColumn(10).setMaxWidth(0);
            tablaAlumnos.getColumnModel().getColumn(11).setMinWidth(0);
            tablaAlumnos.getColumnModel().getColumn(11).setPreferredWidth(0);
            tablaAlumnos.getColumnModel().getColumn(11).setMaxWidth(0);
        }

        jLabel1.setText("BUSQUEDA DE ALUMNOS");

        jLabel2.setText("NOMBRE:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(txtBuscarAlumnos, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 662, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(20, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(269, 269, 269))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtBuscarAlumnos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tablaAlumnosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaAlumnosMouseClicked
     int filaSeleccionada = tablaAlumnos.getSelectedRow(); 
if (filaSeleccionada >= 0) {
    // Inicializa el objeto SelectedData
    SelectedData = new Alumno();

    // Comprobaciones para cada campo antes de asignar el valor
    if (tablaAlumnos.getValueAt(filaSeleccionada, 0) != null) {
        SelectedData.setMatricula(tablaAlumnos.getValueAt(filaSeleccionada, 0).toString());
    } else {
        SelectedData.setMatricula(""); // O algún valor predeterminado
    }

    if (tablaAlumnos.getValueAt(filaSeleccionada, 1) != null) {
        SelectedData.setNombreAlumno(tablaAlumnos.getValueAt(filaSeleccionada, 1).toString());
    } else {
        SelectedData.setNombreAlumno(""); // O algún valor predeterminado
    }

    if (tablaAlumnos.getValueAt(filaSeleccionada, 2) != null) {
        SelectedData.setApellidoPaterno(tablaAlumnos.getValueAt(filaSeleccionada, 2).toString());
    } else {
        SelectedData.setApellidoPaterno(""); // O algún valor predeterminado
    }

    if (tablaAlumnos.getValueAt(filaSeleccionada, 3) != null) {
        SelectedData.setApellidoMaterno(tablaAlumnos.getValueAt(filaSeleccionada, 3).toString());
    } else {
        SelectedData.setApellidoMaterno(""); // O algún valor predeterminado
    }

    if (tablaAlumnos.getValueAt(filaSeleccionada, 4) != null) {
        SelectedData.setGeneracion(tablaAlumnos.getValueAt(filaSeleccionada, 4).toString());
    } else {
        SelectedData.setGeneracion(""); // O algún valor predeterminado
    }

    // Manejo de `semestre` como int
    try {
        if (tablaAlumnos.getValueAt(filaSeleccionada, 5) != null) {
            int semestre = Integer.parseInt(tablaAlumnos.getValueAt(filaSeleccionada, 5).toString());
            SelectedData.setSemestre(semestre);
        }
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "Error al convertir el semestre a número.");
    }

    // Manejo de `statusConstancia` como int
    try {
        if (tablaAlumnos.getValueAt(filaSeleccionada, 6) != null) {
            int statusConstancia = Integer.parseInt(tablaAlumnos.getValueAt(filaSeleccionada, 6).toString());
            SelectedData.setStatusConstancia(statusConstancia);
        }
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "Error al convertir el status de constancia a número.");
    }

    if (tablaAlumnos.getValueAt(filaSeleccionada, 7) != null) {
        SelectedData.setObservaciones(tablaAlumnos.getValueAt(filaSeleccionada, 7).toString());
    } else {
        SelectedData.setObservaciones(""); // O algún valor predeterminado
    }

    if (tablaAlumnos.getValueAt(filaSeleccionada, 8) != null) {
        SelectedData.setCveGrupo(tablaAlumnos.getValueAt(filaSeleccionada, 8).toString());
    } else {
        SelectedData.setCveGrupo(""); // O algún valor predeterminado
    }

    if (tablaAlumnos.getValueAt(filaSeleccionada, 9) != null) {
        SelectedData.setNombreGrupo(tablaAlumnos.getValueAt(filaSeleccionada, 9).toString());
    } else {
        SelectedData.setNombreGrupo(""); // O algún valor predeterminado
    }

    if (tablaAlumnos.getValueAt(filaSeleccionada, 10) != null) {
        SelectedData.setRvoeLicenciatura(tablaAlumnos.getValueAt(filaSeleccionada, 10).toString());
    } else {
        SelectedData.setRvoeLicenciatura(""); // O algún valor predeterminado
    }

    if (tablaAlumnos.getValueAt(filaSeleccionada, 11) != null) {
        SelectedData.setNombreLicenciatura(tablaAlumnos.getValueAt(filaSeleccionada, 11).toString());
    } else {
        SelectedData.setNombreLicenciatura(""); // O algún valor predeterminado
        
    } if (tablaAlumnos.getValueAt(filaSeleccionada, 12) != null) {
        SelectedData.setAbreviacion(tablaAlumnos.getValueAt(filaSeleccionada, 12).toString());
    } else {
        SelectedData.setAbreviacion(""); // O algún valor predeterminado
    }

    this.dispose(); // Cierra el diálogo después de seleccionar
} else {
    JOptionPane.showMessageDialog(this, "Por favor, selecciona una fila.");
}

        
        
        
    }//GEN-LAST:event_tablaAlumnosMouseClicked

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

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                SeleccionarAlumno dialog = new SeleccionarAlumno(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaAlumnos;
    private javax.swing.JTextField txtBuscarAlumnos;
    // End of variables declaration//GEN-END:variables









}


