/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InternalFrame;

import Modelo.Docente;
import Modelo.DocenteDao;
import Modelo.Eventos;
import Modelo.Licenciatura;
import Vista.Interaccion.AsignarGrupoDocente;
import Vista.VistaPrincipal;
import java.awt.Container;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ramos
 */
public class InternalDocente extends javax.swing.JInternalFrame {
AsignarGrupoDocente vAsignarGrupoDocente = new AsignarGrupoDocente(this, null);

Docente vDocente = new Docente();
DocenteDao vDocenteDao = new DocenteDao();

Eventos event = new Eventos();


DefaultTableModel modelo = new DefaultTableModel(); //para las tablas
DefaultTableModel tmp = new DefaultTableModel(); //para reportes
    
   private VistaPrincipal vistaprincipal;
   
   
   
   public InternalDocente(VistaPrincipal vistaprincipal) {
        initComponents();
        this.vistaprincipal = vistaprincipal;
        BasicInternalFrameUI ui = (BasicInternalFrameUI) getUI();
        Container northPane = ui.getNorthPane();
        northPane.removeMouseMotionListener(ui.getNorthPane().getMouseMotionListeners()[0]);
        remove(northPane);
        setBorder(null);  
        
        vAsignarGrupoDocente.cargaComboCompletoDocente();
        limpiarTable();
        listarDocente();
        
        
    }
    
   
    
     public void listarDocente(){
    List<Docente> ListarDoc = vDocenteDao.ListarDocente();
    modelo= (DefaultTableModel)tableDocente.getModel();
    Object [] obj = new Object[8];
    for(int i = 0; i<ListarDoc.size();i++){
        obj[0]= ListarDoc.get(i).getRfcDocente();
        obj[1]= ListarDoc.get(i).getNombreDocente();
        obj[2]= ListarDoc.get(i).getPaternoDocente();
        obj[3]= ListarDoc.get(i).getMaternoDocente();
        obj[4]= ListarDoc.get(i).getEmailDocente();
        obj[5]= ListarDoc.get(i).getTelefonoDocente();
        obj[6]= ListarDoc.get(i).getFechaInicioDocente();
        obj[7]= ListarDoc.get(i).getEstadoDocente();
        
        modelo.addRow(obj);
        }
    tableDocente.setModel(modelo);  
    }

