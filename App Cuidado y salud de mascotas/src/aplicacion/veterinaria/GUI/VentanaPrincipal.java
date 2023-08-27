package aplicacion.veterinaria.GUI;

import aplicacion.veterinaria.*;
import java.sql.*;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JTabbedPane;
import javax.swing.plaf.basic.BasicTabbedPaneUI;

public class VentanaPrincipal extends javax.swing.JFrame {
    
    private PanelMascotas panelExternoMasc;
    private JButton pastButton;
    private String cedula;
    public VentanaPrincipal(String cedula) {
        initComponents();
        this.cedula = cedula;
        currentUser.setText(cedula);
        pastButton = mainButton;
        
        panelExternoMasc = new PanelMascotas(cedula, contenido);
        contenido.addTab("tab2", panelExternoMasc);
        
        PanelCardActividad panelExternoActividades = new PanelCardActividad();
        contenido.addTab("tab3", panelExternoActividades);
        
        PanelCardmedico panelExternoRegistroClinico = new PanelCardmedico();
        contenido.addTab("tab4", panelExternoRegistroClinico);
        
        PanelCardDieta panelExternoDietas = new PanelCardDieta();
        contenido.addTab("tab5", panelExternoDietas);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setResizable(false);
        nav = new javax.swing.JPanel(){
            //   ImageIcon backgroundImage = new ImageIcon(getClass().getResource("/aplicacion/veterinaria/GUI/img/texture-retro-dot-pixel.png"));

            //@Override
            // protected void paintComponent(Graphics g) {
                //    super.paintComponent(g);
                //     g.drawImage(backgroundImage.getImage(), 0, 0, getWidth(), getHeight(), this);
                //}
        };
        mainButton = new javax.swing.JButton();
        mascotasButton = new javax.swing.JButton();
        activityButton = new javax.swing.JButton();
        registroCliniButton = new javax.swing.JButton();
        dietasButton = new javax.swing.JButton();
        cerrarSesion = new javax.swing.JButton();
        topNav = new javax.swing.JPanel();
        navLogo = new javax.swing.JLabel();
        currentUserText = new javax.swing.JLabel();
        currentUser = new javax.swing.JLabel();
        relleno = new javax.swing.JPanel();
        contenido = new javax.swing.JTabbedPane();
        homePanel = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        relleno2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        nav.setBackground(new java.awt.Color(43, 43, 43));
        nav.setForeground(new java.awt.Color(210, 210, 210));
        nav.setMinimumSize(new java.awt.Dimension(186, 496));
        nav.setPreferredSize(new java.awt.Dimension(186, 496));
        nav.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        mainButton.setBackground(new java.awt.Color(90, 90, 90));
        mainButton.setForeground(new java.awt.Color(210, 210, 210));
        mainButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aplicacion/veterinaria/GUI/img/icons8-casa-48.png"))); // NOI18N
        mainButton.setText("Inicio");
        mainButton.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 25, 1, 1));
        mainButton.setBorderPainted(false);
        mainButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        mainButton.setFocusable(false);
        mainButton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        mainButton.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        mainButton.setIconTextGap(25);
        mainButton.setName(""); // NOI18N
        mainButton.setOpaque(true);
        mainButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mainButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                mainButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                mainButtonMouseExited(evt);
            }
        });
        nav.add(mainButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 190, 41));

        mascotasButton.setBackground(new java.awt.Color(51, 51, 51));
        mascotasButton.setForeground(new java.awt.Color(210, 210, 210));
        mascotasButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aplicacion/veterinaria/GUI/img/icons8-animal-folder-24.png"))); // NOI18N
        mascotasButton.setText("Mascotas");
        mascotasButton.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 25, 1, 1));
        mascotasButton.setBorderPainted(false);
        mascotasButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        mascotasButton.setFocusable(false);
        mascotasButton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        mascotasButton.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        mascotasButton.setIconTextGap(23);
        mascotasButton.setMaximumSize(new java.awt.Dimension(179, 41));
        mascotasButton.setMinimumSize(new java.awt.Dimension(179, 41));
        mascotasButton.setName(""); // NOI18N
        mascotasButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                mascotasButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                mascotasButtonMouseExited(evt);
            }
        });
        mascotasButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mascotasButtonActionPerformed(evt);
            }
        });
        nav.add(mascotasButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 190, 41));

        activityButton.setBackground(new java.awt.Color(51, 51, 51));
        activityButton.setForeground(new java.awt.Color(210, 210, 210));
        activityButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aplicacion/veterinaria/GUI/img/icons8-carpeta-de-favoritos-26.png"))); // NOI18N
        activityButton.setText("Actividades");
        activityButton.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 25, 1, 1));
        activityButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        activityButton.setFocusable(false);
        activityButton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        activityButton.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        activityButton.setIconTextGap(24);
        activityButton.setMaximumSize(new java.awt.Dimension(179, 41));
        activityButton.setMinimumSize(new java.awt.Dimension(179, 41));
        activityButton.setName(""); // NOI18N
        activityButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                activityButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                activityButtonMouseExited(evt);
            }
        });
        activityButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                activityButtonActionPerformed(evt);
            }
        });
        nav.add(activityButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 190, 41));

        registroCliniButton.setBackground(new java.awt.Color(51, 51, 51));
        registroCliniButton.setForeground(new java.awt.Color(210, 210, 210));
        registroCliniButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aplicacion/veterinaria/GUI/img/icons8-veterinarian-male-24.png"))); // NOI18N
        registroCliniButton.setText("Registro clinico");
        registroCliniButton.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 25, 1, 1));
        registroCliniButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        registroCliniButton.setFocusable(false);
        registroCliniButton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        registroCliniButton.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        registroCliniButton.setIconTextGap(24);
        registroCliniButton.setMaximumSize(new java.awt.Dimension(179, 41));
        registroCliniButton.setMinimumSize(new java.awt.Dimension(179, 41));
        registroCliniButton.setName(""); // NOI18N
        registroCliniButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                registroCliniButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                registroCliniButtonMouseExited(evt);
            }
        });
        registroCliniButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registroCliniButtonActionPerformed(evt);
            }
        });
        nav.add(registroCliniButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 190, 41));

        dietasButton.setBackground(new java.awt.Color(51, 51, 51));
        dietasButton.setForeground(new java.awt.Color(210, 210, 210));
        dietasButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aplicacion/veterinaria/GUI/img/icons8-tazón-del-perro-30.png"))); // NOI18N
        dietasButton.setText("Dietas");
        dietasButton.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 25, 1, 1));
        dietasButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        dietasButton.setFocusable(false);
        dietasButton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        dietasButton.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        dietasButton.setIconTextGap(20);
        dietasButton.setMaximumSize(new java.awt.Dimension(179, 41));
        dietasButton.setMinimumSize(new java.awt.Dimension(179, 41));
        dietasButton.setName(""); // NOI18N
        dietasButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                dietasButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                dietasButtonMouseExited(evt);
            }
        });
        dietasButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dietasButtonActionPerformed(evt);
            }
        });
        nav.add(dietasButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 190, 41));

        cerrarSesion.setBackground(new java.awt.Color(51, 51, 51));
        cerrarSesion.setForeground(new java.awt.Color(210, 210, 210));
        cerrarSesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aplicacion/veterinaria/GUI/img/cerrar-sesion.png"))); // NOI18N
        cerrarSesion.setText("Cerrar sesion");
        cerrarSesion.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 25, 1, 1));
        cerrarSesion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cerrarSesion.setFocusable(false);
        cerrarSesion.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        cerrarSesion.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        cerrarSesion.setIconTextGap(20);
        cerrarSesion.setMaximumSize(new java.awt.Dimension(179, 41));
        cerrarSesion.setMinimumSize(new java.awt.Dimension(179, 41));
        cerrarSesion.setName(""); // NOI18N
        cerrarSesion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cerrarSesionMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cerrarSesionMouseExited(evt);
            }
        });
        cerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cerrarSesionActionPerformed(evt);
            }
        });
        nav.add(cerrarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 450, 190, 41));

        getContentPane().add(nav, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 112, -1, -1));

        topNav.setBackground(new java.awt.Color(43, 43, 43));

        navLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aplicacion/veterinaria/GUI/img/PetCareNav.png"))); // NOI18N

        currentUserText.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        currentUserText.setForeground(new java.awt.Color(210, 210, 210));
        currentUserText.setText("Usuario:");

        currentUser.setForeground(new java.awt.Color(210, 210, 210));
        currentUser.setText("{usuario}");

        javax.swing.GroupLayout topNavLayout = new javax.swing.GroupLayout(topNav);
        topNav.setLayout(topNavLayout);
        topNavLayout.setHorizontalGroup(
            topNavLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(topNavLayout.createSequentialGroup()
                .addComponent(navLogo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 695, Short.MAX_VALUE)
                .addComponent(currentUserText)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(currentUser, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        topNavLayout.setVerticalGroup(
            topNavLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, topNavLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(topNavLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(currentUserText)
                    .addComponent(currentUser))
                .addGap(20, 20, 20))
            .addGroup(topNavLayout.createSequentialGroup()
                .addComponent(navLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
        );

        getContentPane().add(topNav, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1001, 106));

        relleno.setBackground(java.awt.Color.darkGray);

        javax.swing.GroupLayout rellenoLayout = new javax.swing.GroupLayout(relleno);
        relleno.setLayout(rellenoLayout);
        rellenoLayout.setHorizontalGroup(
            rellenoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        rellenoLayout.setVerticalGroup(
            rellenoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 112, Short.MAX_VALUE)
        );

        getContentPane().add(relleno, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1001, -1));

        contenido.setUI(new BasicTabbedPaneUI() {
            @Override
            protected void installDefaults() {
                super.installDefaults();
                highlight = new Color(43, 43, 43);
                lightHighlight = new Color(43, 43, 43);
                shadow = new Color(43, 43, 43);
                darkShadow = new Color(43, 43, 43);
                focus = new Color(43, 43, 43);
            }
        });
        contenido.setBackground(new java.awt.Color(43, 43, 43));
        contenido.setForeground(new java.awt.Color(210, 210, 210));

        homePanel.setBackground(new java.awt.Color(43, 43, 43));

        jTextField1.setText("jTextField1");
        jTextField1.setPreferredSize(new java.awt.Dimension(326, 30));
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jButton1.setText("Buscar");
        jButton1.setMaximumSize(new java.awt.Dimension(70, 30));
        jButton1.setMinimumSize(new java.awt.Dimension(70, 30));
        jButton1.setPreferredSize(new java.awt.Dimension(70, 30));

        javax.swing.GroupLayout homePanelLayout = new javax.swing.GroupLayout(homePanel);
        homePanel.setLayout(homePanelLayout);
        homePanelLayout.setHorizontalGroup(
            homePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(homePanelLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(369, Short.MAX_VALUE))
        );
        homePanelLayout.setVerticalGroup(
            homePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(homePanelLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(homePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(446, Short.MAX_VALUE))
        );

        contenido.addTab("tab1", homePanel);

        getContentPane().add(contenido, new org.netbeans.lib.awtextra.AbsoluteConstraints(192, 68, 808, 540));
        contenido.getAccessibleContext().setAccessibleName("");

        relleno2.setBackground(java.awt.Color.darkGray);

        javax.swing.GroupLayout relleno2Layout = new javax.swing.GroupLayout(relleno2);
        relleno2.setLayout(relleno2Layout);
        relleno2Layout.setHorizontalGroup(
            relleno2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1001, Short.MAX_VALUE)
        );
        relleno2Layout.setVerticalGroup(
            relleno2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 498, Short.MAX_VALUE)
        );

        getContentPane().add(relleno2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 1001, 498));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void mascotasButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mascotasButtonActionPerformed
        System.out.println("Boton mascotas");
        contenido.setSelectedIndex(1);
        mascotasButton.setBackground(new java.awt.Color(90, 90, 90));
        
        if (pastButton!=mascotasButton)
            pastButton.setBackground(new java.awt.Color(51, 51, 51));
        
        pastButton = mascotasButton;
        
        contenido.setComponentAt(1, panelExternoMasc);
        panelExternoMasc.consultarDatosEnBaseDeDatos();
    }//GEN-LAST:event_mascotasButtonActionPerformed

    private void mainButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mainButtonMouseClicked
        System.out.println("Boton main");
        contenido.setSelectedIndex(0);
        mainButton.setBackground(new java.awt.Color(90, 90, 90));
        
        if (pastButton!=mainButton)
            pastButton.setBackground(new java.awt.Color(51, 51, 51));
        pastButton = mainButton;
    }//GEN-LAST:event_mainButtonMouseClicked

    private void activityButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_activityButtonActionPerformed
        System.out.println("Boton actividades");
        contenido.setSelectedIndex(2);
        activityButton.setBackground(new java.awt.Color(90, 90, 90));
        
        if (pastButton!=activityButton)
            pastButton.setBackground(new java.awt.Color(51, 51, 51));
        
        pastButton = activityButton;
    }//GEN-LAST:event_activityButtonActionPerformed

    private void registroCliniButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registroCliniButtonActionPerformed
        System.out.println("Boton registro clinico");
        contenido.setSelectedIndex(3);
        registroCliniButton.setBackground(new java.awt.Color(90, 90, 90));
        
        if (pastButton!=registroCliniButton)
            pastButton.setBackground(new java.awt.Color(51, 51, 51));
        
        pastButton = registroCliniButton;
    }//GEN-LAST:event_registroCliniButtonActionPerformed

    private void mainButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mainButtonMouseEntered
        mainButton.setBackground(new java.awt.Color(90, 90, 90));
    }//GEN-LAST:event_mainButtonMouseEntered

    private void mainButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mainButtonMouseExited
        if (pastButton!=mainButton)
            mainButton.setBackground(new java.awt.Color(51, 51, 51));
    }//GEN-LAST:event_mainButtonMouseExited

    private void mascotasButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mascotasButtonMouseEntered
        mascotasButton.setBackground(new java.awt.Color(90, 90, 90));
    }//GEN-LAST:event_mascotasButtonMouseEntered

    private void mascotasButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mascotasButtonMouseExited
        if (pastButton!=mascotasButton)
            mascotasButton.setBackground(new java.awt.Color(51, 51, 51));
    }//GEN-LAST:event_mascotasButtonMouseExited

    private void activityButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_activityButtonMouseEntered
        activityButton.setBackground(new java.awt.Color(90, 90, 90));
    }//GEN-LAST:event_activityButtonMouseEntered

    private void activityButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_activityButtonMouseExited
        if (pastButton!=activityButton)
            activityButton.setBackground(new java.awt.Color(51, 51, 51));
    }//GEN-LAST:event_activityButtonMouseExited

    private void registroCliniButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registroCliniButtonMouseEntered
        registroCliniButton.setBackground(new java.awt.Color(90, 90, 90));
    }//GEN-LAST:event_registroCliniButtonMouseEntered

    private void registroCliniButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registroCliniButtonMouseExited
        if (pastButton!=registroCliniButton)
            registroCliniButton.setBackground(new java.awt.Color(51, 51, 51));
    }//GEN-LAST:event_registroCliniButtonMouseExited

    private void dietasButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dietasButtonMouseEntered
        dietasButton.setBackground(new java.awt.Color(90, 90, 90));
    }//GEN-LAST:event_dietasButtonMouseEntered

    private void dietasButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dietasButtonMouseExited
        if (pastButton!=dietasButton)
            dietasButton.setBackground(new java.awt.Color(51, 51, 51));
    }//GEN-LAST:event_dietasButtonMouseExited

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void cerrarSesionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cerrarSesionMouseEntered
        cerrarSesion.setBackground(new java.awt.Color(90, 90, 90));
    }//GEN-LAST:event_cerrarSesionMouseEntered

    private void cerrarSesionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cerrarSesionMouseExited
        cerrarSesion.setBackground(new java.awt.Color(51, 51, 51));
    }//GEN-LAST:event_cerrarSesionMouseExited

    private void cerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cerrarSesionActionPerformed
        System.out.println("CERRAR SESION");
        VentanaLogin login = new VentanaLogin();
        setVisible(false);
    }//GEN-LAST:event_cerrarSesionActionPerformed

    private void dietasButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dietasButtonActionPerformed
        System.out.println("Boton dietas");
        contenido.setSelectedIndex(4);
        dietasButton.setBackground(new java.awt.Color(90, 90, 90));

        if (pastButton!=dietasButton)
        pastButton.setBackground(new java.awt.Color(51, 51, 51));

        pastButton = dietasButton;
    }//GEN-LAST:event_dietasButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton activityButton;
    private javax.swing.JButton cerrarSesion;
    private javax.swing.JTabbedPane contenido;
    private javax.swing.JLabel currentUser;
    private javax.swing.JLabel currentUserText;
    private javax.swing.JButton dietasButton;
    private javax.swing.JPanel homePanel;
    private javax.swing.JButton jButton1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton mainButton;
    private javax.swing.JButton mascotasButton;
    private javax.swing.JPanel nav;
    private javax.swing.JLabel navLogo;
    private javax.swing.JButton registroCliniButton;
    private javax.swing.JPanel relleno;
    private javax.swing.JPanel relleno2;
    private javax.swing.JPanel topNav;
    // End of variables declaration//GEN-END:variables
}
