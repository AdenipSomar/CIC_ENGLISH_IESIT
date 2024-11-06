/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InternalFrame;

import Modelo.Docente;
import Modelo.Eventos;
import Modelo.Grupo;
import Modelo.GrupoDao;
import Vista.Interaccion.AsignarCalificacionGrupo;
import Vista.Interaccion.AsignarGrupoDocente;
import Vista.VistaPrincipal;
import java.awt.Container;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;


public class InternalGrupoAlumno extends javax.swing.JInternalFrame {
AsignarGrupoDocente vAsignarGrupoDocente = new AsignarGrupoDocente(null, this);

Grupo vGrupo = new Grupo();
GrupoDao vGrupoDao = new GrupoDao();

private VistaPrincipal vistaprincipal;

Eventos event = new Eventos();
    
DefaultTableModel modelo = new DefaultTableModel(); //para las tablas
DefaultTableModel tmp = new DefaultTableModel(); //para reportes

 
     

    public InternalGrupoAlumno(VistaPrincipal vistaprincipal) {
        initComponents();
        this.vistaprincipal =  vistaprincipal;     
        BasicInternalFrameUI ui = (BasicInternalFrameUI) getUI();
        Container northPane = ui.getNorthPane();
        northPane.removeMouseMotionListener(ui.getNorthPane().getMouseMotionListeners()[0]);
        remove(northPane);
        setBorder(null);  
       
        vAsignarGrupoDocente.cargaComboCompletoGrupo();
        
         
        limpiarTable();
        listarGrupo();
        
        
    }
    
 
   

    public void listarGrupo(){
    List<Grupo> ListarGrp = vGrupoDao.ListarGrupo();
    modelo= (DefaultTableModel)tableGrupo.getModel();
    Object [] obj = new Object[11];
    for(int i = 0; i<ListarGrp.size();i++){
        obj[0]= ListarGrp.get(i).getCveGrupo();
        obj[1]= ListarGrp.get(i).getNombreGrupo();
        obj[2]= ListarGrp.get(i).getNivelIngles();
        obj[3]= ListarGrp.get(i).getDiaClase1();
        obj[4]= ListarGrp.get(i).getHorarioClase1();
        obj[5]= ListarGrp.get(i).getSalonClase1();
        obj[6]= ListarGrp.get(i).getDiaClase2();
        obj[7]= ListarGrp.get(i).getHorarioClase2();
        obj[8]= ListarGrp.get(i).getSalonClase2();
        obj[9]= ListarGrp.get(i).getCicloEscolar();
        obj[10]= ListarGrp.get(i).getMaxEstudiantes();
  
        modelo.addRow(obj);
        }
    tableGrupo.setModel(modelo);  
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

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        GRUPO = new javax.swing.JLabel();
        txtCveGrupo = new javax.swing.JTextField();
        nivel_ingles = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtNombreGrupo = new javax.swing.JTextField();
        cbxNivelGrupo = new javax.swing.JComboBox<>();
        DIACLASE = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cbxHoraInicio = new javax.swing.JComboBox<>();
        cbxDiaInicio = new javax.swing.JComboBox<>();
        cbxHoraTermino = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        salon = new javax.swing.JLabel();
        maximoestudiantes = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtSalonGrupo = new javax.swing.JTextField();
        txtMaxGrupo = new javax.swing.JTextField();
        txtCicloEscolar = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        DIACLASE1 = new javax.swing.JLabel();
        cbxDiaInicio1 = new javax.swing.JComboBox<>();
        cbxHoraInicio1 = new javax.swing.JComboBox<>();
        cbxHoraTermino1 = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        salon1 = new javax.swing.JLabel();
        txtSalonGrupo1 = new javax.swing.JTextField();
        panelAcciones = new javax.swing.JPanel();
        btnAgregarGrupo = new javax.swing.JButton();
        btnModificarGrupo = new javax.swing.JButton();
        btnCancelarGrupo = new javax.swing.JButton();
        btnEliminarGrupo = new javax.swing.JButton();
        btnCerrarPestañaGrupo = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableGrupo = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        btnDescargarGrupo = new javax.swing.JButton();
        btnCargaCalificacionesGrupo = new javax.swing.JButton();

        setTitle("GENERAR GRUPOS");

        jLabel1.setText("APARTADO GRUPOS ALUMNOS");

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        GRUPO.setText("CLAVE GRUPO: ");
        jPanel1.add(GRUPO, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 25, -1, -1));

