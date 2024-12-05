/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InternalFrame;

import Modelo.Alumno;
import Modelo.AlumnoDao;
import Modelo.Eventos;
import Modelo.Grupo;
import Modelo.GrupoDao;
import Modelo.Licenciatura;
import Modelo.LicenciaturaDao;
import Vista.Interaccion.AgregarLicenciatura;
import Vista.Interaccion.AsignarCalificacionAlumno;
import Vista.Interaccion.AsignarGrupoAlumno;
import Vista.JDialog.SeleccionarAlumno;

import Vista.VistaPrincipal;
import java.awt.Container;
import java.awt.Frame;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;
import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;

/**
 *
 * @author ramos
 */
public class InternalAgregarAlumno extends javax.swing.JInternalFrame {

    AgregarLicenciatura vAgregarLicenciatura = new AgregarLicenciatura(this);
    Licenciatura lic = new Licenciatura();
    LicenciaturaDao licenciaturaDao = new LicenciaturaDao();
    
    Grupo vGrupo = new Grupo();
    GrupoDao vGrupoDao = new GrupoDao();
    
    
    
    Alumno vAlumno = new Alumno();
    AlumnoDao vAlumnoDao = new AlumnoDao();
    
   
    
    DefaultTableModel modelo = new DefaultTableModel(); //para las tablas
    DefaultTableModel tmp = new DefaultTableModel(); //para reportes

    private VistaPrincipal vistaprincipal;
    Eventos evt = new Eventos();
    
    
    public InternalAgregarAlumno(VistaPrincipal vistaprincipal) {
        this.vistaprincipal =  vistaprincipal;
        BasicInternalFrameUI ui = (BasicInternalFrameUI) getUI();
        Container northPane = ui.getNorthPane();
        northPane.removeMouseMotionListener(ui.getNorthPane().getMouseMotionListeners()[0]);
        remove(northPane);
        setBorder(null);  
        
        initComponents();
        
        
        cargaComboCompletoLicenciatura();
        AutoCompleteDecorator.decorate(cbxLicenciatura);
        
        cargaComboCompletoGrupo();
        AutoCompleteDecorator.decorate(cbxAsignarGrupoAlumno);
        
        
       
        
        
    }

    public InternalAgregarAlumno() {
    }
   

    
    public void cargaComboCompletoLicenciatura() {
        cbxLicenciatura.removeAllItems();
        // Cargar datos de las ciudades en el combo box
        cargarLicenciaturas();
        mostrarRvoe();
        // Añadir listener para el cambio de selección en el combo box
        cbxLicenciatura.addActionListener(e -> mostrarRvoe());
    }
    // Método para cargar los nombres de las licenciaturas en el combo box
    public void cargarLicenciaturas() {
        List<Licenciatura> lics = licenciaturaDao.obtenerLicenciatura();
        for (Licenciatura vLicenciatura : lics) {
            cbxLicenciatura.addItem(vLicenciatura.getNombreLicenciatura());
        }
    }
    // Método para mostrar el código postal correspondiente cuando se selecciona una licenciatura
    public void mostrarRvoe() {
        String nombreSeleccionada = (String) cbxLicenciatura.getSelectedItem();
        List<Licenciatura> lics = licenciaturaDao.obtenerLicenciatura();
        for (Licenciatura vLicenciatura : lics) {
            if (vLicenciatura.getNombreLicenciatura().equals(nombreSeleccionada)) {
                txtRvoeLicenciaturaAlumno.setText(vLicenciatura.getRvoe());
                break;
            }
        }
    }
    //Termina la parte de la carga de combo de licenciatura 
    //+++++++
    
    /// INICIA LA PARTE DE CARGAR LOS GRUPOS PARA LOS ALUMNOS
    
