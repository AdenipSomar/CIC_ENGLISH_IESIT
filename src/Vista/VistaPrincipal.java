/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Conexion.conexion;
import InternalFrame.InternalAgregarAlumno;
import InternalFrame.InternalBajaAlumno;
import InternalFrame.InternalDocente;
import InternalFrame.InternalGrupoAlumno;
import Modelo.Eventos;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Timer;

/**
 *
 * @author ramos
 */
public class VistaPrincipal extends javax.swing.JFrame {

    InternalDocente vInternalDocente = new InternalDocente(this);
    InternalAgregarAlumno vInternalAgregarAlumno = new InternalAgregarAlumno(this);
    InternalBajaAlumno vInternalBajaAlumno = new InternalBajaAlumno(this);
    InternalGrupoAlumno vInternalGrupoAlumno = new InternalGrupoAlumno(this);
    
    
   Eventos evt = new Eventos();
   
    
    
    
    
    private Map<Component, Integer> indicePestanas = new HashMap<>();
    //ImageIcon alumnox18 = new ImageIcon(getClass().getResource("/img/18xAlumno.png"));
    //ImageIcon librox18 = new ImageIcon(getClass().getResource("/img/18xLibros.png"));
    conexion cn = new conexion();
    
    
    public VistaPrincipal() {
       this.setResizable(false);
        initComponents();
        iniciarReloj();
        ObtenerFecha();
        
        Connection con;
        con = conexion.getConnection();
        
        
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        relojLabel = new javax.swing.JLabel();
        labelFecha = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        panelPrincipal = new javax.swing.JTabbedPane();
        mnuPrincipal = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        mniSalir = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        itemAgregarAlumno = new javax.swing.JMenuItem();
        itemBajaAlumno = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        itemAgregarGrupoAlumno = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        itemDocente = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CIC_ENGLISH_IESIT");

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        relojLabel.setText(".");

        labelFecha.setText(".");

        jLabel1.setText("BIENVENIDO:");

        jLabel2.setText("USER");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(150, 150, 150)
                .addComponent(relojLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(346, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(relojLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelFecha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/x30ajustes.png"))); // NOI18N
        jMenu2.setText("  ARCHIVO");

        mniSalir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.SHIFT_MASK));
        mniSalir.setText("Salir");
        mniSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniSalirActionPerformed(evt);
            }
        });
        jMenu2.add(mniSalir);

        mnuPrincipal.add(jMenu2);

        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/x30alumno.png"))); // NOI18N
        jMenu3.setText("   ALUMNO");

        itemAgregarAlumno.setText("AGREGAR_ALUMNO");
        itemAgregarAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemAgregarAlumnoActionPerformed(evt);
            }
        });
        jMenu3.add(itemAgregarAlumno);

        itemBajaAlumno.setText("BAJAS_ALUMNO");
        itemBajaAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemBajaAlumnoActionPerformed(evt);
            }
        });
        jMenu3.add(itemBajaAlumno);

        mnuPrincipal.add(jMenu3);

        jMenu4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/x30materia.png"))); // NOI18N
        jMenu4.setText(" NIVELES / GRUPOS");

        itemAgregarGrupoAlumno.setText("AGREGAR_GRUPOS");
        itemAgregarGrupoAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemAgregarGrupoAlumnoActionPerformed(evt);
            }
        });
        jMenu4.add(itemAgregarGrupoAlumno);

        mnuPrincipal.add(jMenu4);

        jMenu5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/x30maestro.png"))); // NOI18N
        jMenu5.setText("   DOCENTES");

        itemDocente.setText("AGREGAR_DOCENTE");
        itemDocente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemDocenteActionPerformed(evt);
            }
        });
        jMenu5.add(itemDocente);

        jMenuItem1.setText("GENERAR_NOMINA");
        jMenu5.add(jMenuItem1);

        mnuPrincipal.add(jMenu5);

        jMenu6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/x30hoario.png"))); // NOI18N
        jMenu6.setText("   HORARIOS");
        mnuPrincipal.add(jMenu6);

        setJMenuBar(mnuPrincipal);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelPrincipal)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(panelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 576, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    //Termina la carga completa de grupo
    private void iniciarReloj() {
    // Actualiza el reloj cada segundo
    Timer timer = new Timer(1000, new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            // Obtiene la hora actual
            Calendar calendario = Calendar.getInstance();
            calendario.add(Calendar.HOUR_OF_DAY, -1); // Resta una hora

            Date now = calendario.getTime();
            // Formatea la hora como "hh:mm:ss a" (formato de 12 horas con AM/PM)
            SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ss a");
            String horaFormateada = sdf.format(now);
            // Actualiza el texto del JLabel con la hora formateada
            relojLabel.setText("HORA: " + horaFormateada);
        }
    });
    timer.start();
}
    private void ObtenerFecha(){
        
    // Metodo para obtener la fecha  en tiempo real 
        // Actualiza la fecha cada segundo
        Timer timer = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Obtiene la fecha actual en el calendario del sistema
                Calendar calendario = Calendar.getInstance();

                // Obtiene el día, mes y año actual
                int dia = calendario.get(Calendar.DAY_OF_MONTH);
                int mes = calendario.get(Calendar.MONTH) + 1; // Se suma 1 porque los meses empiezan desde 0
                int anio = calendario.get(Calendar.YEAR);

                // Formatea la fecha como "dd/MM/yyyy"
                SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
                String fechaFormateada = String.format("%02d/%02d/%d", dia, mes, anio);

                // Actualiza el texto del JLabel con la fecha formateada
                labelFecha.setText("FECHA: " + fechaFormateada);
            }
        });
        timer.start();
    }
   
    public void cerrarDocente(){
          // Obtener el índice actual de la pestaña a cerrar
                int indiceACerrar = panelPrincipal.indexOfComponent(vInternalDocente);
                if (indiceACerrar != -1) {
                    // Remover la pestaña del panel
                    panelPrincipal.removeTabAt(indiceACerrar);
                    // Eliminar la entrada del mapa
                    indicePestanas.remove(vInternalDocente);
                }
    }
    public void cerrarAgregarAlumno(){
          // Obtener el índice actual de la pestaña a cerrar
                int indiceACerrar = panelPrincipal.indexOfComponent(vInternalAgregarAlumno);
                if (indiceACerrar != -1) {
                    // Remover la pestaña del panel
                    panelPrincipal.removeTabAt(indiceACerrar);
                    // Eliminar la entrada del mapa
                    indicePestanas.remove(vInternalAgregarAlumno);
                }
    }
    public void cerrarBajaAlumno(){
    // Obtener el índice actual de la pestaña a cerrar
                int indiceACerrar = panelPrincipal.indexOfComponent(vInternalBajaAlumno);
                if (indiceACerrar != -1) {
                    // Remover la pestaña del panel
                    panelPrincipal.removeTabAt(indiceACerrar);
                    // Eliminar la entrada del mapa
                    indicePestanas.remove(vInternalBajaAlumno);
                }
    
    }
    public void cerrarGrupoAlumno(){
    // Obtener el índice actual de la pestaña a cerrar
                int indiceACerrar = panelPrincipal.indexOfComponent(vInternalGrupoAlumno);
                if (indiceACerrar != -1) {
                    // Remover la pestaña del panel
                    panelPrincipal.removeTabAt(indiceACerrar);
                    // Eliminar la entrada del mapa
                    indicePestanas.remove(vInternalGrupoAlumno);
                }
    
    }
    
    
    private void mniSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniSalirActionPerformed
    System.exit(0);
    }//GEN-LAST:event_mniSalirActionPerformed

    private void itemDocenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemDocenteActionPerformed
        
    // Añadir el componente al panel
    panelPrincipal.add(vInternalDocente);

    // Obtener el índice de la nueva pestaña
    int indice = panelPrincipal.indexOfComponent(vInternalDocente);

    if (indice != -1) {
        // Crear un panel para la pestaña con título y etiqueta de cerrar
        JPanel tabPanel = new JPanel(new BorderLayout());
        tabPanel.setOpaque(false); // Hacer que el panel sea transparente
        
        JLabel iconLabel = new JLabel();
        
        JLabel tabTitle = new JLabel(" DOCENTE " + (indice + 1) + "  "); // Cambia "Titulo " por el título deseado
        tabTitle.setOpaque(false); // Hacer que el título sea transparente

        JLabel cerrar = new JLabel("    X     ");
        cerrar.setForeground(Color.DARK_GRAY); // Color de texto rojo para la "X"
        cerrar.setOpaque(false); // Permitir que el fondo sea visible
        
        tabPanel.add(iconLabel, BorderLayout.WEST); // Icono a la izquierda
        tabPanel.add(tabTitle, BorderLayout.CENTER);
        tabPanel.add(cerrar, BorderLayout.EAST);

        // Establecer el panel de la pestaña como el componente de la pestaña
        panelPrincipal.setTabComponentAt(indice, tabPanel);

        // Agregar el MouseListener a la etiqueta de cerrar
        cerrar.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
               cerrarDocente();
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                cerrar.setOpaque(true);
                cerrar.setBackground(Color.RED); // Fondo rojo para la "X"
                cerrar.setForeground(Color.WHITE); // Cambiar color de texto a negro al pasar el mouse            
            }
            @Override
            public void mouseExited(MouseEvent e) {
             cerrar.setOpaque(false);
                cerrar.setForeground(Color.DARK_GRAY); // Restaurar color de texto a rojo al salir del mouse
            }
        });
        // Guardar el componente y su índice en el mapa
        indicePestanas.put(vInternalDocente, indice);
    }

    // Hacer visible el componente
    vInternalDocente.setVisible(true);
    
    // Establecer la pestaña recién creada como la pestaña seleccionada
    panelPrincipal.setSelectedComponent(vInternalDocente);
    
   
           
        
    }//GEN-LAST:event_itemDocenteActionPerformed

    private void itemAgregarAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemAgregarAlumnoActionPerformed
      
    // Añadir el componente al panel
    panelPrincipal.add(vInternalAgregarAlumno);

    // Obtener el índice de la nueva pestaña
    int indice = panelPrincipal.indexOfComponent(vInternalAgregarAlumno);

    if (indice != -1) {
        // Crear un panel para la pestaña con título y etiqueta de cerrar
        JPanel tabPanel = new JPanel(new BorderLayout());
        tabPanel.setOpaque(false); // Hacer que el panel sea transparente
        
        JLabel iconLabel = new JLabel();
        
        JLabel tabTitle = new JLabel(" ALUMNO " + (indice + 1) + "  "); // Cambia "Titulo " por el título deseado
        tabTitle.setOpaque(false); // Hacer que el título sea transparente

        JLabel cerrar = new JLabel("    X     ");
        cerrar.setForeground(Color.DARK_GRAY); // Color de texto rojo para la "X"
        cerrar.setOpaque(false); // Permitir que el fondo sea visible
        
        tabPanel.add(iconLabel, BorderLayout.WEST); // Icono a la izquierda
        tabPanel.add(tabTitle, BorderLayout.CENTER);
        tabPanel.add(cerrar, BorderLayout.EAST);

        // Establecer el panel de la pestaña como el componente de la pestaña
        panelPrincipal.setTabComponentAt(indice, tabPanel);

        // Agregar el MouseListener a la etiqueta de cerrar
        cerrar.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
               cerrarAgregarAlumno();
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                cerrar.setOpaque(true);
                cerrar.setBackground(Color.RED); // Fondo rojo para la "X"
                cerrar.setForeground(Color.WHITE); // Cambiar color de texto a negro al pasar el mouse            
            }
            @Override
            public void mouseExited(MouseEvent e) {
             cerrar.setOpaque(false);
                cerrar.setForeground(Color.DARK_GRAY); // Restaurar color de texto a rojo al salir del mouse
            }
        });
        // Guardar el componente y su índice en el mapa
        indicePestanas.put(vInternalAgregarAlumno, indice);
    }

    // Hacer visible el componente
    vInternalAgregarAlumno.setVisible(true);
    
    // Establecer la pestaña recién creada como la pestaña seleccionada
    panelPrincipal.setSelectedComponent(vInternalAgregarAlumno);
    
  
    }//GEN-LAST:event_itemAgregarAlumnoActionPerformed

    private void itemBajaAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemBajaAlumnoActionPerformed
        
       // Añadir el componente al panel
    panelPrincipal.add(vInternalBajaAlumno);

    // Obtener el índice de la nueva pestaña
    int indice = panelPrincipal.indexOfComponent(vInternalBajaAlumno);

    if (indice != -1) {
        // Crear un panel para la pestaña con título y etiqueta de cerrar
        JPanel tabPanel = new JPanel(new BorderLayout());
        tabPanel.setOpaque(false); // Hacer que el panel sea transparente
        
        JLabel iconLabel = new JLabel();
        
        JLabel tabTitle = new JLabel(" BAJA ALUMNO " + (indice + 1) + "  "); // Cambia "Titulo " por el título deseado
        tabTitle.setOpaque(false); // Hacer que el título sea transparente

        JLabel cerrar = new JLabel("    X     ");
        cerrar.setForeground(Color.DARK_GRAY); // Color de texto rojo para la "X"
        cerrar.setOpaque(false); // Permitir que el fondo sea visible
        
        tabPanel.add(iconLabel, BorderLayout.WEST); // Icono a la izquierda
        tabPanel.add(tabTitle, BorderLayout.CENTER);
        tabPanel.add(cerrar, BorderLayout.EAST);

        // Establecer el panel de la pestaña como el componente de la pestaña
        panelPrincipal.setTabComponentAt(indice, tabPanel);

        // Agregar el MouseListener a la etiqueta de cerrar
        cerrar.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
               cerrarBajaAlumno();
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                cerrar.setOpaque(true);
                cerrar.setBackground(Color.RED); // Fondo rojo para la "X"
                cerrar.setForeground(Color.WHITE); // Cambiar color de texto a negro al pasar el mouse            
            }
            @Override
            public void mouseExited(MouseEvent e) {
             cerrar.setOpaque(false);
                cerrar.setForeground(Color.DARK_GRAY); // Restaurar color de texto a rojo al salir del mouse
            }
        });
        // Guardar el componente y su índice en el mapa
        indicePestanas.put(vInternalBajaAlumno, indice);
    }

    // Hacer visible el componente
    vInternalBajaAlumno.setVisible(true);
    
    // Establecer la pestaña recién creada como la pestaña seleccionada
    panelPrincipal.setSelectedComponent(vInternalBajaAlumno);   
        
        
    }//GEN-LAST:event_itemBajaAlumnoActionPerformed

    private void itemAgregarGrupoAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemAgregarGrupoAlumnoActionPerformed
      
        // Añadir el componente al panel
    panelPrincipal.add(vInternalGrupoAlumno);

    // Obtener el índice de la nueva pestaña
    int indice = panelPrincipal.indexOfComponent(vInternalGrupoAlumno);

    if (indice != -1) {
        // Crear un panel para la pestaña con título y etiqueta de cerrar
        JPanel tabPanel = new JPanel(new BorderLayout());
        tabPanel.setOpaque(false); // Hacer que el panel sea transparente
        
        JLabel iconLabel = new JLabel();
        
        JLabel tabTitle = new JLabel(" GRUPO " + (indice + 1) + "  "); // Cambia "Titulo " por el título deseado
        tabTitle.setOpaque(false); // Hacer que el título sea transparente

        JLabel cerrar = new JLabel("    X     ");
        cerrar.setForeground(Color.DARK_GRAY); // Color de texto rojo para la "X"
        cerrar.setOpaque(false); // Permitir que el fondo sea visible
        
        tabPanel.add(iconLabel, BorderLayout.WEST); // Icono a la izquierda
        tabPanel.add(tabTitle, BorderLayout.CENTER);
        tabPanel.add(cerrar, BorderLayout.EAST);

        // Establecer el panel de la pestaña como el componente de la pestaña
        panelPrincipal.setTabComponentAt(indice, tabPanel);

        // Agregar el MouseListener a la etiqueta de cerrar
        cerrar.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
               cerrarGrupoAlumno();
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                cerrar.setOpaque(true);
                cerrar.setBackground(Color.RED); // Fondo rojo para la "X"
                cerrar.setForeground(Color.WHITE); // Cambiar color de texto a negro al pasar el mouse            
            }
            @Override
            public void mouseExited(MouseEvent e) {
             cerrar.setOpaque(false);
                cerrar.setForeground(Color.DARK_GRAY); // Restaurar color de texto a rojo al salir del mouse
            }
        });
        // Guardar el componente y su índice en el mapa
        indicePestanas.put(vInternalGrupoAlumno, indice);
    }

    // Hacer visible el componente
    vInternalGrupoAlumno.setVisible(true);
    
    // Establecer la pestaña recién creada como la pestaña seleccionada
    panelPrincipal.setSelectedComponent(vInternalGrupoAlumno);
    
  
        
        
    }//GEN-LAST:event_itemAgregarGrupoAlumnoActionPerformed

   
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
            java.util.logging.Logger.getLogger(VistaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem itemAgregarAlumno;
    private javax.swing.JMenuItem itemAgregarGrupoAlumno;
    private javax.swing.JMenuItem itemBajaAlumno;
    private javax.swing.JMenuItem itemDocente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelFecha;
    private javax.swing.JMenuItem mniSalir;
    private javax.swing.JMenuBar mnuPrincipal;
    private javax.swing.JTabbedPane panelPrincipal;
    private javax.swing.JLabel relojLabel;
    // End of variables declaration//GEN-END:variables
}