        txtCveGrupo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCveGrupoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCveGrupoKeyTyped(evt);
            }
        });
        jPanel1.add(txtCveGrupo, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 22, 205, -1));

        nivel_ingles.setText("NIVEL DE INGLÉS: ");
        jPanel1.add(nivel_ingles, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 99, 126, -1));

        jLabel3.setText("NOMBRE GRUPO:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 63, 116, -1));

        txtNombreGrupo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNombreGrupoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreGrupoKeyTyped(evt);
            }
        });
        jPanel1.add(txtNombreGrupo, new org.netbeans.lib.awtextra.AbsoluteConstraints(191, 60, 204, -1));

        cbxNivelGrupo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "BEGINNERS A", "BEGINNERS B", "ELEMENTARY A", "ELEMENTARY B", "PRE INTERMEDIATE A", "PRE INTERMEDIATE B", "INTERMEDIATE A", "INTERMEDIATE B", "ADVANCED A", "ADVANCED B", "CERTIFICATE", "INTENSIVE PRE INTERMEDIATE", "INTENSIVE ELEMENTARY" }));
        jPanel1.add(cbxNivelGrupo, new org.netbeans.lib.awtextra.AbsoluteConstraints(191, 96, 204, -1));

        DIACLASE.setText("DIAS DE CLASE: ");
        jPanel1.add(DIACLASE, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 116, -1));

        jLabel2.setText("HORARIO CLASE:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 116, -1));

        cbxHoraInicio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "7:00", "7:50", "9:10", "10:00", "10:50", "11:40", "12:40", "13:30", "14:20", "15:10", "16:20", "17:10", "18:00", "18:50" }));
        jPanel1.add(cbxHoraInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 270, 96, -1));

        cbxDiaInicio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "LUNES", "MARTES", "MIERCOLES", "JUEVES", "VIERNES", "SABADO", "DOMINGO" }));
        jPanel1.add(cbxDiaInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 240, 96, -1));

        cbxHoraTermino.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "7:50", "8:40", "10:00", "10:50", "11:40", "12:30", "13:30", "14:20", "15:10", "16:00", "17:10", "18:00", "18:50", "19:40" }));
        jPanel1.add(cbxHoraTermino, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 270, 89, -1));

        jLabel6.setText("A");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 270, 11, -1));

        salon.setText("SALON:");
        jPanel1.add(salon, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 240, 60, 20));

        maximoestudiantes.setText("MAXIMO ESTUDIANTES:");
        jPanel1.add(maximoestudiantes, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, -1));

        jLabel5.setText("CICLO ESCOLAR:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 107, -1));

        txtSalonGrupo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSalonGrupoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtSalonGrupoKeyTyped(evt);
            }
        });
        jPanel1.add(txtSalonGrupo, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 240, 60, -1));

        txtMaxGrupo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtMaxGrupoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtMaxGrupoKeyTyped(evt);
            }
        });
        jPanel1.add(txtMaxGrupo, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 140, 204, -1));

        txtCicloEscolar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCicloEscolarKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCicloEscolarKeyTyped(evt);
            }
        });
        jPanel1.add(txtCicloEscolar, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 170, 204, -1));

        jLabel4.setText("HORARIO CLASE:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 116, -1));

        DIACLASE1.setText("DIAS DE CLASE: ");
        jPanel1.add(DIACLASE1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 116, -1));

        cbxDiaInicio1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { ".", "LUNES", "MARTES", "MIERCOLES", "JUEVES", "VIERNES", "SABADO", "DOMINGO" }));
        jPanel1.add(cbxDiaInicio1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 300, 96, -1));

        cbxHoraInicio1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { ".", "7:00", "7:50", "9:10", "10:00", "10:50", "11:40", "12:40", "13:30", "14:20", "15:10", "16:20", "17:10", "18:00", "18:50" }));
        jPanel1.add(cbxHoraInicio1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 330, 96, -1));

        cbxHoraTermino1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { ".", "7:50", "8:40", "10:00", "10:50", "11:40", "12:30", "13:30", "14:20", "15:10", "16:00", "17:10", "18:00", "18:50", "19:40" }));
        jPanel1.add(cbxHoraTermino1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 330, 89, -1));

        jLabel7.setText("A");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 330, 11, -1));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 390, -1));

        salon1.setText("SALON:");
        jPanel1.add(salon1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 300, 60, 20));

        txtSalonGrupo1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSalonGrupo1KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtSalonGrupo1KeyTyped(evt);
            }
        });
        jPanel1.add(txtSalonGrupo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 300, 60, -1));

        panelAcciones.setBackground(new java.awt.Color(204, 255, 204));

        btnAgregarGrupo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/20xAgregar.png"))); // NOI18N
        btnAgregarGrupo.setText("Agregar");
        btnAgregarGrupo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarGrupoActionPerformed(evt);
            }
        });

        btnModificarGrupo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/20xModificar.png"))); // NOI18N
        btnModificarGrupo.setText("Modificar");
        btnModificarGrupo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarGrupoActionPerformed(evt);
            }
        });

        btnCancelarGrupo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/20xCancelar.png"))); // NOI18N
        btnCancelarGrupo.setText("Cancelar");
        btnCancelarGrupo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarGrupoActionPerformed(evt);
            }
        });

        btnEliminarGrupo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/20xEliminar.png"))); // NOI18N
        btnEliminarGrupo.setText("Eliminar");
        btnEliminarGrupo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarGrupoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelAccionesLayout = new javax.swing.GroupLayout(panelAcciones);
        panelAcciones.setLayout(panelAccionesLayout);
        panelAccionesLayout.setHorizontalGroup(
            panelAccionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAccionesLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(btnAgregarGrupo, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnModificarGrupo, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btnCancelarGrupo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnEliminarGrupo, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );
        panelAccionesLayout.setVerticalGroup(
            panelAccionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelAccionesLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(panelAccionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregarGrupo)
                    .addComponent(btnModificarGrupo)
                    .addComponent(btnCancelarGrupo)
                    .addComponent(btnEliminarGrupo))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        btnCerrarPestañaGrupo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/20xCerrarPestaña.png"))); // NOI18N
        btnCerrarPestañaGrupo.setText("Cerrar Pestaña");
        btnCerrarPestañaGrupo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarPestañaGrupoActionPerformed(evt);
            }
        });

        tableGrupo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CLAVE", "GRUPO", "NIVEL INGLES", "DIA CLASE", "HORARIO CLASE", "SALON", "DIA CLASE", "HORARIO CLASE", "SALON", "CICLO ESCOLAR", "MAX. ESTUDIANTESl"
            }
        ));
        tableGrupo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableGrupoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableGrupo);
        if (tableGrupo.getColumnModel().getColumnCount() > 0) {
            tableGrupo.getColumnModel().getColumn(0).setMinWidth(0);
            tableGrupo.getColumnModel().getColumn(0).setPreferredWidth(0);
            tableGrupo.getColumnModel().getColumn(0).setMaxWidth(0);
            tableGrupo.getColumnModel().getColumn(5).setMinWidth(0);
            tableGrupo.getColumnModel().getColumn(5).setPreferredWidth(0);
            tableGrupo.getColumnModel().getColumn(5).setMaxWidth(0);
            tableGrupo.getColumnModel().getColumn(8).setMinWidth(0);
            tableGrupo.getColumnModel().getColumn(8).setPreferredWidth(0);
            tableGrupo.getColumnModel().getColumn(8).setMaxWidth(0);
            tableGrupo.getColumnModel().getColumn(10).setMinWidth(0);
            tableGrupo.getColumnModel().getColumn(10).setPreferredWidth(0);
            tableGrupo.getColumnModel().getColumn(10).setMaxWidth(0);
        }

        jPanel2.setBackground(new java.awt.Color(204, 255, 204));

        btnDescargarGrupo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/x20Pdf.png"))); // NOI18N
        btnDescargarGrupo.setText("Descargar Listas");
        btnDescargarGrupo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDescargarGrupoActionPerformed(evt);
            }
        });

        btnCargaCalificacionesGrupo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/x20Calificacion.png"))); // NOI18N
        btnCargaCalificacionesGrupo.setText("Cargar Calificaciones");
        btnCargaCalificacionesGrupo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCargaCalificacionesGrupoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(btnDescargarGrupo)
                .addGap(18, 18, 18)
                .addComponent(btnCargaCalificacionesGrupo, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDescargarGrupo)
                    .addComponent(btnCargaCalificacionesGrupo))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelAcciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(530, 530, 530))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnCerrarPestañaGrupo, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 746, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 363, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelAcciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(btnCerrarPestañaGrupo))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCerrarPestañaGrupoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarPestañaGrupoActionPerformed
        vistaprincipal.cerrarGrupoAlumno();
    }//GEN-LAST:event_btnCerrarPestañaGrupoActionPerformed

    private void btnAgregarGrupoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarGrupoActionPerformed
      
     if (!"".equals(txtCveGrupo.getText()) &&
        !"".equals(txtNombreGrupo.getText()) &&
        !"".equals(cbxNivelGrupo.getSelectedItem())) {

        vGrupo.setCveGrupo(txtCveGrupo.getText());
        vGrupo.setNombreGrupo(txtNombreGrupo.getText());
        vGrupo.setNivelIngles(cbxNivelGrupo.getSelectedItem().toString());
        
        vGrupo.setDiaClase1(cbxDiaInicio.getSelectedItem().toString());
        
        String horaInicio1 = cbxHoraInicio.getSelectedItem().toString();
        String horaFin1 = cbxHoraTermino.getSelectedItem().toString();
        String horarioConcatenado1 = horaInicio1 + " - " + horaFin1;       
        vGrupo.setHorarioClase1(horarioConcatenado1);
        
        vGrupo.setSalonClase1(txtSalonGrupo.getText());
        
        
        vGrupo.setDiaClase2(cbxDiaInicio1.getSelectedItem().toString());
        String horaInicio2 = cbxHoraInicio1.getSelectedItem().toString();
        String horaFin2 = cbxHoraTermino1.getSelectedItem().toString();
        String horarioConcatenado2 = horaInicio2 + " - " + horaFin2;    
        vGrupo.setHorarioClase2(horarioConcatenado2);
        vGrupo.setSalonClase2(txtSalonGrupo1.getText());
        
        vGrupo.setCicloEscolar(txtCicloEscolar.getText());
        vGrupo.setMaxEstudiantes(Integer.parseInt(txtMaxGrupo.getText()));
        

        // Insertar el docente en la base de datos
        vGrupoDao.agregarGrupo(vGrupo);
        vAsignarGrupoDocente.cargaComboCompletoGrupo();
       
        
        
        // Limpiar y actualizar tabla
         limpiarTable();
         listarGrupo();
         limpiarGrupo();
         
        // Mostrar mensaje de éxito
        JOptionPane.showMessageDialog(null, "Nuevo Ingreso Registrado con éxito!!");

        } else {
        JOptionPane.showMessageDialog(null, "Hay campos vacíos");
     }
     
        
        
    }//GEN-LAST:event_btnAgregarGrupoActionPerformed

    private void btnEliminarGrupoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarGrupoActionPerformed
       if (!"".equals(txtCveGrupo.getText())) {
        int pregunta = JOptionPane.showConfirmDialog(null, "¿Estás seguro de eliminar?");
        
        if (pregunta == 0) {
            String id = txtCveGrupo.getText();
            boolean eliminado = vGrupoDao.eliminarGrupo(id);
             
            limpiarGrupo();
            if (eliminado) {
                JOptionPane.showMessageDialog(null, "Eliminado correctamente!!");
                limpiarGrupo();
                limpiarTable();
                listarGrupo();
                //this.repaint();
                 vAsignarGrupoDocente.cargaComboCompletoGrupo();
               
                
            } else {
                // No es necesario un mensaje adicional aquí porque el DAO ya muestra el mensaje de error
            }
        }
    } else {
        JOptionPane.showMessageDialog(null, "Seleccione un registro para eliminar.");
    }
       
    }//GEN-LAST:event_btnEliminarGrupoActionPerformed

    private void btnModificarGrupoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarGrupoActionPerformed
      
         if("".equals(txtCveGrupo.getText())){
            JOptionPane.showMessageDialog(null, "Seleccione una fila");
        }else{  
        if(!"".equals(txtNombreGrupo.getText()) && !"".equals(txtCicloEscolar.getText())){
         
          
        vGrupo.setCveGrupo(txtCveGrupo.getText());
        vGrupo.setNombreGrupo(txtNombreGrupo.getText());
        vGrupo.setNivelIngles(cbxNivelGrupo.getSelectedItem().toString());
        
        vGrupo.setDiaClase1(cbxDiaInicio.getSelectedItem().toString());
        
        String horaInicio1 = cbxHoraInicio.getSelectedItem().toString();
        String horaFin1 = cbxHoraTermino.getSelectedItem().toString();
        String horarioConcatenado1 = horaInicio1 + " - " + horaFin1;       
        vGrupo.setHorarioClase1(horarioConcatenado1);
        
        vGrupo.setSalonClase1(txtSalonGrupo.getText());
        
        
        vGrupo.setDiaClase2(cbxDiaInicio1.getSelectedItem().toString());
        String horaInicio2 = cbxHoraInicio1.getSelectedItem().toString();
        String horaFin2 = cbxHoraTermino1.getSelectedItem().toString();
        String horarioConcatenado2 = horaInicio2 + " - " + horaFin2;    
        vGrupo.setHorarioClase2(horarioConcatenado2);
        vGrupo.setSalonClase2(txtSalonGrupo1.getText());
        
        vGrupo.setCicloEscolar(txtCicloEscolar.getText());
        vGrupo.setMaxEstudiantes(Integer.parseInt(txtMaxGrupo.getText()));
        
        vGrupoDao.modificarGrupo(vGrupo);
         vAsignarGrupoDocente.cargaComboCompletoGrupo();
        limpiarGrupo();
        limpiarTable();
        listarGrupo();
        
       

        }else{
        JOptionPane.showMessageDialog(null,"HAY CAMPOS VACIOS");
        }
      } 
        
        
    }//GEN-LAST:event_btnModificarGrupoActionPerformed

    private void btnCancelarGrupoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarGrupoActionPerformed
        limpiarGrupo();

    }//GEN-LAST:event_btnCancelarGrupoActionPerformed

    private void btnDescargarGrupoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDescargarGrupoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDescargarGrupoActionPerformed

    private void btnCargaCalificacionesGrupoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCargaCalificacionesGrupoActionPerformed
       AsignarCalificacionGrupo vAsignarCalificacionGrupo = new AsignarCalificacionGrupo();
       vAsignarCalificacionGrupo.setVisible(true);
     
    }//GEN-LAST:event_btnCargaCalificacionesGrupoActionPerformed

    private void tableGrupoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableGrupoMouseClicked
       
       txtCveGrupo.setEnabled(false);
    int fila = tableGrupo.rowAtPoint(evt.getPoint());
    
        txtCveGrupo.setText(tableGrupo.getValueAt(fila,0).toString());
        txtNombreGrupo.setText(tableGrupo.getValueAt(fila,1).toString());   
        cbxNivelGrupo.setSelectedItem(tableGrupo.getValueAt(fila, 2).toString());
      
        cbxDiaInicio.setSelectedItem(tableGrupo.getValueAt(fila, 3).toString());  
        String horarioConcatenado1 = tableGrupo.getValueAt(fila, 4).toString();
        String[] partesHorario1 = horarioConcatenado1.split(" - ");  // Separar las horas
        cbxHoraInicio.setSelectedItem(partesHorario1[0]);  // Asignar la hora de inicio
        cbxHoraTermino.setSelectedItem(partesHorario1[1]);     // Asignar la hora de fin
        txtSalonGrupo.setText(tableGrupo.getValueAt(fila, 5).toString());
        
        
        cbxDiaInicio1.setSelectedItem(tableGrupo.getValueAt(fila, 6).toString());
        cbxDiaInicio1.setSelectedItem(tableGrupo.getValueAt(fila, 6).toString());
        String horarioConcatenado2 = tableGrupo.getValueAt(fila, 7).toString();
        String[] partesHorario2 = horarioConcatenado2.split(" - ");  // Separar las horas
        cbxHoraInicio1.setSelectedItem(partesHorario2[0]);  // Asignar la hora de inicio
        cbxHoraTermino1.setSelectedItem(partesHorario2[1]);     // Asignar la hora de fin

        txtSalonGrupo1.setText(tableGrupo.getValueAt(fila, 8).toString());

        
        txtCicloEscolar.setText(tableGrupo.getValueAt(fila, 9).toString());
        txtMaxGrupo.setText(tableGrupo.getValueAt(fila, 10).toString());
        
        
        
        
    grupoMouseClicked();  
        
        
        
        
    }//GEN-LAST:event_tableGrupoMouseClicked

    //**********************  EVENTOS DE TECLADO ************************************//
    private void txtCveGrupoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCveGrupoKeyReleased
      String mayus = txtCveGrupo.getText().toUpperCase();
      txtCveGrupo.setText(mayus);     
    }//GEN-LAST:event_txtCveGrupoKeyReleased

    private void txtCveGrupoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCveGrupoKeyTyped
       if (txtCveGrupo.getText().length() >= 8) {
            evt.consume();
        }
    
    }//GEN-LAST:event_txtCveGrupoKeyTyped

    private void txtNombreGrupoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreGrupoKeyReleased
         String mayus = txtNombreGrupo.getText().toUpperCase();
      txtNombreGrupo.setText(mayus);   
    }//GEN-LAST:event_txtNombreGrupoKeyReleased

    private void txtNombreGrupoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreGrupoKeyTyped
         if (txtNombreGrupo.getText().length() >= 30) {
            evt.consume();
        }
    }//GEN-LAST:event_txtNombreGrupoKeyTyped

    private void txtMaxGrupoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMaxGrupoKeyReleased
        
        
    }//GEN-LAST:event_txtMaxGrupoKeyReleased

    private void txtCicloEscolarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCicloEscolarKeyReleased
        
    }//GEN-LAST:event_txtCicloEscolarKeyReleased

    private void txtCicloEscolarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCicloEscolarKeyTyped
         if (txtCicloEscolar.getText().length() >= 9) {
            evt.consume();
        }
         event.numberKeyPress(evt);
    }//GEN-LAST:event_txtCicloEscolarKeyTyped

    private void txtSalonGrupoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSalonGrupoKeyTyped
        if (txtSalonGrupo.getText().length() >= 2) {
            evt.consume();
        }
         
    }//GEN-LAST:event_txtSalonGrupoKeyTyped

    private void txtSalonGrupoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSalonGrupoKeyReleased
      String mayus = txtSalonGrupo.getText().toUpperCase();
      txtSalonGrupo.setText(mayus);
    }//GEN-LAST:event_txtSalonGrupoKeyReleased

    private void txtSalonGrupo1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSalonGrupo1KeyReleased
      String mayus = txtSalonGrupo1.getText().toUpperCase();
      txtSalonGrupo1.setText(mayus);
         
    }//GEN-LAST:event_txtSalonGrupo1KeyReleased

    private void txtSalonGrupo1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSalonGrupo1KeyTyped
        if (txtSalonGrupo1.getText().length() >= 2) {
            evt.consume();
        }
    }//GEN-LAST:event_txtSalonGrupo1KeyTyped

    private void txtMaxGrupoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMaxGrupoKeyTyped
      if (txtMaxGrupo.getText().length() >= 2) {
            evt.consume();
        }
      event.numberKeyPress(evt);
    }//GEN-LAST:event_txtMaxGrupoKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel DIACLASE;
    private javax.swing.JLabel DIACLASE1;
    private javax.swing.JLabel GRUPO;
    private javax.swing.JButton btnAgregarGrupo;
    private javax.swing.JButton btnCancelarGrupo;
    private javax.swing.JButton btnCargaCalificacionesGrupo;
    private javax.swing.JButton btnCerrarPestañaGrupo;
    private javax.swing.JButton btnDescargarGrupo;
    private javax.swing.JButton btnEliminarGrupo;
    private javax.swing.JButton btnModificarGrupo;
    private javax.swing.JComboBox<String> cbxDiaInicio;
    private javax.swing.JComboBox<String> cbxDiaInicio1;
    private javax.swing.JComboBox<String> cbxHoraInicio;
    private javax.swing.JComboBox<String> cbxHoraInicio1;
    private javax.swing.JComboBox<String> cbxHoraTermino;
    private javax.swing.JComboBox<String> cbxHoraTermino1;
    private javax.swing.JComboBox<String> cbxNivelGrupo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel maximoestudiantes;
    private javax.swing.JLabel nivel_ingles;
    private javax.swing.JPanel panelAcciones;
    private javax.swing.JLabel salon;
    private javax.swing.JLabel salon1;
    private javax.swing.JTable tableGrupo;
    private javax.swing.JTextField txtCicloEscolar;
    private javax.swing.JTextField txtCveGrupo;
    private javax.swing.JTextField txtMaxGrupo;
    private javax.swing.JTextField txtNombreGrupo;
    private javax.swing.JTextField txtSalonGrupo;
    private javax.swing.JTextField txtSalonGrupo1;
    // End of variables declaration//GEN-END:variables

   
     private void limpiarGrupo() {
    txtCveGrupo.setText("");
    txtNombreGrupo.setText("");

    // En lugar de eliminar los ítems, selecciona el primer valor predeterminado
    cbxNivelGrupo.setSelectedIndex(0);  // Selecciona el primer ítem
    cbxDiaInicio.setSelectedIndex(0);
    cbxHoraInicio.setSelectedIndex(0);
    cbxHoraTermino.setSelectedIndex(0);
    
    txtSalonGrupo.setText("");
    
    cbxDiaInicio1.setSelectedIndex(0);
    cbxHoraInicio1.setSelectedIndex(0);
    cbxHoraTermino1.setSelectedIndex(0);
    txtSalonGrupo1.setText("");
    
    txtCicloEscolar.setText("");
    txtMaxGrupo.setText("");
    
    agregarGrupo();  // Ajustes de botones
}

     
    private void agregarGrupo(){
      txtCveGrupo.setEnabled(true);
      
      btnAgregarGrupo.setEnabled(true);
      btnModificarGrupo.setEnabled(false);
      btnCancelarGrupo.setEnabled(true);
      btnEliminarGrupo.setEnabled(false);
              
    }
    private void grupoMouseClicked() {
    btnAgregarGrupo.setEnabled(false);
    btnModificarGrupo.setEnabled(true);
    btnCancelarGrupo.setEnabled(true);
    btnEliminarGrupo.setEnabled(true);
   
}
    
    
    
}