    public void cargaComboCompletoGrupo() {
        cbxAsignarGrupoAlumno.removeAllItems();
        // Cargar datos  en el combo box
        cargarGruppo();
        mostrarCveGrupo();
        // Añadir listener para el cambio de selección en el combo box
        cbxAsignarGrupoAlumno.addActionListener(e -> mostrarCveGrupo());
    }
    // Método para cargar los nombres de las licenciaturas en el combo box
    public void cargarGruppo() {
        List<Grupo> listar = vGrupoDao.obtenerGrupo();
        for (Grupo vGrupo : listar) {
            cbxAsignarGrupoAlumno.addItem(vGrupo.getNombreGrupo());
        }
    }
    // Método para mostrar el código postal correspondiente cuando se selecciona una licenciatura
    public void mostrarCveGrupo() {
        String nombreSeleccionada = (String) cbxAsignarGrupoAlumno.getSelectedItem();
        List<Grupo> listar = vGrupoDao.obtenerGrupo();
        for (Grupo vGrupo : listar) {
            if (vGrupo.getNombreGrupo().equals(nombreSeleccionada)) {
                txtCveGrupoAlumno.setText(vGrupo.getCveGrupo());
                break;
            }
        }
    }
    //Termina la parte de la carga de combo de Grupo 
    //+++++++
    
    //limpiar table
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
        btnCerrarPestañaAlumnos = new javax.swing.JButton();
        panelAlumnosInfo = new javax.swing.JPanel();
        LBLNOMBRE = new javax.swing.JLabel();
        LBLPATERNO = new javax.swing.JLabel();
        LBLMATERNO = new javax.swing.JLabel();
        LBLLICENCIATURA = new javax.swing.JLabel();
        LBLGENERACION = new javax.swing.JLabel();
        LBLSEMESTRE = new javax.swing.JLabel();
        txtMatricula = new javax.swing.JTextField();
        txtPaternoAlumno = new javax.swing.JTextField();
        txtMaternoAlumno = new javax.swing.JTextField();
        txtGeneracion = new javax.swing.JTextField();
        txtSemestre = new javax.swing.JTextField();
        cbxLicenciatura = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        txtNombreAlumno = new javax.swing.JTextField();
        btnAgregarLicenciatura = new javax.swing.JButton();
        txtRvoeLicenciaturaAlumno = new javax.swing.JTextField();
        panelAcciones = new javax.swing.JPanel();
        btnAgregarAlumno = new javax.swing.JButton();
        btnModificarAlumno = new javax.swing.JButton();
        btnCancelarAlumno = new javax.swing.JButton();
        btnEliminarAlumno = new javax.swing.JButton();
        jInternalFrame1 = new javax.swing.JInternalFrame();
        jLabel5 = new javax.swing.JLabel();
        btnCerrarPestañaAlumnos1 = new javax.swing.JButton();
        panelAlumnosInfo1 = new javax.swing.JPanel();
        LBLNOMBRE1 = new javax.swing.JLabel();
        LBLPATERNO1 = new javax.swing.JLabel();
        LBLMATERNO1 = new javax.swing.JLabel();
        LBLLICENCIATURA1 = new javax.swing.JLabel();
        LBLGENERACION1 = new javax.swing.JLabel();
        LBLSEMESTRE1 = new javax.swing.JLabel();
        txtMatricula1 = new javax.swing.JTextField();
        txtPaternoAlumno1 = new javax.swing.JTextField();
        txtMaternoAlumno1 = new javax.swing.JTextField();
        txtGeneracion1 = new javax.swing.JTextField();
        txtSemestre1 = new javax.swing.JTextField();
        cbxLicenciatura1 = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        txtNombreAlumno1 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jCheckBox2 = new javax.swing.JCheckBox();
        panelAcciones1 = new javax.swing.JPanel();
        btnAgregarAlumno1 = new javax.swing.JButton();
        btnModificarAlumno1 = new javax.swing.JButton();
        btnCancelarAlumno1 = new javax.swing.JButton();
        btnEliminarAlumno1 = new javax.swing.JButton();
        accionesAlumno1 = new javax.swing.JPanel();
        btnCalificaciones1 = new javax.swing.JButton();
        btnAsignarGrupo1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableAlumnos1 = new javax.swing.JTable();
        panelBusqueda1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        txtBusquedaNombre1 = new javax.swing.JTextField();
        btnBuscar1 = new javax.swing.JButton();
        btnAbrirVentana = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        cbEstadoConstanciaAlumno = new javax.swing.JCheckBox();
        jLabel9 = new javax.swing.JLabel();
        txtObservaciones = new javax.swing.JTextField();
        btnCalificaciones = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        cbxAsignarGrupoAlumno = new javax.swing.JComboBox<>();
        txtCveGrupoAlumno = new javax.swing.JTextField();
        btnActualizarMetodos = new javax.swing.JButton();