  public void limpiarTable(){ 
// para que no se repitan los datos al mostrarse en las tablas
    for (int i=0; i<modelo.getRowCount();i++){
        modelo.removeRow(i);
        i= i-1;
    }
    } 
  


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txtRfcDocente = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtNombreDocente = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtPaternoDocente = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtMaternoDocente = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jdcFechaInicioDocente = new com.toedter.calendar.JDateChooser();
        jLabel3 = new javax.swing.JLabel();
        cbEstadoDocente = new javax.swing.JCheckBox();
        jLabel6 = new javax.swing.JLabel();
        txtEmailDocente = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtTelefonoDocente = new javax.swing.JTextField();
        btnCerrarPestañaDocente = new javax.swing.JButton();
        panelAcciones = new javax.swing.JPanel();
        btnAgregarDocente = new javax.swing.JButton();
        btnModificarDocente = new javax.swing.JButton();
        btnCancelarDocente = new javax.swing.JButton();
        btnEliminarDocente = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableDocente = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        asignarGrupoDocente = new javax.swing.JButton();

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));

        jLabel4.setText("RFC");

        txtRfcDocente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtRfcDocenteKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtRfcDocenteKeyTyped(evt);
            }
        });

        jLabel5.setText("NOMBRE");

        txtNombreDocente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNombreDocenteKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreDocenteKeyTyped(evt);
            }
        });

        jLabel11.setText("APELLIDO PATERNO");

        txtPaternoDocente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPaternoDocenteKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPaternoDocenteKeyTyped(evt);
            }
        });

        jLabel12.setText("APELLIDO MATERNO");

        txtMaternoDocente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtMaternoDocenteKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtMaternoDocenteKeyTyped(evt);
            }
        });

        jLabel2.setText("FECHA INICIO");

        jLabel3.setText("ESTADO");

        cbEstadoDocente.setText("ACTIVO");

        jLabel6.setText("E-MAIL");

        txtEmailDocente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtEmailDocenteKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtEmailDocenteKeyTyped(evt);
            }
        });

        jLabel7.setText("TELÉFONO");

        txtTelefonoDocente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtTelefonoDocenteKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTelefonoDocenteKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtRfcDocente, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 90, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jdcFechaInicioDocente, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbEstadoDocente)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtMaternoDocente)
                                    .addComponent(txtPaternoDocente, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                                    .addComponent(txtNombreDocente, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                                    .addComponent(txtEmailDocente)
                                    .addComponent(txtTelefonoDocente))))
                        .addGap(20, 20, 20))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtRfcDocente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtNombreDocente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txtPaternoDocente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(txtMaternoDocente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtEmailDocente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtTelefonoDocente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jdcFechaInicioDocente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(cbEstadoDocente))
                .addContainerGap())
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 370, 320));

        btnCerrarPestañaDocente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/20xCerrarPestaña.png"))); // NOI18N
        btnCerrarPestañaDocente.setText("Cerrar Pestaña");
        btnCerrarPestañaDocente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarPestañaDocenteActionPerformed(evt);
            }
        });
        getContentPane().add(btnCerrarPestañaDocente, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 420, 201, -1));

        panelAcciones.setBackground(new java.awt.Color(204, 255, 204));

        btnAgregarDocente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/20xAgregar.png"))); // NOI18N
        btnAgregarDocente.setText("Agregar");
        btnAgregarDocente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarDocenteActionPerformed(evt);
            }
        });

        btnModificarDocente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/20xModificar.png"))); // NOI18N
        btnModificarDocente.setText("Modificar");
        btnModificarDocente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarDocenteActionPerformed(evt);
            }
        });

        btnCancelarDocente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/20xCancelar.png"))); // NOI18N
        btnCancelarDocente.setText("Cancelar");
        btnCancelarDocente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarDocenteActionPerformed(evt);
            }
        });

        btnEliminarDocente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/20xEliminar.png"))); // NOI18N
        btnEliminarDocente.setText("Eliminar");
        btnEliminarDocente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarDocenteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelAccionesLayout = new javax.swing.GroupLayout(panelAcciones);
        panelAcciones.setLayout(panelAccionesLayout);
        panelAccionesLayout.setHorizontalGroup(
            panelAccionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAccionesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnAgregarDocente, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnModificarDocente)
                .addGap(26, 26, 26)
                .addComponent(btnCancelarDocente)
                .addGap(18, 18, 18)
                .addComponent(btnEliminarDocente)
                .addContainerGap(47, Short.MAX_VALUE))
        );
        panelAccionesLayout.setVerticalGroup(
            panelAccionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelAccionesLayout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(panelAccionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregarDocente)
                    .addComponent(btnModificarDocente)
                    .addComponent(btnCancelarDocente)
                    .addComponent(btnEliminarDocente))
                .addContainerGap())
        );

        getContentPane().add(panelAcciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 390, 520, 60));

        tableDocente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "RFC", "NOMBRE", "APELLIDO PATERNO", "APELLIDO MATERNO", "E-MAIL", "TELEFONO", "FECHA INCIO", "ESTADO"
            }
        ));
        tableDocente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableDocenteMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableDocente);
        if (tableDocente.getColumnModel().getColumnCount() > 0) {
            tableDocente.getColumnModel().getColumn(0).setMinWidth(0);
            tableDocente.getColumnModel().getColumn(0).setPreferredWidth(0);
            tableDocente.getColumnModel().getColumn(0).setMaxWidth(0);
            tableDocente.getColumnModel().getColumn(6).setMinWidth(0);
            tableDocente.getColumnModel().getColumn(6).setPreferredWidth(0);
            tableDocente.getColumnModel().getColumn(6).setMaxWidth(0);
            tableDocente.getColumnModel().getColumn(7).setMinWidth(0);
            tableDocente.getColumnModel().getColumn(7).setPreferredWidth(0);
            tableDocente.getColumnModel().getColumn(7).setMaxWidth(0);
        }

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 110, 790, 250));

        jLabel1.setText("APARTADO DOCENTE");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 0, 140, 20));

        jPanel2.setBackground(new java.awt.Color(204, 255, 204));

        asignarGrupoDocente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/x20clase.png"))); // NOI18N
        asignarGrupoDocente.setText("Asignar Grupos");
        asignarGrupoDocente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                asignarGrupoDocenteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(asignarGrupoDocente)
                .addContainerGap(239, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(asignarGrupoDocente)
                .addContainerGap())
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 390, 400, 60));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCerrarPestañaDocenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarPestañaDocenteActionPerformed
        
      vistaprincipal.cerrarDocente();
    }//GEN-LAST:event_btnCerrarPestañaDocenteActionPerformed

    private void btnAgregarDocenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarDocenteActionPerformed
         
         if (!"".equals(txtRfcDocente.getText()) &&
        !"".equals(txtNombreDocente.getText()) &&
        !"".equals(txtPaternoDocente.getText())) {

        vDocente.setRfcDocente(txtRfcDocente.getText());
        vDocente.setNombreDocente(txtNombreDocente.getText());
        vDocente.setPaternoDocente(txtPaternoDocente.getText());
        vDocente.setMaternoDocente(txtMaternoDocente.getText());
        vDocente.setEmailDocente(txtEmailDocente.getText());
        vDocente.setTelefonoDocente(txtTelefonoDocente.getText());
        
        // Obtener la fecha seleccionada en el JDateChooser
        Date fecha = jdcFechaInicioDocente.getDate();
        
        if (fecha != null) {
            // Formatear la fecha a una cadena (por ejemplo: "yyyy-MM-dd")
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd"); // Ajusta el formato según necesites
            String fechaFormateada = sdf.format(fecha);
            vDocente.setFechaInicioDocente(fechaFormateada);
        } else {
            vDocente.setFechaInicioDocente(null); // O algún valor por defecto si no hay fecha seleccionada
        }

        // Estado del docente (activo/inactivo)
        vDocente.setEstadoDocente(cbEstadoDocente.isSelected() ? 1 : 0); // 1 para activo, 0 para inactivo
        
        // Insertar el docente en la base de datos
        vDocenteDao.agregarDocente(vDocente);
        vAsignarGrupoDocente.cargaComboCompletoDocente();
        vAsignarGrupoDocente.cargaComboCompletoGrupo();
        
        // Limpiar y actualizar tabla
        limpiarTable();
        listarDocente();
        limpiarDocente();
        
        // Mostrar mensaje de éxito
        JOptionPane.showMessageDialog(null, "Nuevo Ingreso Registrado con éxito!!");

        } else {
        JOptionPane.showMessageDialog(null, "Hay campos vacíos");
     }
        
        
    }//GEN-LAST:event_btnAgregarDocenteActionPerformed

    private void btnModificarDocenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarDocenteActionPerformed
        if("".equals(txtRfcDocente.getText())){
            JOptionPane.showMessageDialog(null, "Seleccione una fila");
        }else{  
        if(!"".equals(txtRfcDocente.getText()) && !"".equals(txtNombreDocente.getText())&& !"".equals(txtPaternoDocente.getText())){
         
          
         vDocente.setRfcDocente(txtRfcDocente.getText());
         vDocente.setNombreDocente(txtNombreDocente.getText());
         vDocente.setPaternoDocente(txtPaternoDocente.getText());
         vDocente.setMaternoDocente(txtMaternoDocente.getText());
         vDocente.setEmailDocente(txtEmailDocente.getText());
         vDocente.setTelefonoDocente(txtTelefonoDocente.getText());
         // Obtener la fecha seleccionada en el JDateChooser
        Date fecha = jdcFechaInicioDocente.getDate();
        
        if (fecha != null) {
            // Formatear la fecha a una cadena (por ejemplo: "yyyy-MM-dd")
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd"); // Ajusta el formato según necesites
            String fechaFormateada = sdf.format(fecha);
            vDocente.setFechaInicioDocente(fechaFormateada);
        } else {
            vDocente.setFechaInicioDocente(null); // O algún valor por defecto si no hay fecha seleccionada
        }
         // Estado del docente (activo/inactivo)
        vDocente.setEstadoDocente(cbEstadoDocente.isSelected() ? 1 : 0); // 1 para activo, 0 para inactivo

         
        vDocenteDao.modificarLDocente(vDocente);
        vAsignarGrupoDocente.cargaComboCompletoDocente();
        vAsignarGrupoDocente.cargaComboCompletoGrupo();
        limpiarDocente();
        limpiarTable();
        listarDocente();
       

       

        }else{
        JOptionPane.showMessageDialog(null,"HAY CAMPOS VACIOS");
        }
      } 
        
    }//GEN-LAST:event_btnModificarDocenteActionPerformed

    private void btnCancelarDocenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarDocenteActionPerformed
        limpiarDocente();
         vAsignarGrupoDocente.cargaComboCompletoGrupo();
    }//GEN-LAST:event_btnCancelarDocenteActionPerformed

    private void btnEliminarDocenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarDocenteActionPerformed
         if (!"".equals(txtRfcDocente.getText())) {
        int pregunta = JOptionPane.showConfirmDialog(null, "¿Estás seguro de eliminar?");
        
        if (pregunta == 0) {
            String id = txtRfcDocente.getText();
            boolean eliminado = vDocenteDao.eliminarDocente(id);
            
            limpiarDocente();
            if (eliminado) {
                JOptionPane.showMessageDialog(null, "Eliminado correctamente!!");
                limpiarDocente();
                limpiarTable();
                listarDocente();
                        vAsignarGrupoDocente.cargaComboCompletoDocente();
                         vAsignarGrupoDocente.cargaComboCompletoGrupo();

                
            } else {
                // No es necesario un mensaje adicional aquí porque el DAO ya muestra el mensaje de error
            }
        }
    } else {
        JOptionPane.showMessageDialog(null, "Seleccione un registro para eliminar.");
    }
         
    }//GEN-LAST:event_btnEliminarDocenteActionPerformed

    private void asignarGrupoDocenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_asignarGrupoDocenteActionPerformed
        
     vAsignarGrupoDocente.setVisible(true);
    }//GEN-LAST:event_asignarGrupoDocenteActionPerformed

    private void txtRfcDocenteKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRfcDocenteKeyReleased
     String mayus = txtRfcDocente.getText().toUpperCase();
       txtRfcDocente.setText(mayus);     
    }//GEN-LAST:event_txtRfcDocenteKeyReleased

    private void txtRfcDocenteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRfcDocenteKeyTyped
        if (txtRfcDocente.getText().length() >= 13) {
            evt.consume();
        }
    }//GEN-LAST:event_txtRfcDocenteKeyTyped

    private void txtNombreDocenteKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreDocenteKeyReleased
        String mayus = txtNombreDocente.getText().toUpperCase();
       txtNombreDocente.setText(mayus);     
    }//GEN-LAST:event_txtNombreDocenteKeyReleased

    private void txtNombreDocenteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreDocenteKeyTyped
      event.textKeyPress(evt);
    }//GEN-LAST:event_txtNombreDocenteKeyTyped

    private void txtPaternoDocenteKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPaternoDocenteKeyReleased
         String mayus = txtPaternoDocente.getText().toUpperCase();
       txtPaternoDocente.setText(mayus);   
    }//GEN-LAST:event_txtPaternoDocenteKeyReleased

    private void txtPaternoDocenteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPaternoDocenteKeyTyped
        event.textKeyPress(evt);
    }//GEN-LAST:event_txtPaternoDocenteKeyTyped

    private void txtMaternoDocenteKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMaternoDocenteKeyReleased
       String mayus = txtMaternoDocente.getText().toUpperCase();
       txtMaternoDocente.setText(mayus);   
    }//GEN-LAST:event_txtMaternoDocenteKeyReleased

    private void txtMaternoDocenteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMaternoDocenteKeyTyped
     event.textKeyPress(evt);
    }//GEN-LAST:event_txtMaternoDocenteKeyTyped

    private void txtEmailDocenteKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEmailDocenteKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailDocenteKeyReleased

    private void txtEmailDocenteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEmailDocenteKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailDocenteKeyTyped

    private void txtTelefonoDocenteKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefonoDocenteKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefonoDocenteKeyReleased

    private void txtTelefonoDocenteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefonoDocenteKeyTyped
        
        if (txtTelefonoDocente.getText().length() >= 10) {
            evt.consume();
        }
        event.numberKeyPress(evt);
    }//GEN-LAST:event_txtTelefonoDocenteKeyTyped

    private void tableDocenteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableDocenteMouseClicked
       
     txtRfcDocente.setEnabled(false);
    int fila = tableDocente.rowAtPoint(evt.getPoint());

    // Verificar si los valores no son nulos antes de asignarlos
    if (tableDocente.getValueAt(fila, 0) != null) {
        txtRfcDocente.setText(tableDocente.getValueAt(fila, 0).toString());
    }
    if (tableDocente.getValueAt(fila, 1) != null) {
        txtNombreDocente.setText(tableDocente.getValueAt(fila, 1).toString());
    }
    if (tableDocente.getValueAt(fila, 2) != null) {
        txtPaternoDocente.setText(tableDocente.getValueAt(fila, 2).toString());
    }
    if (tableDocente.getValueAt(fila, 3) != null) {
        txtMaternoDocente.setText(tableDocente.getValueAt(fila, 3).toString());
    }
    if (tableDocente.getValueAt(fila, 4) != null) {
        txtEmailDocente.setText(tableDocente.getValueAt(fila, 4).toString());
    }
    if (tableDocente.getValueAt(fila, 5) != null) {
        txtTelefonoDocente.setText(tableDocente.getValueAt(fila, 5).toString());
    }

    // Verificar y manejar la fecha
    if (tableDocente.getValueAt(fila, 6) != null) {
        try {
            String fecha = tableDocente.getValueAt(fila, 6).toString();
            SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
            Date fechaInicio = format.parse(fecha);
            jdcFechaInicioDocente.setDate(fechaInicio);
        } catch (ParseException e) {
            e.printStackTrace();  // Manejo de error si la fecha no es válida
        }
    }

    // Verificar y manejar el estado del JCheckBox
    if (tableDocente.getValueAt(fila, 7) != null) {
        int estado = Integer.parseInt(tableDocente.getValueAt(fila, 7).toString());
        cbEstadoDocente.setSelected(estado == 1);
    }

    docenteMouseClicked();
    }//GEN-LAST:event_tableDocenteMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton asignarGrupoDocente;
    private javax.swing.JButton btnAgregarDocente;
    private javax.swing.JButton btnCancelarDocente;
    private javax.swing.JButton btnCerrarPestañaDocente;
    private javax.swing.JButton btnEliminarDocente;
    private javax.swing.JButton btnModificarDocente;
    private javax.swing.JCheckBox cbEstadoDocente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private com.toedter.calendar.JDateChooser jdcFechaInicioDocente;
    private javax.swing.JPanel panelAcciones;
    private javax.swing.JTable tableDocente;
    private javax.swing.JTextField txtEmailDocente;
    private javax.swing.JTextField txtMaternoDocente;
    private javax.swing.JTextField txtNombreDocente;
    private javax.swing.JTextField txtPaternoDocente;
    private javax.swing.JTextField txtRfcDocente;
    private javax.swing.JTextField txtTelefonoDocente;
    // End of variables declaration//GEN-END:variables

    private void limpiarDocente() {
        txtRfcDocente.setText("");
        txtNombreDocente.setText("");
        txtPaternoDocente.setText("");
        txtMaternoDocente.setText("");
        txtEmailDocente.setText("");
        txtTelefonoDocente.setText("");
        jdcFechaInicioDocente.setDate(null);
        cbEstadoDocente.setSelected(false);
                
        agregarDocente();
    }
    
    private void agregarDocente(){
      txtRfcDocente.setEnabled(true);
      
      btnAgregarDocente.setEnabled(true);
      btnModificarDocente.setEnabled(false);
      btnCancelarDocente.setEnabled(true);
      btnEliminarDocente.setEnabled(false);
              
    }
    private void docenteMouseClicked() {
    btnAgregarDocente.setEnabled(false);
    btnModificarDocente.setEnabled(true);
    btnCancelarDocente.setEnabled(true);
    btnEliminarDocente.setEnabled(true);

}
    
    
}