        jLabel1.setText("APARTADO DE ALUMNOS");

        btnCerrarPestañaAlumnos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/20xCerrarPestaña.png"))); // NOI18N
        btnCerrarPestañaAlumnos.setText("Cerrar Pestaña");
        btnCerrarPestañaAlumnos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarPestañaAlumnosActionPerformed(evt);
            }
        });

        panelAlumnosInfo.setBackground(new java.awt.Color(204, 255, 204));

        LBLNOMBRE.setText("MATRICULA: ");

        LBLPATERNO.setText("APELLIDO PATERNO: ");

        LBLMATERNO.setText("APELLIDO MATERNO:");

        LBLLICENCIATURA.setText("LICENCIATURA: ");

        LBLGENERACION.setText("GENERACIÓN:");

        LBLSEMESTRE.setText("SEMESTRE:");

        cbxLicenciatura.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel2.setText("NOMBRE: ");

        btnAgregarLicenciatura.setText("+");
        btnAgregarLicenciatura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarLicenciaturaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelAlumnosInfoLayout = new javax.swing.GroupLayout(panelAlumnosInfo);
        panelAlumnosInfo.setLayout(panelAlumnosInfoLayout);
        panelAlumnosInfoLayout.setHorizontalGroup(
            panelAlumnosInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAlumnosInfoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelAlumnosInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelAlumnosInfoLayout.createSequentialGroup()
                        .addComponent(LBLLICENCIATURA)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                        .addComponent(txtRvoeLicenciaturaAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelAlumnosInfoLayout.createSequentialGroup()
                        .addGroup(panelAlumnosInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LBLNOMBRE)
                            .addComponent(LBLPATERNO)
                            .addComponent(LBLMATERNO)
                            .addComponent(LBLGENERACION)
                            .addComponent(LBLSEMESTRE)
                            .addComponent(jLabel2))
                        .addGap(0, 50, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelAlumnosInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelAlumnosInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtMatricula, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE)
                        .addComponent(txtPaternoAlumno)
                        .addComponent(txtMaternoAlumno)
                        .addComponent(txtGeneracion)
                        .addComponent(txtSemestre)
                        .addComponent(txtNombreAlumno))
                    .addComponent(cbxLicenciatura, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAgregarLicenciatura, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        panelAlumnosInfoLayout.setVerticalGroup(
            panelAlumnosInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAlumnosInfoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelAlumnosInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LBLNOMBRE)
                    .addComponent(txtMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(panelAlumnosInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNombreAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelAlumnosInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LBLPATERNO)
                    .addComponent(txtPaternoAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelAlumnosInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LBLMATERNO)
                    .addComponent(txtMaternoAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelAlumnosInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LBLLICENCIATURA)
                    .addComponent(cbxLicenciatura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAgregarLicenciatura)
                    .addComponent(txtRvoeLicenciaturaAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelAlumnosInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LBLGENERACION)
                    .addComponent(txtGeneracion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelAlumnosInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LBLSEMESTRE)
                    .addComponent(txtSemestre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(103, Short.MAX_VALUE))
        );

        panelAcciones.setBackground(new java.awt.Color(204, 255, 204));

        btnAgregarAlumno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/20xAgregar.png"))); // NOI18N
        btnAgregarAlumno.setText("Agregar");
        btnAgregarAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarAlumnoActionPerformed(evt);
            }
        });

        btnModificarAlumno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/20xModificar.png"))); // NOI18N
        btnModificarAlumno.setText("Modificar");
        btnModificarAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarAlumnoActionPerformed(evt);
            }
        });

        btnCancelarAlumno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/20xCancelar.png"))); // NOI18N
        btnCancelarAlumno.setText("Cancelar");
        btnCancelarAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarAlumnoActionPerformed(evt);
            }
        });

        btnEliminarAlumno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/20xEliminar.png"))); // NOI18N
        btnEliminarAlumno.setText("Eliminar");
        btnEliminarAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarAlumnoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelAccionesLayout = new javax.swing.GroupLayout(panelAcciones);
        panelAcciones.setLayout(panelAccionesLayout);
        panelAccionesLayout.setHorizontalGroup(
            panelAccionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAccionesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnAgregarAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnModificarAlumno)
                .addGap(26, 26, 26)
                .addComponent(btnCancelarAlumno)
                .addGap(18, 18, 18)
                .addComponent(btnEliminarAlumno)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelAccionesLayout.setVerticalGroup(
            panelAccionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelAccionesLayout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(panelAccionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregarAlumno)
                    .addComponent(btnModificarAlumno)
                    .addComponent(btnCancelarAlumno)
                    .addComponent(btnEliminarAlumno))
                .addContainerGap())
        );

        jInternalFrame1.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setText("APARTADO DE ALUMNOS");
        jInternalFrame1.getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(491, 0, -1, -1));

        btnCerrarPestañaAlumnos1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/20xCerrarPestaña.png"))); // NOI18N
        btnCerrarPestañaAlumnos1.setText("Cerrar Pestaña");
        btnCerrarPestañaAlumnos1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarPestañaAlumnos1ActionPerformed(evt);
            }
        });
        jInternalFrame1.getContentPane().add(btnCerrarPestañaAlumnos1, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 405, 181, -1));

        panelAlumnosInfo1.setBackground(new java.awt.Color(204, 255, 204));

        LBLNOMBRE1.setText("MATRICULA: ");

        LBLPATERNO1.setText("APELLIDO PATERNO: ");

        LBLMATERNO1.setText("APELLIDO MATERNO:");

        LBLLICENCIATURA1.setText("LICENCIATURA: ");

        LBLGENERACION1.setText("GENERACIÓN:");

        LBLSEMESTRE1.setText("SEMESTRE:");

        cbxLicenciatura1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel6.setText("NOMBRE: ");

        jLabel7.setText("ESTATUS CONSTANCIA: ");

        jCheckBox2.setText("ENTREGADO");

        javax.swing.GroupLayout panelAlumnosInfo1Layout = new javax.swing.GroupLayout(panelAlumnosInfo1);
        panelAlumnosInfo1.setLayout(panelAlumnosInfo1Layout);
        panelAlumnosInfo1Layout.setHorizontalGroup(
            panelAlumnosInfo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAlumnosInfo1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelAlumnosInfo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LBLNOMBRE1)
                    .addComponent(LBLPATERNO1)
                    .addComponent(LBLMATERNO1)
                    .addComponent(LBLLICENCIATURA1)
                    .addComponent(LBLGENERACION1)
                    .addComponent(LBLSEMESTRE1)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addGroup(panelAlumnosInfo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelAlumnosInfo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtMatricula1)
                        .addComponent(txtPaternoAlumno1)
                        .addComponent(txtMaternoAlumno1)
                        .addComponent(txtGeneracion1)
                        .addComponent(txtSemestre1)
                        .addComponent(cbxLicenciatura1, 0, 216, Short.MAX_VALUE)
                        .addComponent(txtNombreAlumno1))
                    .addComponent(jCheckBox2))
                .addGap(48, 48, 48))
        );
        panelAlumnosInfo1Layout.setVerticalGroup(
            panelAlumnosInfo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAlumnosInfo1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelAlumnosInfo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LBLNOMBRE1)
                    .addComponent(txtMatricula1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(panelAlumnosInfo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtNombreAlumno1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelAlumnosInfo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LBLPATERNO1)
                    .addComponent(txtPaternoAlumno1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelAlumnosInfo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LBLMATERNO1)
                    .addComponent(txtMaternoAlumno1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelAlumnosInfo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LBLLICENCIATURA1)
                    .addComponent(cbxLicenciatura1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelAlumnosInfo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LBLGENERACION1)
                    .addComponent(txtGeneracion1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelAlumnosInfo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LBLSEMESTRE1)
                    .addComponent(txtSemestre1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelAlumnosInfo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jCheckBox2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jInternalFrame1.getContentPane().add(panelAlumnosInfo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 40, -1, 320));

        panelAcciones1.setBackground(new java.awt.Color(204, 255, 204));

        btnAgregarAlumno1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/20xAgregar.png"))); // NOI18N
        btnAgregarAlumno1.setText("Agregar");
        btnAgregarAlumno1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarAlumno1ActionPerformed(evt);
            }
        });

        btnModificarAlumno1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/20xModificar.png"))); // NOI18N
        btnModificarAlumno1.setText("Modificar");
        btnModificarAlumno1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarAlumno1ActionPerformed(evt);
            }
        });

        btnCancelarAlumno1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/20xCancelar.png"))); // NOI18N
        btnCancelarAlumno1.setText("Cancelar");
        btnCancelarAlumno1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarAlumno1ActionPerformed(evt);
            }
        });

        btnEliminarAlumno1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/20xEliminar.png"))); // NOI18N
        btnEliminarAlumno1.setText("Eliminar");
        btnEliminarAlumno1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarAlumno1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelAcciones1Layout = new javax.swing.GroupLayout(panelAcciones1);
        panelAcciones1.setLayout(panelAcciones1Layout);
        panelAcciones1Layout.setHorizontalGroup(
            panelAcciones1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAcciones1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnAgregarAlumno1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnModificarAlumno1)
                .addGap(26, 26, 26)
                .addComponent(btnCancelarAlumno1)
                .addGap(18, 18, 18)
                .addComponent(btnEliminarAlumno1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelAcciones1Layout.setVerticalGroup(
            panelAcciones1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelAcciones1Layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(panelAcciones1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregarAlumno1)
                    .addComponent(btnModificarAlumno1)
                    .addComponent(btnCancelarAlumno1)
                    .addComponent(btnEliminarAlumno1))
                .addContainerGap())
        );

        jInternalFrame1.getContentPane().add(panelAcciones1, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 374, -1, 60));

        accionesAlumno1.setBackground(new java.awt.Color(255, 255, 204));

        btnCalificaciones1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/x20Notas.png"))); // NOI18N
        btnCalificaciones1.setText("Calificaciones");
        btnCalificaciones1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalificaciones1ActionPerformed(evt);
            }
        });

        btnAsignarGrupo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/x20clase.png"))); // NOI18N
        btnAsignarGrupo1.setText("Asignar Grupo");
        btnAsignarGrupo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAsignarGrupo1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout accionesAlumno1Layout = new javax.swing.GroupLayout(accionesAlumno1);
        accionesAlumno1.setLayout(accionesAlumno1Layout);
        accionesAlumno1Layout.setHorizontalGroup(
            accionesAlumno1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(accionesAlumno1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(btnCalificaciones1)
                .addGap(28, 28, 28)
                .addComponent(btnAsignarGrupo1)
                .addContainerGap(100, Short.MAX_VALUE))
        );
        accionesAlumno1Layout.setVerticalGroup(
            accionesAlumno1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, accionesAlumno1Layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(accionesAlumno1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCalificaciones1)
                    .addComponent(btnAsignarGrupo1))
                .addContainerGap())
        );

        jInternalFrame1.getContentPane().add(accionesAlumno1, new org.netbeans.lib.awtextra.AbsoluteConstraints(531, 374, -1, -1));

        tableAlumnos1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "MATRICULA", "NOMBRE", "PETERNO", "MATERNO", "codLicenciatura", "LICENCIATURA", "GENERACIÓN", "SEMESTRE"
            }
        ));
        jScrollPane2.setViewportView(tableAlumnos1);

        jInternalFrame1.getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(491, 99, 620, 235));

        panelBusqueda1.setBackground(new java.awt.Color(204, 255, 204));

        jLabel8.setText("BUSQUEDA POR NOMBRE");

        btnBuscar1.setText("Buscar");
        btnBuscar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscar1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelBusqueda1Layout = new javax.swing.GroupLayout(panelBusqueda1);
        panelBusqueda1.setLayout(panelBusqueda1Layout);
        panelBusqueda1Layout.setHorizontalGroup(
            panelBusqueda1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBusqueda1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addComponent(txtBusquedaNombre1, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnBuscar1)
                .addContainerGap(170, Short.MAX_VALUE))
        );
        panelBusqueda1Layout.setVerticalGroup(
            panelBusqueda1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBusqueda1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelBusqueda1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtBusquedaNombre1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar1))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        jInternalFrame1.getContentPane().add(panelBusqueda1, new org.netbeans.lib.awtextra.AbsoluteConstraints(491, 25, 620, -1));

        btnAbrirVentana.setMnemonic('1');
        btnAbrirVentana.setText("Abrir ventana");
        btnAbrirVentana.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAbrirVentanaActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));

        jLabel4.setText("ESTATUS CONSTANCIA: ");

        cbEstadoConstanciaAlumno.setText("ENTREGADO");

        jLabel9.setText("OBSERVACIONES:");

        btnCalificaciones.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/x20Notas.png"))); // NOI18N
        btnCalificaciones.setText("Calificaciones");
        btnCalificaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalificacionesActionPerformed(evt);
            }
        });

        jLabel3.setText("ASIGNAR GRUPO:");

        cbxAsignarGrupoAlumno.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4)
                        .addGap(47, 47, 47)
                        .addComponent(cbEstadoConstanciaAlumno))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addComponent(btnCalificaciones))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel3))
                        .addGap(39, 39, 39)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtObservaciones, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE)
                            .addComponent(cbxAsignarGrupoAlumno, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtCveGrupoAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(49, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cbEstadoConstanciaAlumno))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtObservaciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cbxAsignarGrupoAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(txtCveGrupoAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 164, Short.MAX_VALUE)
                .addComponent(btnCalificaciones)
                .addContainerGap())
        );

        btnActualizarMetodos.setMnemonic('a');
        btnActualizarMetodos.setText("actualizar combo");
        btnActualizarMetodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarMetodosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jInternalFrame1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(513, 513, 513)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(panelAcciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(186, 186, 186)
                                .addComponent(btnAbrirVentana, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnActualizarMetodos, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(156, 156, 156))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnCerrarPestañaAlumnos, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(panelAlumnosInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(58, 58, 58)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(209, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jInternalFrame1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelAlumnosInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAbrirVentana)
                            .addComponent(btnActualizarMetodos))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCerrarPestañaAlumnos))
                    .addComponent(panelAcciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCerrarPestañaAlumnosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarPestañaAlumnosActionPerformed
       vistaprincipal.cerrarAgregarAlumno();
    }//GEN-LAST:event_btnCerrarPestañaAlumnosActionPerformed

    private void btnAgregarAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarAlumnoActionPerformed
      
        if (!"".equals(txtMatricula.getText()) &&
        !"".equals(txtNombreAlumno.getText()) &&
        !"".equals(txtPaternoAlumno.getText())) {

        JOptionPane.showMessageDialog(null, "Nuevo Ingreso Registrado con éxito!!");

        } else {
        JOptionPane.showMessageDialog(null, "Hay campos vacíos");
     }
        
        
    }//GEN-LAST:event_btnAgregarAlumnoActionPerformed

    private void btnModificarAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarAlumnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnModificarAlumnoActionPerformed

    private void btnCancelarAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarAlumnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCancelarAlumnoActionPerformed

    private void btnEliminarAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarAlumnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEliminarAlumnoActionPerformed

    private void btnCalificacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalificacionesActionPerformed
     AsignarCalificacionAlumno vAsignarCalificacionAlumno = new AsignarCalificacionAlumno();
     vAsignarCalificacionAlumno.setVisible(true);
         
       
    }//GEN-LAST:event_btnCalificacionesActionPerformed

    private void btnCerrarPestañaAlumnos1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarPestañaAlumnos1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCerrarPestañaAlumnos1ActionPerformed

    private void btnAgregarAlumno1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarAlumno1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAgregarAlumno1ActionPerformed

    private void btnModificarAlumno1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarAlumno1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnModificarAlumno1ActionPerformed

    private void btnCancelarAlumno1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarAlumno1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCancelarAlumno1ActionPerformed

    private void btnEliminarAlumno1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarAlumno1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEliminarAlumno1ActionPerformed

    private void btnCalificaciones1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalificaciones1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCalificaciones1ActionPerformed

    private void btnAsignarGrupo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAsignarGrupo1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAsignarGrupo1ActionPerformed

    private void btnBuscar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscar1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBuscar1ActionPerformed

    private void btnAgregarLicenciaturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarLicenciaturaActionPerformed
      
        vAgregarLicenciatura.setVisible(true);
    }//GEN-LAST:event_btnAgregarLicenciaturaActionPerformed

    private void btnAbrirVentanaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbrirVentanaActionPerformed
    SeleccionarAlumno dialogSeleccionar = new SeleccionarAlumno(
        (Frame) SwingUtilities.getWindowAncestor(this), true
    );
    dialogSeleccionar.setVisible(true);

    // Obtén el objeto seleccionado del diálogo
    Alumno selectedData = dialogSeleccionar.getSelectedData();

    // Rellena los JTextField y el JCheckBox con los datos del objeto
    if (selectedData != null) {
        txtMatricula.setText(selectedData.getMatricula());
        txtNombreAlumno.setText(selectedData.getNombreAlumno());
        txtPaternoAlumno.setText(selectedData.getApellidoPaterno());
        txtMaternoAlumno.setText(selectedData.getApellidoMaterno());
        txtGeneracion.setText(selectedData.getGeneracion());
        
        // Manejo de `semestre`
        txtSemestre.setText(String.valueOf(selectedData.getSemestre()));
        
        // Manejo de `statusConstancia`
        cbEstadoConstanciaAlumno.setSelected(selectedData.getStatusConstancia() == 1);
        txtObservaciones.setText(selectedData.getObservaciones());
        cbxLicenciatura.setSelectedItem(selectedData.getNombreLicenciatura());
        cbxAsignarGrupoAlumno.setSelectedItem(selectedData.getNombreGrupo());
    }

    }//GEN-LAST:event_btnAbrirVentanaActionPerformed

    private void btnActualizarMetodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarMetodosActionPerformed
       cargaComboCompletoGrupo();
       cargaComboCompletoLicenciatura();
    }//GEN-LAST:event_btnActualizarMetodosActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LBLGENERACION;
    private javax.swing.JLabel LBLGENERACION1;
    private javax.swing.JLabel LBLLICENCIATURA;
    private javax.swing.JLabel LBLLICENCIATURA1;
    private javax.swing.JLabel LBLMATERNO;
    private javax.swing.JLabel LBLMATERNO1;
    private javax.swing.JLabel LBLNOMBRE;
    private javax.swing.JLabel LBLNOMBRE1;
    private javax.swing.JLabel LBLPATERNO;
    private javax.swing.JLabel LBLPATERNO1;
    private javax.swing.JLabel LBLSEMESTRE;
    private javax.swing.JLabel LBLSEMESTRE1;
    private javax.swing.JPanel accionesAlumno1;
    private javax.swing.JButton btnAbrirVentana;
    private javax.swing.JButton btnActualizarMetodos;
    private javax.swing.JButton btnAgregarAlumno;
    private javax.swing.JButton btnAgregarAlumno1;
    private javax.swing.JButton btnAgregarLicenciatura;
    private javax.swing.JButton btnAsignarGrupo1;
    private javax.swing.JButton btnBuscar1;
    private javax.swing.JButton btnCalificaciones;
    private javax.swing.JButton btnCalificaciones1;
    private javax.swing.JButton btnCancelarAlumno;
    private javax.swing.JButton btnCancelarAlumno1;
    private javax.swing.JButton btnCerrarPestañaAlumnos;
    private javax.swing.JButton btnCerrarPestañaAlumnos1;
    private javax.swing.JButton btnEliminarAlumno;
    private javax.swing.JButton btnEliminarAlumno1;
    private javax.swing.JButton btnModificarAlumno;
    private javax.swing.JButton btnModificarAlumno1;
    private javax.swing.JCheckBox cbEstadoConstanciaAlumno;
    private javax.swing.JComboBox<String> cbxAsignarGrupoAlumno;
    private javax.swing.JComboBox<String> cbxLicenciatura;
    private javax.swing.JComboBox<String> cbxLicenciatura1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel panelAcciones;
    private javax.swing.JPanel panelAcciones1;
    private javax.swing.JPanel panelAlumnosInfo;
    private javax.swing.JPanel panelAlumnosInfo1;
    private javax.swing.JPanel panelBusqueda1;
    private javax.swing.JTable tableAlumnos1;
    private javax.swing.JTextField txtBusquedaNombre1;
    private javax.swing.JTextField txtCveGrupoAlumno;
    private javax.swing.JTextField txtGeneracion;
    private javax.swing.JTextField txtGeneracion1;
    private javax.swing.JTextField txtMaternoAlumno;
    private javax.swing.JTextField txtMaternoAlumno1;
    private javax.swing.JTextField txtMatricula;
    private javax.swing.JTextField txtMatricula1;
    private javax.swing.JTextField txtNombreAlumno;
    private javax.swing.JTextField txtNombreAlumno1;
    private javax.swing.JTextField txtObservaciones;
    private javax.swing.JTextField txtPaternoAlumno;
    private javax.swing.JTextField txtPaternoAlumno1;
    private javax.swing.JTextField txtRvoeLicenciaturaAlumno;
    private javax.swing.JTextField txtSemestre;
    private javax.swing.JTextField txtSemestre1;
    // End of variables declaration//GEN-END:variables

    public void limpiarAlumno() {
        txtMatricula.setText("");
        txtNombreAlumno.setText("");
        txtPaternoAlumno.setText("");
        txtMaternoAlumno.setText("");
        txtGeneracion.setText("");
        txtSemestre.setText("");
        cbEstadoConstanciaAlumno.setSelected(false);
        txtObservaciones.setText("");
        cbxLicenciatura.setSelectedIndex(0);
              
        agregarAlumno();
               
    }
    
    public void agregarAlumno(){
        txtMatricula.setEnabled(true);
      
      btnAgregarAlumno.setEnabled(true);
      btnModificarAlumno.setEnabled(false);
      btnCancelarAlumno.setEnabled(true);
      btnEliminarAlumno.setEnabled(false);
    }
    
    public void alumnoMouseClicked(){
    btnAgregarAlumno.setEnabled(false);
    btnModificarAlumno.setEnabled(true);
    btnCancelarAlumno.setEnabled(true);
    btnEliminarAlumno.setEnabled(true);
    }
    
    
    
    
    
}
